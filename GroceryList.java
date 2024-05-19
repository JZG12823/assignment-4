//Gibson Phelps
// This class keeps track of a grocery list of items

public class GroceryList {
     private GroceryItemOrder[] items;
     int numItems;
     public GroceryList(){
         items = new GroceryItemOrder[5];
         numItems = 0;
     }
     public boolean add(GroceryItemOrder item){
         boolean space = false;
         if(numItems < 5){
            items[numItems] = item;
            numItems++;
            space = true;
         }
         return(space);
     }
     public double getTotalCost(){
         double cost = 0;
         if(numItems > 0){
            for(int i = 0; i < numItems; i++){
               cost = cost + items[i].getCost();
           }
         }
         return(cost);
     }
     public String toString(){
         String AL = "";
         if(numItems > 0){
            for(int a = 0; a < numItems - 1; a++){
               AL = AL + items[a].toString() + "\n";
           }
           AL = AL + items[numItems - 1].toString();
         }
         return(AL);     
     }
}
