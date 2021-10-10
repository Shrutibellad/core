class CurtainStarter{
public static void main(String... args)
{
Curtain curt=new Curtain();
String color=curt.getColor();
System.out.println("curtain color is:"+color);
curt.setColor("red");
System.out.println(curt.color);
String materialType=curt.getMaterialType();
System.out.println("curtain Material is:"+materialType);
curt.setMaterialType("Smoothfabric");
System.out.println(curt.materialType);
float size=curt.getSize();
System.out.println("curtain size is:"+size);
curt.setSize(35.0f);
System.out.println(curt.size);
boolean lightAbsorb=curt.getLightAbsorb();
System.out.println("curtain lightabsorbs:"+lightAbsorb);
curt.setLightAbsorb(true);
System.out.println(curt.lightAbsorb);
String quality=curt.getQuality();
System.out.println("curtain quality is:"+quality);
curt.setQuality("Good");
System.out.println(curt.quality);
}
}