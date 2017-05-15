package Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import Guitar.Dao.GuitarDaoImpl;
import Guitar.Entity.Guitar;
import Guitar.Entity.GuitarSpec;
import Guitar.Entity.Inventory;
import Guitar.service.GuitarService;


public class GuitarAction extends ActionSupport  implements ServletRequestAware{
	private Guitar guitar;
    private GuitarSpec guitarspec;



public String search(){
	 Inventory inventory=new Inventory();
	 GuitarService gs=new GuitarService();
	 gs.setGuitardao(new GuitarDaoImpl());
	 List<Guitar> guitars=gs.addInventory(gs.getGuitardao().search(guitar,guitarspec));
	 List<Guitar> matchingGuitars=inventory.search(guitarspec, guitars); 
	 if(!matchingGuitars.isEmpty()){
		 HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("list", matchingGuitars);
			return SUCCESS;
	 }
	
	return ERROR;
	
}

@Override
public void setServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub

}



public GuitarSpec getGuitarspec() {
	return guitarspec;
}

public void setGuitarspec(GuitarSpec guitarspec) {
	this.guitarspec = guitarspec;
}

public Guitar getGuitar() {
	return guitar;
}
public void setGuitar(Guitar guitar) {
	this.guitar = guitar;
}

}
