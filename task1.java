public class task1{


        public static int remainder(int a, int b)
        {
            return a%b;
        }

        public static double triArea(int a, int b)
        {
            return 0.5*a*b;
        }

        public static int animals(int a, int b, int c)
        {
            return a*2+b*4+c*4;
        }

        public static boolean profitableGamble(double a, double b, double c)
        {
            return a*b>c;
        }

        public static String operation(int N, int a, int b) {
            if (a + b == N) {
                return "added";
            } else if (a - b == N) {
                return "subtracted";
            } else if (a * b == N) {
                return "miltiplied";
            } else if (a / b == N) {
                return "devided";
            }
            else {return "None";}
        }

        public static int ctoa(char a)
        {
            return (int) a;
        }

        public static int addUpTo(int N)
        {
            int s = 0;
            for (int i = 1; i < N+1; i++){
                s=s+i;
            }
            return s;
        }

        public static int nextEdge(int a, int b)
        {
            return a+b-1;
        }

        /* public static int sumOfCubes(int[] a)
        {
            int s = 0;
            for (int i = 0; i < len(a)+1; i++){
                s = s+a[i]*a[i]*a[i];
            }
            return s;
        }*/


        public static boolean abcmath(int a, int b, int c)
        {

            for (int i =1; i<b+1; i++){
                a = a + a;
            }

            return a%c==0;
        }



        public static void main(String[] args)
        {
            System.out.println(remainder(-9, 45));
            System.out.println(triArea(3, 2));
            System.out.println(animals(2,3,5));
            System.out.println(profitableGamble(0.2,50,9));
            System.out.println(operation(24, 15, 9));
            System.out.println(ctoa ( 'A'));
            System.out.println(addUpTo(10));
            System.out.println(nextEdge(8,10));
            //System.out.println(sumOfCubes([1, 5, 9]));
            System.out.println(abcmath(5,2,1));
        }
}
