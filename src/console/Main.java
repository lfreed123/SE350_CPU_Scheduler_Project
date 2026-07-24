package console;

// Will need to use these libraries but code will need to change
import java.util.Arrays;
import java.util.Comparator;

import model.Process;

/**
 * This is just a temporary test script to verify the scheduling math. It isn’t connected to the actual app yet.
 */
public class Main {
    public static void main(String[] args) {
        // id, arrivalTime, burstTime, priority
        Process[] processes = {
                new Process(1, 0, 5, 0),
                new Process(2, 2, 3, 0),
                new Process(3, 4, 4, 0),
        };

        

        int currentTime = 0;
        int totalWaiting = 0;

        System.out.println("Run order ():");
        for (Process p : processes) {
            // CPU may idle
            if (currentTime < p.getArrivalTime()) {
                currentTime = p.getArrivalTime();
            }

            int waitingTime = currentTime - p.getArrivalTime();
            totalWaiting += waitingTime;

            System.out.printf("  P%d  start=%d  burst=%d  waiting=%d%n",
                    p.getId(), currentTime, p.getBurstTime(), waitingTime);

            currentTime += p.getBurstTime();
        }

        // Calculate and display performance metric
        System.out.printf("Average waiting time: %.2f%n",
                (double) totalWaiting / processes.length);
    }
}
