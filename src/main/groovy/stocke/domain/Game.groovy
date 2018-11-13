package stocke.domain


class Game {

    Long id

    String link = UUID.randomUUID().toString()

    Date dateCreated = new Date()

    static constraints = {
        id nullable: false, blank: false
        link nullable: false, blank: false
    }
}
