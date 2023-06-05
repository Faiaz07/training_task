package trainingtask

import com.htmcse.tasktrain.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()
    }
    def destroy = {
    }
}
