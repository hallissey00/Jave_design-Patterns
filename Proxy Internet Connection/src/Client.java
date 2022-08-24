

public class Client{
    private static ProxyInternet internet;

    public static void main (String[] args){
        internet = new ProxyInternet();
        try{
            internet.connectTo("dylanhallissey.ie");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}




