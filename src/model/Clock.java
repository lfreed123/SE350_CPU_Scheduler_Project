package model;

/**
 * Singleton simulation clock. Intended to be the single source of truth for
 * the current simulation tick once the scheduler is wired to it.
 * Methods are stubs for now — no meaningful timekeeping yet.
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
        // TODO: advance the current tick once timekeeping is implemented.
    }

    /**
     * @return the current simulation tick. Always 0 for now.
     */
    public int getCurrentTick() {
        return 0;
    }
}