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
    this.collection.remove(title);
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
      return this.collection.containsKey(title);
  } 
  
  public boolean isAvailable(String title) { // returns true if the title is currently available, false otherwise
    if (this.containsTitle(title) == true) {
      if (this.collection.get(title) == true) {
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
    if (this.collection.isEmpty()) {
      System.out.println("There is nothing in the collection.");
    }
    else {
      for (String key:this.collection.keySet()){
        if (this.collection.get(key)) {
          System.out.println(key + ", Available to borrow.");
        }
        else {
          System.out.println(key + ", Checked out.");
        }
      }
    }
  } 


  public static void main(String[] args) {
    Library forbes = new Library("Forbes", "10 Elm St", 1);
    forbes.addTitle("If You Give A Mouse A Cookie");
    forbes.addTitle("Chicka Chicka Boom Boom");
    forbes.checkOut("Chicka Chicka Boom Boom");
    forbes.printCollection();
    System.out.println(" ");
    forbes.removeTitle("If You Give A Mouse A Cookie");
    forbes.printCollection();
    System.out.println(" ");
    forbes.returnBook("Chicka Chicka Boom Boom");
    forbes.addTitle("Poppy");
    forbes.checkOut("Poppy");
    forbes.printCollection();
    System.out.println(" ");
    System.out.println(forbes.isAvailable("Poppy"));
  }
  
}