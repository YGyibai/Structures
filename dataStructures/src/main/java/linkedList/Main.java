package linkedList;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-27 10:05
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i <5 ; i++) {
            list.addFirst(i);
            System.out.println(list);
        }
        list.add(2,666);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

    }
}
