package invoker;

import command.Command;
import receiver.*;

import java.util.LinkedList;
import java.util.Queue;

public class CommandInvoker {
    private final Queue<Command> commandQueue=new LinkedList<>();

    public void setCommand(Command command) {
        commandQueue.add(command);
    }

    public void execute(){
        Command command=commandQueue.poll();
        if(command!=null)command.execute();
    }
}
