public class Lesson3
{
    public static void main(String[] args)
    {
        ex1_swap0and1();
        ex2_init100();
        ex3_less6Times2();
        ex4_initDiagonalElements();
        ex5_returnArray(8, 11);
        int[] array = {8, -12, 6, -21, 3, -9};
        System.out.println(ex6_minElement(array));
        System.out.println(ex6_maxElement(array));
        int[] balance = {2, 4, 1, 5, 2};
        System.out.println(ex7_sumLeftAndRightSide(balance));
        int[] shift = {1, 2, 3, 4, 5};
        ex8_shiftElements(shift, -3);
    }

    // Вспомогательные методы для вывода результатов на печать:

    public static void printArray(int[] arr)
    {
        for (int v : arr)
        {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] arr)
    {
        for (int[] v : arr)
        {
            printArray(v);
        }
    }

    // Задание №1

    public static void ex1_swap0and1()
    {
        int[] arr = new int[10];

        for (int j = 0; j < arr.length; j++)
        {
            if (j % 2 != 0)
            {
                arr[j] = 1;
            }
        }
        printArray(arr);

        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 1)
            {
                arr[j] = 0;
            }
            else
            {
                arr[j] = 1;
            }
        }
        printArray(arr);
    }

    // Задание№2

    public static void ex2_init100()
    {
        int[] arr = new int[100];

        for (int j = 0; j < 100; j++)
        {
            arr[j] = j + 1;
        }
        printArray(arr);
    }

    // Задание №3

    public static void ex3_less6Times2()
    {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        printArray(arr);
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] < 6)
            {
                arr[j] = arr[j] * 2;
            }
        }
        printArray(arr);
    }

    // Задание №4

    public static void ex4_initDiagonalElements()
    {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        printMatrix(arr);
    }

    // Задание №5

    public static int[] ex5_returnArray(int len, int initialValue)
    {
        int[] arr = new int[len];

        for (int j = 0; j < arr.length; j++)
        {
            arr[j] = initialValue;
        }
        printArray(arr);
        return arr;
    }

    // Задание №6

    public static int ex6_minElement(int arr[])
    {
        int min = arr[0];
        for (int v : arr)
        {
            if (v < min)
            {
                min = v;
            }
        }
        return min;
    }

    public static int ex6_maxElement(int arr[])
    {
        int max = arr[0];
        for (int v : arr)
        {
            if (v > max)
            {
                max = v;
            }
        }
        return max;
    }

    // Задание №7

    public static boolean ex7_sumLeftAndRightSide(int arr[])
    {
        int sumTotal = 0;
        for (int v : arr)
        {
            sumTotal += v;
        }
        int sumLeft = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sumLeft += arr[i];

            if (sumLeft == sumTotal - sumLeft)
            {
                return true;
            }
        }
        return false;
    }

    // Задание №8

    public static void ex8_shiftElements(int arr[], int n)
    {
        printArray(arr);

        if (n > 0)
        {
            for (int x = 1; x <= n % arr.length; x++)
            {
                shiftRight(arr);
            }
        }
        else
        {
            for (int x = 1; x <= -n % arr.length; x++)
            {
                shiftLeft(arr);
            }
        }
        printArray(arr);
    }

    public static void shiftRight(int arr[])
    {
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = tmp;
    }

    public static void shiftLeft(int arr[])
    {
        int tmp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = tmp;
    }
}



