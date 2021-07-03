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
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("API를 선택하시오.");
			System.out.println("1. TICKER");
			System.out.println("2. ORDER_BOOK");
			System.out.println("3. TRANSACTION_HISTORY");
			System.out.println("4. ASSETS_STATUS");
			System.out.println("5. BTCI");

			int apiSelect = in.nextInt();

			switch (apiSelect) {

			case 1:
				System.out.println(GetTicker);
				getChickenBitumbAPI.HttpGet(GetTicker);
				break;
			case 2:
				System.out.println(GetOrderBook);
				getChickenBitumbAPI.HttpGet(GetOrderBook);
				break;
			case 3:
				System.out.println(GetTransaction_History);
				getChickenBitumbAPI.HttpGet(GetTransaction_History);
				break;
			case 4:
				System.out.println(GetAssets_Status);
				getChickenBitumbAPI.HttpGet(GetAssets_Status);
				break;
			case 5:
				System.out.println(GetBTCI);
				getChickenBitumbAPI.HttpGet(GetBTCI);
				break;
			default:
				System.out.println("API를 선택해주세요.");
			}
		} catch (Exception e) {

			System.out.println("숫자를 선택해주세요.");

		}

	}
}