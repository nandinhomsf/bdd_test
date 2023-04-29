package triangulo;


/*******************************************************************************
 * Classe que verifica se tr�s valores informados formam um tri�ngulo, ou seja,
 * se cada lado � menor que a soma dos outros dois lados. Em caso positivo,
 * informa se o tri�ngulo � is�sceles (dois lados iguais e um diferente),
 * escaleno (todos os lados diferentes) ou equil�tero (todos os lados iguais).
 *******************************************************************************/

public class Triangulo {
	
    public String verificaTriangulo(int a, int b, int c) {
        if (ehValido(a, b, c)) {
            return descobreQualTriangulo(a, b, c);
        }
        return "Nao eh um triangulo";
    }

    public String descobreQualTriangulo(int a, int b, int c) {
        if (ehEquilatero(a, b, c)) {
            return "O triangulo eh equilatero";
        } else if (ehIsosceles(a, b, c)) {
            return "O triangulo eh isosceles";
        } else {
            return "O triangulo eh escaleno";
        }
    }

    public boolean ehValido(int a, int b, int c) {
        return (a + b > c && b + c > a && a + c > b);
    }

    public boolean ehEquilatero(int a, int b, int c){
        return (a == b && b == c);
    }

    public boolean ehIsosceles(int a, int b, int c){
        return (a == b || b == c || a == c);
    }	

}
