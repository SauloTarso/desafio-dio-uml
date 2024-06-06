package app;

public class Program {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();
        iphone.aplicativos.forEach(System.out::println);

    }
}
