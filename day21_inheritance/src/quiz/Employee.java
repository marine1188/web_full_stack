/*
 이름 ,직급 부서,연락처
 */
package quiz;

public class Employee extends Regular   {
	protected String name = null;
	protected String rank = null;
	protected String department = null;
	protected String contact = null;
	
	
	

	
	
	@Override
	public String toString() {
		return "Employee [이름=" + name + ", 직급=" + rank + ", 부서=" + department + ", 연락처=" + contact
				+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "조성규";
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = "회장";
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = "비서실";
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = "010-2733-1549";
	}


}
