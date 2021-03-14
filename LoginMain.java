package Login;

import java.io.*;
import java.util.*;


public class LoginMain {
	public static void main(String[] args) {
	Login l = new Login();
	l.initGui();
		//Questions q = new Questions();
		//q.initGui();
	//Signup s = new Signup();
	//s.initGui();
		//AdminLogin a= new AdminLogin();
		//a.initGui();
		// stuLogout s = new stuLogout();
		 //s.initGui(0);
		//QuesMark v = new QuesMark();
		//v.initGui();
	Student st[] = new Student[100];
	int cnt = 0;
	File f= new File("D:\\PROJECT(JAVA)\\src\\Login\\info.txt");
	try {
		Scanner input = new Scanner(f);
	while(input.hasNext()) {
		String name=input.next();
		int mark = input.nextInt();
		
		Student su = new Student(name,mark);
		System.out.println(su.toString());
		
		st[cnt]=su;
		cnt++;
	}
	input.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(" ");
	System.out.println("highest mark "+maxMark(st, cnt).getMark()+" obtained by "+maxMark(st, cnt).getName());

}
public static Student maxMark(Student st[],int size) {
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

}
	
