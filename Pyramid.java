import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args)  {
		System.out.print("Please input the layer of the Pyramid:");
		int layer=new Scanner(System.in).nextInt();
		for(int i=0;i<layer;i++){
			printSpace(layer-i-1);
			printStar(2*i+1);
			System.out.println();
		}
	}
	static void printSpace(int i){
		for(int j=0;j<i;j++){
			System.out.print(" ");
		}
	}
	static void printStar(int i){
		for(int j=0;j<i;j++){
			System.out.print("*");
		}
	}
	
	
	

}
