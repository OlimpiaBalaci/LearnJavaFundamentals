package intro_to_java1.operators.lightSwitches;

public class ThreeSwitchesV2 {

    Switch switchA, switchB, switchC;
    Light light;

    //Switch A      Switch B    Switch C    Light
    //F             F           F           F
    //F             F           T           T
    //F             T           F           T
    //F             T           T           F
    //-------------------------------------------------
    //T             F           F           T
    //T             F           T           F
    //T             T           F           F
    //T             T           T           T

    public void switchLogic() {
        boolean a = switchA.isUp();
        boolean b = switchB.isUp();
        boolean c = switchC.isUp();

        if (!a && !b && c ||
                !a && b && !c ||
                a && !b && !c ||
                a && b && c)
            light.on();
        else
            light.off();
    }

}
