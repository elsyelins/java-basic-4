public class JavaMethod{
    public static void main (String[] args){
        myMethod(100);
        myMethod(75);
        myMethod(55);
        myMethod(35);
        myMethod(5);
        myMethod(105);
    }
    static void myMethod(int nilai){

        if (nilai >= 81 && nilai <= 100){
            System.out.println("Nilai Anda : A");
        } else if (nilai >= 61 && nilai <= 80){
            System.out.println("Nilai Anda : B");
        } else if (nilai >= 41 && nilai <= 60){
            System.out.println("Nilai Anda : C");
        } else if (nilai >= 21 && nilai <= 40){
            System.out.println("Nilai Anda : D");
        } else if (nilai >= 0 && nilai <= 20){
            System.out.println("Nilai Anda : E");
        } else if (nilai > 100){
            System.out.println("Invalid Number");
        } 
    }
}