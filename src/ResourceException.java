public class ResourceException implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new ArithmeticException("ArithmeticException error");
    }
}