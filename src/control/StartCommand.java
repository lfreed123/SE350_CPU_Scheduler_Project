package control;

public class StartCommand implements Command{

    @Override
    public void execute(){
        System.out.println("StartCommand.execute()");
    }


}
