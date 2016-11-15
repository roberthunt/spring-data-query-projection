package uk.co.rbrt;

/**
 * @author <a href="mailto:roberthunt87@gmail.com">Robert Hunt</a>
 */
public class PersonSummaryClass
{
    private String name;
    private int age;

    public PersonSummaryClass(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
