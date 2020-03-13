import java.util.*;

public class ExcepcionFigurasGeometricas extends Throwable {
    private String error = "";

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }
    
    public ExcepcionFigurasGeometricas() {}

    public ExcepcionFigurasGeometricas(String error) {
        this.error = error;
    }
}
