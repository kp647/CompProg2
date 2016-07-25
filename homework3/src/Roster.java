public class Roster {
    Student [ ] students;
    int numStudents;
    int stopPoint;
    Course course;
	
    /**
     * The constructor for this class.
     * Initialize this roster so that it is empty, i.e., holds no students,
     *  but so that it can hold up to stopPoint students
     *   and so that it has the given stop point and course
     */
    public Roster(int stopPoint, Course course){
	this.stopPoint = stopPoint;
	this.course = course;
	this.students = new Student [stopPoint];
    }
    
    /**
     * toString is a method every class has.  It returns a string 
     * that represents the object for printing
     */
    public String toString( ){
	String res = "";
	for(int j = 0; j < numStudents; j++){
	    res = res + "\n" + students[j].toString();
	}
	return course + " " + numStudents + "/" + stopPoint+res;
    }

    /**
     * isFull returns true if and only if the number of students in it is 
     *   at the stopPoint
     */
    public boolean isFull( ){
	if (numStudents==stopPoint)
		return true;
	else
		return false;// replace this line with your code//done
    }
	
    /**
     * add given student to this roster
     * if student already on roster or numStudents already == stopPoint, 
     *   do not change roster and return false
     * worst case O(1) - add the new Student at the end of the array
     * @return true if successful, else false
     */
    public boolean addStudent(Student student){
    	
     	for(int count=0; count<this.numStudents; count++)
     	{
     		if (this.students[count].toString().equals(student.toString())){
     			return false;
     		}

     	}
    	if(this.numStudents<=this.stopPoint){
		this.students[numStudents]=student;
		this.numStudents++;
		}

 	return true;
    }


    /**
     * returns true if and only if the student is on this roster.
     */
    public boolean findStudent(Student student){
    	 
    	for(int count=0;count<this.numStudents; count++)
    	{
    		if (this.students[count].equals(student)){
    			return true;
    		
    	}}

	return false; }// replace this line with your code}//done

    /**
     * Remove given student from this roster. 
     * If student is not on this roster do not change roster and return false
     * @return true if successful, else false
     */
    public boolean dropStudent(Student student){
    	for(int count=0; count<this.numStudents; count++)
     	{
     		if (this.students[count].toString().equals(student.toString())){
     			for(int i=count;i<this.numStudents-1;i++){
     				this.students[i]=this.students[i+1];
     				
     			}
     			this.numStudents--;
     			return true;
     		}
     	}

	return false; // replace this line with your code//done

    }

}
