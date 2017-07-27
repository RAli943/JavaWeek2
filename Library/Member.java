package Library;

import java.util.ArrayList;

public class Member implements Person {


private int personId = 0;
private String personName = "";
private int personAge = 0;
private String personAddress = "";

private ArrayList<Integer> rentedList = new ArrayList<Integer>();


public Member(String personName, int personAge, String personAddress) { 
this.personId = Data.getNewPersonId();
this.personName = personName;
this.personAge = personAge;
this.personAddress = personAddress;
}


public int getPersonId() { 
return this.personId;
}


public String getName() { 
return this.personName;
}


public int getAge() {
return this.personAge;
}

public String getAddress() {
return this.personAddress;
}


public String getType() { 
return this.getClass().getName();
}


public boolean doTask() {
System.out.println("You as a member are now renting a book.");
return true;
}


public boolean addItem(int itemId) {
return this.rentedList.add(itemId);
}


public boolean removeItem(int itemId) {
return this.rentedList.remove((Object)itemId);
}



public ArrayList<Integer> getItems() { 
return this.rentedList;
}


public String toString() {
return "{\"id\": \"" + this.personId + "\", \"Name\": \"" + this.personName + "\", \"Age\": \"" + this.personAge + "\", \"Address\": \"" + this.personAddress + "\"}";
}

}