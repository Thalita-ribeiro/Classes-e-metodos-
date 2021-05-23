package classe;

public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
