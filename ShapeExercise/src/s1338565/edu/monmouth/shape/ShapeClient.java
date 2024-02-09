package s1338565.edu.monmouth.shape;

public class ShapeClient
{
    public static void main(String[] args) throws Exception 
    {
        Circle c = new Circle(5);
        System.out.println("Circle Attibutes: ");
        System.out.println("radius: " + c.getRadius());
        c.setRadius(6);
        System.out.println("new radius (after setting to six): " + c.getRadius());
        System.out.println("area: " + c.area());

        System.out.println("\n---------------------------------");

        Rectangle rt = new Rectangle(2,3);
        System.out.println("Rectangle Attributes: ");
        System.out.println("length: " + rt.getLength());
        System.out.println("width: " + rt.getWidth());
        rt.setLength(3);
        rt.setWidth(4);
        System.out.println("new length (after setting to 3): " + rt.getLength());
        System.out.println("new width (after setting to 4): " + rt.getWidth());
        System.out.println("area: " + rt.area());


        Circle circle;
        Rectangle rectangle;
        Shape shape1, shape2;

        circle = new Circle(12);
        /*
         * Declaring a new instance of a Circle Object with circle reference, circle is a circle
         */

        rectangle = new Rectangle(21,34);
         /*
          * declaring a new instance of a Rectangle Object with rectangle reference, rectangle is a rectangle
          */

        shape1 = new Circle(90);
        /*
         * shape1, a circle, is-a shape
         */
        shape2 = new Rectangle(2,4);
        /*
         * shape2, a rectangle, is-a shape
         */

        System.out.println("Greatest: " + findGreatest(circle, rectangle).area());
    }

    public static Shape findGreatest(Shape shape1, Shape shape2)
    {
        if(Math.abs(shape1.area() - shape2.area()) < 0.0000001)//Roundoff Error
            return null;

        if(shape1.area() > shape2.area())
            return shape1;

        return shape2;
    }
}
