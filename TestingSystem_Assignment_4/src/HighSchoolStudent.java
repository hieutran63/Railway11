
public class HighSchoolStudent extends Student{
	private String clazz;
	private String desiredUniversity;
	
	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity  ) {
		super(id, name);
		this.clazz = clazz;
		this.desiredUniversity =  desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent [id= " + super.getId() + ", name= " + super.getName() + ","
							+ " clazz= " + clazz + ", desiredUniversity= " + desiredUniversity + "]";
	}

	
}
