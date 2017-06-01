
//import java.util.ArrayList;
//import java.util.List;

public class Education {
	
	
	
	//List<String> schools = new ArrayList<String>();
	
	private String[] schoolsarray = {"Harvard","MIT", "Montgomery", "PennState", "ATBU",
			"Maryland", "Hopkins", "FGC", "Indiana", "Stanford" };
	
	public Education() {
	};
	
	public Education(String[] schoolsarray){
		
		this.schoolsarray = schoolsarray;
	};
	
	
	public String setSchools() {
		return "return schools";
	}
	@Override
	
	public String[] toString() {
		return schoolsarray;
	}

}
