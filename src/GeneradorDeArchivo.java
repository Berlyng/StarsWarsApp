import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {

    public void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escribirArchivo = new FileWriter("escribirArchivo.json");
        escribirArchivo.write(gson.toJson(pelicula));
        escribirArchivo.close();

    }
}
