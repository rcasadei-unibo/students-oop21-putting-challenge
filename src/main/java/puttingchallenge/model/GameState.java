package puttingchallenge.model;
/**
 * 
 * Interface for maintaining and handling the states of the game.
 *
 */
public interface GameState {
    /**
     * Sets the initial state.
     */
    void initState();
    /**
     * @return
     *          the current {@link GameStatus} of the game
     */
    GameStatus getStatus();
    /**
     * @return
     *          the {@link GameStateManager} object
     */
    GameStateManager getGameStateManager();
    /**
     * @return
     *          the {@link Environment} object
     */
    Environment getEnvironment();
}
