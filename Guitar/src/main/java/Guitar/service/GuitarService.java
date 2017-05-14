package Guitar.service;

import java.util.List;

import Guitar.Entity.Guitar;
import Guitar.Entity.Inventory;

public class GuitarService {
	private Inventory inventory;
	
	public List<Guitar> search(Guitar guitar){
		return inventory.search(guitar);
		
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

}
