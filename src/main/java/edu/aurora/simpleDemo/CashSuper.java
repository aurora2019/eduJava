package edu.aurora.simpleDemo;

/**
 * @Author aurora
 * @Description 收费接口  抽象收费  正常收费、打折、满减
 * @Date Created in 13:59 2019/4/9
 * @Modified By
 */
public interface CashSuper {
    /**
     * 计算实收的费用
     * @param money 应收金额
     * @return
     */
    double acceptCash(double money);
}
