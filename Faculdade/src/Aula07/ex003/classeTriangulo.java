package ex003;

public class classeTriangulo {
    public int x;
    public int y;
    public int z;

    public boolean isTriangulo()
    {
        if((x+y)>z || (x+z)>y || (y+z)>x)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public String classificar()
    {
        if(x == y && x==z && y==z)
        {
            return "Triangulo Equilatero";
        }
        else if( x != y && x != z && y != z)
        {
            return "Triangulo Escaleno";
        }
        else
        {
            return "Triangulo Isociles";
        }
    }
}
