public class Main {


    static int sumowanie(int n){
        if( n == 0)
            return 0;
        else
            return n+sumowanie(n-1);
    }


    public static void main(String args[]){

        System.out.print(sumowanie(3));
    }
}
