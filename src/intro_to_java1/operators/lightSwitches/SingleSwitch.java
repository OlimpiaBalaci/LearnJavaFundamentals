package intro_to_java1.operators.lightSwitches;

public class SingleSwitch {
    Switch switchA;
    Light light;
    //Switch A  Light
    //F         F
    //T         T

    public void switchLogic(){
        if(switchA.isUp())
            light.on();
        else
            light.off();
    }
}
