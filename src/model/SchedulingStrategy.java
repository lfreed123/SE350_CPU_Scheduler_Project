package model;

import java.util.List;


public interface SchedulingStrategy {
    /**
     * Selects the next process to run from the given ready queue.
     * readyQueue the processes currently ready to run
     * returns the process to run next
     */
    Process selectNext(List<Process> readyQueue);
}

