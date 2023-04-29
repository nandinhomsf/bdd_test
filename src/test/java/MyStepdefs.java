import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import triangulo.Triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {

    private String resultado;

    @Dado("que tenho os lados a={int}, b={int} e c={int}")
    public void queTenhoOsLadosABC(int arg0, int arg1, int arg2) {
        Triangulo triangulo = new Triangulo();
        resultado = triangulo.verificaTriangulo(arg0, arg1, arg2);
    }

    @Quando("verifico se é um triângulo")
    public void verificoSeEUmTriangulo() {
        // Não é necessário implementar aqui, pois o cenário já define que esse é o passo a ser executado.
    }

    @Entao("deve exibir {string}")
    public void deveExibir(String arg0) {
        assertEquals(arg0, resultado);
    }
}




