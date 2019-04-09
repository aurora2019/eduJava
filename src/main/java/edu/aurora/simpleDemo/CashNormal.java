package edu.aurora.simpleDemo;

/**
 * @Author aurora
 * @Description 正常收费
 * @Date Created in 14:03 2019/4/9
 * @Modified By
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
