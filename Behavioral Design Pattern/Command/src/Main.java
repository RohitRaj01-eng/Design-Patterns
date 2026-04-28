import command.*;
import invoker.CommandInvoker;
import receiver.Light;

void main() {
    Light light=new Light();
    Command turnOnCommand=new TurnOnLightCommand(light);
    Command turnOffCommand=new TurnOffLightCommand(light);
    CommandInvoker invoker=new CommandInvoker();
    invoker.setCommand(turnOnCommand);
    invoker.setCommand(turnOffCommand);
    invoker.execute();
    invoker.execute();

}
