package org.acme;

import java.util.HashMap;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/labseq")
public class LabseqResource {

    HashMap<Integer, Long> memo = new HashMap<>() {
        {
            put(0, 0l);
            put(1, 1l);
            put(2, 0l);
            put(3, 1l);
        }
    };

    @Path("/{n:\\d+}")
    @GET
    @Produces("application/json")
    public Response getLabseq(@PathParam("n") int n) {
        Long result = l(n);

        HashMap<String, Long> response = new HashMap<>();
        response.put("value", result);

        return Response.ok(response).build();
    }

    private Long l(int n) {
        if (memo.get(n) != null)
            return memo.get(n);

        Long new_value = l(n - 4) + l(n - 3);

        memo.put(n, new_value);

        return memo.get(n);
    }
}
