package ejercicio;
import java.util.Scanner;
public class calculo {

	public static void Clear() {
		for(int i=1; i <=20; i++); {
		System.out.println("");
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		int op,y,f,i;
		double ycm,fcm,icm;
		boolean exit=false;
		
		while(!exit) {
			System.out.println("1. De Yardas a Centimetros");
			System.out.println("2. De Pies a Centimetros");
			System.out.println("3. De Pulgadas a Centimetros");
			System.out.println("4. Salida");
			System.out.println("Eliga una opcion");
			op = tc.nextInt();
			Clear();
			switch(op) {
			case 1:
				System.out.println("Ingrese el valor de Yardas");
				y = tc.nextInt();
				
				ycm = y*0.9144*100;
				
				System.out.println("La conversion de yardas a centimetros es de: "+ycm+"cm");
				Clear();
				break;
				
			case 2:
				System.out.println("Ingrese el valor de Pies");
				f = tc.nextInt();
				
				fcm = (f*30.48)/1;
				
				System.out.println("La conversion de pies a centimetros es de: "+fcm+"cm");
				Clear();
				break;
				
			case 3:
				System.out.println("Ingrese el valor de Pulgadas");
				i = tc.nextInt();
				
				icm = (i*2.54)/1;
				
				System.out.println("La conversion de pulgadas a centimetros es de: "+icm+"cm");
				Clear();
				break;
				
			case 4:
				System.out.println("Adios!");
				break;
				
				default:
					System.out.println("Opciones invalidas");
			}
		}
	}
}
