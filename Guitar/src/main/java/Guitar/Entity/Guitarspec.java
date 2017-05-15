package Guitar.Entity;

public class GuitarSpec {
	private String model;
	private String type;
	private String builder;
	private String backwood;
	private String topwood;
	

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getBackwood() {
		return backwood;
	}
	public void setBackwood(String backwood) {
		this.backwood = backwood;
	}
	public String getTopwood() {
		return topwood;
	}
	public void setTopwood(String topwood) {
		this.topwood = topwood;
	}
	  public boolean matches(GuitarSpec otherSpec) {
		
		    if ((otherSpec.builder!=null)&&(!otherSpec.builder.equals(""))
		    		&&(!builder .equals(otherSpec.builder)))
		      return false;
		    if ((otherSpec.model != null) &&(!otherSpec.model.equals(""))
		        &&(!model.equals(otherSpec.model))){
		      return false;}
		    if ((otherSpec.type != null) && (!otherSpec.type.equals(""))
			        &&(!otherSpec.type.equals(type))){
			      return false;}
		    if ((otherSpec.topwood!= null) &&(!otherSpec.topwood.equals(""))
			        &&(!otherSpec.topwood.equals(topwood))){
			      return false;}
		  if ((otherSpec.backwood != null)&&(!otherSpec.backwood.equals(""))
			        &&(!otherSpec.backwood.equals(backwood))){
			      return false;}
		    return true;
		  }
	}
