package Paint;


import java.util.ArrayList;

public class PaintWizards {

ArrayList<PaintWizard> paintList = new ArrayList<PaintWizard>();

public PaintWizards() {
paintList.add(new PaintWizard("CheapoMax", 20, 10, 19.99));
paintList.add(new PaintWizard("AverageJoes", 15, 11, 17.99));
paintList.add(new PaintWizard("DuluxourousPaints", 10, 20, 25.00));
}


public PaintWizard wastesLeast(double size) throws Exception {

System.out.println("\n[PaintWizard]: choosing best paint: " + size + "M²");

double leastWastedPaint = -1;
PaintWizard bestPaint = null;

for(PaintWizard p : paintList) {
double totalCoverage = p.getQuantity() * p.getCoverage();
double coveredSize = totalCoverage - size; 
double wastedPaint = coveredSize / p.getCoverage();


if(wastedPaint < 0) { 
System.out.println("[PaintWizard]: " + p.getName() + " this can fill " + totalCoverage + "M², size of the room " + size + "M², no soloution");
continue;
}

if(leastWastedPaint == -1) { 
System.out.println("[PaintWizard]: " + p.getName() + " first paint covered " + size + "M² and wastage " + wastedPaint + "L, new soloution.");

leastWastedPaint = wastedPaint;
bestPaint = p;
}
else if(wastedPaint < leastWastedPaint) {

System.out.println("[PaintWizard]: better solution: " + p.getName() + " this wastes " + wastedPaint + "L compared to " + bestPaint.getName() + " that wastes " + leastWastedPaint + "L");

leastWastedPaint = wastedPaint;
bestPaint = p;
}
}

if(bestPaint == null) { 
throw new Exception("No paint has been chosen couldnt find soloution.");
}

return bestPaint;
}

public void listPaints() {
System.out.println();

for(PaintWizard p : paintList) { 
System.out.println(p.stringify());
}
}

public PaintWizard bestPrice() throws Exception {
System.out.println("\n[PaintWizard]: finding new paint based on price.");

PaintWizard bestPaint = null;
double bestPrice = -1;

for(PaintWizard p : paintList) {

if(bestPrice == -1) {  
System.out.println("[PaintWizard]: " + p.getName() + " first paint that is £" + p.getPrice() + ", sets as firts soloution");

bestPrice = p.getPrice();
bestPaint = p;
}
else { 
if(p.getPrice() < bestPrice) { 
System.out.println("[PaintWizard]: Found a better solution: " + p.getName() + " costs £" + p.getPrice() + " compared to " + bestPaint.getName() + " this costs £" + bestPrice);

bestPrice = p.getPrice();
bestPaint = p;
}
else {
System.out.println("[PaintWizard]: " + p.getName() + " this costs £" + p.getPrice() + " compared to " + bestPaint.getName() + " this costs £" + bestPrice + ", forget.");
}
}
}

if(bestPaint == null) { 
throw new Exception("No paint has been chosen couldnt find soloution.");
}


return bestPaint;
}

}