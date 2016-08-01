package card_game;

public class Gamestate
{
	private Deck deck;
	private Player players[];
	private Rules rules;
	private int pot;
	private int turn;
	
	public boolean finished;

	public Gamestate(Deck deck, Player players[], int pot, Rules rules)
	{
	}

	public void dealTo(int from, int to)
	{
	}

	public void playerTossCard(int playerIdx)
	{
	}

	public int takeFromPot(int ammount, Player player)
	{
		this.pot -= ammount;
		// ref from player, if null just execute action
	}

	public void addToPot(int ammount, Player player)
	{
		this.pot += ammount;
		// ref from player, if null just execute action
	}

	public void toggleTurn()
	{
	}

	// Getters
	public Player[] getPlayers()
	{
		return this.players[];
	}

	public Deck getDeck()
	{
		return this.deck;
	}

	public int getPot()
	{
		return this.pot;
	}

	public Player getCurrentPlayer()
	{
		return this.players[this.turn];
	}
}

public interface Gameplay
{
	public Gamestate startNewGame()
	{
		// Set new Gamestate
		Gamestate newgame = new Gamestate(/* add args here */);
		// Run setup for new game here...
		return newgame;
	}

	public void takeTurn(Gamestate *state)
	{
	}

	public void endGame(Gamestate *state)
	{
	}

	public void prepNextTurn(Gamestate *state)
	{
	}

	public void checkWinner(Gamestate *state)
	{
	}
}