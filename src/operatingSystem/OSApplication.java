package operatingSystem;

import java.util.Scanner;



public class OSApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Welcome to OS Application");
			System.out.println("Please provide the name of OS");
			String nameOfOS = scanner.nextLine();
			OSName fromValue = OSName.fromValue(nameOfOS);
			validateNameOfOS("Name of OS", fromValue);

			OSService osService = null;
			switch (fromValue) {
			case MAC:
				osService = new MacOS();
				break;
			case WINDOWS:
				osService = new Windows();
				break;
			
			default:
				throw new OSException("Invalid OS name. Valid Names are: mac and windows");
			}
			osService.printResult();
		} catch (OSException oe) {
			System.out.println(oe.getMessage());
		} catch (Exception e) {
			System.out.println("An unknown exception happened. Please call service desk.");
		} finally {
			System.out.println("Thank you for using OS Application");
			scanner.close();
		}
		System.out.println("-------------------------");

	}
	
	private static void validateNameOfOS(String fieldName, OSName nameOfOS) {

		if (nameOfOS.equals(OSName.INVALID)) {
			throw new OSException("Invalid OS name. Valid Names are: mac and windows");
		}

	}

	}


