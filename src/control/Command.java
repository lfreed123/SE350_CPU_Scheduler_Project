package control;

/**
 * The user-triggers an action from the scheduler ui.
 * Each control button will be mapped to a command that is constructed and linked,
 * which will execute on click
 */


public interface Command {
    void execute();
}
