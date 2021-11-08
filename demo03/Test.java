package homework02.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 15:43
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Component group1 = new Group("Group1");
        Component member1 = new Member("member1");
        Component member2 = new Member("member2");
        Component member3 = new Member("member3");
        Component member4 = new Member("member4");

        group1.add(member1);
        group1.add(member2);
        group1.add(member3);
        group1.add(member4);

        System.out.println(((Member) member1).getName() + "分享了一条新动态");
        member1.share(group1);

        System.out.println("---------------------------");

        Component group2 = new Group("group2");
        group2.add(group1);
        Component member5 = new Member("member5");
        group2.add(member5);
        System.out.println(((Member) member5).getName() + "分享了一条新动态");
        member5.share(group2);

    }
}
