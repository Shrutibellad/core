class FoodItemStarter{
public static void main(String[] args)
{
FoodItem food=new FoodItem("Veg Kadayi",150.0f,"Great Fortune",2,5);
food.type=Type.VEG;
food.orderType=OrderType.TABLESERVICE;
food.displayDetails();
food.printTotalPrice();

FoodItem food1=new FoodItem("Noodles",100.0f,"Green Chilly",4,2);
food1.type=Type.CHINEESE;
food1.orderType=OrderType.HOMEDELIVERY;
food1.displayDetails();
food1.printTotalPrice();

}
}