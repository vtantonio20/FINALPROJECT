
public class City {
	private String cityName;
	private int cityNumber;
	
	public City(String ctName, int ctNum) {
		cityName = ctName ;
		cityNumber = ctNum;
	}
	
	public City(City CopyCity) {
		cityName = CopyCity.cityName;
		cityNumber = CopyCity.cityNumber;		
	}
	//USED TO SET data
	public void set(String stName, int stNum) {
		cityName = stName ;
		cityNumber = stNum;
	}
	
	public int getCityNum() {
		int cityNum = cityNumber;
		return cityNum;
	}
}
