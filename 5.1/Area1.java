import java.util.*;
import java.lang.Math;

abstract class Figure {
	double dim1;
	public abstract void findArea();
	public abstract void findPerimeter();

}
//circle extends figure class 
class Circle extends Figure{
	float r;
	// setting value of radius
	void set(float r){
		
		this.r=r;
		System.out.println("value of radius= "+r);
	}
	@Override
	//finds area and displays it
	public void findArea() 
	{
		// TODO Auto-generated method stub
		float area= 3.14f*r*r;
		System.out.println("area of circle= "+area);
	}

	@Override
	//finds perimeter and displays it
	public void findPerimeter() {
		// TODO Auto-generated method stub
		double peri= 2*3.14*r;
		System.out.println("perimeter of circle= "+peri);
	}
}
//rectangle extends figure class
class Rectangle extends Figure{
		float l,b;
		///setting values for length and breadth
			void set(float l, float b){
				this.l=l;
				this.b=b;
				System.out.println("length of rectangle= "+l+"\n breadth of rectangle= "+b);
			}
		@Override
	//finding area and displaying it
		public void findArea() {
			// TODO Auto-generated method stub
			float Area= l*b;
			System.out.println("area of rectangle= "+Area);
		}

		@Override
// finding perimeter and displaying it
		public void findPerimeter() {
			// TODO Auto-generated method stub
			float peri=2*(l+b);
			System.out.println("perimeter of rectangle= "+peri);
		}
		
	}
//triangle extends figure
class Triangle extends Figure{
		float a,b,c;
	//setting values for Ist, IInd,IIIrd sides
		void set(float a,float b, float c){
			this.a=a;
			this.b=b;
			this.c=c;
			System.out.println("Ist side of triangle= "+a+"\nIInd side of triangle= "+b+"\nIIIrd side of triangle= "+c);
		}
		@Override
		//finding area and displaying it
		public void findArea() {
			// TODO Auto-generated method stub
		float l=(a+b+c)/2;
		double area=Math.sqrt(l*(l-a)*(l-b)*(l-c));
			System.out.println("area of triangle= "+area);
		}

		@Override
		//finding perimeter and displaying it
		public void findPerimeter() {
			// TODO Auto-generated method stub
			float peri=(a+b+c);
			System.out.println("perimeter of triangle is= "+peri);
		}
		
	}
	
class Area1{
	public static void main(String args[]){
		Scanner g= new Scanner(System.in);
		System.out.println("enter radius= ");
		float r=g.nextFloat();
		Circle cir= new Circle();	
		cir.set(r);		// calling methods  of circle class
		cir.findArea();
		cir.findPerimeter();
		
		System.out.println("\nenter length= ");
		float l=g.nextFloat();
		System.out.println("enter breadth= ");
		float b=g.nextFloat();
		Rectangle rec= new Rectangle();
		rec.set(l, b);
		rec.findArea();		//calling methods of rectangle class
		rec.findPerimeter();
		
		System.out.println("\nenter Ist side");
		float a=g.nextFloat();
		System.out.println("enter IIst side");
		float B=g.nextFloat();
		System.out.println("enter IIIst side");
		float c=g.nextFloat();
		
		Triangle tri= new Triangle();
		tri.set(a, B, c);
		tri.findArea();		//calling methods of triangle class
		tri.findPerimeter();
		
		
		
	}
}
