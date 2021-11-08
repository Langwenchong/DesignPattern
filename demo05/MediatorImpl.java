package homework03.demo05;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 8:43
 * @Version 1.0
 */
public class MediatorImpl implements Mediator {
    private List<SubSystem> subSystemList = new ArrayList<>();
    private TCsubSystem tCsubsystem;
    private TASubsystem taSubsystem;
    private RSubsystem rSubsystem;
    private ASubsystem aSubsystem;
    private HSubsystem hSubsystem;

    public TCsubSystem gettCsubsystem() {
        return tCsubsystem;
    }

    public void settCsubsystem(TCsubSystem tCsubsystem) {
        this.tCsubsystem = tCsubsystem;
        this.subSystemList.add(tCsubsystem);
    }

    public TASubsystem getTaSubsystem() {
        return taSubsystem;
    }

    public void setTaSubsystem(TASubsystem taSubsystem) {
        this.taSubsystem = taSubsystem;
        this.subSystemList.add(taSubsystem);
    }

    public RSubsystem getrSubsystem() {
        return rSubsystem;
    }

    public void setrSubsystem(RSubsystem rSubsystem) {
        this.rSubsystem = rSubsystem;
        this.subSystemList.add(rSubsystem);
    }

    public ASubsystem getaSubsystem() {
        return aSubsystem;
    }

    public void setaSubsystem(ASubsystem aSubsystem) {
        this.aSubsystem = aSubsystem;
        this.subSystemList.add(aSubsystem);
    }

    public HSubsystem gethSubsystem() {
        return hSubsystem;
    }

    public void sethSubsystem(HSubsystem hSubsystem) {
        this.hSubsystem = hSubsystem;
        this.subSystemList.add(hSubsystem);
    }

    @Override
    public void contact(String msg, SubSystem system) {
        for (SubSystem subSystem : this.subSystemList) {
            if (system != subSystem) {
                subSystem.getMessage(msg);
            }
        }
    }
}
