package Tools;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {
	public String generateRandomString(int length){
		return RandomStringUtils.randomAlphabetic(length);
	}
	
	public String generateRandomNumber(int length){
		return RandomStringUtils.randomNumeric(length);
	}
	
	public String generateRandomAlphaNumeric(int length){
		return RandomStringUtils.randomAlphanumeric(length);
	}
	
	public String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
		String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
				"1234567890" +   //numbers
				allowdSplChrs;
		return RandomStringUtils.random(length, allowedChars);
	}
	
	public String generateInstanceName(int length) {
		String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
				"1234567890"    //numbers
				;   //special characters
		String instance="";
		String temp=RandomStringUtils.random(length,allowedChars);
		instance=temp.substring(0,temp.length()-9)+"Auto";
		return instance;
	}
	

}
