package Guitar.Entity;

import java.sql.ResultSet;
import java.util.List;


import Guitar.Dao.GuitarDaoImpl;

public class InventoryImpl implements Inventory {


	@Override
	public List<Guitar> search(Guitar guitar) {
	 MyTool mt=new MyTool();
	 GuitarDaoImpl gi=new GuitarDaoImpl();
	 String sql=mt.sql(guitar);
	 ResultSet rs=gi.search(sql);
	 List<Guitar> glist=mt.Mysort(rs); 
     return glist;
	}



}
