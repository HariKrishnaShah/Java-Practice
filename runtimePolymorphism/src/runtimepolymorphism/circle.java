package runtimepolymorphism;

class circle extends area
{
    double radius;
    public double getarea()
    {       
        
        return (45);
    }
    
    public double getarea(double r)
    {       
        radius = r;
        return (3.14*r*r);
    }
    
     public void display()
    {
        System.out.println("KKKK");
    }
    
   
}