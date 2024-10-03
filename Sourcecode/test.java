public class ExceptionExample {
    public void riskyMethod() {
        try {
            int result = 10 / 0; // possible divide by zero
        } catch (Exception e) {
            // do nothing
        }
    }
}
