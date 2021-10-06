class Product{
String name;
String type;
int Quantity;
float price;
String vendor;
static float totalProductsPrice;
Product(String name,String vendor,int Quantity)
{
this.name=name;
this.vendor=vendor;
this.Quantity=Quantity;
}
void details()
{
	System.out.println(name);
	System.out.println(type);
	System.out.println(Quantity);
	System.out.println(price);
	System.out.println(vendor);
}
void printTotalCost()
{
	float total=this.price*this.Quantity;
	System.out.println("Total Cost:"+total);
	totalProductsPrice=totalProductsPrice+total;
	System.out.println("Total Product Price:"+totalProductsPrice);
	
}
}