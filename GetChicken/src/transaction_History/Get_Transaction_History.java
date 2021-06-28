package transaction_History;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Get_Transaction_History {
public static void main(String[] args) {

String coinName = "BTC";
	try {
		URL url = new URL("https://api.bithumb.com/public/transaction_history/" + coinName + "_KRW");
		// 요청 url 주소

		URLConnection conn = url.openConnection();

		conn.setDoInput(true);

		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line = null;

		while ((line = reader.readLine()) != null) {
			sb.append(line + "\\n");
			System.out.println();
		}
		System.out.println(sb);

	} catch (Exception e) {

		e.printStackTrace(); // 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력.

	}

}
}