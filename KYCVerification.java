

public class KYCVerification {
	private String panNumber;
	private long aadharNumber;
	private String documentType;
	private String documentNumber;
	
	public KYCVerification()
	{
		super();
	}
	
	public KYCVerification(String panNumber,long aadharNumber,String documentType,String documentNumber) {
		super();
		this.setPanNumber(panNumber);
		this.setAadharNumber(aadharNumber);
		this.setDocumentType(documentType);
		this.setDocumentNumber(documentNumber);
		
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	
}