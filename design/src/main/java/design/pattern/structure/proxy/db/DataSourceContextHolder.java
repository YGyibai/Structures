package design.pattern.structure.proxy.db;

/**
 * @Description: DataSource上下文
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-24 20:29
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER=new ThreadLocal<>();

    public static void setDbType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDbType(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDbType(){
        CONTEXT_HOLDER.remove();
    }
}
