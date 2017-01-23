package shallowCloining;

public class Student implements Cloneable {
	private int id;
	private String name;
	private Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	// Default version of clone() method which will create the shallow copy of
	// the object
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
