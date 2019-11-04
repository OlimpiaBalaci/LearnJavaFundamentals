package intro_to_java1.operators.lightSwitches;

public class TwoSwitchesV2 {

    Switch switchA;
    Switch switchB;
    Light light;

    //Switch A      Switch B    Light
    //up            up          on
    //up            down        Off
    //down          up          off
    //down          down        on

    public void switchLogic() {
        light.off();

        if(switchA.isUp() && switchB.isUp())
            light.on();

        if(switchA.isDown() && switchB.isDown())
            light.on();
    }
}
