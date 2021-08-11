package api;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class GetChickenMain {

	public static void main(String[] args) throws Exception {
		long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        String getTime = simpleDateFormat.format(date);
        System.out.println(getTime);
		
		GetChickenBithumbAPI getChickenBitumbAPI = new GetChickenBithumbAPI();

		StringBuffer GetTicker = getChickenBitumbAPI.GetTicker("BTC", "KRW");
		StringBuffer GetOrderBook = getChickenBitumbAPI.GetOrderBook("BTC", "KRW");
		StringBuffer GetTransaction_History = getChickenBitumbAPI.GetTransaction_History("BTC", "KRW");
		StringBuffer GetAssets_Status = getChickenBitumbAPI.GetAssets_Status("BTC", "KRW");
		StringBuffer GetBTCI = getChickenBitumbAPI.GetBTCI("BTC", "KRW");
		
//		System.out.println(GetOrderBook);
//		System.out.println(GetTransaction_History);
//		System.out.println(GetAssets_Status);
//		System.out.println(GetBTCI);


		String s = GetTicker.toString(); //json object·Î ¸¸µé¾î¾ßµÊ.
		JSONParser parser = new JSONParser(); //json object·Î ¸¸µé¾îÁÜ
		
		JSONObject obj = (JSONObject) parser.parse(s); //JSON Object·Î ¸¸µé¾îÁÜ

		JSONObject data = (JSONObject)obj.get("data"); //data ¸¸ ²¨³»¿È
//		String opening_price = (String)data.get("opening_price");

		JSONArray array = new JSONArray();
		array.add(data);
		
		List list = new List();
		
//		for(List ar : data) {
//			ar.add(list);
//		}
		
		System.out.println(array);

//		System.out.println(GetTicker);
//		System.out.println(opening_price);

	}
}









