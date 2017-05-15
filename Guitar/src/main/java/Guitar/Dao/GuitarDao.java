package Guitar.Dao;

import java.sql.ResultSet;

import Guitar.Entity.Guitar;
import Guitar.Entity.GuitarSpec;

public interface GuitarDao {
	public ResultSet search(Guitar guitar,GuitarSpec guitarspec);

}
