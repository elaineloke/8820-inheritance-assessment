
/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
        Database database1 = new Database();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testAll()
    {       
        Book book1 = new Book("The Book of Food", "Jenny Jang", 2010);
        Book book2 = new Book("the book of yogurt", "jonny tings", 2019);
        Book book3 = new Book("Crazy Rich Asians", "Kevin Kwan", 2010);
        Book book4 = new Book("Everything has CHANGED", "jenny HAN", 2018);
        Journal journal1 = new Journal("Journaling through the west", 12, 2020);
        Journal journal2 = new Journal("realising journaling", 11, 2009);
        Publication publicat1 = new Publication("All about publication", 2002);
        Publication publicat2 = new Publication("publication 101", 2012);
        Publication publicat3 = new Publication("WHAT THE PUBLICATION", 2021);
        Database database1 = new Database();
        
        database1.addPublication(book4);
        database1.addPublication(book1);
        database1.addPublication(publicat1);
        database1.addPublication(journal2);
        database1.addPublication(book2);
        database1.addPublication(publicat3);
        database1.addPublication(journal1);
        database1.addPublication(book3);
        database1.addPublication(publicat2);
        
        database1.sortDetails03();
        
    }
}
