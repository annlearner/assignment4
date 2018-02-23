nice try, but I suggest you use a clear logic to solve the problem , please look at my answer and learn it:

 public String getHint(String secret, String guess) {
        if(guess.equals("") || guess.length() == 0){
            return "";
        }
        int countA = 0, countB = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : secret.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(int i = 0 ;i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                countA++;
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
            }
        } 
        for(int i = 0 ;i < secret.length(); i++){
            if(secret.charAt(i) != guess.charAt(i) && map.containsKey(guess.charAt(i))){
                if(map.get(guess.charAt(i)) > 0){
                    map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
                    countB++;
            }  
        }
        }
        return countA + "A" + countB + "B";
    }


more simple approach: 

public String getHint(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        int s = Character.getNumericValue(secret.charAt(i));
        int g = Character.getNumericValue(guess.charAt(i));
        if (s == g) bulls++;
        else {
            if (numbers[s] < 0) cows++;
            if (numbers[g] > 0) cows++;
            numbers[s] ++;
            numbers[g] --;
        }
    }
    return bulls + "A" + cows + "B";
}


scores:  1.5 / 2.0





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

