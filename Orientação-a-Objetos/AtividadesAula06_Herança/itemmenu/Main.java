package itemmenu;

public class Main {
    public static void main(String[] args) {
        ItemMenu item = new ItemMenu("Torrada", 10.50);
        Sobremesa sobremesa = new Sobremesa("Pudim", 8.00, true);

        System.out.println(item.toString());
        System.out.println(sobremesa.toString());
    }
}
