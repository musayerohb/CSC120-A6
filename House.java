/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  
  public int nResidents() {
    return this.residents.size();
  }

  public void moveIn(String name){
    this.residents.add(name);
  }
  
  public String moveOut(String name) {  // return the name of the person who moved out
    this.residents.remove(name);
    return name;
  }

  public boolean isResident(String person) {
    return residents.contains(person);
  }



  public String toString() {
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

    ziskind.moveIn("Billy Bob Sr");
    System.out.println(ziskind.isResident("Billy Bob Jr"));

    House capen = new House("Capen", "26 Prospect St Northampton MA", 3, false);
    System.out.println(capen);
  }

}