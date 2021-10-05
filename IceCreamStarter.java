class IceCreamStarter{
public static void main(String[] args)
{
IceCream cream;
cream=new IceCream(-20,"butterscoth","cone");
System.out.println(cream.temp);
System.out.println(cream.flavour);
System.out.println(cream.type);
System.out.println(cream.color.GREEN);

cream.brand=new Brand();
System.out.println(cream.brand);
System.out.println(cream);
String fla=cream.flavour;
System.out.println(fla);

float temp=cream.temp;
Brand brand=cream.brand;
String name=brand.name;
String location=brand.location;
String ownerName=brand.ownerName;
int since=brand.since;
System.out.println(name);
System.out.println(location);
System.out.println(ownerName);
System.out.println(since);

brand.name="AMUL";
brand.ownerName="shruti";
brand.since=1999;

System.out.println(name);
System.out.println(location);
System.out.println(ownerName);
System.out.println(since);
cream.brand=null;
System.out.println(cream.brand.location);
System.out.println(brand.location);
}
}

