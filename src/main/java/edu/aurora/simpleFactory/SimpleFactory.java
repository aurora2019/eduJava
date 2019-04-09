package edu.aurora.simpleFactory;

/**
 * @Author aurora
 * @Description
 * @Date Created in 12:37 2019/4/9
 * @Modified By
 */
public class SimpleFactory {

    /*public Person createPerson(String type){
        if("customer".equals(type)){
            return new Customer();
        }else if("salesclerk".equals(type)) {
            return new Salesclerk();
        }else if("boss".equals(type)) { // 修改添加
            return new Boss();
        }else {
            return null;
        }
    }*/

    public Object createPerson(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        return Class.forName(classname).newInstance();

    }
}
