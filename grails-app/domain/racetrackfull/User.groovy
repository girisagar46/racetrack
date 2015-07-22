package racetrackfull

class User {

    String login
    String password
    String role = "user"

    static constraints = {
        login(blank: false, nullable: false, unique: true)
        password(blank: false, password: true)
        role(inList: ["admin", "user"])
    }

    @Override
    String toString() {
        login
    }

    static transients = ['admin']

    boolean isAdmin(){
        return role == "admin"
    }
    def beforeInsert = {
        password = password.encodeAsSHA()
    }
}
