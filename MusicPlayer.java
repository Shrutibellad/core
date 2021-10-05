class MusicPlayer{
public static void main(String[] args)
{
	String name="sarasvathi";
	int noOfMusicians=50;
Music music=new Music(name,noOfMusicians);
music.type="Hindustani";
System.out.println(music.type);
System.out.println(music.name);
System.out.println(music.fee);
System.out.println(music.noOfMusicians);
}
}

