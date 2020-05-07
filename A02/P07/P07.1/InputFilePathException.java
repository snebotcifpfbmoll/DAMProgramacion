import java.util.*;
import java.io.*;
import java.text.*;

public class InputFilePathException extends Throwable {
    private String error = "";

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public InputFilePathException() {}

    public InputFilePathException(String error) {
        this.error = error;
    }

    public void log(String ruta) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(ruta, true);

            // obtener fecha y hora
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            Date objFecha = new Date();
            String fecha = df.format(objFecha) + " - ";
            for (int i = 0; i < fecha.length(); i ++) fout.write(fecha.charAt(i));

            // imprimir error
            String error = getError();
            for (int i = 0; i < error.length(); i ++) fout.write(error.charAt(i));

            fout.write('\n');
        } catch (IOException e) {
            throw e;
        } finally {
            if (fout != null) fout.close();
        }
    }
}
