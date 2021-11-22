
/**
 * A superclass model for book and journal
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Publication
{
    private String title;     // The title of the publication
    private int year;         // The year when the publication was published

    /**
     * Constructor for objects of class Publication
     * 
     * @param title     The title of the publication.
     * @param year      The year when the publication was published.
     */
    public Publication(String title, int year)
    {
        this.title = title;
        this.year = year;
    }

    /**
     * Get the title of the publication
     * 
     * @return The title of the publication
     */
    public String getTitle()
    {
        return title;
    }
    
     /**
     * Get the year of the publication when it was published
     * 
     * @return  The  year of the publication when it was published
     */
    public int getYear()
    {
        return year;
    }
    
     /**
     * Get the details of the publication
     * 
     * @return A string containing the details of the publication
     */
    public String toString(){
          return getTitle() + ", " + getYear();
    }
    
     /**
     * Get the details of the publication
     * 
     * @return A string containing the details of the publication
     */
    public String pubPrint(){
          return "Publication: " + toString();
    }
}
