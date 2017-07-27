package Library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Newspaper extends Item {


private String releaseDate = null;


public Newspaper(String itemName, int itemPages, boolean itemAvailable, String releaseDate) { 
super(Data.getNewItemId(), itemName, itemPages, itemAvailable);
this.releaseDate = releaseDate;
}

public String getReleaseDate() { 
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

return dateFormat.format(releaseDate);
}


public String toString() {
return "{\"name\": \"" + this.itemName + "\", \"pages\": \"" + this.itemPages + "\", \"available\": \"" + this.itemAvailable + "\", \"releasedate\": \"" + this.releaseDate + "\"}";
}


}