import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(10);
        System.out.println(binarySearch(list,3));

    }
    static int binarySearch(List list, int x){
        int low = 0;
        int high = list.size()-1;
        while (high >= low) {
            int m = (high+low)/2;
            if ((int)list.get(m)==x) {
                return m;
            }
            else if((int)list.get(m)>x){
                high = m-1;
            }
            else {
                low = m+1;
            }
        }
        return -1;
    }
}
