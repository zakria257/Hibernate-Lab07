
public class Person {
	private int person_id;
	private String name;
	private String fathername;
	private String organization;
	private String mobile;
	
	public Person(int id, String name, String fathername, String organization, String mobile) {
		this.person_id = id;
		this.name = name;
		this.fathername = fathername;
		this.organization = organization;
		this.mobile = mobile;
	}
	
	public Person() {}
	
	public int getPerson_id() {
		return person_id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFathername() {
		return fathername;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
