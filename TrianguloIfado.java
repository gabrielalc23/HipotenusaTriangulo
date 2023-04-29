import java.util.Scanner;

//Crie um programa em java que leia
//3 Valores que representam os lados de um triângulo
//Verifique se é um 
//triânagulo equiláreo (3 lado iguais)
//isóceles (2 lado iguais)
//escaleno (nenhum lado igual)

//if//and (&&)
//or (||)
//igual(==)
//Diferente !=

 class  CalculoMedia {
    public static void main (String args[]) {
        
		Scanner teclado = new Scanner(System.in);
        System.out.println("Insira os comprimentos dos tres lados do triangulo:");
		
			double ladoA = teclado.nextDouble();
			double ladoB = teclado.nextDouble();
			double ladoC = teclado.nextDouble();
			double hipotenusa;

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.printf("Este e um triangulo equilatero.\n\n");
        
		} else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
            System.out.printf("Este e um triangulo escaleno. \n\n");
        
		} else {
            System.out.printf("Este e um triangulo isosceles \n\n.");
		}
	    hipotenusa = (ladoA*ladoA)+(ladoB*ladoB);
		System.out.printf("a hipotenusa e \n\n" + hipotenusa);
		}
}