import java.util.Scanner;


    /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */
    class Thenu
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in) ;
            String  a = sc.next();
            String b = sc.next();
            String clue = hint(a,b);
            System.out.println(clue);

        }
        static String hint(String  a , String b)
        {
            int bull=0;
            int cow =0;
            String a1="",b1="";

            //counting bulls
            for(int i=0;i<=3;i++)
            {
                if(a.charAt(i)==b.charAt(i))
                    bull++;
                else
                {
                    a1=a1+a.charAt(i);
                    b1=b1+b.charAt(i);
                }
            }

            //counting cows
            for(int i=0;i<a1.length();i++)
            {
                for(int j =0;j<b1.length();j++)
                {
                    if(a1.charAt(i)==b1.charAt(j))
                    {
                        cow++;
                        b1 = b1.substring(0, j) + b1.substring(j+1);
                        break;
                    }
                }
            }
            return (bull + "A" + cow + "B");
        }
    }

