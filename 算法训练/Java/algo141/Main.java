package algo141;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			students[i] = new Student(in.next(), in.next(), in.nextInt(), in.nextInt());
		}
		in.close();

		Arrays.sort(students);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

}

class Student implements Comparable<Student> {

	private String name;
	private String sex;
	private int age;
	private int grade;

	public Student(String name, String sex, int age, int grade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return name + " " + sex + " " + age + " " + grade;
	}

	@Override
	public int compareTo(Student s) {

		return this.grade - s.grade;
	}

}