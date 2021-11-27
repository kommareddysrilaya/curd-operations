package com.curd.apps.encryptiondecryption;

public class Encryptiondecryption {
	public static void main(String[] args) {
		String str="encryption";int key=6;
		char[] ch = str.toCharArray();
//		for(char c:ch) {
//			System.out.print(c);
//		}
		
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]);
//		}
	//	for(int i=60;i<120;i++) {
			//System.out.println((char)i +" "+i);
		//}
		
		System.out.println(str);
		String encryptedMsg="";
		System.out.println();
			for(int i=0;i<ch.length;i++) {
				char c=(char) (ch[i]+key);
				//System.out.print(c);
				encryptedMsg=encryptedMsg+ c+ "";
			}
			System.out.println(encryptedMsg);
			System.out.println();
			char[] ch1 =encryptedMsg .toCharArray();
			for(int i=0;i<ch1.length;i++) {
				char c=(char) (ch1[i]-key);
				System.out.print(c);
			}
	}

}
