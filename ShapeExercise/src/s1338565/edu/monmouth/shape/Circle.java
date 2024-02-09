package s1338565.edu.monmouth.shape;

public class Circle implements Shape
{
    private int radius; 

    public Circle(int r)
    { radius = r; }

    public int getRadius()
    { return radius; }

    public void setRadius(int r)
    {   radius = r; }

    @Override
    public double area()
    { return Math.PI*(Math.pow(radius, 2)); }
}
