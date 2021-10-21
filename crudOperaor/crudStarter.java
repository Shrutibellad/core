package com.xworkz.crud;

import com.xworkz.crud.operation.crudRunner;

public class crudStarter {
 
	public static void main(String[] args) {
crudRunner runner=new crudRunner();	
runner.addbeachName("Gokarna beach");
runner.addbeachName("Om beach");
runner.addbeachName("Malpe beach");
runner.addbeachName("panambur beach");
runner.addbeachName("NIK beach");
runner.displayBeachNames();

crudRunner choco=new crudRunner();
choco.addchoclateName("Diary milk");
choco.addchoclateName("Milky bar");
choco.addchoclateName("Dark fantasy");
choco.displayChoclateNames();

crudRunner GN=new crudRunner();	
GN.addbeachName("Botanist");
GN.addbeachName("Bombay Sapphire");
GN.addbeachName("Hapusa");
GN.addbeachName("Hendricks");
GN.displayBeachNames();

crudRunner runner1=new crudRunner();	
runner1.addbeachName("Maldives");
runner1.addbeachName("Bora Bora");
runner1.addbeachName("Palawan");
runner1.addbeachName("The cook island");
runner1.addbeachName("Bali");
runner1.displayBeachNames();

crudRunner Falls=new crudRunner();	
Falls.addbeachName("Apsarakonda falls");
Falls.addbeachName("Nisargadhama falls");
Falls.addbeachName("Jog falls");
Falls.addbeachName("Bangara kusuma falls");
Falls.addbeachName("Mallali falls");
Falls.displayBeachNames();

crudRunner runner2=new crudRunner();	
runner2.addbeachName("Gokarna beach resort");
runner2.addbeachName("Om beach resort");
runner2.addbeachName("Evolve black");
runner2.addbeachName("Country club");
runner2.addbeachName("Silent shores");
runner2.displayBeachNames();

crudRunner runner3=new crudRunner();	
runner3.addbeachName("MTR");
runner3.addbeachName("Kabali biriyani");
runner3.addbeachName("Imperio");
runner3.addbeachName("Al-Bek");
runner3.addbeachName("Desi ahar");
runner3.displayBeachNames();

	}
}
