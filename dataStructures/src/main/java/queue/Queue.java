package queue;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-12 16:30
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();

    /**
     * 插入数据(入队)
     * @param e
     */
    void enqueue(E e);

    /**
     * 删除数据（出队）
     * @return
     */
    E dequeue();

    /**
     * 查看队首元素
     * @return
     */
    E getFront();
}
