/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author Matthews
 */
public class Equipment implements Serializable {

    private String equip_id;
	private String name;
	private int quantity;
	private double current_value;
	private String description;
        private String category;
	private String date_acquired;
    public Equipment(String equip_id, String name, int quantity, double current_value, String description,String category) {
        this.equip_id = equip_id;
        this.name = name;
        this.quantity = quantity;
        this.current_value = current_value;
        this.description = description;
        this.category=category;
        this.date_acquired = null;
    } public Equipment(String equip_id, String name,String quantity, String current_value, String description,String category) {
        this.equip_id = equip_id;
        this.name = name;
        this.quantity = 0;
        this.current_value =0;
        this.description = description;
        this.category=category;
        this.date_acquired = null;
    }
    public Equipment(String equip_id, String name, int quantity, double current_value, String description,String category, String date_acquired) {
        this.equip_id = equip_id;
        this.name = name;
        this.quantity = quantity;
        this.current_value = current_value;
        this.description = description;
        this.category=category;
        this.date_acquired = date_acquired;
    }
    public Equipment(String equip_id, String name, int quantity, double current_value, String description) {
        this.equip_id = equip_id;
        this.name = name;
        this.quantity = quantity;
        this.current_value = current_value;
        this.description = description;
        this.date_acquired = null;
    }

    
	
	

    
	
	public String getEquip_id() {
		return equip_id;
	}
	public void setEquip_id(String equip_id) {
		this.equip_id = equip_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCurrent_value() {
		return current_value;
	}
	public void setCurrent_value(double current_value) {
		this.current_value = current_value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
        public String getCategory() {
		return category;
	}
        public void setCategory(String category) {
		this.category = category;
	}
	public String getDate_acquired() {
		return date_acquired;
	}
	public void setDate_acquired(String date_acquired) {
		this.date_acquired = date_acquired;
	}
        @Override
    public String toString() {
        return "Myequipment{" + "equip_id=" + equip_id + ", name=" + name + ", quantity=" + quantity + ", current_value=" + current_value + ", description=" + description + ", date_acquired=" + date_acquired + '}';
    }
}

