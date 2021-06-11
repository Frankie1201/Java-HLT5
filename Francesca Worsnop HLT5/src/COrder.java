
public class COrder {
    
int OrderID;
String Cname;
String CPhone;
String CAddress;
String ItemID;
int QTY;
double Total;
String Date;

//default constructor

    public COrder() {
    }
    
//parameterized constructor

    public COrder(int OrderID, String Cname, String CPhone, String CAddress, String ItemID, int QTY, double Total, String Date) {
        this.OrderID = OrderID;
        this.Cname = Cname;
        this.CPhone = CPhone;
        this.CAddress = CAddress;
        this.ItemID = ItemID;
        this.QTY = QTY;
        this.Total = Total;
        this.Date = Date;
    }
    
    //Getter and Setter

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getCPhone() {
        return CPhone;
    }

    public void setCPhone(String CPhone) {
        this.CPhone = CPhone;
    }

    public String getCAddress() {
        return CAddress;
    }

    public void setCAddress(String CAddress) {
        this.CAddress = CAddress;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
      
    
}//cl;ass ends
