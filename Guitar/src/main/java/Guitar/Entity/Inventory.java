package Guitar.Entity;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Inventory{

	

	public List<Guitar> search(GuitarSpec searchSpec,List<Guitar> guitars) {
	    List<Guitar> matchingGuitars = new ArrayList<Guitar>();
	    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getGuitarspec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }


}
