import grails.util.GrailsUtil
import racetrackfull.Race
import racetrackfull.Registration
import racetrackfull.Runner
import racetrackfull.User

class BootStrap {

    def init = { servletContext ->
        switch (GrailsUtil.developmentEnv){
            case "development":
                def john = new Runner(
                        firstName: "John", lastName: "Doe",
                        dateOfBirth:(new Date() - 365*30),
                        gender:"Male",
                        address:"123 Main St",
                        city:"Goose",
                        state:"B",
                        zipcode:"12345",
                        email:"jane@whereever.com"
                )
                john.save(flush: true)
                if (john.hasErrors()){
                    println(john.errors )
                }

                def trot = new Race(
                        name:"Turkey Trot",
                        startDate:(new Date() + 90),
                        city:"Duck",
                        state:"B",
                        distance:5.0,
                        cost:20.0,
                        maxRunners:350
                )
                trot.save(flush: true)
                if(trot.hasErrors()){
                    println(trot.errors)
                }
                def reg = new Registration(
                        paid:false,
                        runner:john,
                        race:trot
                )
                reg.save(flush: true)
                if(reg.hasErrors()){
                    println (reg.errors)
                }

                def user = new User(
                        login: "admin1",
                        password: "admin1",
                        role: "admin"
                )
                user.save(flush: true)
                if(user.hasErrors()){
                    println(user.errors)
                }
            break

            case "produnction": break
        }
    }
    def destroy = {
    }
}
