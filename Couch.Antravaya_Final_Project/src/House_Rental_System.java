/****************************************
* Student Name: Antravaya Couch
* Date Due: May 3, 2023 
* Date Submitted: May 3, 2023
* Program Name: Hotel_Rental_System
* Program Description: This program acts as a house rental
* system. The client can add homes onto the program
* and distribute them to users for renting.
****************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House_Rental_System {
    
    static ArrayList<House> houseList = new ArrayList<>();
    static ArrayList<Guest> guestList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String choice = "";
			
			while (!choice.equals("9")) {
			    System.out.println("What would you like to do?");
			    System.out.println("1. Register House");
			    System.out.println("2. Unregister a house");
			    System.out.println("3. Register a guest");
			    System.out.println("4. Unregister a guest");
			    System.out.println("5. Rent House");
			    System.out.println("6. Return House");
			    System.out.println("7. House Report");
			    System.out.println("8. Guest Report");
			    System.out.println("9. Quit");
			    choice = sc.nextLine();
			    
			    switch (choice) {
			        case "1":
			        	System.out.println("Enter the house registration ID:");
			            String id = sc.nextLine();
			            System.out.println("Enter the house type (Single House, Apartment, Condo):");
			            String type = sc.nextLine();
			            System.out.println("Enter the rental cost per night:");
			            double cost = Double.parseDouble(sc.nextLine());
			            System.out.println("Enter the owner's name:");
			            String owner = sc.nextLine();
			            System.out.println("Enter the available dates (separated by commas):");
			            String[] availableDates = sc.nextLine().split(",");
			            System.out.println("Enter the unavailable dates (separated by commas):");
			            String[] unavailableDates = sc.nextLine().split(",");
			            houseList.add(new House(id, type, cost, owner, availableDates, unavailableDates));
			            System.out.println("House added successfully!");
			        	break;
			        case "2":
			            unregistarHouse();
			            break;
			        case "3":
			        	registarGuest();
			        	break;
			        case "4":
			        	unregisterGuest();
			            break;
			        case "5":
			            rentHouse();
			            break;
			        case "6":
			        	returnHouse();
			        	break;
			        case "7":
			        	houseReport(houseList);
			        	break;
			        case "8":
			        	guestReport(guestList);
			        	break;
			        case "9":
			            System.out.println("Goodbye!");
			            break;
			        default:
			            System.out.println("Invalid choice. Please try again.");
			            break;
			        case "":
			            registarGuest();
			            break;
			    }
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    }
    
    public static void unregistarHouse() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the ID of the house to remove:");
			String id = sc.nextLine();
			boolean houseRemoved = false;
			for (int i = 0; i < houseList.size(); i++) {
			    if (houseList.get(i).getId().equals(id)) {
			        houseList.remove(i);
			        System.out.println("House with ID " + id + " removed successfully.");
			        houseRemoved = true;
			        break;
			    }
			}
			if (!houseRemoved) {
			    System.out.println("No house with ID " + id + " found.");
			}
		}
        return;
    }
        
    public static void registarGuest() {
    	try (Scanner sc = new Scanner(System.in)) {
    		System.out.println("Enter the guest ID:");
    		String guestId = sc.nextLine();
    		System.out.println("Enter the guest name:");
            String guestName = sc.nextLine();
            System.out.println("Enter the rental starting date:");
            String rentalStartDate = sc.nextLine();
            System.out.println("Enter the rental ending date:");
            String rentalEndDate = sc.nextLine();
            guestList.add(new Guest(guestId, guestName, rentalStartDate, rentalEndDate));
            System.out.println("Guest added successfully!");
            }
    	}

    public static void unregisterGuest() {
    	try (Scanner sc = new Scanner(System.in)) {
    		System.out.println("Enter the Guest registration ID to unregister:");
            String unregisterId = sc.nextLine();
            boolean removed = false;
            for (Guest h : guestList) {
                if (h.getId().equals(unregisterId)) {
                   guestList.remove(h);
                    removed = true;
                    System.out.println("Guest with ID " + unregisterId + " unregistered successfully!");
                    break;
                }
            }
            if (!removed) {
            	System.out.println("No Guest with ID " + unregisterId + " was found.");
            }
        }
     }
                
    public static void rentHouse() {
    	try (Scanner sc = new Scanner(System.in)) {
    		System.out.println("Enter the guest ID:");
            String guestId = sc.nextLine();
            System.out.println("Enter the house ID:");
            String houseId = sc.nextLine();
            System.out.println("Enter the rental starting date:");
            String rentalStartDate = sc.nextLine();
            System.out.println("Enter the rental ending date:");
            String rentalEndDate = sc.nextLine();
            
            Guest guest = null;
            House house = null;
            for (Guest g : guestList) {
            	if (g.getId().equals(guestId)) {
            		guest = g;
                    break;
                    }
                }
                for (House h : houseList) {
                	if (h.getId().equals(houseId)) {
                		house = h;
                        break;
                    }
                }
                
                if (guest == null) {
                    System.out.println("Guest with ID " + guestId + " not found.");
                    return;
                }
                if (house == null) {
                    System.out.println("House with ID " + houseId + " not found.");
                    return;
                }

                boolean isAvailable = true;
                for (String date : house.getUnavailableDates()) {
                    if (isBetween(date, rentalStartDate, rentalEndDate)) {
                        isAvailable = false;
                        break;
                    }
                }
                if (!isAvailable) {
                    System.out.println("House with ID " + houseId + " is not available during the specified period.");
                    return;
                }

                house.setGuest(guest);
                house.addUnavailableDate(rentalStartDate);
                house.addUnavailableDate(rentalEndDate);
                System.out.println("House with ID " + houseId + " rented to guest with ID " + guestId + " from " + rentalStartDate + " to " + rentalEndDate + ".");
            }
        }
        
        public static boolean isBetween(String date, String startDate, String endDate) {
            return date.compareTo(startDate) >= 0 && date.compareTo(endDate) <= 0;
        }
        
    public static void returnHouse() {
    	try (Scanner sc = new Scanner(System.in)) {
    		System.out.println("Enter the guest ID:");
    		String guestId = sc.nextLine();
    		System.out.println("Enter the house ID:");
    		String houseId = sc.nextLine();
    		
    		Guest guest = null;
    		House house = null;
    		for (Guest g : guestList) {
    			if (g.getId().equals(guestId)) {
    				guest = g;
    				break;
    				}
                }
                for (House h : houseList) {
                    if (h.getId().equals(houseId)) {
                        house = h;
                        break;
                    }
                }

                if (guest == null) {
                    System.out.println("Guest with ID " + guestId + " not found.");
                    return;
                }
                if (house == null) {
                    System.out.println("House with ID " + houseId + " not found.");
                    return;
                }

                if (!guest.getRentedHouseId().equals(houseId)) {
                    System.out.println("Guest with ID " + guestId + " has not rented house with ID " + houseId + ".");
                    return;
                }

                double rentalCost = house.getRentalCostPerNight() * guest.getRentalDuration();
                System.out.println("Guest with ID " + guestId + " has rented house with ID " + houseId + " for " + guest.getRentalDuration() + " nights, at a cost of $" + rentalCost + ".");

                guest.returnHouse();
                house.returnHouse(guest.getRentalStartDate(), guest.getRentalEndDate());

                System.out.println("House with ID " + houseId + " has been returned by guest with ID " + guestId + ".");
            }
        }
    
    public static void houseReport(List<House> houses) {
        for (House house : houses) {
            System.out.println("House ID: " + house.getId());
            System.out.println("Room Type: " + house.getType());
            System.out.println("The Cost: " + house.getCost());
            System.out.println("Owners Name: " + house.getOwner());
            System.out.println("Status: " + (house.isAvailable() ? "Available" : "Not available"));
            System.out.println();
        }
    }
      
    public static void guestReport(List<Guest> guests) {
        System.out.println("Current Guest List:");
        System.out.println("-------------------");
        for (Guest guest : guests) {
            System.out.println(guest.getName() + " (" + guest.getId());
        }
        System.out.println();
    }
}