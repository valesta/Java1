import com.sun.javadoc.PackageDoc;

import java.util.Random;
import java.util.Scanner;

public class Lesson4
{
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '·';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args)
    {
        initMap();
        printMap();
        while (true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил Искусственный Интеллект");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char s)
    {
        // Проверка строк
        for (int r = 0; r < map.length; r++)
        {
            if (maxLength(s, r, 0, 0, 1) == DOTS_TO_WIN)
            {
                return true;
            }
        }
        // Проверка столбцов
        for (int c = 0; c < map.length; c++)
        {
            if (maxLength(s, 0, c, 1, 0) == DOTS_TO_WIN)
            {
                return true;
            }
        }
        // Проверка главной диагонали и двух параллельных ей диагоналей
        if (maxLength(s, 0, 0, 1, 1) == DOTS_TO_WIN
                || maxLength(s, 1, 0, 1, 1) == DOTS_TO_WIN
                || maxLength(s, 0, 1, 1, 1) == DOTS_TO_WIN)
        {
            return true;
        }
        //  Проверка побочной диагонали и двух параллельных ей диагоналей
        if (maxLength(s, map.length - 1, 0, -1, 1) == DOTS_TO_WIN
                || maxLength(s, map.length - 1, 1, -1, 1) == DOTS_TO_WIN
                || maxLength(s, map.length - 2, 0, -1, 1) == DOTS_TO_WIN)
        {
            return true;
        }

        return false;
    }

    // Метод, который считает максимальное число следующих друг за другом одинаковых символов в последовательности
    public static int maxLength(char s, int r, int c, int dr, int dc) // dr и dc - величина изменения индекса (дельта)
    {
        int L = 0;
        int maxLength = 0;

        for (int i = r, j = c; i < map.length && i >= 0 && j < map.length && j >= 0; i += dr, j += dc)
        {
            if (map[i][j] == s)
            {
                L++;
            }
            else
            {
                maxLength = Math.max(maxLength, L);
                L = 0;
            }
        }
        maxLength = Math.max(maxLength, L);
        return maxLength;
    }

    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn()
    {
        int x, y;
        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        return false;
    }

    public static void aiTurn()
    {
        int x, y;
        do
        {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
}
