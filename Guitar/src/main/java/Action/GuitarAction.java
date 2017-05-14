package Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Guitar;
import Entity.InventoryImpl;
import Guitar.service.GuitarService;


public class GuitarAction extends ActionSupport  implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware {
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
public void setServletResponse(HttpServletResponse response) {
	// TODO Auto-generated method stub
	
}
@Override
public void setServletRequest(HttpServletRequest request) {
	// TODO Auto-generated method stub
	
}
@Override
public void setApplication(Map<String, Object> application) {
	// TODO Auto-generated method stub
	
}
@Override
public void setSession(Map<String, Object> session) {
	// TODO Auto-generated method stub
	
}
public Guitar getGuitar() {
	return guitar;
}
public void setGuitar(Guitar guitar) {
	this.guitar = guitar;
}

}
