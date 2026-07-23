package control;

public class PauseCommand implements Command {

    @Override
    public void execute(){
        System.out.println("PauseCommand.execute()");
    }

}
