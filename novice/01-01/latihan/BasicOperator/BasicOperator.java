public class BasicOperator{
    public static void main(String args[]){
        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );

        int x = 6;
        int y = 9;

        int hasilTambah = x+y;
        int hasilKali = x*y;

        System.out.println("Nilai x = "+x);
        System.out.println("Nilai y = "+y);
        System.out.println("Hasil tambah dari x dan y = "+hasilTambah);
        System.out.println("Hasil kali dari x dan y = "+hasilKali);
    }
}