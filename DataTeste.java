package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        String dataFormata = data.obterDataFormatada();
        System.out.println(dataFormata);

        Data data1 = new Data(14, 06, 2000);

        String dataFormata1 = data1.obterDataFormatada();
        System.out.println(dataFormata1);
    }
}
