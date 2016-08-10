package xyz.mynt.fuse.zeus.experience.ussdloanavailment;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
public interface UssdLoanAvailmentRaml {

    @Path("UssdLoanAvailment")
    @POST
    @Consumes({
            MediaType.APPLICATION_JSON
    })
    @Produces({
            MediaType.APPLICATION_JSON
    })
    public UssdAck ussdLoanAvailment(LoanAvailment loanAvailment, @Context UriInfo uriInfo);
}
