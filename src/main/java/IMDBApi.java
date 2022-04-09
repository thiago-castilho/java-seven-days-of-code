import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class IMDBApi {


    private static String apiKey = "k_4yuyrj1z";
    private static String language = "en";
    private static URI uri = URI.create("https://imdb-api.com/"+language+"/API/Top250Movies/" + apiKey);

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String otimized = response.body().toString().split("\\[")[1].split("]")[0];

        String[] lista = otimized.spl
        System.out.println(otimized);
        List<String> titles;
        List<String> urlImages;













//        irstDay1();
//        secondDay1();
    }

    private static void secondDay1() throws IOException, InterruptedException {
        String apiKey = "k_4yuyrj1z";
        String language = "en";
        URI uri = URI.create("https://imdb-api.com/"+language+"/API/Top250Movies/" + apiKey);

        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest.newBuilder()
                        .uri(uri)
                        .GET()
                        .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private static void firstDay1() {
        // TODO: EXECUTAR REQUISIÇÃO E PEGAR O CÓDIGO JSON E IMPRIMIR NO CONSOLE

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_4yuyrj1z"))
                .GET()
                .build();

        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
