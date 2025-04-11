// PARTNER NAME:Caleb
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 


public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surName, givenName, birthCountry, termCondition,sex;
		surName = "John"; 
		givenName="Doe"; 
		birthCountry="America";
		termCondition="None";
		sex="male";
		int birthMonth = 01,birthDate = 01,birthYear =2000;
		int validDay=1,validMonth=1, validYear =2020;
		int expireDay=4,expireMonth=4,expireYear = 2070;
		int cardCode=1234567890, USCIS=100100725;
		String catergory="catergory";
		
		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+surName+" ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+givenName+"");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+USCIS+"    "+catergory+"        SRC"+cardCode+"");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+birthCountry +"");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+termCondition+" ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+birthMonth+"/"+birthDate+"/"+birthYear+"        "+sex+"");
		System.out.println("║                       Valid From:     "+validMonth+"/"+validDay+"/"+validYear+"");
		System.out.println("║                       Card Expires:   "+expireMonth+"/"+expireDay+"/"+expireYear+"");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
