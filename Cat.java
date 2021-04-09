public class Cat extends Animal
{
    private static int numberCat;

    Cat(String name)
    {
        super(name, 200, 0);
        numberCat++;
    }

    @Override
    public void swim(int distance)
    {
        System.out.println(name + " не умеет плавать");
    }

    public static int counterCat()
    {
        return numberCat;
    }
}
