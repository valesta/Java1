public class Animal
{
    protected String name;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;
    private static int number;

    Animal(String name, int maxDistanceRun, int maxDistanceSwim)
    {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        number++;
    }

    public void run(int distance)
    {
        if (distance < maxDistanceRun && distance >= 0)
        {
            System.out.println(name + " пробежал " + distance + "м");
        }
        else
        {
            System.out.println(name + " не может пробежать " + distance + "м");
        }
    }

    public void swim(int distance)
    {
        if (distance < maxDistanceSwim && distance >= 0)
        {
            System.out.println(name + " проплыл " + distance + "м");
        }
        else
        {
            System.out.println(name + " не может проплыть " + distance + "м");
        }
    }

    public static int counter()
    {
        return number;
    }
}
