package pack;
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ingreso de datos
		int N;
		String a=("");
		String b=("");
		String c=("");
		int j=0;
		Scanner d=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del cuadrado");
		N=d.nextInt();
		int z=N-2;
		//condicion 0 y 1
		if(N==0){
			System.out.println(" ");
		}
		if(N==1){
			System.out.println("*");
		}
		//aqui esta la magia!
		else{
			for(int i=0;i<N;i++){
				a=("*")+a;
			}
			while(j<=z){
				b=("*")+c+("*");
				c=c+(" ");
				j=j+1;
			}
		}
		System.out.println(a);
		for(int k=0;k<N;k++){
			System.out.println(b);
		}
		System.out.println(a);

	}

}
