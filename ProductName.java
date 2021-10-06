class ProductName{
public static void main(String[] args)
{
Product product=new Product("Dove","Shivanya traders",5);
product.type="Shampoo";
product.price=200.0f;
product.details();

Product product1=new Product("Hair dryer","Om traders",4);
product1.type="EC";
product1.price=400.0f;
product1.details();
product1.printTotalCost();
}
}