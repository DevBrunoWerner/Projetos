package recursividade;


public class recu {
    public int fibo(int n){
        if(n<2){
            return n;
        } else {
        return fibo(n-1) + fibo(n -2); 
    }
}
    public static void main(String[]args){

        recu obj = new recu();

        for (int i = 0; i < 30; i++){
            System.out.println("(" + i + ")" + obj.fibo(i) + "\t");
        }

    }
}