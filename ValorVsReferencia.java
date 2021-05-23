package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor (Tipo primitivo)

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(14, 06, 2000);
        Data d2 = d1; //atribuição por referência (Objeto)

        d1.dia = 27;
        d1.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1070;
    }
}
