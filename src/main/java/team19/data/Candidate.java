package team19.data;

public class Candidate {
	
	private int id;
	private String party;
	private String location;
	private int age;
	private String reason;
	private String goals;
	private String profession;
	private String fName;
	private String sName;
	private String USERNAME;
	private String PASSWORD;
	
	
	public Candidate(String id, String sName, String fName, String party, String location, String age, String reason, 
			String goals, String profession, String USERNAME, String PASSWORD) {
		setId(id);
		this.sName=sName;
		this.fName=fName;
		this.party=party;
		this.location=location;
		setAge(age);
		this.reason=reason;
		this.goals=goals;
		this.profession=profession;
		this.USERNAME=USERNAME;
		this.PASSWORD=PASSWORD;	
	}
	
	public Candidate(int id, String sName, String fName, String party, String location, int age, String reason, 
			String goals, String profession, String USERNAME, String PASSWORD) {
		setId(id);
		this.sName=sName;
		this.fName=fName;
		this.party=party;
		this.location=location;
		setAge(age);
		this.reason=reason;
		this.goals=goals;
		this.profession=profession;
		this.USERNAME=USERNAME;
		this.PASSWORD=PASSWORD;	
	}
	
	public Candidate() {
		System.out.println("Candidate() default constructor");		
	}
	
	
	// set
	
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		try {
			this.id = Integer.parseInt(id);
		}
		catch(NumberFormatException | NullPointerException e) {
		}
	}
	public void setParty(String candidate) {
		this.party = candidate;	
	}
	public void setSName(String sName) { //propeety name in JSP (JSTL lib) will be c.SName
		this.sName = sName;	
	}
	public void setFName(String fName) { //propeety name in JSP (JSTL lib) will be c.FName
		this.fName = fName;	
	}
	public void setLocation(String location) {
		this.location = location;	
	}
	public void setAge(int age) {
		this.age = age;	
	}
	public void setAge(String age) {
		try {
			this.age = Integer.parseInt(age);
		}
		catch(NumberFormatException | NullPointerException e) {
		}	
	}
	public void setReason(String reason) {
		this.reason = reason;		
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public void setProfession(String profession) {
		this.profession = profession;		
	}
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;		
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;		
	}
	//Get
	public int getId() {
		return id;
	}
	public String getParty() {
		return party;
	}
	public String getSName() {
		return sName;
	}
	public String getFName() {
		return fName;
	}
	public String getLocation() {
		return location;		
	}
	public int getAge() {
		return age;	
	}
	public String getReason() {
		return reason;	
	}
	public String getGoals() {
		return goals;
	}
	public String getProfession() {
		return profession;
	}	
	public String getUSERNAME() {
		return USERNAME;		
	}
	public String getPASSWORD() {
		return PASSWORD;		
	}
}
