import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.util.stream.Collectors.toList;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main (String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://13.238.167.130/weather"))
                .header("Accept", "text/event-stream")
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofInputStream())
                .thenApply(HttpResponse::body)
                .thenAccept(inputStream -> {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {

                        List <String> line =
                           reader.lines()
                           .filter(reader.readLine() -> reader.readLine().contains("Windy") )
                           .collect(toList());
                       System.out.println("Received: " + line); 


    
                       //  while ((line = reader.readLine()) != null) {
                         //       System.out.println("Received: " + line);
                  //     }
                     
                    } catch (IOException e) {
                        System.err.println("Error reading Server Side Event (SSE) stream: " + e.getMessage());
                    }
                })
                .join(); // Wait for the async operation to complete
    }
}