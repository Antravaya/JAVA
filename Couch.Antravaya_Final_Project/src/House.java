class House {
    
    private String id;
    private String type;
    private double cost;
    private String owner;
    private String[] availableDates;
    private String[] unavailableDates;
    
    public House(String id, String type, double cost, String owner, String[] availableDates, String[] unavailableDates) {
        this.id = id;
        this.type = type;
        this.cost = cost;
        this.owner = owner;
        this.availableDates = availableDates;
        this.unavailableDates = unavailableDates;
    }

	public String getId() {
    	return id;
    }
    
    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public String getOwner() {
        return owner;
    }

    public String[] getAvailableDates() {
        return availableDates;
    }

    public String[] getUnavailableDates() {
        return unavailableDates;
    }

    public String toString() {
        String availableDatesString = String.join(",", availableDates);
        String unavailableDatesString = String.join(",", unavailableDates);
        return "ID: " + id + ", Type: " + type + ", Cost: $" + cost + "/night, Owner: " + owner + ", Available dates: " + availableDatesString + ", Unavailable dates: " + unavailableDatesString;
    }

	public void setGuest(Guest guest) {
		// TODO Auto-generated method stub
		return;
	}

	public void addUnavailableDate(String rentalStartDate) {
		// TODO Auto-generated method stub
		return;
	}

	public int getRentalCostPerNight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void returnHouse(String rentalStartDate, String rentalEndDate) {
		// TODO Auto-generated method stub
		return;
	}

	public String getSquareFootage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}