import java.util.*;

class ClientList {
    private static final List<Client> clients = new ArrayList<>();

    public static void addClient(Client client) { clients.add(client); }

    public static void showClientList() {
        for (Client c : clients) {
            c.showInfo();
            System.out.println("---");
        }
    }
}