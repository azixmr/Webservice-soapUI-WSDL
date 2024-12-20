import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {
        System.out.println("web service deploye sur http//0.0.0.0:9191/ ");
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());

    }
}

