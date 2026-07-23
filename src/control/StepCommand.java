package control;

public class StepCommand implements Command {

    @Override
    public void execute(){
        System.out.println("StartCommand.execute()");
    }

}
