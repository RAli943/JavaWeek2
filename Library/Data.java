package Library;

public class Data {

private static int uniquePersonId = 0;
private static int uniqueItemId = 0;

public static int getNewPersonId() { 
return uniquePersonId++;
}

public static int getNewItemId() { 
return uniqueItemId++;
}

public static void resetIncrement() { 
uniquePersonId = 0; 
uniqueItemId = 0;
}

}