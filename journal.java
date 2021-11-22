/**
 * A simple model of a Journal
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Journal extends Publication
{
    private int month;          // The month when the journal was published

    /**
     * Create a journal. 
     * 
     * @param title     The title of the journal.
     * @param month     The month when the journal was published.
     * @param year      The year when the journal was published.     
     */
    public Journal(String title, int month, int year)
    {
        super(title, year);
        this.month = month;
        
    }

    /**
     * Get the month of the journal when it was published
     *  
     * @return  The month of the journal when it was published
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Get the details of the journal
     *  
     * @return  The details of the journal including 
     *          the title, publisher, month and year
     */
    public String toString()
    {
        return "Journal: " + super.toString() + " (" + getMonthName(month) + ")";      
    }             
    
    /**
     * Check if the journal is the same as the given one.
     * 
     * @param obj The given object.
     * 
     * @return true if the journal and the given object are the same 
     *         or they have the same title, year and month; 
     *         false otherwise
     */
    public boolean equals(Object obj) {        
        if (this == obj) return true;
        
        if ( !(obj instanceof Journal) ) return false;
        
        Journal aJournal = (Journal) obj;
        return getTitle().equals(aJournal.getTitle()) &&
               this.month == aJournal.month &&
               getYear() == aJournal.getYear();
    }    
    
    /**
     * To get the first three letters of a given month's name
     * 
     * @param month A given month
     * @return   The first three letters of the given month's name
     */
    private String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Unknown";
        }
    }    
}
