package racetrackfull


class Race {

    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost

    Integer maxRunners = 1000
    static constraints = {
        name(blank:false, maxSize:50)
        startDate(validator: {return (it > new Date())})
        city()
        state(inList:["A", "B", "C", "D"])
        distance(min:0.0)
        cost(min:0.0, max:100.0)
        maxRunners(min:0, max:1000)
    }

    static hasMany = [registrations: Registration]

    String toString() {
        return "${name}, ${startDate.format("MM/dd/yyyy")}"
    }
}
