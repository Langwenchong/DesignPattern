package main.java.com.chong.mediator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:31
 * @Version 1.0
 */

//具体的中介者角色类
public class MediatorStructure extends Mediator {
    //聚合房主和具体的租房者
    Tenant tenant;
    HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void contact(String msg, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(msg);
        } else {
            houseOwner.getMessage(msg);
        }
    }
}
