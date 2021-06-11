
public class Ex4Student {
	private int id;
	private String name;
	private String homeTown;
	private float score ; 
	
	public Ex4Student() {
		
	}
	
	public Ex4Student (String name, String homeTown){
		this.name = name;
		this.homeTown = homeTown;
		this.score = (float) 0;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Ex4Student [id=" + id + ", name=" + name + ", homeTown=" + homeTown + ", score=" + score + "]";
	}
	
	
}
