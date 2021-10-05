class IceCream{
String flavour="black current";
String type;
Color color=Color.VIOLET;
Brand brand;
float temp;
IceCream(float temp)
{
this.temp=temp;
}
IceCream(float temp,String flavour,String type)
{
this(temp);
this.flavour=flavour;
this.type=type;
}
}
