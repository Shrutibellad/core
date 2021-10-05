class CurrencyStarter{
public static void main(String[] args)
{
Currency currency;
currency=new Currency("Rupee",0.013f);
currency.displayDetails();

currency.country1=new Country1("US",91);
Country1 country1=currency.country1;
country1.cname="India";
country1.code=91;
country1.displayDetails();

currency=new Currency("Dollar",0.01f);
currency.displayDetails();

currency.country1=new Country1("US",91);
country1.cname="US";
country1.code=56;
country1.displayDetails();

currency=new Currency("Euro",0.02f);
currency.displayDetails();

currency.country1=new Country1("US",91);
country1.cname="UK";
country1.code=78;
country1.displayDetails();


currency=new Currency("Pound",0.014f);
currency.displayDetails();

currency.country1=new Country1("US",91);
country1.cname="SRILANKA";
country1.code=59;
country1.displayDetails();

currency=new Currency("franc",0.03f);
currency.displayDetails();

currency.country1=new Country1("US",91);
country1.cname="BANGLADESH";
country1.code=35;
country1.displayDetails();
}
}
