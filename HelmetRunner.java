class HelmetRunner{
public static void main(String[] hair){
Helmet helmet=new Helmet();
helmet.brand="AGV HELMET";
helmet.color="Red";
helmet.price=2000.0f;
helmet.size=HelmetSize.MEDIUM;
 
Helmet helmet1=new Helmet();
helmet1.brand="AGV HELMET";
helmet1.color="pink";
helmet1.price=1500.0f;
helmet1.size=HelmetSize.BIG;

helmet.protection();
helmet1.protection();
}
}


