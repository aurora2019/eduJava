package edu.aurora.simpleDemo;

/**
 * @Author aurora
 * @Description
 * @Date Created in 14:05 2019/4/9
 * @Modified By
 */
public class CashRebate implements CashSuper {
   // 折扣
    private double moneyRebate;

    // 带参构造器
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * ( moneyRebate / 10);
    }
}
