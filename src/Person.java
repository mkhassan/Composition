
public class Person {
	
	// composition has - a relationship
	
	private Job job;
	private Education edu;
	
	public Person() {
		this.job = new Job();
		job.setSalary(1000L);
		
		this.edu = new Education();
		edu.setSchools();
	}
	
	public long getSalary() {
		return job.getSalary();
	}
	
	public String toString(){
	return " person name, education, jobtitle ";
	}


}
