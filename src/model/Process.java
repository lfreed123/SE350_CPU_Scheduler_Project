package model;

public class Process {
    private final int id;
    private final int arrivalTime;
    private final int burstTime;
    private final int priority;
    private ProcessState currentState;

    public Process(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
        this.currentState = new NewState();
    }

    public int getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public ProcessState getCurrentState() {
        return currentState;
    }

    /**
     * Moves this process into the given state by directly assigning the field.
     * No transition-legality checks yet — the rules come later.
     *
     * @param state the state to transition into
     */
    public void transitionTo(ProcessState state) {
        this.currentState = state;
    }
}