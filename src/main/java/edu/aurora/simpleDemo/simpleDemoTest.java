package edu.aurora.simpleDemo;

import org.junit.jupiter.api.Test;

/**
 * @Author aurora
 * @Description
 * @Date Created in 15:15 2019/4/9
 * @Modified By
 */
public class simpleDemoTest {

    @Test
    public void test(){

        // 需要知道 CashSuper 和 CashFactory两个类
        CashSuper cashSuper = CashFactory.createCashAccept("打折");
        System.out.println(cashSuper.acceptCash(1000));
        cashSuper = CashFactory.createCashAccept("正常");
        System.out.println(cashSuper.acceptCash(1000));
        cashSuper = CashFactory.createCashAccept("满减");
        System.out.println(cashSuper.acceptCash(600));

        // 面对我们不断的需求变化，选择策略模式

    }
}
