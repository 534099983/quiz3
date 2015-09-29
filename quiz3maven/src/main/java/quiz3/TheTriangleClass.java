package quiz3;

public class TheTriangleClass extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	
	public TheTriangleClass(){
		double side1=1.0;
		double side2=1.0;
		double side3=1.0;
	}
	
	
	public TheTriangleClass(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
		
	public double getside1(){
			return side1;
		}
		public double getside2(){
			return side2;
		}
		public double getside3(){
			return side3;
		}
		public void setside1(double side1){
			this.side1 = side1;
		}
		public void setside2(double side2){
			this.side2 = side2;
		}
		public void setside3(double side3){
			this.side3 = side3;
		}
		double Area;
	public double getArea(){
		return Area=Math.sqrt(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2))*(((side1+side2+side3)/2)-side3);
	}


	double Perimeter;
	public double getPerimeter() {
		return Perimeter=side1+side2+side3;
	}
	String word;
	public String toString(){
		return word="The triangle side1 is "+side1+", side2 is "+side2+", side3 is "+side3+", area is "+Area+", perimeter is "+Perimeter;
		
	}

}
