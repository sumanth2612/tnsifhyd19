package com.superkeyword;

public class SuperKeyMethod {
	
	class Mobile{
		//String network="4G";
		void surfInternet() {
			System.out.println("Surfing the Internet using Mobile..");
		}
	}

	class OPPO extends Mobile{
		//String network="5G";
		void surfInternet() {
			System.out.println("Surfing the Internet using OPPO Mobile..");
		}
		void playGames() {
			System.out.println("Playing games using OPPO Mobile");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
