package main;

import java.util.ArrayList;

import models.AbroadEmployee;
import models.Client;
import models.CountryEmployee;
import models.PackageType;
import models.PlovdivEmployee;
import models.StorageEmployee;
import state.PreparingPackageState;

public class CourierCompany {

	public static void main(String[] args) {
		AbroadEmployee abroadEmployee = new AbroadEmployee(null);
		CountryEmployee countryEmployee = new CountryEmployee(abroadEmployee);
		PlovdivEmployee plovdivEmployee = new PlovdivEmployee(countryEmployee);
		
		StorageEmployee storageBoy = new StorageEmployee();
		
		abroadEmployee.attach(storageBoy);
		countryEmployee.attach(storageBoy);
		plovdivEmployee.attach(storageBoy);
		
		
		ArrayList<Client> clients = new ArrayList<Client>();
		
		//Normal cases
		clients.add(new Client(PackageType.Abroad, "Ivan"));
		clients.add(new Client(PackageType.Country, "Dragan"));
		clients.add(new Client(PackageType.Plovdiv, "John"));
		
		//Chain has no one to handle the request case
		clients.add(new Client(PackageType.Overseas, "Mr. Nobody"));
		
		for(Client client : clients) {
			plovdivEmployee.handleClient(client);
		}
		
		//Here we simulate that a abroad employee is in the 'busy' state and can't handle another client's package
		plovdivEmployee = new PlovdivEmployee(countryEmployee, new PreparingPackageState());
		plovdivEmployee.attach(storageBoy);
		
		for(Client client : clients) {
			plovdivEmployee.handleClient(client);
		}
	}

}
