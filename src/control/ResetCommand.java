package control;

public class ResetCommand implements Command {

    @Override
    public void execute(){
        System.out.println("ResetCommand.execute()");
    }

}
