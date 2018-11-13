package stocke

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.reactivex.Maybe
import io.reactivex.Single
import stocke.domain.Game

@CompileStatic
@Controller("/game")
class GameController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    Map list() {


        [:]
    }

    @Post("/")
    @Produces(MediaType.APPLICATION_JSON)
    Maybe create() {

//        Game.withNewSession {
//            Game g = new Game()
//            g.link = "testing"
//            g.save(flush: true, failOnError: true)
//        }

        Maybe result = Maybe.just([:])

        result
    }

}
