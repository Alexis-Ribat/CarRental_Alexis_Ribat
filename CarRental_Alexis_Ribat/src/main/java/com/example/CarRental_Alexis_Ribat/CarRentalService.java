

package com.example.CarRental_Alexis_Ribat;

/*
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import java.util.Date;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	private Date date;

	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari",5, 80, " ", " "));
		cars.add(new Car("33BB44", "Porshe",2,50," ", " "));
	}
	
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public List<Car> getListOfCars(){
		System.out.println("TZDBIDFIDGIDBIUUDGIH");
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		System.out.println("TZDBIDFIDGIDBIUUDGIH");

		cars.add(car);
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
		
		System.out.println(plateNumber);
		for(Car Car : cars) {
			if(Car.getPlateNumber().contentEquals(plateNumber)) {
				System.out.println(Car);
			return Car;
		}
	}
	return null;
	}
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void getBack(@PathVariable("	") String plateNumber) throws Exception{
	}
	/*
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
	}
	*/
/*
	@RequestMapping(value = "/voiture/{plateNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK) public void
	rentAndGetBack(@PathVariable("plateNumber") String plateNumber,
	@RequestParam(value="rent", required = true)boolean rent) throws Exception{
	}
	
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
	public void rent(
			@PathVariable("plateNumber") String plateNumber, 
			@RequestParam(value="rent",required = true)boolean rent, 
			@RequestBody Date date){
		this.date = date;
	}
	
	


}
*/

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari",5, 80, " ", " ", false));
		cars.add(new Car("33BB44", "Porshe",2,50," ", " ", false));
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public List<Car> getListOfCars(){
		return cars;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/cars/{plateNumber}", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public Car getListOfCars(@PathVariable(value="plateNumber") String plateNumber){
		for(Car car: cars) {
			if(car.getPlateNumber().equals(plateNumber)) {
				return car;
			}
		}
		return null;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public Car addCar(@RequestBody Car car) throws Exception{
		cars.add(car);
		return car;
	}

}
