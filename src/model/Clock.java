package model;

/**
 * Singleton simulation clock. Intended to be the single source for
 * the current simulation tick once the scheduler is wired to it.
 */
public class Clock {
    private static final Clock INSTANCE = new Clock();

    private Clock() {
    }

    public static Clock getInstance() {
        return INSTANCE;
    }

    /** Advances the clock by one tick. No-op for now. */
    public void tick() {
        
    }


    public int getCurrentTick() {
        return 0;
    }
}
