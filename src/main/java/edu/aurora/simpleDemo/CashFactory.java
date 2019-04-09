package edu.aurora.simpleDemo;

/**
 * @Author aurora
 * @Description 收费对象生成工厂
 * @Date Created in 14:26 2019/4/9
 * @Modified By
 */
public class CashFactory {
    public static CashSuper createCashAccept(String cashType){

        CashSuper cs = null;
        switch(cashType){
            case "正常":
                cs = new CashNormal();
                break;
            case "打折":
                cs =  new CashRebate(8);
                break;
            case "满减":
                cs = new CashReturn(300 ,100);
                break;
            default :

                    break;
        }
        return cs;
    }

}
