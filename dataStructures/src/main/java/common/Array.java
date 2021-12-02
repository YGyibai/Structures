package common;

public class Array<E> {
    private E[] data;
    private int size;//当前数组内元素数量

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        data = (E[]) new Object[10];
        size = 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new RuntimeException("Add failed! Index is illegal.");
        if (size == data.length)
            resize(2 * data.length);

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }


    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new RuntimeException("Remove failed! Index is illegal.");

        E e = data[index];
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        size--;
        data[size] = null;//这句可写可不写，都不影响的。loitering objects != leak memory

        if (size == data.length / 4 && data.length / 2 != 0)
            resize(data.length / 2);

        return e;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new RuntimeException("Get failed! Index is illegal.");
        return data[index];
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index) {
        if (index < 0 || index >= size)
            throw new RuntimeException("Set failed! Index is illegal.");
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[ ");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(",");
        }
        res.append(" ]");
        return res.toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getCapacity() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(e))
                return true;
        return false;
    }

    public int find(E e) {
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(e))
                return i;
        return -1;
    }


}