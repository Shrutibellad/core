class Earphone{
float frequency;
Earphone()
{
System.out.println("invoked Earphone no-arg constr");
}
 void setFrequency(float frequency)
 //if we written private for this method it will be secure and we cant change this
{
this.frequency=frequency;
}
}