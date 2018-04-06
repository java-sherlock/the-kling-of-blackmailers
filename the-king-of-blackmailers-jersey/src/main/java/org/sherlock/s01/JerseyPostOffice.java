package org.sherlock.s01;

import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("letter-box")
public class JerseyPostOffice {


    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String put(@FormDataParam("letter") String letter) {
        return letter;
    }
}
