import java.util.ArrayList;
import java.util.Scanner;
//This is a game where you escape from your kidnappers.


//Skips to end

//j
//
//n
//x
//t map
//e
//x
//t bat
//e
//n
//w
//x
//t chips
//e
//e
//x
//t waterbottle
//w
//n
//w
//x
//t shinyrock
//n



public class Escape {
  boolean cheat = false;
  boolean hasWon = false;
  boolean hasWon2 = false;
  boolean hasLost = false;
  public int matrixLoc = 0;
  public Location currentloc;
  ArrayList<Location> locations = new ArrayList<>();
  String[] directions= {"north","south","east","west"};
 
  public String gameMapdisplay= "\n                         Factory              Bedroom        "+
           "\n                            |                    |           "+    
           "\n                        Waterfall----River  Living Room      "+
           "\n                                       |         |           "+
           "\n                             Cave----Forest----House         "+
           "\n                                       |                     "+
           "\n            DarkRoom----Backyard----Pathway                  "+
           "\n               |                                             "+
           "\n             Truck                                           ";

  //directions
  public int[][] navMatrix= {
    {1,-1,-1,-1},
    {-1,0,2,-1},
    {-1,-1,3,1},
    {4,-1,-1,2},
    {9,3,8,5},
    {6,-1,4,-1},
    {7,5,-1,-1},
    {-1,6,-1,-1},   
    {-1,-1,-1,4},
    {-1,4,-1,10},
    {11,-1,-1,-1},
    {-1,10,-1,-1}
  };

  

public Escape(){
    
  Item waterBottle = new Item("waterbottle", "This is a water bottle.");
  Item shinyRock = new Item("shinyrock", "This is a shiny rock. Maybe it holds some secrets?");
  Item chips = new Item("chips", "This is a bag of potato chips. Better save it for when you get hungry.");
  Item baseballBat = new Item("bat", "This is a baseball bat. You can use it to defend yourself.");
  Item gameMap = new Item("map","This map should lead you to safety.");
  Item key = new Item("key", "This key can open the door in the house.");

  String truckDesc = "You hear the sound of a truck running. Everything is dark around you; you cannot see because you are blindfolded. You hear two men talking outside. Suddenly, they open the door and push you out of the truck. 'Hurry up and go north!' they tell you.";
  String truckDesc2 = "You see a truck in front of you. There seems to be no where to go from here.";
  Location truck = new Location("Truck",truckDesc,0,true,new ArrayList<Item>(),"",false,truckDesc2);

  String darkDesc = "After walking north for some distance, you are knocked out by one of the men. When you wake up, you find yourself in a dark room. You can hear the sound of water dripping from the ceiling. There is a door to the east.";
  String darkDesc2 = "You find yourself in a dark room. You can hear the sound of water dripping from the ceiling. There is a door to the east.";
  ArrayList dark = new ArrayList<>();
  dark.add(gameMap);
  Location darkRoom = new Location("Dark Room",darkDesc,1,false,dark,"There is a map on the ground.",false, darkDesc2);

  String yardDesc = "You find yourself outside in a backyard. To the east, you can see a gate. The gate seems safe to use.";
  ArrayList yard = new ArrayList<>();
  yard.add(baseballBat);
  Location backyard = new Location("Backyard",yardDesc, 2, false,yard,"There is a baseball bat on the ground.", false, yardDesc);

  String PathwayDesc = "You find yourself on a path. To the north, you can see a jungle. Around you are animals of various shapes and sizes, including deer, skunks, and rabbits.";
  Location pathway = new Location("Pathway",PathwayDesc, 3, false,new ArrayList<Item>(), "", false, PathwayDesc);

  String ForestDescription = "You find yourself in a forest. You hear that sounds of animals around you, however you don't see any. A few miles north, you spot a river. To the east, you spot a cave. To the west, you spot a house that seems to be abandoned.";
  Location forest = new Location("Forest",ForestDescription, 4, false, new ArrayList<Item>(), "", false, ForestDescription);

  String HouseDescription = "You approach the house. It seems to be abandoned. On the door of the house is a lock that seems to glisten in the sun. Looks like the lock is broken. You can enter if you wish.";
  ArrayList chip = new ArrayList<>();
  chip.add(chips);
  Location house = new Location("House",HouseDescription,5, false,chip, "There is a bag of potato chips on the ground.", false, HouseDescription);

  String InsideHouseDescription = "You managed to make your way into the house. It seems like there are only two rooms in this house, the one you are in and one to the north. The door seems to be locked. Go find a key.";
  ArrayList keyList = new ArrayList<>();
  keyList.add(key);
  Location insideHouse = new Location("Living Room",InsideHouseDescription,6,false, keyList, "You find a key under one of the couches.",false, InsideHouseDescription);

  String BedroomDescription = "You walk into the bedroom when suddenly the door locks behind you. The floor suddenly drops beneath you. You fall for several seconds before reaching a pit of lava. You burn to death. You might have died, but you escaped your kidnappers. You win! The End.";
  Location bedroom = new Location ("Bedroom",BedroomDescription,7,false, new ArrayList<Item>(), "", false, BedroomDescription);
    
 String  CaveDescription = "You approach a cave and hear ominous noise emerging from within. Maybe you should go back the way you came.";
  ArrayList waterList = new ArrayList<>();
  waterList.add(waterBottle);
  Location cave = new Location("Cave",CaveDescription, 8, false,waterList, "There is a water bottle on the ground.", false, CaveDescription);

  String RiverDescription = "You approach a river, with water a sparkling, clear, blue color. To the west is a rumbling waterfall.";
  Location river = new Location("River",RiverDescription, 9, false, new ArrayList<Item>(), "", false, RiverDescription);

  String WaterfallDescription = "You approach a waterfall, the sound of which is deafening. To the north, you can see a factory of some kind.";
  ArrayList shinyRockList = new ArrayList<>();
  shinyRockList.add(shinyRock);
  Location waterfall = new Location("Waterfall", WaterfallDescription, 10, false, shinyRockList, "There is a shiny rock on the ground.", false, WaterfallDescription);

  String FactoryDescription = "You find yourself at a factory. It seems that people are working inside! It's your lucky day! You must bring EXACTLY 5 items into the factory in order to be rescued.";
  Location factory = new Location("Factory",FactoryDescription, 11, false, new ArrayList<Item>(), "", false, FactoryDescription);

  String end = "You walk into the factory, with items in hand, and are shot mercilessly by the factory workers, thinking that you are some kind of terrorist. You have died, but you escaped your kidnappers. You win! The End.";

  locations.add(truck);
  locations.add(darkRoom);
  locations.add(backyard);
  locations.add(pathway);
  locations.add(forest);
  locations.add(house);
  locations.add(insideHouse);
  locations.add(bedroom);
  locations.add(cave);
  locations.add(river);
  locations.add(waterfall);
  locations.add(factory);
  
  currentloc = locations.get(0);
  matrixLoc = 0;
  
}
    //helps calculate turns

public void moveTo(int dest,Player player){

  player.turn = player.turn + 1;
  if (locations.get(dest).hasVisited == false){
    System.out.print(locations.get(dest).locDescription);
    player.score += 1;
    locations.get(dest).hasVisited = true;       
        
    if (currentloc.locName == "Factory" && (player.inventory.size() == 5 || cheat == true)){
      hasWon = true;
    }else if (currentloc.locName == "Bedroom"){
      hasWon2 = true;
 }
            
  } else {
    System.out.println("You have already visited this location");
    System.out.println(locations.get(dest).locDescription2);
  }

}

public void handleInput(String cmd, Player player){
  String itemName = "";
  boolean found = false;
  
  if (player.turn > 18) //loses after 20 turns
    hasLost = true;

  //direction inputs, plus help, map, points, and quit inputs
  String command = cmd.split(" ")[0];
    if(command.equals("PabloRivas")){
    cheat = true;
  }else if (command.equals("north") || command.equals("n")){
    if (currentloc.locName.equals("Living Room")){
      found = false;
      for (Item item : player.inventory){
  if (item.name.equals( "key")){
   found = true;
   }
   }
      if (found == true){
                currentloc = locations.get(navMatrix[matrixLoc][0]);
                moveTo(navMatrix[matrixLoc][0],player);
                matrixLoc = navMatrix[matrixLoc][0];
      } else {
                System.out.println("You cannot go that way!");
   }
    } else if (navMatrix[matrixLoc][0] != -1){
      currentloc = locations.get(navMatrix[matrixLoc][0]);
      moveTo(navMatrix[matrixLoc][0],player);
      matrixLoc = navMatrix[matrixLoc][0];
 
    }else {
      System.out.println("You cannot go that way!");
 }
  } else if (command.equals("south") || command.equals("s")){
    if (navMatrix[matrixLoc][1] != -1){
      currentloc = locations.get(navMatrix[matrixLoc][1]);
      moveTo(navMatrix[matrixLoc][1],player);
      matrixLoc = navMatrix[matrixLoc][1];
    } else {
      System.out.println("You cannot go that way!");
 }
  }else if(command.equals("east") || command.equals("e")){
    if (navMatrix[matrixLoc][2] != -1){
      currentloc = locations.get(navMatrix[matrixLoc][2]);
      moveTo(navMatrix[matrixLoc][2],player);
      matrixLoc = navMatrix[matrixLoc][2];
    }else {
      System.out.println("You cannot go that way!");
 }
  }
  else if (command.equals("west") || command.equals("w")){
    if (navMatrix[matrixLoc][3] != -1){
      currentloc = locations.get(navMatrix[matrixLoc][3]);
      moveTo(navMatrix[matrixLoc][3],player);
      matrixLoc = navMatrix[matrixLoc][3];
    } else {
      System.out.println("You cannot go that way!");
 }
  }
  else if (command.equals("help") || command.equals("h")){
    System.out.println("You options are: north, south, east, west, help, points, map, inventory, examine, take, drop, or quit.");
  }
  else if (command.equals("win")){
    System.out.println("You have lost for trying to cheat.");
    end(player);
  }
  else if (command.equals("points") || command.equals("p")){
    System.out.println("Your score is: " + player.score);
  }
  else if (command.equals("examine") || command.equals("x")){
    if(currentloc.items.size() > 0){
      System.out.println(currentloc.examineDescription);
      currentloc.hasbeenExamined = true;
 }
                
    else{
      System.out.println("There is not an item here.");
 }
  }
  else if( command.equals("take") || command.equals("t")){
    if (cmd.split(" ").length > 1){
      itemName = cmd.split(" ")[1];
      System.out.println("You took the " + itemName);
      if (currentloc.hasbeenExamined == true){
        player.take(currentloc,itemName.toLowerCase());
   }
      else {
        System.out.println("You must examine the location before taking an item");
   }
 }
    else {
      System.out.println("You must include an item name in this command");
 }
  }     
  else if (command.equals("map") || command.equals("m")){
    for (Item item : player.inventory){
      if (item.name.equals("map")){
        System.out.println(gameMapdisplay);
      } else {
        System.out.println("You don't have a map yet.");
      }
    } 
  } 
  else if (command.equals("quit") || command.equals("q")){
    end(player);
  }
  else if (command.equals("drop") || command.equals("d")){
    if (cmd.split(" ").length > 1){
      itemName = cmd.split(" ")[1];
      player.discard(currentloc,itemName.toLowerCase());
 }
    else {
      System.out.println("You must include an item name in this command");
 }
  }
  else if (command.equals("inventory") || command.equals("i")){
    for (Item x : player.inventory){
      System.out.println (x.name);
 }
  }
  else {
    System.out.println("That is not a valid command.");
    System.out.println("Turn count " + player.turn);
  }
}
  
//tiltlescreen/player name 
public static void main(String[] args){
  Escape game = new Escape();
  System.out.println("Welcome to Escape. Please enter your name: ");
  Scanner nameSC = new Scanner(System.in);
  String name = nameSC.next();
  Player player = new Player(name);
  player.inventory = new ArrayList<>();
  System.out.println(" Hello " + player.name + "! While on a trip with your family, you are suddenly blindfolded and kidnapped." +
    "What will happen to you? Will you return to your family? Type Continue to start the game.");
  String enter=nameSC.next();
  if(enter.equals("Continue")){
    System.out.println(game.locations.get(0).locDescription);
    game.gameLoop(player);
  }
}
//Copyright and endgame   
public static void end(Player player){
  
  System.out.println("Your Final Score is "+ player.score);

  System.out.println("This game has been copyrighted by Jake Litts, which can be reached at john.litts1@marist.edu.");
  Scanner sc = new Scanner(System.in);
    String x = sc.next();
    
  while (!x.equals("yes") && !x.equals("no")){
    System.out.println("Would you like to play again?");
    x = sc.next();
    if (x.equals("yes")){
      System.exit(0); //not working
    } else if (x.equals("no")){
      System.out.println("Bye Friend!");
 }
    else {
      System.out.println("That is not a valid command.");
 }
  }
}
            
//determines whether or not you win or lose
public void gameLoop(Player player){

  if (hasLost == true){
    System.out.println("You ran out of turns. You lose!");
    end(player);
  }else if (hasWon == true){
    end(player);
  }
  else if (hasWon2 == true){
    end(player);
  }
  else {
    System.out.println(("Where would like to go?").toLowerCase());
    Scanner userSC = new Scanner(System.in);
    String userInput = userSC.nextLine();
    handleInput(userInput,player);
    gameLoop(player);
  }
}
}
