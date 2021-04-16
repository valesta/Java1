package Lesson7;

public class Cat
{
    private String name;
    private int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate)
    {
        if (plate.enoughFood(appetite) && !isFull)
        {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name + " теперь сыт");
        }
        else if (!plate.enoughFood(appetite))
        {
            System.out.println(name + " голоден - в тарелке недостаточное количество еды");
        }
        else if (isFull)
        {
            System.out.println(name + " уже сыт");
        }
    }
}
