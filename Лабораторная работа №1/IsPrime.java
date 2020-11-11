public class IsPrime{

    public static boolean IsPrime (int n)
    {
        int s=0;
        for (int i=2; i<n; i++)
        {
            if ((n%i==0) && (n!=i)) {s = s + 1;}
        }
        return s==0;
    }


    public static void main(String[] args)
    {
        for (int i=2; i<100; i++)
            if (IsPrime(i) == true)
            {
                System.out.print(i);
                System.out.print(" ");
            }
    }
}
