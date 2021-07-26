package api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetChickenMain {

	public static void main(String[] args) throws Exception {
		
		GetChickenBithumbAPI getChickenBitumbAPI = new GetChickenBithumbAPI();

		StringBuffer GetTicker = getChickenBitumbAPI.GetTicker("BTC", "KRW");


		String s = GetTicker.toString(); //json object로 만들어야됨.
		JSONParser parser = new JSONParser(); //json object로 만들어줌
		
		JSONObject obj = (JSONObject) parser.parse(s); //JSON Object로 만들어줌
		JSONObject data = (JSONObject)obj.get("data");
		String opening_price = (String)data.get("opening_price");

		JSONArray array = new JSONArray();
		array.add(opening_price);
		System.out.println(array);
		
//		System.out.println(GetTicker);
//		System.out.println(opening_price);

	}
}






//StringBuffer GetOrderBook = getChickenBitumbAPI.GetOrderBook("BTC", "KRW");
//StringBuffer GetTransaction_History = getChickenBitumbAPI.GetTransaction_History("BTC", "KRW");
//StringBuffer GetAssets_Status = getChickenBitumbAPI.GetAssets_Status("BTC", "KRW");
//StringBuffer GetBTCI = getChickenBitumbAPI.GetBTCI("BTC", "KRW");


//System.out.println(GetOrderBook);
//System.out.println(GetTransaction_History);
//System.out.println(GetAssets_Status);
//System.out.println(GetBTCI);