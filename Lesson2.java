public class HomeWorkApp
{
    public static void main(String[] args)
    {
        System.out.println(isBetween10and20(5, 10));
        printSignum(-7);
        System.out.println(isNegative(-8));
        printStringNTimes(3, "Hello");
        System.out.println(isLeapYear(2020));
    }

    public static boolean isBetween10and20(int a, int b)
    {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }

    public static void printSignum(int a)
    {
        if (a >= 0)
        {
            System.out.println("Число положительное");
        }
        else
        {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a)
    {
        return a < 0;
    }

    public static void printStringNTimes(int time, String word)
    {
        for (int i = 1; i <= time; i++)
        {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int y)
    {
        if (y % 4 == 0)
        {
            if (y % 100 != 0 || y % 400 == 0)
            {
                return true;
            }
        }
        return false;
    }
}
