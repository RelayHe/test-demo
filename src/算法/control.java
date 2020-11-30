package 算法;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class control {
		public void add(godess g) throws Exception {
			goddmain g1=new goddmain();
			g.setSex("女");
			g.setAge(22);
			g.setUsernameString("小溪");
			g.setEmail("2311971673@163.com");
			g.setIsdel(0);
			g.setId(2);
			g.setMobile("18637812520");
			g1.addGoddess(g);
		}
		public godess get(Integer id) throws Exception {
			goddmain g1=new goddmain();
			return g1.get(id);
		}
		public void edit(godess g) throws SQLException {
			goddmain g1=new goddmain();
			g1.updateGoddess(g);
		}
		public void del(Integer id) throws SQLException {
			goddmain g1=new goddmain();
			g1.delGoddess(id);
		}
		public List<godess> query() throws Exception{
			goddmain g1=new goddmain();
			return g1.query();
		}
		public List<godess> query(List<Map<String,Object>> p) throws Exception{
			goddmain g1=new goddmain();
			return g1.get3(p);
		}
	}
