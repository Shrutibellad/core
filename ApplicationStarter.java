class ApplicationStarter{
public static void main(String[] args)
{
Application app=new Application();
app.Aname="Java";
app.version="JDK";
app.displayDetails();

app.country1=new Country1("India",91);
Country1 country1=app.country1;
country1.displayDetails();

app.company=new Company("Tata");
Company company=app.company;
company.ceo="Shruti";
company.cfo="ABD";
company.displayDetails();

}
}
