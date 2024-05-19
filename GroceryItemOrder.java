//Gibson Phelps
// This class stores information about a single grocery item being ordered.

public class GroceryItemOrder {

    private String name;
    private int amount;
    private double cost;

   public GroceryItemOrder(String name, int amount, double cost){
        this.name = name;
        this.amount = amount;
        this.cost = cost;
   }
   
   public double getCost(){
      double total = (double) amount * cost;
      return(total);
   }
   public String toString(){
      String lable = amount + " of " + name;
      return(lable);
   }
   public void setQuantity(int adj){
   
      this.amount = adj;
   
   }
   
}
