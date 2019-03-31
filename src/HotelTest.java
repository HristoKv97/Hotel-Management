/**
 * 
 * @author Hristo Galabov Kovachev 
 * Date : 12/12/2016
 * 
 */
public class HotelTest {

	public static void main(String[] args) {

		// creating hotel object

		Hotel a = new Hotel();
		try {
			a.setName("GrandHotel");
		} catch (Exception e) {

			e.printStackTrace();
		}
		a.addRoom(1, 1, 2);
		a.addRoom(1, 3, 4);

		HotelReport.report(a);
		System.out.println("Maximum occupancy is : " + a.getOccupancy());
	}

}
