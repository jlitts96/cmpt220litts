import java.util.ArrayList;
public class Item {
  public String description = "";
  public String name = "";
  
  public Item (String name, String description){
    this.name = name;
    this.description = description;
  }

  public void render(String description){
    this.description = description;
  }
 
}