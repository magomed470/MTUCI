public class task2{

    //1 задача
    public static String repeat(String a, int b)
    {
        String s = "";
        char[] HA = a.toCharArray();
        for (int i = 0; i< a.length(); i++)
        {
            for (int j=0; j<b; j++)
            {
                s = s + HA[i];
            }
        }
        return s;
    }

    //2 задача
    public static int differenceMaxMin(String st)  //2
    {
        String[] items = st.split(" ");

        int[] a = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            a[i] = Integer.parseInt(items[i]);
        }


        int maxElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxElement) {
                maxElement = a[i];
            }
        }
        int minElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minElement) {
                minElement = a[i];
            }
        }
        return maxElement - minElement;
    }

    //3 задача
    public static boolean isAvgWhole(String a)
    {
        double s = 0;
        String[] items = a.split(" ");
        int[] aa = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            aa[i] = Integer.parseInt(items[i]);
        }


        for (int i=0; i<aa.length; i++)
        {
            s = s + aa[i];
        }
        return s/aa.length % 1 == 0;
    }

    //4 задача
    public static int getDecimalPlaces(String a){
        return  a.length() - (a.indexOf('.')+1);
    }

    //5 задача
    public static String cumulativeSum(String a)
    {
        //Ввод массива
        String[] items = a.split(" ");
        int[] aa = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            aa[i] = Integer.parseInt(items[i]);
        }

        //переменная для вывода
        String st = "";

        //основная программа
        for (int i=0; i< aa.length; i++)
        {
            int s=0;
            for (int j=0; j< i+1; j++)
            {
                s=s+aa[j];
            }
            st = st + s + " ";
        }

        return st;

    }

    //6 задача
    public static int Fibonacci(int a) {
        int a1 = 1;
        int a2 = 1;

        for (int i = 2; i < a+1; i++) {
            if (i%2==1){
            a1 = a1 + a2;}
            else{
            a2 = a1 + a2;}
        }
        if (a % 2 == 0) {
            return a2;
        }
        else {
            return a1;
        }
    }

    // 7 задача
    public static boolean isDigital(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValid(String a)
    {
        return (isDigital(a) == true) && (a.length() == 5);
    }

    public  static boolean isStrangePair(String aa, String bb)
    {
        String[] a = aa.split("");
        String[] b = bb.split("");
        return (a[0].equals(b[b.length - 1])) && (b[0].equals(a[a.length - 1]));

    }

    public static boolean isSuffix(String a, String b)
    {
        b= b.substring(1);
        return a.endsWith(b);
    }

    public static boolean isPrefix (String a, String b)
    {
        b= b.substring(0, b.length()-1);
        return a.startsWith(b);
    }

    public static int boxSeq(int n)
    {
        if (n%2==0) {return 3*n/2-n/2;}
        else {return 3*(n/2+1)-n/2;}
    }

    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));                   //1
        System.out.println(differenceMaxMin("44 32 86 19"));        //2
        System.out.println (isAvgWhole("9 2 2 5"));                 //3
        System.out.println(cumulativeSum("1 2 3"));                 //4
        System.out.println(getDecimalPlaces("43.20"));              //5
        System.out.println(Fibonacci(3));                           //6
        System.out.println(isValid("55011"));                       //7
        System.out.println(isStrangePair("ratioi", "orator")); //8
        System.out.println(isSuffix("arachnophobia", "-phobia"));//9
        System.out.println(isPrefix("autoomation", "auto-"));    //9
        System.out.println(boxSeq(5));                              //10
    }
}