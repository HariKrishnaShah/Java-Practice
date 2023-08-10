package runtimepolymorphism;

class rectangle extends area
{
    double base;
    double length;
    public double getarea(double b,double l)
    {
        base = b;
        length = l;
        return (l*b);
         
    }
    
    public double getarea()
    {
        return(20);
    }
    
}