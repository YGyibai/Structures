package stack;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-11 10:42
 */
public interface Stack<T> {
    /**
     *  栈容量
     * @author: 北风
     */
    int getSize();
    /**
     *  是否为空
     * @author: 北风
     */
    boolean isEmpty();
    /**
     *  进栈
     * @author: 北风
     */
    void push(T t);
    /**
     *  出栈
     * @author: 北风
     */
    T pop();
    /**
     *  查看栈顶
     * @author: 北风
     * @date: 2021/8/28
     */
    T peek();
}
