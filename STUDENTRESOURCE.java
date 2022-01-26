package net.codejava.ws;
import java.net.*;
import java.util.*;
 
import javax.ws.rs.*;
import javax.ws.rs.core.*;
 
 
@Path("/students")
public class STUDENTRESOURCE 
{
    private STUDENTDAO dao = STUDENTDAO.getInstance();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<STUDENT> list() 
    {
        return dao.listAll();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(STUDENT student) throws URISyntaxException 
    {
        int newProductId = dao.add(student);
        URI uri = new URI("MyWebsite/rest/student/" + newProductId);
        return Response.created(uri).build();
    }
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id)
    {
        STUDENT student = dao.get(id);
        if (student != null)
        {
            return Response.ok(student, MediaType.APPLICATION_JSON).build();
        } else
        {
            return Response.status(Response.Status.NOT_FOUND).build();
            
        }
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response update(@PathParam("id") int id, STUDENT student) {
        student.setid(id);
        if (dao.update(student)) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        if (dao.delete(id)) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }
}
