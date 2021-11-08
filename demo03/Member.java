package homework02.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 15:33
 * @Version 1.0
 */
public class Member extends Component {


    public Member(String name) {
        this.name = name;

    }
    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }
    private String name;

    @Override
    public void add(Component ccomponent) {
        System.out.println("调这个函数也没用");

    }


    @Override
    public void remove(Component component) {
        System.out.println("调这个函数也没用");

    }


    @Override
    public void share(Component component) {
        if (component instanceof Group) {
            ArrayList<Component> components = ((Group) component).getComponents();


            if (components.contains(this)) {
                components.remove(this);


            }

            for (Component obj : components) {
                obj.share(obj);

            }

            components.add(this);

        } else if (component instanceof Member) {
            ((Member) component).onMessage();

        }


    }


    public void onMessage() {
        System.out.println(this.getName() + "收到消息");

    }

}

