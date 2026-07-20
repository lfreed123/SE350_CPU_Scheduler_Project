package control;

import model.SchedulingStrategy;

public class SchedulerEngine {
    private final SchedulingStrategy strategy;

    public SchedulerEngine(SchedulingStrategy strategy) {
        this.strategy = strategy;
    }
}
