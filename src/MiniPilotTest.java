public class MiniPilotTest {

    public static void main(String[] args) {
        MiniPilot miniPilot = new MiniPilot();
        Light light = new Light("bla");

        GaradgeGate garadgeGate = new GaradgeGate();

        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);

        miniPilot.setSlot(turnOnLightCommand);
        miniPilot.buttonWasPushed();

        OpenGaradgeGateCommand openGaradgeGateCommand = new OpenGaradgeGateCommand(garadgeGate);
        miniPilot.setSlot(openGaradgeGateCommand);
        miniPilot.buttonWasPushed();
    }
}
