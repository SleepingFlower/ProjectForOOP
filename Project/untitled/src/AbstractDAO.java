import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 * @version 1.0
 * @created 27-��-2016 21:07:50
 */
public interface AbstractDAO {

	/**
	 * 
	 * @param params
	 */
	public List<Object> readModel(Map<String,Object> params);

}