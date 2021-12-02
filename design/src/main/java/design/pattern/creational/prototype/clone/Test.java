package design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-04 15:02
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig=new Pig("pig",new Date(0L));
        Pig pig1= (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(pig1);
        System.out.println("--------");
        pig1.setBirthday(new Date(66666666666L));
        System.out.println(pig);
        System.out.println(pig1);
    }
}
