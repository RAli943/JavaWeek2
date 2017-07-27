package Library;

public class Magazine extends Item {


private String magazineCategory = "";


public Magazine(String itemName, int itemPages, boolean itemAvailable, String magazineCategory) {
super(Data.getNewItemId(), itemName, itemPages, itemAvailable);
this.magazineCategory = magazineCategory;
}

public String getCategory() { 
return this.magazineCategory;
}

public String toString() {
return "{\"name\": \"" + this.itemName + "\", \"pages\": \"" + this.itemPages + "\", \"available\": \"" + this.itemAvailable + "\", \"category\": \"" + this.magazineCategory + "\"}";
}
}
