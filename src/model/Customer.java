package model;

import Exception.DocumentTypeException;
import Exception.NumberException;

public class Customer {

	private String id;
	private DocumentType documentType;
	
	
	
	public Customer() {
		super();
	}
	public Customer(String id, String documentType) {
		this.id=id;
		this.documentType=DocumentType.valueOf(documentType);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DocumentType getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
	
	
	public void addPerson( String id,  String documentType, int date) throws DocumentTypeException, NumberException{
		
		
		int temp=Character.getNumericValue(id.charAt(id.length()-2));

		if(!documentType.equals("TI")) {
			if((date%2==0 && temp%2!=0)||(date%2!=0 && temp%2==0)) {
				System.out.println("El usuario puede entrar");
			}else {
				throw new NumberException(date);
			}
		}
		else {
			
			throw new DocumentTypeException(documentType);
			
		}
	}
	

}
