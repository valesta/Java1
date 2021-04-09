public class Lesson6
{
    public static void main(String[] args)
    {
        Animal cat1 = new Cat("Мурзик");
        Animal cat2 = new Cat("Барсик");
        Animal dog1 = new Dog("Шарик");
        Animal dog2 = new Dog("Бобик");
        Animal dog3 = new Dog("Тузик");

        cat1.run(150);
        cat2.run(250);
        dog1.run(600);
        dog2.run(400);
        dog3.run(300);
        cat1.swim(3);
        cat2.swim(5);
        dog1.swim(8);
        dog2.swim(5);
        dog3.swim(12);

        System.out.println("Количество животных " + Animal.counter());
        System.out.println("Количество котов " + Cat.counterCat());
        System.out.println("Количество собак " + Dog.counterDog());
    }
}
