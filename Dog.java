public class Dog extends Animal
{
    private static int numberDog;

    Dog(String name)
    {
        super(name, 500, 10);
        numberDog++;
    }

    public static int counterDog()
    {
        return numberDog;
    }
}
