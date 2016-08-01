package card_game;

class Player
{
    public Card hand[];
    public int wallet;
    private boolean active;

    public Player(int cardsInHand, int walletStart)
    {
        hand[] = new Card[cardsInHand];
        wallet = walletStart;
        active = false;
    }
    
    public void draw(Card card)
    {
    	for(int i=0; i < this.hand.length; i++){
    		if(this.hand[i] !== null) {
    			this.hand[i] = card;
    			break;
    		}
    	}
    }

    public Card discard(int cardIdx)
    {
        Card discarded = this.hand[cardIdx];
        this.hand[cardIdx] = null;
        
        return discarded;
    }

    public int bet(int ammount)
    {
        this.wallet -= ammount;
        return ammount;
    }

    public void earn(int ammount)
    {
    	this.wallet += ammount;
    }
    
    public void toggleActive()
    {
        this.active != this.active;
    }
}