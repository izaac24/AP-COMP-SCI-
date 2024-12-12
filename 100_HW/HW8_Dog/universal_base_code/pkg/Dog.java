package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a,int b, String c){
		name = a;
		age = b;
		breed = c;
	}
	public void setName(String w){
		name = w;
	}
	public void setAge(int e){
		age = e;
	}
	public void setBreed(String t){
		breed = t;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		boolean s = true;
		int rnum = (int)(Math.random()*2 + 1);
		if(rnum == 1){
			s = false;
			return s;
		}
		if(rnum == 2){
			s = true;
			return s;
		}
		return s;
	}
	public void bark(){
		System.out.print(name + " is barking. ");
	}

}
