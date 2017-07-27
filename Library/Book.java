package Library;

public class Book extends Item {


private boolean hardCover = false;


public Book(String itemName, int itemPages, boolean itemAvailable, boolean hardCover) { 
super(Data.getNewItemId(), itemName, itemPages, itemAvailable);
this.hardCover = hardCover;
}

public boolean isHardCover() { 
return this.hardCover;
}

public String toString() {
return "{\"name\": \"" + this.itemName + "\", \"pages\": \"" + this.itemPages + "\", \"available\": \"" + this.itemAvailable + "\", \"hardcover\": \"" + this.hardCover + "\"}";
}
}