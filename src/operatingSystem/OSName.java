package operatingSystem;


public enum OSName {
	MAC("mac"), WINDOWS("windows"),  INVALID("");

	private String osName;

	private OSName(String osName) {
		this.osName = osName;
	}

	public static OSName fromValue(String osName) {
		OSName[] osNames = OSName.values();
		for (OSName enumOS : osNames) {
			if (enumOS.osName.equalsIgnoreCase(osName)) {
				return enumOS;
			}

		}
		return INVALID;

	}


}
