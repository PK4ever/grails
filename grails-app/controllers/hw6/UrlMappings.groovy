package hw6

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/eventList"(view: '/eventful/events')
        "/getEvents"(controller:'Eventful',action:'test')
        "/liked"(controller:'Eventful',action:'liked')
        "/delete"(controller: 'Eventful', action:'delete')
//        "/liked"(view: '/eventful/liked')
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        /*RESTFUL SERVICES*/
        "/restFul/search/${id}"(controller: 'Restful', action: 'search', method:'post')
        "/restFul/addAll/${id}"(controller: 'Restful', action: 'addAll', method:'post')
        "/restFul/deleteRest/${id}"(controller: 'Restful', action: 'deleteRest', method:'delete')

    }
}