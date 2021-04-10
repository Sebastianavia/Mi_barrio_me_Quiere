package model;

/**
 * @author nicolas g
 *
 */
public class Customer {
	private String id;
	private DocumentType documentType;
	public Customer(String id, DocumentType documentType) {
		this.id=id;
		this.documentType=documentType;
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

}
