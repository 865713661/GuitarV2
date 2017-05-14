package Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import Guitar.Entity.Guitar;
import Guitar.Entity.InventoryImpl;
import Guitar.service.GuitarService;


public class GuitarAction extends ActionSupport  implements ServletRequestAware{
	private Guitar guitar;


public String search(){
	 GuitarService gs=new GuitarService();
	 InventoryImpl ii=new InventoryImpl();
	 gs.setInventory(ii);
	 List<Guitar> glist=gs.search(guitar);
	 if(!glist.isEmpty()){
		 HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("list", glist);
			return SUCCESS;
	 }
	
	return ERROR;
	
}

@Override
public void setServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub

}
public Guitar getGuitar() {
	return guitar;
}
public void setGuitar(Guitar guitar) {
	this.guitar = guitar;
}

}
