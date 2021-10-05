class NailcutterRunner{
public static void main(String[] kichidi)
{
Nailcutter nail=new Nailcutter();
nail.color="Black";
nail.company="vega";
nail.price=15.0f;
nail.size=NailcutterSize.SMALL;
nail.sharp=true;

Nailcutter nailcutter=new Nailcutter();
nailcutter.color="White";
nailcutter.company="Leegoal";
nailcutter.price=10.0f;
nailcutter.size=NailcutterSize.BIG;
nailcutter.sharp=false;
nailcutter.cut();
nail.cut();
}
}
