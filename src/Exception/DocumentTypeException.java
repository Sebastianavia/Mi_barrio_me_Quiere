package Exception;

public class DocumentTypeException extends Exception{
	
	private String type; 
	
	public DocumentTypeException(String type) {
		super("Es menor de edad");
		this.type=type;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
