package exampleOfDataStructures;

import java.util.Comparator;

class Recursion{
	public void recursion (int count) {
		if(count<=0) {
			System.out.println(".");
		}else {
			System.out.println(count+" *");
			recursion(count-1);
		}
	}
}

class Car implements Comparable<Car> {
	private String modelName;
	private int modelYear;
	private String color;
	
	Car(String mn, int my, String c) {
		this.modelName = mn;
		this.modelYear = my;
		this.color = c;
	}
	
	public String getModel() {
		return this.modelYear + "식 " + this.modelName + " " + this.color;
	}
	public int getModelYear() {
		return this.modelYear;
	}
	
	public int compareTo(Car obj) {
		if (this.modelName == obj.modelName&&this.modelYear == obj.modelYear&&this.color == obj.color) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
public class Example_230728 {

	public static void main(String[] args) {
		
		//행렬 for문 실습
		int arrRepeat[] = {4,5,2,3,4,5,6,};
		
		for(int i=0;i<arrRepeat.length;i++) {
			arrRepeat[i] = i ;
		}
		
		for(int i: arrRepeat) { //i 에 arrRepeat[0]부터 끝까지 넣고 연산에 사용
			System.out.print(" "+i);
		}
		System.out.println();
		
		for(int i: arrRepeat) {
			System.out.print(" "+arrRepeat[i]); //굳이 필요없음
		}
		System.out.println();
		
		//Comparable 실습
		Car mycar1 = new Car("아반떼", 12, "빨강");
		Car mycar2 = new Car("아반떼", 23, "빨강");
		
		System.out.println(mycar1.compareTo(mycar2));
		System.out.println(mycar1.getModel());
		
		String myFood = "사탕";
		String yourFood = "피자";
		
		System.out.println(myFood.compareTo(yourFood));
		
		
		//Comparator, 익명개체 실습
		Comparator<Car> useMethod = new Comparator<Car>() {
			public int compare(Car obj1, Car obj2){
				return obj1.getModelYear() - obj2.getModelYear();
			}
		};
		
		System.out.println(useMethod.compare(mycar1, mycar2));
		
		//순환, 재귀 호출 실습
		Recursion rec = new Recursion();
		rec.recursion(4);
		
		
	}
	

}
