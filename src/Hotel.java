
/**
 * 
 * @author Hristo Galabov Kovachev
 * Date : 12/12/2016
 * 
 */

import java.util.*;

public class Hotel {
	private boolean vacancy;
	private String name;
	private List<Room> roomList = new ArrayList<Room>();

	public String getName() { // method for setting hotel's name
		return name;
	}

	// checking the name is in the right format

	public void setName(String name) throws Exception {
		if (name.isEmpty())
			throw new IllegalArgumentException("Name is not given");
		this.name = name;

	}

	// making a room list, which stores the rooms

	public List<Room> getRoomList() {
		return roomList;
	}

	// adding bed, either single or double

	public void addBed(int singleBed, int doubleBed) {

		Room roomA = new Room();

		for (int i = 0; i < singleBed; i++) {
			roomA.bedAdd(Bed.TYPESINGLE);
		}

		for (int i = 0; i < doubleBed; i++) {
			roomA.bedAdd(Bed.TYPEDOUBLE);
		}

		roomList.add(roomA);
	}

	// making rooms with different types of beds

	public void addRoom(int rooms, int singleBed, int doubleBed) {

		for (int i = 0; i < rooms; i++) {
			addBed(singleBed, doubleBed);

		}
	}

	// calculating the maximum capacity of the hotel
	public int getOccupancy() {
		int i = 0;

		for (Room b : roomList) {

			i = i + b.getNumSingle();
			i = i + b.getNumDouble() * 2;

		}
		return i;
	}
	
	public boolean isVacancy() {
		return vacancy;
	}

	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
	}

	

}
