package stocke

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces

@CompileStatic
@Controller("/game")
class GameController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    Map list() {
    }

    @Post("/")
    @Produces(MediaType.APPLICATION_JSON)
    Map create() {

        [:]
    }
}
