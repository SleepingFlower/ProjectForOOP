/**
 * @author Lenovo
 * @version 1.0
 * @created 27-��-2016 21:07:52
 */
public class BookModel {

	private String author;
	private String country;
	private int pageCount;
	public BookGenre m_BookGenre;

	public String getAuthor(){
		return author;
	}

	public int getPageCount(){
		return pageCount;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAuthor(String newVal){
		author = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPageCount(int newVal){
		pageCount = newVal;
	}

}