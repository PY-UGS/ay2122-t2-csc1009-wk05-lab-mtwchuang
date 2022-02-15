package Labs.Week_5_Q1;

public class Rectangle extends GeometricObject
{
    private double width;
    private double height;
    public Rectangle()
    {
        super();
    }

    public Rectangle(double width, double height)
    {
        super();
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth() 
    {
        return this.width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return this.height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getArea()
    {
        return (width*height);
    }

    public double getPerimeter()
    {
        return(2*width+2*height);
    }
}
