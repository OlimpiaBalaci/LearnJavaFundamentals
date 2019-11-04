package intro_to_java1.operators.lightSwitches;

public class TwoSwitches {
    Switch switchA;
    Switch switchB;
    Light light;

    //How the switches work
    //Switch A      Switch B    Light
    //up            up          Off
    //up            down        on
    //down          up          on
    //down          down        Off
    public void switchLogic() {
        if (switchA.isUp())
            light.on();
        else
            light.off();

        if (switchB.isUp())
            light.off();
        else
            light.on();


    }


}
