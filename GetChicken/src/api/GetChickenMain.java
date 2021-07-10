package api;

import java.util.Scanner;

public class GetChickenMain {

	public static void main(String[] args) throws Exception {

		GetChickenBithumbAPI getChickenBitumbAPI = new GetChickenBithumbAPI();

		String GetTicker = getChickenBitumbAPI.GetTicker("BTC", "KRW");
		String GetOrderBook = getChickenBitumbAPI.GetOrderBook("BTC", "KRW");
		String GetTransaction_History = getChickenBitumbAPI.GetTransaction_History("BTC", "KRW");
		String GetAssets_Status = getChickenBitumbAPI.GetAssets_Status("BTC", "KRW");
		String GetBTCI = getChickenBitumbAPI.GetBTCI("BTC", "KRW");
		

	}
}