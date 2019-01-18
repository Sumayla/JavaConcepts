package objectorientedprogramming;


public class ThisKeyword {


    public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically 
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects      
            
            Properties - features (part of something)
            Methods - functions (describes what a function does)
        */
        
        Point1 p = new Point1(10, 20);
        Point1 p2 = new Point1(4, 25);

        
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p2.x);
        System.out.println(p2.y);
        System.out.println("Hello Java");
    }
    
}

class Point1
{
    Point1()
    {
        System.out.println("This is default constructor");
        x = 100;
        y = 100;
    }
    Point1(int x, int y)
    {  //parameters
        this.x = x;
        this.y = y;        
    }
    int x;
    int y;
}