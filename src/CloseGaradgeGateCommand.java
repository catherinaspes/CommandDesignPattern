public class CloseGaradgeGateCommand implements Command{

    GaradgeGate garadgeGate;

    public CloseGaradgeGateCommand(GaradgeGate garadgeGate) {
        this.garadgeGate = garadgeGate;
    }

    @Override
    public void execute() {
        garadgeGate.closeGate();
    }

    @Override
    public void undo() {
        garadgeGate.openGate();
    }
}
