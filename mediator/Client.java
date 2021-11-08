package main.java.com.chong.mediator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:34
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediatorStructure = new MediatorStructure();

        Tenant tenant = new Tenant("李四", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);
        tenant.contact("我想租房子");
        houseOwner.contact("我可以租给你，5000一月");
    }
}
