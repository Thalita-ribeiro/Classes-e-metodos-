package classe;

public class AreaCirTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        System.out.println(a.area(12));

        AreaCirc a1 = new AreaCirc(10);
        System.out.println(a1.area(12));

        AreaCirc.area(12);
    }
}
