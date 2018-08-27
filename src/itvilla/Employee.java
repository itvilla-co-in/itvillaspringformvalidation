package itvilla;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import validation.EmpValidate;



public class Employee 
{
	@EmpValidate
	private String empid;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String empname;
	private String empdept;
	private String country;
	private String empgrad;
	private LinkedHashMap<String, String> gradopt;
	private String favoriteLanguage;
	
	private String[] klang;
	@Min(value=1, message="must be greater than or equal to 1")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer familymembers;

	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	public Employee(String empid, String empname, String empdept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
	}


	public Employee() {
		gradopt = new LinkedHashMap<String, String>();
		gradopt.put("BE", "bachelor Degree");
		gradopt.put("MS", "Masters Degree");
		gradopt.put("DP", "Diploma Degree");
		gradopt.put("NN", "No Degree");
	}


	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getEmpdept() {
		return empdept;
	}


	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getGradopt() {
		return gradopt;
	}


	public String getEmpgrad() {
		return empgrad;
	}


	public void setEmpgrad(String empgrad) {
		this.empgrad = empgrad;
	}


	
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getKlang() {
		return klang;
	}


	public void setKlang(String[] klang) {
		this.klang = klang;
	}


	public Integer getFamilymembers() {
		return familymembers;
	}


	public void setFamilymembers(Integer familymembers) {
		this.familymembers = familymembers;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + "]";
	}
	
	
	
	
	
	
}
