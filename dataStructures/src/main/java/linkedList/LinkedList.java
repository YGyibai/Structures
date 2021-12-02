package linkedList;

/**
 * 链表
 *
 * @Description: 链表
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-23 09:57
 */
public class LinkedList<E> {
    private Node dummyHead;//虚拟头结点（头结点的前一个节点）
    private int size;


    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() { return size; }

    public boolean isEmpty() { return size == 0; }

    //在链表头部添加元素e
    public void addFirst(E e) {  add(0, e);  }

    /*链表添加元素需要注意指针顺序*/
    public void add(int index, E e) {
        if (index < 0 || index >size) {
            throw new IllegalArgumentException(Thread.currentThread() .getStackTrace()[1].getMethodName()+" fail,illegal index.");
        }
        Node prev = dummyHead;//prev 表示需要插入元素的前一个位置
        for (int i = 0; i < index; i++) {
            prev = prev.next;
//                Node node=new Node(e);
//                node.next=prev.next;
//                prev.next=node;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    //获取index的元素
    public E get(int index) {
        //Method
        checkIndex(index);
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return (E) cur.e;
    }

    public void addLast(E e) { get(size - 1); }

    //    修改链表中的第index个位置的元素
    public void set(int index, E e) {
        //Method
        checkIndex(index);
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //是否包含
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {  return true; }
            cur = cur.next;
        }
        return false;
    }

    //region 从链表中删除index位置的元素，返回删除的元素
    public E remove(int index){
        //method
        checkIndex(index);
        Node prev=dummyHead;
        for (int i = 0; i < index; i++) {
            prev=prev.next;
        }
        Node retNode=prev.next;
        prev.next=retNode.next;
        retNode.next=null;
        size--;
        return (E) retNode.e;
    }
    //endregion

    public E removeFirst(){return remove(0);}

    public E removeLast(){return remove(size-1);}

    private class Node<E> {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    public void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException(Thread.currentThread() .getStackTrace()[2].getMethodName()+" fail,illegal index.");
        }
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
