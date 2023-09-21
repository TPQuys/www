package vn.edu.iuh.fit.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.models.Employee;
import vn.edu.iuh.fit.services.EmployeeService;

@Path("/employees")
public class EmployeeResources {
    @Inject
    private EmployeeService employeeService;
    @POST
    @Produces("application/json")
    public Response insert(Employee e){
        employeeService.insertEmp(e);
        return Response.ok(e).build();
    }
}
