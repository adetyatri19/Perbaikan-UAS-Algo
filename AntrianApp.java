package NO2;
public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(27);
        antrian.display();
        antrian.enqueue(15);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(40);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(65);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
