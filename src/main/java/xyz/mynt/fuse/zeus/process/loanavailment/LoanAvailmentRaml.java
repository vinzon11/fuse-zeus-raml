package xyz.mynt.fuse.zeus.process.loanavailment;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public interface LoanAvailmentRaml {

    @Path("goloan")
    @POST
    @Consumes({
            MediaType.APPLICATION_JSON
    })
    @Produces({
            MediaType.APPLICATION_JSON
    })
    public GoLoanAvailmentResult goLoanAvailment(LoanAvailment loanAvailment, @Context UriInfo uriInfo);
}
