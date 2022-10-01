

public class ContactDetails {
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private String countryName;
	private long pinCode;
	private long mobileNumber;
	private long emailId;
	
	public ContactDetails(String houseNumber, String localityName,String cityName,String stateName,
								String countryName, long pinCode,long mobileNumber, long emailId ) {
		
		super();
		this.setHouseNumber(houseNumber);
		this.setLocalityName(localityName);
		this.setCityName(cityName);
		this.setStateName(stateName);
		this.setCountryName(countryName);
		this.setPinCode(pinCode);
		this.setMobileNumber(mobileNumber);
		this.setEmailId(emailId);
		
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getEmailId() {
		return emailId;
	}

	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
	
}