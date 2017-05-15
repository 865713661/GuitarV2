package Guitar.Dao;

import java.sql.ResultSet;

import Guitar.Dbuitl.DbUtil;
import Guitar.Entity.Guitar;
import Guitar.Entity.GuitarSpec;

public class GuitarDaoImpl implements GuitarDao {

	public ResultSet search(Guitar guitar,GuitarSpec guitarspec) {
		ResultSet rs=DbUtil.executeQuery(sql(guitar,guitarspec),new Object[]{});
		return rs;
	}

	public String sql(Guitar guitar,GuitarSpec guitarspec){
		 String sql="select * from guitar where 1=1";
			if(guitar.getId()!=0)
				sql=sql+" and id="+guitar.getId()+"";
			if(! guitarspec.getType().isEmpty())
				sql=sql+" and type="+"'"+ guitarspec.getType()+ "'";
			if(! guitarspec.getModel().isEmpty())
				sql=sql+" and model="+"'" + guitarspec.getModel()+"'";
			if(! guitarspec.getBuilder().isEmpty())
				sql=sql+" and builder="+"'"+ guitarspec.getBuilder()+"'";
			if(guitar.getPrice()!=0)
				sql=sql+" and price="+guitar.getPrice()+"";
			if(! guitarspec.getTopwood().isEmpty())
				sql=sql+" and topwood="+"'"+ guitarspec.getTopwood()+"'";
			if(! guitarspec.getBackwood().isEmpty())
				sql=sql+" and backwood="+"'"+ guitarspec.getBackwood()+"'";
		return sql;
		
	}
}
