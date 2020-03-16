import java.util.*;

public class ApuestaException extends Throwable {
    private String error = "";

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public ApuestaException() {}

    public ApuestaException(String error) {
        this.error = error;
    }
}
