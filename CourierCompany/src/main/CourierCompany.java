package main;

import models.AbroadEmployee;
import models.CountryEmployee;
import models.PlovdivEmployee;
import models.StorageEmployee;

public class CourierCompany {

	public static void main(String[] args) {
		AbroadEmployee abroadEmployee = new AbroadEmployee(null);
		CountryEmployee countryEmployee = new CountryEmployee(abroadEmployee);
		PlovdivEmployee plovdivEmployee = new PlovdivEmployee(countryEmployee);
		
		StorageEmployee storageBoy = new StorageEmployee();
		
		abroadEmployee.attach(storageBoy);
		countryEmployee.attach(storageBoy);
		plovdivEmployee.attach(storageBoy);
		
		
	}

}
