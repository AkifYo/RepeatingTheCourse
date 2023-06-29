package C04_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L04_Iterator {
    public static void main(String[] args) {


        List<String> animals=new ArrayList<>();
        animals.add("essek");
        animals.add("karga");
        animals.add("it");
        animals.add("horoz");
        animals.add("yilan");
        animals.add("tosba");
        Iterator<String> it = animals.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }

}
