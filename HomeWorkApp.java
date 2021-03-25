public class HomeWorkApp
{
    public static void main(String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign()
    {
        int a = 5;
        int b = -7;

        if (a + b >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else
        {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor()
    {
        int value = 77;

        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (value <= 100)
        {
            System.out.println("Жёлтый");
        }
        else
        {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers()
    {
        int a = 12;
        int b = 25;

        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }
    }
}
