package racetrackfull

class RaceController {
    def scaffold = Race

    def list(Integer max){
        params.max = Math.min(max ?: 2, 10)
        [raceInstanceList: Race.list(params), raceInstanceTotal: Race.count()]
    }
}