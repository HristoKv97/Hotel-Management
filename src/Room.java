
/**
 * 
 * @author Hristo Galabov Kovachev
 * Date : 12/12/2016
 * 
 */

import java.util.*;

public class Room {

	private List<Bed> bedList = new ArrayList<Bed>();

	// making a list, which stores beds in a room
	public List<Bed> getBedList() {
		return bedList;
	}

	// if the bed is Single, makes a counter for it
	public int getNumSingle() {
		int n = 0;

		for (Bed a : bedList) {
			if (a.getBedSize() == Bed.TYPESINGLE) {
				n++;
			}

		}
		return n;
	}

	public int getNumDouble() {
		int s = 0;

		for (Bed a : bedList) {
			if (a.getBedSize() == Bed.TYPEDOUBLE) {
				s++;
			}
		}
		return s;
	}

	// defines bed's type
	public void bedAdd(String bedSize) {
		Bed bedA = new Bed();
		bedA.setBedSize(bedSize);
		bedList.add(bedA);
	}


	


}
