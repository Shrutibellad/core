class NartakiTheaterRunner{
public static void main(String[] arg)
{
Theater theater=new Theater("Nartaki",TicketPrice.Box);
theater.location="Majestic";
System.out.println(theater.name);
System.out.println(theater.location);
System.out.println(theater.capacity);
System.out.println(theater.ticketprice);
System.out.println(theater.ticketprice.price);
System.out.println(theater.ticketprice.tax);
}
}

