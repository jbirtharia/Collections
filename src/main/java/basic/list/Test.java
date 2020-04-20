package basic.list;

import basic.set.Student;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("text");
        System.out.println(sb.equals("text"));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Every collection class implements Cloneable and Serializable interface.
        ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();
        System.out.println("List : "+list1);

        //synchronizedList() method will provide synchronized version of list. By default list is non-synchronised.
        List<Integer> synchronizedList = Collections.synchronizedList(list1);
        System.out.println("Synchronized list : "+synchronizedList);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
            if(i==10) {
                System.out.println("Removing "+i);
                //Cannot remove element from list using Iterator. It will throw java.util.ConcurrentModificationException
                //list.remove(new Integer(10));
                iterator.remove();
            }
        }
    }
}
