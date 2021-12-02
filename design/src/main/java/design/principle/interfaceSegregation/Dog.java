package design.principle.interfaceSegregation;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-18 09:52
 */
public class Dog implements EatAnimalAction,SwimAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
