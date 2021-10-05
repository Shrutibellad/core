class CountryRunner{
public static void main(String[] top){
String name="India";
int noOfStates=28;
String primeministername="Narendra Modi";
String presidentwifename="Savita kovind";
Country refOfCountry=new Country(name,noOfStates,primeministername,presidentwifename);
System.out.println(refOfCountry.noOfStates);
System.out.println(refOfCountry.primeministername);
System.out.println(refOfCountry.presidentwifename);
System.out.println(refOfCountry.name);
}
}