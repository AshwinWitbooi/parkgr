package za.co.ashtech.parkgr.utils;


/*This exception is throw when a park run record is not found*/
public class ParkrunNotFoundException extends Throwable {

	private static final long serialVersionUID = -923277536597058576L;
	
	public ParkrunNotFoundException (String msg) {
		super(msg);
	}

}
