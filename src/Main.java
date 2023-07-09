import java.io.*;

public class Main {
    public static void main(String[] args){
        try {
            exception();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exception() throws IOException {
        try {
            throw new NullPointerException("NullPointerException error");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new IOException("IOException error");
        } finally {
            try (ResourceException resourceException = new ResourceException()) {
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}