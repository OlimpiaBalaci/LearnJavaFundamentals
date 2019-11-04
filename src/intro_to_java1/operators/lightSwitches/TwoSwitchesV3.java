package intro_to_java1.operators.lightSwitches;

public class TwoSwitchesV3 {

    //Switch A      Switch B    Light
    //up            up          Off
    //up            down        on
    //down          up          on
    //down          down        Off
    Switch switchA, switchB;
    Light light;

    public void switchLogic()
    {
        if(switchA.isUp() && switchB.isUp() ||
                switchA.isDown() && switchB.isDown())
            light.on();
        else
            light.off();
    }

}
