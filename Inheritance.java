// Inheritance
// Single-level inheritance

class Shape{
    public void area()
    {
        System.out.println('Display area');
    }
}

class Triangele extends Shape{
    public void area(int l,int h)
    {
        System.out.println(l/2*l*h)
    }
}

// Multi-level inheritance
class Shape{
    public void area()
    {
        System.out.println("Display area');
    }
}

class Triangele extends Shape{
    public void area(int l,int h)
    {
        System.out.println(l/2*l*h);
    }
}

class Equilateral extends Triangle{
    public void area(int l,int h){
        System.out.println(l/2*l*h);
    }
}

// Hierarchical Inheritance

class Shape{
    public void area()
    {
        System.out.println("Display area");
    }
}

class Triangele extends Shape{
    public void area(int l,int h)
    {
        System.out.println(l/2*l*h)
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
