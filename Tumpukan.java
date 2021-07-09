package NO1;
public class Tumpukan {
    public int ukuran;
    public long [] tumpukan;
    public int top;
    
    public Tumpukan ( int u){
        ukuran = u;
        tumpukan = new long [ukuran];
        top = -1;      
    }
    public void push(long i ){
        tumpukan[++top] = i;
    }
    public long pop(){
        return tumpukan[top--];
    }
    public long peek(){
        return tumpukan[top];
    }
    public boolean IsEmpety(){
        return (top == ukuran-1);
    }
    public boolean IsFull(){
        return (top == ukuran-1);
    }
    public void tampil(){
        int t = top;
        while(t>=0){
            System.out.print(tumpukan[t]);
            System.out.print(" ");
            t--;
        }
        System.out.println("");
    }
}
