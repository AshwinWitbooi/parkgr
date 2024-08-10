package za.co.ashtech.parkgr.utils;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-06T14:52:13.057490747Z[GMT]")
public class ApiException extends Exception {

	private static final long serialVersionUID = 4057644509271483243L;
	
	private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
