package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class GetChickenBithumbAPI {

	String coin, currrency;
	URL url;

	final static String TICKER = "https://api.bithumb.com/public/ticker/"; // {order_currency}_{payment_currency}
	final static String ORDER_BOOK = "https://api.bithumb.com/public/orderbook/"; // {order_currency}_{payment_currency}
	final static String TRANSACTION_HISTORY = "https://api.bithumb.com/public/transaction_history/"; // {order_currency}_{payment_currency}
	final static String ASSETS_STATUS = "https://api.bithumb.com/public/assetsstatus/";// {order_currency}
	final static String BTCI = "https://api.bithumb.com/public/btci/";// NONE

	public GetChickenBithumbAPI() {
	}

	public GetChickenBithumbAPI(String coin) {
		this.coin = coin;
	}

	private static StringBuffer HttpGet(String bitumbURL) throws Exception {

		URL url = new URL(bitumbURL);
		// ��û url �ּ�. url Ŭ�����δ� �츮�� ���ϴ� ����� ���� �� �� �����Ƿ� URLConnection ��ü�� �ǵ��� �ʿ䰡 ����.

		URLConnection conn = url.openConnection(); // openConnection() : URLConnection�� ��ü�� �ٲٴµ� �̿�Ǵ� �޼���. �� ���� �޼ҵ带
													// �̿��� �� �ִ�.
		conn.setDoInput(true);

		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line = null;

		while ((line = reader.readLine()) != null) {
			sb.append(line);

		}

		return sb;

		// json print ���
		// System.out.println(sb);

	}

	// ��û ��� ���� �ŷ��� �����ڻ� ���簡 ������ �����մϴ�.
	public StringBuffer GetTicker(String coin, String currency) throws Exception {
		String apiURL = TICKER + coin + "_" + currency;
		StringBuffer httpResult;
		httpResult = HttpGet(apiURL);
		return httpResult;

	}

	// ��û ��� ���� �ŷ��� �����ڻ� ���簡 ������ �����մϴ�.
	public StringBuffer GetOrderBook(String coin, String currency) throws Exception {
		String apiURL = ORDER_BOOK + coin + "_" + currency;
		StringBuffer httpResult;
		httpResult = HttpGet(apiURL);
		return httpResult;
	}

	// ���� �ŷ��� �����ڻ� �ŷ� ü�� �Ϸ� ������ �����մϴ�.
	public StringBuffer GetTransaction_History(String coin, String currency) throws Exception {
		String apiURL = TRANSACTION_HISTORY + coin + "_" + currency;
		StringBuffer httpResult;
		httpResult = HttpGet(apiURL);
		return httpResult;
	}

	// ���� �ڻ��� ��/��� ��Ȳ ������ �����մϴ�.
	public StringBuffer GetAssets_Status(String coin, String currency) throws Exception {
		String apiURL = ASSETS_STATUS + coin + "_" + currency;
		StringBuffer httpResult;
		httpResult = HttpGet(apiURL);
		return httpResult;
	}

	// ���� ���� (BTMI,BTAI) ������ �����մϴ�.
	public StringBuffer GetBTCI(String coin, String currency) throws Exception {
		String apiURL = BTCI + coin + "_" + currency;
		StringBuffer httpResult;
		httpResult = HttpGet(apiURL);
		return httpResult;
	}
}