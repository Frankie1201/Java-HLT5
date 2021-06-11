
public class Item {
    
   String ItemID;
   String Dish;
   double Price;
   String Category;
   
   //default constructor

    public Item() {
    }
   
    //parameterized constructor

    public Item(String ItemID, String Dish, double Price, String Category) {
        this.ItemID = ItemID;
        this.Dish = Dish;
        this.Price = Price;
        this.Category = Category;
    }
    
    //Getter and Setter

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    public String getDish() {
        return Dish;
    }

    public void setDish(String Dish) {
        this.Dish = Dish;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
       
}//Class ends
