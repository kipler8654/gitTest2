public class Main {
    public static void main(String[] args) {
        try{
            throw new CheckedException();
        }catch(CheckedException e){
            System.out.println("Caught CheckedException");
        }
    }
}