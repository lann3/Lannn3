package ClassDay;

public class Person {
	private String fullname;
	private int age;
	private String role;
	private String worktitle;
	private String gender;
	
	public void setFullname (String fullname) {
		this.fullname = fullname;
	}
	
	public String getFullname () {
		return fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setId(int id) {
		this.role = role;
	}

	public String getWorktitle() {
		return worktitle;
	}

	public void setWorktitle(String worktitle) {
		this.worktitle = worktitle;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Person (String fullname, int age, String role, String worktitle, String gender) {
		this.fullname = fullname;
		this.age = age;
		this.role = role;
		this.worktitle = worktitle;
		this.gender = gender;
	}
	public String toString () {
		return "info of person: " + role + "  " + fullname +",  " + age+ " years old,  " + worktitle + ",  " + gender;
	}
	

	
	public static void main(String[] args) {
		String [] arrName = {"John", "Marry Jane", "Peter", "Daisy"};
		int [] arrAge = {50, 40, 18, 16};
		String [] arrRole = {"Father", "Mother", "Son", "Daughter"};
		String[] arrWork = {"worker", "Teacher", "Student", "Student"};
		String [] arrGender = {"Male", "Female", "Male", "Female"};
		for(int g = 0; g < 4; g++) {
			Person p1 = new Person (arrName[g], arrAge[g], arrRole[g],arrWork [g], arrGender[g]);
			System.out.println(p1);
		}
		
		
	}
	
}
