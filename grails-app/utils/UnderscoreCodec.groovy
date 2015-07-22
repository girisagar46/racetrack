/**
 * Created by linuxsagar on 5/10/15.
 */
class UnderscoreCodec {
    static encode = {target->
        target.replaceAll(" ", "_")
    }
    static decode = {target->
        target.replaceAll("_", " ")
    }
}
