/**
 * 
 * @author Hristo Galabov Kovachev
 *  Date : 12/12/2016
 * 
 */
public class HotelReport {

	// reporting information with given object information
	public static void report(Hotel a) {
		System.out.println("Name:" + a.getName());

		for (int i = 0; i < a.getRoomList().size(); i++) {

			System.out.println("Room" + "[" + (i + 1) + "]");
			System.out.println("Single :" + a.getRoomList().get(i).getNumSingle());
			System.out.println("Double :" + a.getRoomList().get(i).getNumDouble());
			
			if(a.isVacancy()){
				
				System.out.println("The room is free");
			}
			else {
				System.out.println("The room is taken");
			}
		}

	}

}
