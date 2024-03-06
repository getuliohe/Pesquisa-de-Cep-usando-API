import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<ViaCep> cepList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String search = "";

        while (!search.equalsIgnoreCase("sair")) {
            try {
                System.out.println("Digite o cep procurado: ");
                search = scanner.nextLine();

                if (search.equalsIgnoreCase("sair")){
                    break;
                }


                RetornaCep retornaCep = new RetornaCep();

                ViaCep viaCep = retornaCep.viaCep(search);
                System.out.println(viaCep);
                cepList.add(viaCep);

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Nao conseguimos achar o cep informado");
            }
        }
        RecordArchive recordArchive = new RecordArchive();
        recordArchive.RecordJson(cepList);

    }
}