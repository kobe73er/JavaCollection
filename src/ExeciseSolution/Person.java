package ExeciseSolution;

import java.util.Comparator;

public class Person implements Comparable {
	private int age;
	private String name;
	private String sex;

	public Person(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person) o;
		if (this.getAge() > p.getAge())
			return 1;
		else if (this.getAge() < p.getAge())
			return -1;
		else
			return 0;
	}
}
