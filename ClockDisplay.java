
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Clase ClockDisplay con atributos de la clase NumberDisplay.
public class ClockDisplay
{
   
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    
    public ClockDisplay()
    { 
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplay(int newHours,int newMinutes)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
        hours.setValue(newHours);
        minutes.setValue(newMinutes);
    }

    public void setTime(int actualHours,int actualMinutes)
    {
        hours.setValue(actualHours);
        minutes.setValue(actualMinutes);
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    public void timeTick()
    {
        minutes.increment();
        if (minutes.getValue() == 0)
        {
            hours.increment();
        }
        updateDisplay();

    }

    private void updateDisplay()
    {

        if (hours.getValue()> 11)
        {   
            int setHour = hours.getValue() - 12;
            displayString= setHour+ ":" + minutes.getDisplayValue() + "pm";
        }
        else
        {
            displayString= hours.getDisplayValue()+ ":" + minutes.getDisplayValue() + "am";
        }

    }
}