package edu.aurora.simpleFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 12:33 2019/4/9
 * @Modified By
 */
public class Customer implements Person {
    @Override
    public void say() {
        System.out.println("你好，请问这件衣服有另外的颜色吗？");
    }
}
