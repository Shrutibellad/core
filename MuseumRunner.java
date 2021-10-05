class MuseumRunner{
public static void main(String[] pp)
{
Museum mus=new Museum();
mus.display();
Museum mus1=null;
mus1.display();//this is the case of null pointer exception
}
}