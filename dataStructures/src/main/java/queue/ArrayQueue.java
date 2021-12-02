package queue;

import common.Array;

/**
 * @Description:  普通队列
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-12 16:32
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;



    public ArrayQueue(int capacity){
        array=new Array<>(capacity);
    }
    public ArrayQueue(){
        array=new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
    public int getCapacity(){return  array.getCapacity();}
    //对尾插入
    @Override
    public void enqueue(E e) {
            array.addLast(e);
    }
    //队头删除
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append("Queue： ");
        res.append("front [");
        for (int i = 0; i <array.getSize() ; i++) {
            res.append(array.get(i));
            if (i!=array.getSize()-1)
                res.append("，");
        }
        res.append("] tail");
        return res.toString();
    }


    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
