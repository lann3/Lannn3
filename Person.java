package ClassDay;

public class Person {
	private String fullname;
	private int age;
	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public Person (String fullname, int age, int id, String worktitle, String gender) {
		this.fullname = fullname;
		this.age = age;
		this.id = id;
		this.worktitle = worktitle;
		this.gender = gender;
	}
	public String toString () {
		return "info of person: " + id + "  " + fullname +",  " + age+ " years old,  " + worktitle + ",  " + gender;
	}
	

	
	public static void main(String[] args) {
		String [] arrName = {"John", "Marry Jane", "Peter", "Daisy"};
		int [] arrAge = {50, 40, 18, 16};
		int [] arrId = {1, 2, 3, 4};
		String[] arrWork = {"worker", "Teacher", "Student", "Student"};
		String [] arrGender = {"Male", "Female", "Male", "Female"};
		for(int g = 0; g < 4; g++) {
			Person p1 = new Person (arrName[g], arrAge[g], arrId[g],arrWork [g], arrGender[g]);
			System.out.println(p1);
		}
		
		
	}
	
}
