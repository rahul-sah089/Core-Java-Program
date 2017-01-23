package deepCloning;

public class Student implements Cloneable {
	private int id;
	private String name;
	private Course couse;

	public Student(int id, String name, Course couse) {
		super();
		this.id = id;
		this.name = name;
		this.couse = couse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCouse() {
		return couse;
	}

	public void setCouse(Course couse) {
		this.couse = couse;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student student = (Student) super.clone();
		Course course = (Course) getCouse().clone();
		student.setCouse(course);
		return student;
	}

}
