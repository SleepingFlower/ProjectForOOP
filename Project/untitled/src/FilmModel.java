import java.util.Date;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @created 27-��-2016 21:07:54
 */
public class FilmModel {

	private List<String> actors;
	private String country;
	private String director;
	private FilmGenre genre;
	private Date year;

	private int ImdbRate;

	public FilmModel(){

	}

	public void finalize() throws Throwable {

	}

	public List<String> getActors(){
		return actors;
	}

	public String getCountry(){
		return country;
	}

	public String getDirector(){
		return director;
	}

	public int getImdbRate(){
		return ImdbRate;
	}

	public Date getYear(){
		return year;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setActors(List<String> newVal){
		actors = newVal;
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
	public void setDirector(String newVal){
		director = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setImdbRate(int newVal){
		ImdbRate = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setYear(Date newVal){
		year = newVal;
	}

}