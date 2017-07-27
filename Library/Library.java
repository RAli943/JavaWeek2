package Library;


	import java.util.HashMap;

    import Person;

	public class Library {

	
	private PersonManager personManager = new PersonManager();
	private ItemAdmin itemAdmin = new ItemAdmin();

	public Library() { 

	}

	
	public boolean checkoutItem(int itemId, int personId) {

	try {
	Person p = personManager.getPerson(personId);
	Item i = itemAdmin.getItem(itemId);

	if(itemAdmin.updateItem(itemId, false)) {
	p.removeItem(itemId);
	personManager.updatePerson(personId, p);

	System.out.println("[DEBUG]: item checked out [" + itemId + "] " + i.getName() + " length of duration [" + p.getPersonId() + "] " +p.getName());

	return true;
	}

	}
	catch (Exception e) {
	System.out.println("[DEBUG]: invalid check item [" + itemId + "] not available for: [" + personId + "], " + e.getMessage());
	return false;
	}

	System.out.println("[DEBUG]: invalid check item [" + itemId + "] not availbe for: [" + personId + "], The item is checked out already.");

	return false;

	}

	
	public boolean checkinItem(int itemId, int personId) { 

	try {
	Person p = personManager.getPerson(personId);
	Item i = itemAdmin.getItem(itemId);

	if(itemAdmin.updateItem(itemId, true)) {
	p.removeItem(itemId);
	personManager.updatePerson(personId, p);

	System.out.println("[DEBUG]: checked in successful [" + itemId + "] " + i.getName() + " in for [" + p.getPersonId() + "] " +p.getName());

	return true;
	}

	}
	catch (Exception e) {
	System.out.println("[DEBUG]: invalid check item [" + itemId + "] in for person: [" + personId + "], " + e.getMessage());
	return false;
	}

	System.out.println("[DEBUG]: invalid check item[" + itemId + "] in for person: [" + personId + "], item is checked out already.");

	return false;

	}

	
	public boolean addPerson(Person p) { 
	if(personManager.addPerson(p) != -1) { 
	return true;
	}

	return true;
	}

	public boolean removePerson(int id) {
	return personManager.removePerson(id);
	}

	public boolean updatePerson(int id, Person p) {
	return personManager.updatePerson(id, p);
	}

	
	public Person getPerson(int id) throws Exception {
	return personManager.getPerson(id);
	}

	
	public boolean addItem(Item i) { 
	if(itemAdmin.addItem(i) != -1) { 
	return true;
	}

	return false;
	}

	
	public boolean removeItem(int id) { 
	if(itemAdmin.removeItem(id)) { 
	return true;
	}

	return false;
	}

	
	public boolean updateItem(int id, Item i) { 
	return itemAdmin.updateItem(id, i);
	}

	
	public Item getItem(int id) throws Exception {
	return itemAdmin.getItem(id);
	}

	
	public HashMap<Integer, Item> getItemList() {
	return itemAdmin.getItemList();
	}

	
	public HashMap<Integer, Person> getPersonList() {
	return personManager.getPersonList();
	}
	
}

