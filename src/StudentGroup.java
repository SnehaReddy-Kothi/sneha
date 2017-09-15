import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		student = new Student(Students);
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		student = new Student(Students);
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		this.student = new Student(i);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.student = new Student(Students,i);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		this.student = new Student(F_Students);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		this.student = new Student(L_Students);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		this.student = new Student(Students,i);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		this.student = new Student(i);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		this.student = new Student(Students);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		this.student = new Student(i);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		this.student = new Student(Students);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		this.student = new Student(i);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		this.student = new Student(Students);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n = arr.length;
		int temp = 0;
		for (int i=0;i<n;i++)
		{
		 for (int j=1;j<(n-i);j++)
		{
		if(arr[j-1]>arr[j])
		{
		temp = arr[j-1];
		arr[j-1] = arr[j];
		arr[j] = temp;
		}
		}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
