class AirconditionerExecutor {

	public static void main(String[] conditioner) {
	
	Airconditioner air = new Airconditioner();

		air.brand = "samsung";
		String brand = air.brand;
		air.model = "A366";
		String model = air.model;
		air.price = 39999.90;
		double price = air.price;
		air.type = "R4";
		String type = air.type;
		air.weight = "4.5 kg";
		String weight = air.weight;
		air.color = "White";
		String color = air.color;
		air.warranty = "4 months";
		String warranty = air.warranty;
		
		System.out.println("Brand of the AirConditioner : " + brand);
		System.out.println("Model of the AirConditioner : " + model);
		System.out.println("Price of the AirConditioner : " + price);
		System.out.println("Type of the AirConditioner : " + type);
		System.out.println("Weight of the AirConditioner : " + weight);
		System.out.println("Color of the AirConditioner : " + color);
		System.out.println("warranty of the AirConditioner : " + warranty);
	
	}


}