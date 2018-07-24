public class MiniPilot {

    Command slot;

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPushed(){
        slot.execute();
    }
}
