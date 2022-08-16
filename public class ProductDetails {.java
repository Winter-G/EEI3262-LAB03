public class ProductDetails {
  public static void main(String[] args) {
    String pID;
    String name;
    int price;


public String getpID(){
        return pID;
    }

    public String getname(){
        return name;
    }

    public int getprice(){
        return price;
    }

    public void setpID(String newpID){
        pID = newpID;
    }

    public void setname(String newname){
        name = newname;
    }

    public void setprice(int newprice){
        price = newprice;
    }
}

    public static void main(String args[]){
         productdetails obj = new productdetails ();
         obj.setpID();
         obj.setname();
         obj.setprice();
         System.out.println("product details "());
         System.out.println("product id: " + obj.getpID());
         System.out.println("product name : " + obj.getname());
         System.out.println("price : " + obj.getprice());


}
  }