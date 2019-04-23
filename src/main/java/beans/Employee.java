package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Employee")
@XmlRootElement(name="Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee 
{   @Id
	@Column(name="E_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    @Column(name="Name")
	private String name;
    @Column(name="Designation")
	private String desg;
    @Column(name="Salary")
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee( String name, String desg, int salary) {
	
		
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	
	Employee()
	{
		
	}
	

}
