package hw6

import com.evdb.javaapi.data.Event
import grails.converters.JSON
import grails.rest.Resource
import org.grails.web.json.JSONObject

@Resource(uri ='/restful',formats=['json', 'xml'])
class RestfulController {

//    def index() {}

    def EventfulServicesService eventfulServicesService
    def search(){
        def events = eventfulServicesService.search(params.id)
        def myString = new JSONObject()
//        for (Event e: events){
//
//        }
        HashMap jsonMap = new HashMap()
        jsonMap.EVENTS = events.collect {event ->
            return [title: event.title, venue: event.venueAddress, Seid: event.seid]
        }
        render jsonMap as JSON
    }
    def addAll(){
        def events = eventfulServicesService.search(params.id)
        for (Event e: events){
            def db = new EventDB(title: e.title, venue: e.venueAddress,seID:e.seid)
            db.save()
        }

        def eventlist = EventDB.list()
        render eventlist as JSON
    }
    def deleteRest(){

        println(params.id)
        def event = EventDB.findBySeID(params.id)

        event.delete(flush: true)

//        def events = EventDB.list()
        render "deleted"
    }
}
