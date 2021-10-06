class FoodItem{
String name;
float price;
String hotelName;
int quantity;
Type type;
int rating;
OrderType orderType;
static float totalFoodItemPrice;

FoodItem(String name,float price,String hotelName,int quantity,int rating)
{
this.name=name;
this.price=price;
this.hotelName=hotelName;
this.quantity=quantity;
this.rating=rating;
}

void displayDetails()
{
  System.out.println(this.hotelName);
  System.out.println(this.name);
  System.out.println(this.price);
  System.out.println(this.type);
  System.out.println(this.orderType);
}
void printTotalPrice()
{
   float total=this.price*this.quantity;
   System.out.println("Total Price:"+total);
   totalFoodItemPrice=totalFoodItemPrice+total;
	System.out.println("Total FoodItem Price:"+totalFoodItemPrice);
}
}
