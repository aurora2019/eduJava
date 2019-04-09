package edu.aurora.simpleDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author aurora
 * @Description Context上下文，维护对strategy对象的引用
 * @Date Created in 16:16 2019/4/9
 * @Modified By
 */
public class CashContext {
    //CashSuper cs = null;

    /*public CashContext(String strategy) {
        switch(strategy){
            case "正常" :
                cs = new CashNormal();
                break;
            case "打折":
                cs = new CashRebate(7);
                break;
            case "满减" :
                cs = new CashReturn(500,100);
                break;
            default:
                break;

        }
    }*/
    Class<?> clazz = null;
    Object obj = null;
    // 使用反射去除switch
    public CashContext(String className, Class[] paramsType,  Object[] params){

        try {
            clazz = Class.forName(className);
            Constructor con = clazz.getConstructor(paramsType);

                obj = con.newInstance(params);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
             e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
    }

    public double getResult(double money){
        return ((CashSuper)obj).acceptCash(money);
    }
}
