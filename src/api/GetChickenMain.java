package api;

import org.json.simple.parser.JSONParser;

public class GetChickenMain {

	public static void main(String[] args) throws Exception {
		// String jsonInfo =
		// "{\"books\":[{\"genre\":\"소설\",\"price\":\"100\",\"name\":\"사람은 무엇으로
		// 사는가?\",\"writer\":\"톨스토이\",\"publisher\":\"톨스토이
		// 출판사\"},{\"genre\":\"소설\",\"price\":\"300\",\"name\":\"홍길동전\",\"writer\":\"허균\",\"publisher\":\"허균
		// 출판사\"},{\"genre\":\"소설\",\"price\":\"900\",\"name\":\"레미제라블\",\"writer\":\"빅토르
		// 위고\",\"publisher\":\"빅토르 위고
		// 출판사\"}],\"persons\":[{\"nickname\":\"남궁민수\",\"age\":\"25\",\"name\":\"송강호\",\"gender\":\"남자\"},{\"nickname\":\"예니콜\",\"age\":\"21\",\"name\":\"전지현\",\"gender\":\"여자\"}]}";

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
//		JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonInfo); //JSON Object로 만들어줌
//		String opening_price = (String)jsonObj.get("books");
//		System.out.println(opening_price);

	}
}