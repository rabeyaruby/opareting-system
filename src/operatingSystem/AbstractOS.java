package operatingSystem;

public abstract class AbstractOS implements OSService {

	@Override
	public void printResult() {
		System.out.println("Does OS have display? : " + haveDisplay());
		System.out.println("Brand name is : " + brandName());
		System.out.println("CPU type is : " + typeOfCPU());

	}

	@Override
	public boolean haveDisplay() {

		return true;
	}

	@Override
	public String typeOfCPU() {

		return "intel";
	}
}
