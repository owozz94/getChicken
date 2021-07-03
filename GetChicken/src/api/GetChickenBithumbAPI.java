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

	public void HttpGet(String bitumbURL) throws Exception {

		URL url = new URL(bitumbURL);
		// 요청 url 주소. url 클래스로는 우리가 원하는 기능을 전부 할 수 없으므로 URLConnection 객체로 되돌릴 필요가 있음.

		URLConnection conn = url.openConnection(); // openConnection() : URLConnection로 객체를 바꾸는데 이용되는 메서드. 더 많은 메소드를
													// 이용할 수 있다.
		conn.setDoInput(true);

		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line = null;

		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
			System.out.println();
		}
		System.out.println(sb);

	}

	// 요청 당시 빗썸 거래소 가상자산 현재가 정보를 제공합니다.
	public String GetTicker(String coin, String currency) {
		String s = TICKER + coin + "_" + currency;
		return s;

	}

	// 요청 당시 빗썸 거래소 가상자산 현재가 정보를 제공합니다.
	public String GetOrderBook(String coin, String currency) {

		String s = ORDER_BOOK + coin + "_" + currency;
		return s;
	}

	// 빗썸 거래소 가상자산 거래 체결 완료 내역을 제공합니다.
	public String GetTransaction_History(String coin, String currency) {
		String s = TRANSACTION_HISTORY + coin + "_" + currency;
		return s;
	}

	// 가상 자산의 입/출금 현황 정보를 제공합니다.
	public String GetAssets_Status(String coin, String currency) {
		String s = ASSETS_STATUS + coin + "_" + currency;
		return s;
	}

	// 빗썸 지수 (BTMI,BTAI) 정보를 제공합니다.
	public String GetBTCI(String coin, String currency) {
		String s = BTCI + coin + "_" + currency;
		return s;
	}
}