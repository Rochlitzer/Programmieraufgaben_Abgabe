package Enum;

public enum Treibstoff {
	
	Super("Power-Super"){int octan(){return 100;}},
	Diesel("Turbo-Diesel"){int octan(){return 90;}},
	Normal("Renn-Benzin"){int octan(){return 95;}};

private String nameSuper;
abstract int octan();


private Treibstoff(String name) {
	this.nameSuper = name;
}

public String getNameSuper(){return nameSuper;}
}

