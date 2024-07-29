package programs.TwentyTwo;

public class AgeInvalidException  extends RuntimeException{
	
	private String message;
	public AgeInvalidException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
