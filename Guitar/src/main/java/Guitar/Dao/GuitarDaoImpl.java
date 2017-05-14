package Guitar.Dao;

import java.sql.ResultSet;

import Guitar.Dbuitl.DbUtil;

public class GuitarDaoImpl {

	public ResultSet search(String sql) {
		ResultSet rs=DbUtil.executeQuery(sql,new Object[]{});
		return rs;
	}

}
