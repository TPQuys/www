package vn.edu.iuh.fit.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getEmployeeById(@PathParam("id") long id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return Response.ok(employee).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
    @DELETE
    @Path("/{id}")
    public Response deleteEmp(@PathParam("id")long id) {
        employeeService.deleteEmp(id);
        return Response.ok().build();
    }
}
