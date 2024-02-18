import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        // add(value)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // add(index,value)
        list.add(2,41);
        System.out.println(list);

        // clear()

        // indexOf(value)
        System.out.println(list.indexOf(2));

        // get(index)
        System.out.println(list.get(2));

        // remove(index)
        System.out.println(list.remove(3) + " is removed");
        System.out.println(list);

        // set(index,value)
        list.set(0,89);
        System.out.println(list);

        // size()
        System.out.println(list.size());

        // toString()


    }
}