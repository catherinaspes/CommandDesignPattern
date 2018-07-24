public class StereoSystemOnCommand implements Command {

    StereoSystem stereoSystem;

    public StereoSystemOnCommand(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    @Override
    public void execute() {
        stereoSystem.onStereoSystem();
        stereoSystem.setCD();
        stereoSystem.setVolume(10);

    }

    @Override
    public void undo() {
        stereoSystem.offStereoSystem();
    }
}
