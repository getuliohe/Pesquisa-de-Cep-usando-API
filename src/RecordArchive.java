import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RecordArchive {

    void RecordJson(ArrayList<ViaCep> lista) throws IOException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = new FileWriter("Ceps.json");
        fileWriter.write(gson.toJson(lista));
        fileWriter.close();
    }
}
