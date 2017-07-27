package Library;

import java.util.ArrayList;

public class Staff implements Person {


private int personId = 0;
private String personName = "";
private int personAge = 0;
private String personAddress = "";
private String jobTitle = "";

private ArrayList<Integer> rentedList = new ArrayList<Integer>();

public Staff(String personName, int personAge, String personAddress, String jobTitle) { 
this.personId = Data.getNewPersonId();
this.personName = personName;
this.personAge = personAge;
this.personAddress = personAddress;
this.jobTitle = jobTitle;
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
System.out.println("the staff is on.");
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


public String getStaffTitle() {
return this.jobTitle; 
}

@Override
public String toString() {
return "ID: " + this.personId + ", Name: " + this.personName + ", Age: " + this.personAge + ", Address: " + this.personAddress + ", JobTitle: " + this.jobTitle;
}
}