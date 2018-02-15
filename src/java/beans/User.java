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
public class User {  
   
        private String staff_id;
	private String name;
	private String password;
	private String faculty;
	private String department;
        private String role;
        private String email;

	private int tel_no;

    public User(String staff_id, String name, String faculty, String department, String role,String email) {
        this.staff_id=staff_id;
        this.name=name;
        this.faculty=faculty;
        this.department=department;
        this.role=role;
        this.email=email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTel_no() {
		return tel_no;
	}
	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
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
}


