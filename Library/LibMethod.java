package Library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.simple.JSONValue;

public class LibMethod {



public static boolean writeObjectJSON(Object o, String f) {


BufferedWriter writer = null;
try {

writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "utf-8"));

} 
catch (IOException e) {
System.out.println(e.getMessage());
} 
finally {
try {
writer.close();
return true;
} 
catch (Exception e) {
System.out.println(e.getMessage());
}
}

return false;
}
}


({ "not checked","lists"})


HashMap<Integer, Item> itemList = new HashMap<Integer, Item>();

try { 
File fileLocation = new File(f);
FileInputStream fileReader = new FileInputStream(fileLocation);

byte[] fileData = new byte[(int) fileLocation.length()];
fileReader.read(fileData);

String rawJson = new String(fileData, "UTF-8");
System.out.println("[LibMethod]: Raw JSON: " + rawJson);

try { 
HashMap<String, ArrayList<String>> decodedJson = (HashMap<String, ArrayList<String>>) JSONValue.parse(rawJson);

for(Object item : decodedJson.values()) {
HashMap<String, String> obj = (HashMap<String, String>)item;
System.out.println("[LibMethod]: Decoded JSON value found: " + item);

if(obj.containsKey("hardCover")) {
int id = Data.getNewItemId();
System.out.println("[LibMethod]: new Book added, adding to list with ID: " + id);
itemList.put(id, new Book(obj.get("name"), Integer.parseInt(obj.get("pages")), Boolean.parseBoolean(obj.get("available")), Boolean.parseBoolean(obj.get("hardCover"))));
}
else if(obj.containsKey("date")) {
int id = Data.getNewItemId();
System.out.println("[LibMethod]: new newspaper added, adding to list with ID: " + id);
itemList.put(id, new Newspaper(obj.get("name"), Integer.parseInt(obj.get("pages")), Boolean.parseBoolean(obj.get("available")), obj.get("date"))); 
}
else if(obj.containsKey("category")) {
int id = Data.getNewItemId();
System.out.println("[LibMethod]: new Magazine added, adding to list with ID: " + id);
itemList.put(id, new Magazine(obj.get("name"), Integer.parseInt(obj.get("pages")), Boolean.parseBoolean(obj.get("available")), obj.get("category"))); 
}
else {
System.out.println("[LibMethod]: Item doesnt have own features (attributes).");
}
}

System.out.println();
if(itemList.size() > 0) { 
return itemList;
}
}
catch(Exception e) {
System.out.println(e.getMessage());
}

fileReader.close();
}
catch(Exception e) {
System.out.println(e.getMessage());
}

return new Object();
}
}}
