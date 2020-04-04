import java.util.*;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	//TODO constructor
	Student()
    	{
        		this.index = "";
       		this.firstName="";
        		this.lastName="";
        		this.grades = new ArrayList<>();
    	}

    	Student(String index, String firstName, String lastName, ArrayList<Integer>grades)
    	{
        		this.index = index;
        		this.firstName= firstName;
        		this.lastName= lastName;
        		this.grades = grades;
    	}

	//TODO seters & getters
	public String getIndex() {
        		return index;
    	}

    	public String getFirstName() {
        		return firstName;
    	}

    	public String getLastName() {
        		return lastName;
    	}

    	public List<Integer> getGrades() {
        		return grades;
    	}

    	public void setIndex(String index) {
        		this.index = index;
    	}

    	public void setFirstName(String firstName) {
        		this.firstName = firstName;
    	}

    	public void setLastName(String lastName) {
        		this.lastName = lastName;
    	}

    	public void setGrades(List<Integer> grades) {
        		this.grades = grades;
    	}
	public double getAverage() {
		//TODO
		double sum = 0;

        		for(int i = 0 ; i < grades.size(); i ++)
        		{
           		 	sum += grades.get(i);
        		}

       	 	sum = sum/grades.size();

        		return sum;
	}

	public int ECTSCredits() {
		//TODO
  		int count = 0;
        		
		for(int i = 0 ; i < grades.size(); i ++)
        		{
            			if(grades.get(i) >= 6)
            			{
             		
				count++;
            			}
        		}

        		return count;
	}
}
