package stocke

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@CompileStatic
@Controller("/player")
class PlayerController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    Map index() {
        ["key": "value"]
    }



}
