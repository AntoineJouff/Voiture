package com.iia.shop.entity;

public class Car {

	private int Year;
	private String model;
	private String color;
	private Double price;
	private int speed;

	private String marque;

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Car(int year, String model, String color, Double price, String marque, int speed) {
		super();
		Year = year;
		this.model = model;
		this.color = color;
		this.price = price;
		this.marque = marque;
		this.speed = speed;

	}

	public static void Start() {
		System.out.println("La voiture demarre");
	}

	public static void Stop() {
		System.out.println("La voiture est arrete");
	}

	public static int SpeedUp(int speed) {
		if (speed < 180) {
			speed = speed + 20;
			System.out.println("La vitesse de la voiture augmente. Elle roule a " + speed + "km");
		} else {
			System.out.println("La voiture est deja a sa vitesse maximal");
		}
		return speed;

	}

	public static int SpeedDown(int speed) {
		if (speed > 20) {

			speed = speed - 20;
			System.out.println("La vitesse de la voiture diminue. Elle roule a " + speed + "Km");

		} else {
			System.out.println("La voiture est deja a l arret");
		}
		return speed;
		
	}

}
