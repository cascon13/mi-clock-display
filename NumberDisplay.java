
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    private int limit;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        limit = newLimit;
        display = 0;
    }
  
    public void setValue(int newDisplay)
    {
        display = newDisplay;
    }
    
    public void getDisplayValue()
    {
        if(display <10)
        {
            System.out.println("0" + display);
        }
        else
        {
            System.out.println(display);
        }
    }
    
    public int getValue()
    {
        return display;
    }
    
    public void increment()
    {
        
        if ( display < limit)
        {
            display ++;
        }
        else 
        {
            display = 0;
        }
    }
}
