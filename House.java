import java.util.ArrayList;

public class House extends Building{
  /**
   * Has information extended from the Building class. Stores the information of the house's name, address, number of floors, and whether it has a dining room.
   * @param args The program's arguments
   */
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    /**
     * Stores the building's name, address, and floor number into an ArrayList and sets up the boolean statement for whether or not a house has a dining room.
     * @param(String) name The name of the house.
     * @param(String) address The address of the house.
     * @param(int) nFloors The number of floors the house has.
     * @param(bool) hasDiningRoom Whether or not the house has a dining room.
     */
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  public boolean hasDiningRoom() {
    /**
     * A boolean about whether or not a house has a dining hall.
     * @return True if the house has a dining hall, and false if it doesn't.
     */
    return this.hasDiningRoom;
  }
  
  public int nResidents() {
    /**
     * Returns the number of residents in the house.
     * @return The number of residents in the house.
     */
    return this.residents.size();
  }

  public void moveIn(String name){
    /**
     * Moves in a new resident into the house, adding their name to the list of residents.
     * @param(String) name The name of the resident being added.
     */
    this.residents.add(name);
  }
  
  public String moveOut(String name) {  // return the name of the person who moved out
    /**
     * Moves out the resident from the house, removing their name from the list of residents.
     * @param(String) name The name of the resident moving out.
     * @return The name of the person.
     */
    this.residents.remove(name);
    return name;
  }

  public boolean isResident(String person) {
    /**
     * Checks to see if someone is a resident in the house by checking if their name is in the list of residents.
     * @param(String) person The person who's being checked.
     * @return True if the list contains the person's name, false if it doesn't.
     */
    return residents.contains(person);
  }



  public String toString() {
    /**
     * A string that states the attributes of the house in a print statement.
     * @return A description of the house in form of a print statement stating the number of residents, and whether or not it has a dining room.
     */
    String description = super.toString();
    description += ". This house has " + this.residents.size() + " residents.";
    description += "This house ";
    if (this.hasDiningRoom) {
      description += "has";
  } else {
    description += "does not have";
  }
  description += "a dining room.";
  return description;
}



  public static void main(String[] args) {
    House ziskind = new House("Ziskind","1 Henshaw Ave Northampton MA", 4, true);
    System.out.println(ziskind);
    System.out.println(ziskind.hasDiningRoom + ": dining room test");

    ziskind.moveIn("Billy Bob Sr");
    System.out.println(ziskind.isResident("Billy Bob Sr"));
    System.out.println(ziskind.isResident("Billy Bob Jr"));
    ziskind.moveOut("Billy Bob Sr");
    ziskind.moveIn("Mr. Bean");
    ziskind.moveIn("Sherlock Holmes");
    System.out.println(ziskind.nResidents());

    House capen = new House("Capen", "26 Prospect St Northampton MA", 3, false);
    System.out.println(capen);
  }

}