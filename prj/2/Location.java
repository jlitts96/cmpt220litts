import java.util.ArrayList;
public class Location{
  public String locName = "";
  public String locDescription = "";
  public String locDescription2 = "";
  public int number = 0;
  public boolean hasVisited = false;
  public ArrayList<Item> items = new ArrayList<>();
  public String examineDescription;
  public boolean hasbeenExamined;
  
  
  
  public Location(String locName, String locDescription,int number,boolean hasVisited,ArrayList<Item> items,String examineDescription,boolean hasbeenExamined,String locDescription2){
    this.locName = locName;
    this.locDescription = locDescription;
    this.number = number;
    this.hasVisited = hasVisited;
    this.items = items;
    this.examineDescription = examineDescription;
    this.hasbeenExamined = hasbeenExamined;
    this.locDescription2 = locDescription2;
 
  } 
}