import java.util.ArrayList;
import java.util.List;


public class ProxyInternet implements Internet{
    private RealInternet internet = new RealInternet();
    private static List<String> server;

    static{
        server = new ArrayList<String>();
    }

    @Override
    public void connectTo(String serverhost) throws Exception{
        if(server.contains(serverhost.toLowerCase())){
            throw new Exception("Access Denied " + serverhost);
        }
        internet.connectTo(serverhost);
    }
}
