import javax.servlet.http.HttpServlet;

/**
 * @author Lenovo
 * @version 1.0
 * @created 27-��-2016 21:07:49
 */
public class AbstractController extends HttpServlet {

	private AbstractDAO dao;

	public AbstractDAO getDao() {
		return dao;
	}

	public void setDao(AbstractDAO dao) {
		this.dao = dao;
	}
}