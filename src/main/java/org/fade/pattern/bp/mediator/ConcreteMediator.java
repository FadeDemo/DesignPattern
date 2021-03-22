package org.fade.pattern.bp.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者模式
 * 具体中介者
 * @author fade
 * */
public class ConcreteMediator extends Mediator {

    private Map<String,Colleague> colleagueMap;

    private Map<String,String> interMap;

    public ConcreteMediator(){
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if (colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }
        else if (colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }
        else if (colleague instanceof Curtain){
            interMap.put("Curtain",colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange==0){
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTV();
            }
            else if (stateChange==1){
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        }
        else if (colleagueMap.get(colleagueName) instanceof TV){
            ((Curtain)(colleagueMap.get(interMap.get("Curtain")))).upCurtain();
        }
    }

}
