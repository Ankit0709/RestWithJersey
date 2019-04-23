package services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import beans.Employee;
import beans.EmployeeData;

@Path("/test")
public class ServiceProvider 
{
      
    @GET
    @Path("/fetch-in-xml")
    @Produces("application/xml")
    public List<Employee> fetchXML()
    {
    	return EmployeeData.fetch();
    	
    	
    }
    
    @GET
    @Path("/fetch-in-json")
    @Produces("application/json")
    public List<Employee> fetchJson()
    {
    	return EmployeeData.fetch();
    }
    
    @GET
    @Path("/fetch-in-xml-by-id/{e_id}")
    @Produces("application/xml")
    public Employee fetchXML(@PathParam("e_id")int id)
    {
    	return EmployeeData.fetchById(id);
    }
    
    @GET
    @Path("/fetch-in-json-by-id/{e_id}")
    @Produces("application/json")
    public Employee fetchJSON(@PathParam("e_id")int id)
    {
    	return EmployeeData.fetchById(id);
    }
    
    
    
    @POST
    @Path("/store-by-xml")
    @Consumes("application/xml")
    @Produces("text/plain")
    public String storeDataXML(Employee e)
    {
    	
    	return EmployeeData.storeData(e);
    	
    }
    
    @POST
    @Path("/store-by-json")
    @Consumes("application/json")
    @Produces("text/plain")
    public String storeDataJSON(Employee e)
    {
    	
    	return EmployeeData.storeData(e);
    	
    }
   
    @PUT
    @Path("/update-by-xml")
    @Consumes("application/xml")
    @Produces("text/plain")
    public String updateDataByXml(Employee e)
    {
    	return EmployeeData.updateData(e);
    }
    
    @PUT
    @Path("/update-by-json")
    @Consumes("application/json")
    @Produces("text/plain")
    public String updateDataByJson(Employee e)
    {
    	return EmployeeData.updateData(e);
    }
    
    
    @DELETE
    @Path("/delete-by-xml")
    @Consumes("application/xml")
    @Produces("text/plain")
    public String removeDataByXml(Employee e)
    {
    	return EmployeeData.removeData(e);
    }
	
    @DELETE
    @Path("/delete-by-json")
    @Consumes("application/json")
    @Produces("text/plain")
    public String removeDataByJson(Employee e)
    {
    	return EmployeeData.removeData(e);
    }
	
    @DELETE
    @Path("/deleteById/{id}")
    @Produces("text/plain")
    public String removeDataById(@PathParam("id") int id)
    {
    	return EmployeeData.removeDataById(id);
    }
    
  
      

}
