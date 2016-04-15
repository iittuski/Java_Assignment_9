package j9;

public class j9 {
int a=16,b=18;

int  calculatesqrt(){
int sqrt = (int) Math.sqrt(a);
return sqrt;
}

int calculatecbrt(){
	int cubert = (int) Math.cbrt(b);
	return cubert;
}
	public static void main(String args[]){
		
		j9 object = new j9();
		int finalsqrttoot = object.calculatesqrt();
		int finalcuberoot = object.calculatecbrt();
			System.out.println("Sqaure Root is :"+finalsqrttoot+ "\nAnd Cuberoot is "
					+ ":"+finalcuberoot);
		
	}
}
