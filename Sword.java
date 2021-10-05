class Sword{
String Sharp;
void Sharp()
{
System.out.println("invoked for war");
System.out.println(Sharp);
this.cut();
}
static void cut()
{
System.out.println("invoked for killing enemy");
battle();
}
static void battle()
{
System.out.println("invoked for pride of king");
}
}