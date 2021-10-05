class DeveloperRunner{
public static void main(String[] top)
{
Developer ref=new Developer();
String d1=ref.name;
System.out.println(d1);
int t2=ref.gp;
System.out.println(t2);
double t3=ref.price;
System.out.println(t3);
ref.name="Java full stack developer";
System.out.println(ref.name);
ref.gp=3;
System.out.println(ref.gp);


Developer dpref=new Developer();
System.out.println(dpref.name);
System.out.println(dpref.gp);
System.out.println(dpref.price);

}
}