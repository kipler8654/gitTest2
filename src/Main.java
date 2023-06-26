import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            exception();
        } catch (Exception e) {
            System.out.println("Exception error");
        }
    }

    public static void exception() throws IOException {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException error");
            throw new IOException();
        } finally {
            try (BufferedReader br = new BufferedReader(new FileReader("file.java"))) {
                throw new ArrayIndexOutOfBoundsException();
            } catch (IOException e) {
                System.out.println("IOException error");
            }
        }
    }
}