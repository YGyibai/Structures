package queue;

import java.util.Random;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-11 15:36
 */
public class Main {
    //测试queue opCount个入队和出队操作的时间，单位：秒;
    private static double testQueue(Queue<Integer> queue,int opCount){
        long startTime=System.nanoTime();
        Random random=new Random();
        for (int i = 0; i < opCount ; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        System.out.println(queue);
        for (int i = 0; i < opCount ; i++) {
            queue.dequeue();
        }
        long endTime=System.nanoTime();
        double time=(endTime-startTime)/1000000000.0;
        return time;
    }
    public static void main(String[] args) {
        int opCount=100000;
        ArrayQueue<Integer> arrayQueue=new ArrayQueue<>();
        double time=testQueue(arrayQueue,opCount);
        System.out.println(time);
        LoopQueue<Integer> loopQueue=new LoopQueue<>();
        time=testQueue(loopQueue,opCount);
        System.out.println(time);
    }
}
