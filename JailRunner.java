class JailRunner{
public static void main(String[] sum)
{
String location="Ballari";
String name="Ballari central jail";
int yearOfconstr=1872;
Jail jail=new Jail(location,name,yearOfconstr);
System.out.println(jail.location);
System.out.println(jail.name);
System.out.println(jail.year);
System.out.println(jail.strict);
System.out.println(jail.noOfCells);
System.out.println(jail.noOfCriminals);
System.out.println(jail.personnel);
System.out.println(jail.areaInAcres);
}
}
