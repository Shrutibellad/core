class MovieTicket{
String movieName;
String theater;
float price;
int noOfSeats;
String type;

MovieTicket(String movieName)
{
this.movieName=movieName;
}

MovieTicket(String movieName,String theater,float price,int noOfSeats,String type)
{
this(movieName);
this.theater=theater;
this.price=price;
this.noOfSeats=noOfSeats;
this.type=type;
}

void displayDetails()
{
	System.out.println(movieName);
	System.out.println(theater);
	System.out.println(price);
	System.out.println(noOfSeats);
	System.out.println(type);
}

void printTotalPrice()
{
	float total=this.price*this.noOfSeats;
	System.out.println("TOTAL PRICE IS:"+total);
}
}