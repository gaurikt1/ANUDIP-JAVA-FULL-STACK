
public class Product {

	    int ProductId;
        String Productname;
        double Productprice;

      public Product(int pID,String pname,double pprice){
    	  ProductId=pID;
    	  Productname=pname;
    	  Productprice=pprice;
      }
      
    	  public  void  SetproductId() {
    		  
    		  System.out.println("ProductId:"+ProductId);
    		  System.out.println("Productname:"+Productname);
    		  System.out.println("Productprice:"+Productprice);

    	  } 
    	        public  void  getproductId() {
        		  System.out.println("ProductId:"+ProductId);
        		  System.out.println("Productname:"+Productname);
        		  System.out.println("Productprice:"+Productprice);
    	        }
        		  public static void main(String[]args)
        		  {
        	 Product p1=new Product(1,"poonam",8.8);
        	 Product p2=new Product(2,"pooja",8.5);
        	 p1.SetproductId();
        	 p1.getproductId();
        	 }
}
    	 


