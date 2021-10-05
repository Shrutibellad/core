class ForestStarter{
public static void main(String[] chetas)
{
Forest forest=new Forest("Gundalpet",912.04);
System.out.println(forest.location);
System.out.println(forest.reserveArea);
System.out.println(forest.name);

forest.state=new State("Karnataka","Basavaraj Bommai");
System.out.println(forest.state.name);
System.out.println(forest.state.cmName);

CapitalCity capitalcity=new CapitalCity();
System.out.println(capitalcity.name);
System.out.println(capitalcity.population);
System.out.println(capitalcity.famousFor);
}
}

