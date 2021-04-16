package Lesson7;

public class Lesson7
{
    public static void main(String[] args)
    {
        Cat[] cats = {
                new Cat("Барсик", 50),
                new Cat("Мурзик", 30),
                new Cat("Том", 40),
        };

        Plate plate = new Plate(100, 100);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.addFood();

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }
    }
}
