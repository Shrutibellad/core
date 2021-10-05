class State{
String name;
int noOfDistricts;
String cmName;
CapitalCity capitalcity;
State(String name)
{
this.name=name;
}

State(String name,String cmName)
{
this(name);
this.cmName=cmName;
}

}