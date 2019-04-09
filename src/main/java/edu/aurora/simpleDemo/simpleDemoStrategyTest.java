package edu.aurora.simpleDemo;

/**
 * @Author aurora
 * @Description “简单工厂模式需要让客户端认识两个类，CashSuper和CashFactory，而策略模式与简单工厂结合的用法，客户端就只需要认识一个类CashContext就可以了。耦合更加降低。”“我们在客户端实例化的是CashContext的对象，调用的是CashContext的方法getResult，这使得具体的收费算法彻底地与客户端分离。连算法的父类CashSuper都不让客户端认识了。”
 * @Date Created in 16:56 2019/4/9
 * @Modified By
 *
 */
public class simpleDemoStrategyTest {

    // hi需要知道CashContext一个类 CashContext使用反射
    public static void main(String[] args) {
        CashContext context = null;
        double money = 0.0;
        String type = "edu.aurora.simpleDemo.CashRebate";
        Class[] paramTypes = {double.class};
        Object[] params = {7.0};

        context = new CashContext(type, paramTypes, params);
        money = context.getResult(900);
        System.out.println(money);
    }

}
