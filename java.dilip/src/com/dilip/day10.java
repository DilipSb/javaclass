package com.dilip;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String fullName = "dilipbabu";
		//creating object of type sting (inbuilt data type)
		String n = fullName.toUpperCase();
		System.out.println(n);

	}
		Vehicle Car = new Vehicle (" toyota",2021);
		//System.out.println(Car.model);



	System.out.println(Car.model);
	System.out.println(Car.year);
	Car.Start();
	Car.Run();
	Car.Stop();

		
	class Vehicle{
		//properties 
		String model;
		int year;
		
	//public Vehicle(String String) {
			// TODO Auto-generated constructor stub

	//Constructor to set property values and filed values
		
		public Vehicle(String model, int year) {
			this.model = model;
			this.year = year;
			
			//method Start and Run and Stop
			
		}
		public void Start() {
			System.out.println("Able to Start");
		}
		public void Run() {
			System.out.println("Able to Run");
		}
		public void Stop() {
			System.out.println("Able to Stop");
		}
	

	
	  
}
}



