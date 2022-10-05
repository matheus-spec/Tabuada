package tabuada;
public class Tabuada {
    public static void main(String[] args) {
        tabuada(1);
        tabuada(2);
        tabuada(3);
        tabuada(4);
        tabuada(5);
        tabuada(6);
        tabuada(7);
        tabuada(8);
        tabuada(9);
        tabuada(10);
        direitos();
    }
    
    public static void tabuada(int n){
        int i;
        
        System.out.printf("+--Resultado--+\n");
        for (i=1; i<=10; i++){
            System.out.printf("| %2d*%d = %2d |\n", i, n, (i*n));
        }
        System.out.printf("+-------------+\n\n");
    }
    
    public static void direitos(){
        System.out.printf("Copyright(c) Prof. Omero Francisco Bertol.\n");
    }
    
}
