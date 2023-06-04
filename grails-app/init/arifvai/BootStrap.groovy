package arifvai
import com.webalive.ocb.AppInitializationService
class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()
    }
    def destroy = {
    }
}
