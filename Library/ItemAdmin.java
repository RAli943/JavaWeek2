package Library;
import java.util.HashMap;
public class ItemAdmin {
	




	
	private HashMap<Integer, Item> itemList = new HashMap<Integer, Item>();

	
	public ItemAdmin() {

	}

	
	public int addItem(Item item) {
	try { 
	itemList.put(item.getId(), item);
	System.out.println(" Item Added (" + item.getClass().getName() + ") with the ID: " + item.getId());
	}
	catch(Exception e) { 
	System.out.println("unable to add item (" + item.getClass().getName() + "), Item exists ID : " + item.getId() + "?");
	return -1;
	}

	return item.getId();
	}

	
	public boolean removeItem(int id) {
	if(itemList.containsKey(id)) { 
	itemList.remove(id);
	return true;
	}

	return false;
	}

	
	public Item getItem(int itemId) throws Exception {
	if(itemList.containsKey(itemId)) {
	return itemList.get(itemId);
	}

	throw new Exception("cant Find item: " + itemId);
	}

	
	public boolean updateItem(int id, Item item) {
	if(itemList.containsKey(id)) { 
	itemList.put(id, item);

	return true;
	}

	return false;
	}

	
	public boolean updateItem(int itemId, boolean ItemState) { 
	if(itemList.containsKey(itemId)) {
	return itemList.get((int)itemId).setAvailability(ItemState);
	}

	return false;
	}

	
	public HashMap<Integer, Item> getItemList() { 
	return itemList;
	}

	}

