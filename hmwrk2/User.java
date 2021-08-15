package hmwrk2;

public class User {
	private int id ;
	private String userName ;
	private String eMailAdress;
	private String cauntry ;
	private String postCode;
	private String adress;
	private String position ;
	public User () {
		
	}
	public User (String position,int id , String userName, String cauntry, String postCode, String adress, String eMailAdress) {
		super();
		this.id = id;
		this.userName = userName;
		this.eMailAdress = eMailAdress;
		this.cauntry = cauntry;
		this.postCode = postCode;
		this.adress = adress;
		this.position = position;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;	
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String geteMailAdress() {
		return eMailAdress;
	}
	public void seteMailAdress(String eMailAdress) {
		this.eMailAdress = eMailAdress;
	}
	public String getCauntry() {
		return cauntry;
	}
	public void setCauntry(String cauntry) {
		this.cauntry = cauntry;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	

}
