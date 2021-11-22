import java.util.*;

/**
 * A database for a collection of publications, e.g. books and journals
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Database
{
    // A collecion of publication
    private ArrayList<Publication> publicationList;
    private ArrayList<Publication> books;
    private ArrayList<Publication> publications;
    private Publication pubs;

    /**
     * Create a new database
     */
    public Database()
    {
        publicationList = new ArrayList<Publication>();
    }  

    /**
     * Add a non-null publication
     * 
     * @param newPublication The publication to be added
     */
    public void addPublication(Publication newPublication) {
        if (newPublication != null ) {
            publicationList.add(newPublication);
        }
        if (publicationList.contains(newPublication)){
            System.out.println(newPublication);
        }
    }  

    /**
     * Get the total number of publications 
     * 
     * @return The total number of publications  
     */
    public int getTotal() {
        return publicationList.size();
    }    

    /** 
     * 
     * Print the details of all publications
     */
    public void printList() {
        for (Publication publication: publicationList) {
            System.out.println(publication);
        }
        System.out.println("Total number of publications: " + getTotal());
    }   

    /**
     * Get the list of books published in a given year 
     * 
     * @param year A given year
     * @return A list of books published in a given year 
     */
    public String listOfBooks(int year) {
        ArrayList<Publication> books = new ArrayList<Publication>();
        for (Publication publication : publicationList) {
            if(publication instanceof Book && publication.getYear() == year){
                books.add(publication);
            }
        }  
        return books.toString();
    }

    /**
     * Get the details of all publications 
     * 
     * Prints the details of all publications in order of category and title within each category 
     * Using additional pubPrint() method in Publication class
     * And CASE_INSENSITIVE_ORDER to print original inputs
     */
    public void sortDetails01(){ 
        ArrayList<String> allDetails = new ArrayList<>();
        for(Publication details : publicationList){
            if(details.getClass().toString().contains("Publication")){
                allDetails.add(details.pubPrint());
            } else{
                allDetails.add(details.toString());
            }
        }
        Collections.sort(allDetails, String.CASE_INSENSITIVE_ORDER);
        for(String sortedList : allDetails){
            System.out.println(sortedList);
        }
    }

    /**
     * Get the details of all publications 
     * 
     * Prints the details of all publications in order of category and title within each category 
     * By embedding String pub method directly to print "Publication: " for Publication category
     * Outputs will be all lowercase only
     */
    public void sortDetails02(){ 
        ArrayList<String> allDetails = new ArrayList<>();
        for(Publication details : publicationList){
            String fullDetails = details.toString().toLowerCase();
            if(details.getClass().toString().contains("Publication")){
                String pub = "publication: " + fullDetails;
                allDetails.add(pub);
            } else{
                allDetails.add(fullDetails);
            }
        }
        Collections.sort(allDetails);
        for(String sortedList : allDetails){
            System.out.println(sortedList);
        }
    }

    /**
     * Get the details of all publications 
     * 
     * Prints the details of all publications in order of category and title within each category 
     * Using SortedSet TreeSet to sort inputs alphabetically
     * And compare TreeSet and ArrayList which contains original case sensitive inputs 
     * Outputs will be printed in the original case sensitive inputs instead of being 
     * converted to all lower or upper case
     */
    public void sortDetails03(){
        SortedSet<String> ts = new TreeSet<>();
        for(Publication details : publicationList){
            String fullDetails = details.toString().toLowerCase();
            if(details.getClass().toString().contains("Publication")){
                String pub = "publication: " + fullDetails;
                ts.add(pub);
            } else{
                ts.add(fullDetails);
            }
        }
        ArrayList<String> allDetails = new ArrayList<>();
        for(Publication pubs : publicationList){
            if(pubs.getClass().getName().contains("Publication")){
                String pub = "Publication: " + pubs;
                allDetails.add(pub);
             } else {
                allDetails.add(pubs.toString());
            }
        }
        for(String sort : ts){
            for(String list : allDetails){
                if(sort.equalsIgnoreCase(list.toString())){
                    System.out.println(list);
                }
            }
        }
    }
}
