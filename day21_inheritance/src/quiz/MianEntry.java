/*
 Employee -> 상속 받는 클래스 Regutl
 */
package quiz;

public class MianEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name = null;
			String rank = null;
			String department = null;
			String contact = null;
			int pay = 0;
			Employee em = new Employee();
			Regular re = new Regular();
			
			em.setName(name);
			em.setRank(rank);
			em.setDepartment(department);
			em.setContact(contact);
			re.setPay(pay);
			System.out.println(em);
//		
	}

}
