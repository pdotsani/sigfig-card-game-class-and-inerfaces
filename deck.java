package card_game;

public class Deck
{
    private Card[] stack;
    private Card[] discarded;
    private int mark; 

    public Deck()            
    {
        stack[] =  new Card[52];
        char[] suites = { 'd', 'c', 'h', 's' };
        mark = 0;

        for(int i=0; i < suites.length; i++){
            int inc = 0;

            for(int j=0; j < 13; j++)
            {
                int c = j + 1;
                this.stack[j] = new Card(suites[i], c); 
            }
            
            inc += 13;
        }
    }
    
    public void shuffle()
    {
        int[] shuffleOrder = new int[stack.length];
        int[] newStack =  new int[stack.length];

        for(int i=0; i < stack.length; i++){
            // Generate random idx with range 0..51
            // if idx value is not present in shuffleOrder, declare as suffleOrder[i]
            // if idx value is present, repeat sequence
            
            // Erase discarded[i] = null;
        }

        for(int i=0; i < stack.length; i++){
            // Take i value from shuffleOrder and use as index for stack
            // tacke the stack value at (stack[shuffleOrder[i]]) and assign to (newStack[i])
        }

        this.stack = newStack;
    }
    
    public Card deal(int num)
    {
        if(this.mark === this.stack.length - 1){
            this.shuffle();
        }
        
        Card out = this.stack[this.stack.length - 1 - this.mark];
        this.stack[this.stack.length - 1 - this.mark] = null;
        this.discarded[this.mark - 1] = out;
        this.mark += 1;

        return out;
    }
}


public class DeckWJoker extends Deck
{
    public DeckWJoker(int jokers, int jokerVal)
    {
        super(stack[], discarded[]);    
        stack[] =  new Card[52 + jokers];
        char[] suites = { 'd', 'c', 'h', 's', 'j' };
        mark = 52 + jokers;

        for(int i=0; i < suites.length; i++){
            int inc = 0;
            for(int j=0; j < 13; j++){
                int c = j + 1;
                this.stack[j + inc] = (suites[i] === 'j') ? new Card(suites[i], jokerVal) : new Card(suites[i], c);
            }
            inc += 13;
        }

        for(int i=0; i < this.stack.length; i++){
            System.out.println(i + "--" + this.stack[i].suite + ":" + this.stack[i].card);
        } 
    }
}