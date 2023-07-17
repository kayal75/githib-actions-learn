import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.1.22", 3128));
			URL url = new URL("http://192.168.1.22:8080/testProxy");
			HttpURLConnection uc = (HttpURLConnection)url.openConnection(proxy);
			uc.connect();

			StringBuffer page = new StringBuffer();
			String line="";
			StringBuffer tmp = new StringBuffer();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			while ((line = in.readLine()) != null){
			   page.append(line + "\n");
			}
			System.out.println(page);
			System.out.println(uc.getResponseCode());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
