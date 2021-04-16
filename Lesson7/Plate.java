package Lesson7;

public class Plate
{
    private int food;
    private int maxFood; // Максимальная вместимость тарелки

    public Plate(int food, int maxFood)
    {
        this.food = food;
        this.maxFood = maxFood;
    }

    public void decreaseFood(int appetite)
    {
        if (!enoughFood(appetite))
        {
            System.out.println("в тарелке недостаточное количество еды");
        }
        else
        {
            food = food - appetite;
        }
    }

    public boolean enoughFood(int appetite)
    {
        return appetite < food;
    }

    public void addFood( )
    {
        int f;
        f = maxFood - food;
        food += f;
        System.out.println("в тарелку добавлена еда");
    }
}
