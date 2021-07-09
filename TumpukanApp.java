package NO1;
public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(5);
        tumpukan.push(80);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(200);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(15);
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.tampil();
        System.out.println(" ");
        System.out.println("Nilai Top nya = "+tumpukan.peek());
       
    }
}
