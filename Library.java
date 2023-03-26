/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{
  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
  }

  public void addTitle(String title) {
    this.collection.put(title, true);
    }
    
  public String removeTitle(String title) {
    this.collection.remove(title, false);
    return title;
  } // return the title that we removed


//these methods will simply modify the `value` associated with the given `key` - the `title`).
//_Hint: use the functions provided by the [`Hashtable`](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html) class to make this much easier! Specifically, check out `put(...)`, `remove(...)`, and `replace(...)`._
  public void checkOut(String title) { 
    this.collection.replace(title, false);
  }

  public void returnBook(String title) {
    this.collection.replace(title, true);
  }

  public boolean containsTitle(String title) { // returns true if the title appears as a key in the Library's collection, false otherwise
      return this.collection.contains(title);
  } 
  
  public boolean isAvailable(String title) { // returns true if the title is currently available, false otherwise
    if (this.collection.contains(title)) {
      if (this.collection.containsValue(true)) {
        return true;
      }
      else {
        return false;
      }
    }
    else {
      return false;
    }
  }
    
  public void printCollection() { // prints out the entire collection in an easy-to-read way (including checkout status)
    System.out.println(this.collection);
  } 


  public static void main(String[] args) {
    Library forbes = new Library("Forbes", "10 Elm St", 1);
    forbes.addTitle("If You Give A Mouse A Cookie");
    forbes.addTitle("Chicka Chicka Boom Boom");
    forbes.printCollection();

  }
  
  }