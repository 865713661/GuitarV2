package Guitar.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyTool {

	public String sql(Guitar guitar){
		 String sql="select * from guitar where 1=1";
			if(guitar.getId()!=0)
				sql=sql+" and id="+guitar.getId()+"";
			if(!guitar.getGuitarspec().getType().isEmpty())
				sql=sql+" and type="+"'"+guitar.getGuitarspec().getType()+ "'";
			if(!guitar.getGuitarspec().getModel().isEmpty())
				sql=sql+" and model="+"'" +guitar.getGuitarspec().getModel()+"'";
			if(!guitar.getGuitarspec().getBuilder().isEmpty())
				sql=sql+" and builder="+"'"+guitar.getGuitarspec().getBuilder()+"'";
			if(guitar.getPrice()!=0)
				sql=sql+" and price="+guitar.getPrice()+"";
			if(!guitar.getGuitarspec().getTopwood().isEmpty())
				sql=sql+" and topwood="+"'"+guitar.getGuitarspec().getTopwood()+"'";
			if(!guitar.getGuitarspec().getBackwood().isEmpty())
				sql=sql+" and backwood="+"'"+guitar.getGuitarspec().getBackwood()+"'";
		return sql;
		
	}
	
	public List<Guitar> Mysort(ResultSet rs){
		List<Guitar> glist=new ArrayList<Guitar>();
		try {
			while(rs.next()){
				Guitar guitar=new Guitar();
				Guitarspec guitarspec=new Guitarspec();
				guitar.setId(rs.getInt(1));
			    guitarspec.setType(rs.getString(2));
				guitarspec.setModel(rs.getString(3));
				guitar.setPrice(rs.getInt(4));
			    guitarspec.setBuilder(rs.getString(5));
				guitarspec.setTopwood(rs.getString(6));
				guitarspec.setBackwood(rs.getString(7));
				guitar.setGuitarspec(guitarspec);
			    glist.add(guitar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return glist;
}
}