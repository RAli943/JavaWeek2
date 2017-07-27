package Library;

import java.util.HashMap;

public class PersonManager {

private HashMap<Integer, Person> personList = new HashMap<Integer, Person>();


public PersonManager() {

}


public int addPerson(Person p) {
try {
personList.put(p.getPersonId(), p);
System.out
.println("[DEBUG]: Added Person (" + p.getClass().getName() + ") with the ID: " + p.getPersonId());
} catch (Exception e) {
System.out.println("[DEBUG]: Failed to add Person (" + p.getClass().getName()
+ "), The item already exists ID: " + p.getPersonId() + "?");
return -1;
}

return p.getPersonId();
}


public boolean removePerson(int personId) {
if (personList.containsKey(personId)) {
personList.remove(personId);

return true;
}

return false;
}


public Person getPerson(int personId) throws Exception {
if (personList.containsKey(personId)) {
return personList.get(personId);
}

throw new Exception("Unable to find an person by ID: " + personId);
}


public boolean updatePerson(int personId, Person p) {
if (personList.containsKey(personId)) {
personList.put(personId, p);
return true;
}

return false;
}


public HashMap<Integer, Person> getPersonList() {
return personList;
}
}