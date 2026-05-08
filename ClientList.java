import java.util.ArrayList;
public class ClientList {
    private static final ArrayList<Client> clients = new ArrayList<>();
    public static void addClient(Client client) {clients.add(client);}

    public static void showClientList(){
        for (Client c : clients){
            c.showInfo();
        }
    }
}
