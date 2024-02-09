package s1338565.edu.monmouth.shape;

public class Rectangle implements Shape
{
    private int length;
    private int width; 

    public Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    public int getLength()
    { return length; }

    public int getWidth()
    { return width; }

    public void setLength(int l)
    { length = l; }

    public void setWidth(int w)
    { width = w; }

    @Override
    public double area()
    { return length*width; }

}
