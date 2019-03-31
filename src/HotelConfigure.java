
/**
 * 
 * @author Hristo Galabov Kovachev
 * Date : 12/12/2016
 * 
 */

import java.util.*;

public class HotelConfigure {

	public static void main(String[] args) {

		HotelCreation();

	}

	static Scanner sc = new Scanner(System.in);

	// creating new hotel object

	public static void HotelCreation() {
		Hotel a = new Hotel();
		System.out.println("Enter the name of the hotel: ");
		String name = sc.nextLine();

		try {
			a.setName(name);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Enter the number of the rooms: ");

		int rooms = sc.nextInt();

		// for loops for making rooms with different types of rooms
		for (int i = 1; i <= rooms; i++) {
			System.out.print("Enter the number of single beds in room" + "[" + i + "] : ");
			int singleBed = sc.nextInt();
			System.out.print("Enter the number of double beds in room" + "[" + i + "] : ");
			int doubleBed = sc.nextInt();
			a.addBed(singleBed, doubleBed);
			
			System.out.println("Is the room taken, YES or NO ");
			
			String answer = sc.next();
			
			if(answer.toLowerCase().equals("yes")){
				a.setVacancy(false);
			}
			if(answer.toLowerCase().equals("no")){
				a.setVacancy(true);
			}
			
			
		
		}

		HotelReport.report(a);
		System.out.println("Maximum occupancy : " + a.getOccupancy());
	
	}

}
