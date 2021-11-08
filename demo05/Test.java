package homework03.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 8:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        TCsubSystem tCsubSystem = new TCsubSystem("翀翀旅行社", mediator);
        TASubsystem taSubsystem = new TASubsystem("翀翀景点", mediator);
        HSubsystem hSubsystem = new HSubsystem("翀翀旅馆", mediator);
        RSubsystem rSubsystem = new RSubsystem("翀翀餐厅", mediator);
        ASubsystem aSubsystem = new ASubsystem("翀翀机场", mediator);

        mediator.sethSubsystem(hSubsystem);
        mediator.settCsubsystem(tCsubSystem);
        mediator.setTaSubsystem(taSubsystem);
        mediator.setaSubsystem(aSubsystem);
        mediator.setrSubsystem(rSubsystem);

        tCsubSystem.contact("来新客人了");

        System.out.println("======================");
        aSubsystem.contact("食堂暂时停电暂停提供餐饮服务");
    }
}
