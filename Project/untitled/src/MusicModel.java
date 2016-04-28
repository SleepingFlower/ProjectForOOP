import java.util.Date;

/**
 * @author Lenovo
 * @version 1.0
 * @created 27-��-2016 21:07:57
 */
public class MusicModel {

	private String country;
	private String language;
	private Date year;
	public MusicGenre m_MusicGenre;

	public MusicModel(){

	}

	public void finalize() throws Throwable {

	}

	public String getCountry(){
		return country;
	}

	public String getLanguage(){
		return language;
	}

	public Date getYear(){
		return year;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCountry(String newVal){
		country = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLanguage(String newVal){
		language = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setYear(Date newVal){
		year = newVal;
	}

}