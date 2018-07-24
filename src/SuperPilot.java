import java.util.Arrays;
import java.util.concurrent.Callable;

public class SuperPilot {

    Command [] commandsOn;
    Command [] commandsOff;
    Command undoCommand;

    public SuperPilot() {
        commandsOn = new Command[7]; //dla pilota na 7 urządzeń
        commandsOff = new Command[7];
        Command noCommand = new NoCommand();

        for (int i = 0; i<7; i++){
            commandsOn[i] = noCommand;
            commandsOff[i] = noCommand;

        }
        undoCommand = noCommand;

    }

    public void setCommand(int slot, Command commandOn,Command commandOff){
        commandsOn[slot] = commandOn;
        commandsOff[slot] = commandOff;

    }

    public void onButtonIsPushed(int slot){
        commandsOn[slot].execute();
        undoCommand  = commandsOn[slot];
    }
    public void offButtonIsPushed(int slot){
        commandsOff[slot].execute();
        undoCommand = commandsOff[slot];
    }
    public void undoButtonIsPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Pilot-----\n");
        for(int i = 0; i<commandsOn.length; i++){
            stringBuffer.append("[slot "+ i+" ] " +commandsOn[i].getClass().getName()+
                    " "+commandsOff[i].getClass().getName()+ " \n");
        }

        return stringBuffer.toString();
    }
}
