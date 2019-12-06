/**
 * 
 */
/**
 * @author alrib
 *
 */


package com.example.CarRental_Alexis_Ribat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Car {
	
	private String plateNumber;
	private String brand;
	private int nomberOfSeats;
	private int price;
	
	Date date = null;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private String begin= " ";
	private String end = " ";
	private boolean rent = false;

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	public Car() {
		super();
	}
	
	public Car(String plateNumber, String brand, int nomberOfSeats, int price, String begin, String end , boolean rent) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.nomberOfSeats = nomberOfSeats;
		this.price = price;
		this.begin = begin;
		this.end = end;
		this.rent = rent;
		
	}
	
	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNomberOfSeats() {
		return nomberOfSeats;
	}

	public void setNomberOfSeats(int nomberOfSeats) {
		this.nomberOfSeats = nomberOfSeats;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", nomberOfSeats=" + nomberOfSeats + ", price="
				+ price + ", begin=" + begin + ", end=" + end + "]";
	}

}