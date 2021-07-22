package api;

import org.json.simple.parser.JSONParser;

public class GetChickenMain {

	public static void main(String[] args) throws Exception {
		
		GetChickenBithumbAPI getChickenBitumbAPI = new GetChickenBithumbAPI();

		StringBuffer GetTicker = getChickenBitumbAPI.GetTicker("BTC", "KRW");
		StringBuffer GetOrderBook = getChickenBitumbAPI.GetOrderBook("BTC", "KRW");
		StringBuffer GetTransaction_History = getChickenBitumbAPI.GetTransaction_History("BTC", "KRW");
		StringBuffer GetAssets_Status = getChickenBitumbAPI.GetAssets_Status("BTC", "KRW");
		StringBuffer GetBTCI = getChickenBitumbAPI.GetBTCI("BTC", "KRW");

		System.out.println(GetTicker);
		System.out.println(GetOrderBook);
		System.out.println(GetTransaction_History);
		System.out.println(GetAssets_Status);
		System.out.println(GetBTCI);

		// String s = GetTicker.toString();
		JSONParser jsonParser = new JSONParser();
//		JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonInfo); //JSON Object·Î ¸¸µé¾îÁÜ
//		String opening_price = (String)jsonObj.get("books");
//		System.out.println(opening_price);

	}
}