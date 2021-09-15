package day2.training;

public class Main {

    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 20, 5);
	    Case theCase = new Case("220B", "HP", "220", dimensions);
	    Motherboard theMotherboard = new Motherboard("23Mother", "Asus", 4, 6, "v2.44");
	    Monitor theMonitor = new Monitor("223be", "Acer", 27, new Resolution(220, 233));

//	    PC newPC = new PC(theCase, theMonitor, theMotherboard);
//	    newPC.powerUp();

		Wall wall1 = new Wall("west");
		Wall wall2 = new Wall("east");
		Wall wall3 = new Wall("south");
		Wall wall4 = new Wall("north");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Modern", 4, 3, 2, 1);

		Lamp lamp = new Lamp("Classic", false, 65);

		Bedroom bedRoom = new Bedroom("Timmy", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

		bedRoom.makeBed();

		bedRoom.getLamp().turnOn();

    }
}
