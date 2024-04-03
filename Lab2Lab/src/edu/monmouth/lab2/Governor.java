package edu.monmouth.lab2;

public class Governor 
{
    private String name;
    private int age;

    public Governor(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(!(otherObject instanceof Governor))
        {
            return false;
        }
        
        Governor otherGov = (Governor) otherObject;

        if(otherGov.getName() == getName() && otherGov.getAge() == getAge())
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return getName().hashCode() + getAge();
    }

    @Override
    public String toString()
    {
        return "Governor " + name + ", Age " + age;
    }

}
