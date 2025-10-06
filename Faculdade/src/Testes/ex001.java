public class ex001 
{
    public static void main(String[] args) 
    {
        double result = Math.min(3, 7) + Math.abs(-50);
        System.out.println("O resultado é " + result); //53

        double result1 = Math.abs(-1.23);
        double result2 = Math.pow(3, 2);
        double result3 = Math.sqrt(121.0) - Math.sqrt(256.0);
        double result4 = Math.abs(Math.min(-3, -5));

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("--------------------------");

        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(b >= a);
        System.out.println(b <= a);

        System.out.println("--------------------------");

        
    }//fim do método main
}