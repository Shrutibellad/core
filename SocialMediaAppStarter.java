class SocialMediaAppStarter{
public static void main(String[] args)
{
SocialMediaApp media=new SocialMediaApp();
media.setName("Instagram");
System.out.println(media.name);
media.setSize(15.0f);
System.out.println(media.size);
media.setLang("English");
System.out.println(media.lang);
media.setVersion(1.8f);
System.out.println(media.version);
media.setPlatform("Chrome");
System.out.println(media.platform);
Company1 comp=new Company1();
comp.setName("Facebook");
comp.setFounder("Mark Zucker");
comp.setEst(2000);
comp.setNoOfEmployes(100);
comp.setNoOfBranches(10000);
comp.setRevenue(98);
comp.setHeadQuarter("US");
media.setCompany1(comp);
System.out.println(media.company1.name);
System.out.println(media.company1.founder);
System.out.println(media.company1.est);
System.out.println(media.company1.noOfEmployes);
System.out.println(media.company1.noOfBranches);
System.out.println(media.company1.revenue);
System.out.println(media.company1.headQuarter);
}
}