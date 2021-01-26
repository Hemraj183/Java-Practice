import java.util.ArrayList;
import java.util.Iterator;
class Iterator{
        public static void main(String args[]){
                ArrayList Li = new ArrayList();
                Li.add("Ram");
                Li.add("Shyam");
                Li.add("Hari");

                Iterator It = Li.iterator();

                while(It.hasNext()) {
                    String obj = (String)It.next();
                    System.out.println(obj);
                }
            }

        }

