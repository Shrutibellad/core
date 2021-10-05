class HospitalRunner{
public static void main(String[] doctor)
{
String name="KIMS";
String location="Banglore";
String owner="Dr.V.T.Venkatesh";
int noOfBeds=1000;
Hospital health=new Hospital(name,location,owner,noOfBeds);
System.out.println(health.name);
System.out.println(health.location);
System.out.println(health.owner);
System.out.println(health.noOfBeds);
}
}