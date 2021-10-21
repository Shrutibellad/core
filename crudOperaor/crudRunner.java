package com.xworkz.crud.operation;

public class crudRunner {
private String country=new String();
private String[] beachNames=new String[5];
private String[] choclateNames=new String[3];
private String[] ginNames=new String[4];
private String[] resortNames=new String[5];
private String[] rocketNames=new String[5];
private String[] restaurantNames=new String[5];
private String[] islandNames=new String[5];
private String[] waterfallNames=new String[5];

private int count=0;
public crudRunner() {
	System.out.println("invoked the no-arg const");
}
public crudRunner(String name) {
	this.country=country;
	System.out.println("invoked the string const");
}
public void addbeachName(String name) {
//	System.out.println("invoked addbeachName");
	System.out.println("name:".concat(name));
	if (this.count<5) {
		this.beachNames[this.count]=name;
		this.count++;
	} 
	else {
System.out.println("index value is full");
	}
}
public void displayBeachNames() {
	System.out.println("invoked displayBeachNames");
	for (int i = 0; i < beachNames.length; i++) {
		String name=this.beachNames[i];
		System.out.println(name);
	}
}
	public void addchoclateName(String name) {
		System.out.println("name:".concat(name));
		if (this.count<3) {
			this.choclateNames[this.count]=name;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayChoclateNames() {
		System.out.println("invoked displayChocolateNames");
		for (int choco = 0; choco < choclateNames.length; choco++) {
			String name=this.choclateNames[choco];
			System.out.println(name);
		}
	}
	public void addginName(String ginname) {
		System.out.println("gin name:".concat(ginname));
		if (this.count<4) {
			this.ginNames[this.count]=ginname;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayGinNames() {
		System.out.println("invoked displayGinNames");
		for (int gin= 0; gin < ginNames.length; gin++) {
			String gname=this.ginNames[gin];
			System.out.println(gname);
		}
	}
	public void addresortName(String name) {
		System.out.println("name:".concat(name));
		if (this.count<5) {
			this.resortNames[this.count]=name;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayResortNames() {
		System.out.println("invoked displayResortNames");
		for (int resort= 0; resort< resortNames.length; resort++) {
			String rname=this.resortNames[resort];
			System.out.println(rname);
		}
	}
	public void addrocketName(String rocket) {
		System.out.println("name:".concat(rocket));
		if (this.count<5) {
			this.rocketNames[this.count]=rocket;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayRocketNames() {
		System.out.println("invoked displayRocketNames");
		for (int rock= 0; rock< rocketNames.length; rock++) {
			String rname=this.rocketNames[rock];
			System.out.println(rname);
		}
	}
	public void addrestaurantName(String name) {
		System.out.println("name:".concat(name));
		if (this.count<5) {
			this.restaurantNames[this.count]=name;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayRestaurantNames() {
		System.out.println("invoked displayRestaurantNames");
		for (int r= 0; r< restaurantNames.length; r++) {
			String rname=this.restaurantNames[r];
			System.out.println(rname);
		}
	}
	public void addislandName(String name) {
		System.out.println("name:".concat(name));
		if (this.count<5) {
			this.islandNames[this.count]=name;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayIslandNames() {
		System.out.println("invoked displayIslandNames");
		for (int land= 0;land< islandNames.length; land++) {
			String iname=this.islandNames[land];
			System.out.println(iname);
		}
	}
	public void addwaterfallName(String name) {
		System.out.println("name:".concat(name));
		if (this.count<5) {
			this.waterfallNames[this.count]=name;
			this.count++;
		} 
		else {
	System.out.println("index value is full");
		}
	}
	public void displayWaterfallNames() {
		System.out.println("invoked displayWaterfallNames");
		for (int fall= 0;fall< waterfallNames.length; fall++) {
			String fallname=this.waterfallNames[fall];
			System.out.println(fallname);
		}
	}

}

