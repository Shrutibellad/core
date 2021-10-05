class Company{
String Cname;
Country1 country1;
String ceo;
String cfo;
Company(String Cname)
{
this.Cname=Cname;
}
void displayDetails()
{
	System.out.println(Cname);
	System.out.println(ceo);
	System.out.println(cfo);
}	
}