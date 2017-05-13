import java.util.ArrayList;
public class Player {
  
  public static int MAX_ITEMS = 6;
  public String name = "";
  public int score = 0;
  public int location = 0;
  public int turn = 1;
  public ArrayList<Item> inventory = new ArrayList<>();
  public ArrayList<Item> items = new ArrayList<>();
    
  //constructor - initializes the data inside the class
  public Player(String name){
    this.name = name;
  }  
  public void take (Location location,String userInput){
    //First check location for item
    int count = 0;
    boolean itemFound = false;
    for (Item item:items){
      if (item.name.equals( userInput)){
        System.out.println("You have picked up: " + item.name);
        //Now we need to remove the item from the location and add it to the user inventory
        this.inventory.add(item);
        location.items.remove(item);
        itemFound = true;
      count += 1;
 }  
    if (itemFound == false){
      System.out.println("That item does not exist in this location");
    }
    }
  }
  public void discard (Location location, String userInput){
    //Check player inventory for the item
    int count = 0;
    boolean itemFound = false;
    for (Item item:inventory){
      if (item.name == userInput){
        System.out.println("You have discarded :" + item.name);
        location.items.add(item);
        inventory.remove(item);
        itemFound = true;
    } 
      count+= 1;
 }  
    if (itemFound == false){
      System.out.println("You do not have that item to discard");
    }  
  }
  public void display_inventory(){
    for (Item item : inventory){
      System.out.println(item.name);
 }
  }
        
  public void move (int newLoc){
    this.location = newLoc;
    this.turn += 1;
  }

  
}
