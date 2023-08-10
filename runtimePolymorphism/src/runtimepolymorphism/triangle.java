package runtimepolymorphism;

class triangle extends area
{
    double base;
    double height;
    public double getarea(double b,double h)
    {
        base = b;
        height = h;
        return(0.5*b*h);
        
    }
    public double getarea()
    {
        return (50);
    }
    
}