class Guest {
	private String id;
	private String name;
	private String rentalStartDate;
	private String rentalEndDate;

	public Guest(String id, String name, String rentalStartDate, String rentalEndDate) {
	    this.id = id;
	    this.name = name;
	    this.rentalStartDate = rentalStartDate;
	    this.rentalEndDate = rentalEndDate;
	
	}

	public String getId() {
	    return id;
	}

	public String getName() {
	    return name;
	}

	public String getRentalStartDate() {
	    return rentalStartDate;
	}

	public String getRentalEndDate() {
	    return rentalEndDate;
	}

	public String toString() {
	    return "ID: " + id + ", Name: " + name + ", Rental start date: " + rentalStartDate + ", Rental end date: " + rentalEndDate;
	}

	public Object getRentedHouseId() {
		return null;
	}

	public void returnHouse() {
		return;
	}

	public int getRentalDuration() {
		return 0;
	}
}