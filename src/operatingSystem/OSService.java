package operatingSystem;

public interface OSService extends PrintService {
	boolean haveDisplay();
	
	String typeOfCPU();
	
	String brandName();

}
