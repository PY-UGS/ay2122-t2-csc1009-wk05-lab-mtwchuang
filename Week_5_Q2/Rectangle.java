package Labs.Week_5_Q2;
public class Rectangle extends Shape
{
    public Rectangle(double width, double height)
    {
        super(width,height);
    }
    public double area()
    {
        return (super.dim1*super.dim2);
    }
}
