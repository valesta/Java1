public class Lesson5
{
    public static void main(String[] args)
    {
        Person[] employees = new Person[5];
        employees[0] = new Person("Иванов И.А.", "архитектор", "ivanov@mailbox.com", "899999999", 30000, 38);
        employees[1] = new Person("Петров П.И.", "аналитик", "petrov@mailbox.com", "899999988", 32000, 41);
        employees[2] = new Person("Сидоров А.И.", "дизайнер", "sidorov@mailbox.com", "899999977", 28000, 32);
        employees[3] = new Person("Смирнов Е.С.", "программист", "smirnov@mailbox.com", "899999966", 30000, 42);
        employees[4] = new Person("Орлов С.Г.", "тестировщик", "orlov@mailbox.com", "899999955", 25000, 25);

        for (int i = 0; i < 5; i++)
        {
            if (employees[i].getAge() > 40)
            {
                System.out.println(employees[i]);
            }
            System.out.println();
        }
    }
}
