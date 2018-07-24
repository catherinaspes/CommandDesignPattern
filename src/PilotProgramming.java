public class PilotProgramming {

    public static void main(String[] args) {

        SuperPilot superPilot = new SuperPilot();
        Light diningRoomLight = new Light("Jadalnia");
        Light kitchen = new Light("Kuchania");
        GaradgeGate garadgeGate = new GaradgeGate();
        StereoSystem stereoSystem = new StereoSystem();

        TurnOnLightCommand diningRoomTurnOnLightCommand = new TurnOnLightCommand(diningRoomLight);
        TurnOffLightCommand diningRoomTurnOffLightCommand = new TurnOffLightCommand(diningRoomLight);

        TurnOnLightCommand kitchenTurnOnLight = new TurnOnLightCommand(kitchen);
        TurnOffLightCommand kitchenTurnOffLight = new TurnOffLightCommand(kitchen);

        OpenGaradgeGateCommand openGaradgeGateCommand = new OpenGaradgeGateCommand(garadgeGate);
        CloseGaradgeGateCommand closeGaradgeGateCommand = new CloseGaradgeGateCommand(garadgeGate);

        superPilot.setCommand(0, diningRoomTurnOnLightCommand, diningRoomTurnOffLightCommand);
        superPilot.setCommand(1, kitchenTurnOnLight, kitchenTurnOffLight);
        superPilot.setCommand(2, openGaradgeGateCommand, closeGaradgeGateCommand);

        System.out.println(superPilot);
        superPilot.onButtonIsPushed(0);
        superPilot.offButtonIsPushed(0);
        superPilot.onButtonIsPushed(1);
        superPilot.offButtonIsPushed(1);
        superPilot.undoButtonIsPushed();
        superPilot.onButtonIsPushed(2);
        superPilot.offButtonIsPushed(2);




    }
}
