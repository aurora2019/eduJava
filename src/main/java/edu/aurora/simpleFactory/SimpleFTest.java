package edu.aurora.simpleFactory;

import org.junit.jupiter.api.Test;

/**
 * @Author aurora
 * @Description
 * @Date Created in 12:36 2019/4/9
 * @Modified By
 */
public class SimpleFTest {
    // 简单工厂模式 不符合开闭原则；如果现在要增加一个对象，需要对工厂的if else进行修改
    // 对扩展开放，对修改关闭
    @Test
    public void doSession() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        SimpleFactory simpleFactory = new SimpleFactory();
        /*Person salesclerk = simpleFactory.createPerson("salesclerk");
        Person customer = simpleFactory.createPerson("customer");
        Person boss = simpleFactory.createPerson("boss");*/
        Person salesclerk = (Person) simpleFactory.createPerson("edu.aurora.simpleFactory.Salesclerk");
        Person customer = (Person) simpleFactory.createPerson("edu.aurora.simpleFactory.Customer");
        Person boss = (Person) simpleFactory.createPerson("edu.aurora.simpleFactory.Boss");
        salesclerk.say();
        customer.say();
        boss.say();
    }
}
