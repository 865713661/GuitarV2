package Guitar.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Guitar.Dao.GuitarDao;
import Guitar.Entity.Guitar;
import Guitar.Entity.GuitarSpec;
import Guitar.Entity.Inventory;

public class GuitarService {
	private GuitarDao guitardao;

	public GuitarDao getGuitardao() {
		return guitardao;
	}

	public void setGuitardao(GuitarDao guitardao) {
		this.guitardao = guitardao;
	}
 public ResultSet search(Guitar guitar,GuitarSpec guitarspec){
	return guitardao.search(guitar,guitarspec);
	 
 }

 public List<Guitar> addInventory(ResultSet rs){
	 List<Guitar> guitars=new ArrayList<Guitar>();
	 try {
		
			while(rs.next()){
				Guitar guitar=new Guitar(); 
				GuitarSpec guitarspec=new GuitarSpec();
				guitar.setId(rs.getInt(1));
			    guitarspec.setType(rs.getString(2));
				guitarspec.setModel(rs.getString(3));
				guitar.setPrice(rs.getInt(4));
			    guitarspec.setBuilder(rs.getString(5));
				guitarspec.setTopwood(rs.getString(6));
				guitarspec.setBackwood(rs.getString(7));
				guitar.setGuitarspec(guitarspec);
			    guitars.add(guitar);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return guitars;
}
}