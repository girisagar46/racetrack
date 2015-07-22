package racetrackfull

class Registration {
    Boolean paid
    Date dateCreated

    static belongsTo = [race:Race, runner:Runner]

    static constraints = {
        race()
        runner()
        paid()
        dateCreated()
    }

    String toString(){
        return "${runner.firstName}, ${race.name}"
    }
}
