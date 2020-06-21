package models;

public class Client {
	
	private String name;
	private PackageType packageType;
	
	public Client(PackageType packageType, String name) {
		this.packageType = packageType;
		this.name = name;
	}
	
	public PackageType getPackageType() {
		return this.packageType;
	}
	
	public String getName() {
		return this.name;
	}
}
