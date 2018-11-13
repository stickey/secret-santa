package stocke

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

import javax.inject.Inject

@CompileStatic
@Controller("/player")
class PlayerController {

    @Inject
    DAO dao

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    Map index() {
        dao.insertPlayer()

        [:]
    }



}
