package model;


/**
 * Class representing a process to be scheduled. But no real logic of schedling lives here.
 */

public class Process {
    private final int id;
    private final int placeholder1;
    private final int placeholder2;
    private final int priority;

public Process(int id, int placeholder1, int placeholder2, int priority) {
    this.id = id;
    this.placeholder1 = placeholder1;
    this.placeholder2 = placeholder2;
    this.priority = priority;
}   

public int getId() {
        return id;
    }

// Other functions will be listed here

public int getPriority() {
        return priority;
    }

}