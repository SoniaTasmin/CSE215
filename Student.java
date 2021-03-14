package Login;

public class Student {
	private String name;
	private int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student maxMark(Student st[],int size) {
		int maxIndex=0;
		int maxMark= st[0].getMark();
		
		for(int i= 0; i<size; i++) {
			if(maxMark< st[i].getMark()) {
				maxMark = st[i].getMark();
				maxIndex= i;
			}
		}
		return st[maxIndex];
		
		
	}
	public String toString() {
		return name+"  got "+mark;
		
	}
	
	
	
}
