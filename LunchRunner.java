class LunchRunner{
public static void main(String[] sum)
{
String brand="miltone";
String color="blue";
String size="big";
int price=200;
LunchBox lunch=new LunchBox(brand,color,size,price);
System.out.println(lunch.brand);
System.out.println(lunch.color);
System.out.println(lunch.size);
System.out.println(lunch.price);
}
}