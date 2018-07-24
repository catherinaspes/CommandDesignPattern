public class OpenGaradgeGateCommand implements Command {

    GaradgeGate garadgeGate;

    public OpenGaradgeGateCommand(GaradgeGate garadgeGate) {
        this.garadgeGate = garadgeGate;
    }

    @Override
    public void execute() {
        garadgeGate.openGate();
    }

    @Override
    public void undo() {
        garadgeGate.closeGate();
    }
}
