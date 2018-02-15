/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Matthews
 */
public class AdminAudit {
        private String staff_id;
	private String name;	
	private String faculty;
	private String department;
        private String role;
        private String email;
        private String activity;

    public AdminAudit(String staff_id, String name, String faculty, String department, String role, String email, String activity, String date) {
        this.staff_id = staff_id;
        this.name = name;
        this.faculty = faculty;
        this.department = department;
        this.role = role;
        this.email = email;
        this.activity = activity;
        this.date = date;
    }
        

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
        private String date;
    
}
