import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(3);
        System.out.println(list.isEmpty());
//        for(Integer x:list) {
//            System.out.println(list.get(0));
//        }
        //System.out.println(list);
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        list.add(2,8);
        System.out.println(list);
        System.out.println(list.size());
    }
}
