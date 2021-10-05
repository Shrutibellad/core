class SaloonRunner{
public static void main(String[] bhoot)
{
Saloon saloon=new Saloon();
saloon.name="Green Trends";
saloon.location="BTM";
saloon.opentime=9.0f;
saloon.closetime=9.0f;
saloon.branch=SaloonBranch.BTM;
 
Saloon saloon1=new Saloon();
saloon1.name="YLG";
saloon1.location="JAYANAGAR";
saloon1.opentime=10.0f;
saloon1.closetime=7.0f;
saloon1.branch=SaloonBranch.JAYANAGAR;
saloon.haircut();
saloon1.haircut();
}
}