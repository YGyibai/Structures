package design.pattern.creational.singleton;

/**
 * @Description:    枚举单例
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-28 11:28
 */
public  enum EnumInstance {
    INSTANCE;
    private Object data;

    private EnumInstance(){
        System.out.println("INSTANCE now created!");
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
