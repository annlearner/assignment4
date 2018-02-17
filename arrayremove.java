import java.util.Collection;
import java.util.HashMap;



    public class arrayremove {
        public static void main(String[] args) {
            int i;

            HashMap<Object, Object> hmap = new HashMap<Object, Object>();
            hmap.put(0, 1);
            hmap.put(1, 4);
            hmap.put(2, 5);
            hmap.put(3, 2);
            hmap.put(4, 2);
            hmap.put(5, 2);
            hmap.put(6, 6);
            hmap.put(7, 8);
            hmap.put(8, 3);
            hmap.put(9, 2);
            hmap.put(10, 1);


            Collection<Object> array = hmap.values();

            System.out.println("the array is" + array);


            for (i = 0;i<11; i++)

                if (i == 6 || i == 8) {
                    array.remove(i);

                    System.out.println("new array is " + array);
                }
            boolean IsIn = array.contains(4);
            {

                if (IsIn) {
                    // return;
                   System.out.println(IsIn);
                } else
                    System.out.println("not in array");
            }

        }
    }


