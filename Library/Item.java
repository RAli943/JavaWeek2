package Library;
public class Item extends ItemAdmin {






	protected int itemId = 0;
	protected String itemName = "";
	protected int itemPages = 0;
	protected boolean itemAvailable = true;

	
	public Item(int itemId, String itemName, int itemPages, boolean itemAvailable) {
	this.itemId = itemId;
	this.itemName = itemName;
	this.itemPages = itemPages;
	this.itemAvailable = itemAvailable;
	}

	public int getId() {
	return this.itemId;
	}

	public String getName() { 
	return this.itemName;
	}

	public int getPages() { 
	return this.itemPages;
	}

	public boolean setAvailability(boolean state) {

	if(this.itemAvailable == state) { 
	return false;
	}

	this.itemAvailable = state;
	return true;
	}

	public boolean getAvailability() {
	return this.itemAvailable; 
	}
	}

