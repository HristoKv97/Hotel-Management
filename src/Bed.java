/**
 * 
 * @author Hristo Galabov Kovachev 
 * Date : 12/12/2016
 * 
 */

// Creating Bed class, which sets the bed size
public class Bed {

	private String bedSize;
	public static final String TYPESINGLE = "Single";
	public static final String TYPEDOUBLE = "Double";

	public String getBedSize() {
		return bedSize;
	}

	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}

}
