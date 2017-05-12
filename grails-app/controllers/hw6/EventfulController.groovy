package hw6

import com.evdb.javaapi.data.Event
/**
 * Created by paulk4ever on 5/3/17.
 */
class EventfulController {

    def index() {
        render "Hello World!!"
    }
    def EventfulService

    def List<Event> eventsList
    def test() {

        eventsList = EventfulService.search(params.Event)
        render(view:'/eventful/events',
                model:[data:eventsList])
    }

    def liked(){
        def e = new EventDB(title: params.title.replace("%20"," ").replace("/"," "), venue: params.venue.replace("%20"," ").replace("/"," "),seID:params.SeID.replace("/"," "))
        e.save()
        def events = EventDB.list()
        render view: 'liked', model: [events: events]
    }
    def delete(){
        def event = EventDB.findBySeID(params.SeID.replace("/"," "))

        event.delete(flush: true)

        def events = EventDB.list()
        render view: 'liked', model: [events: events]
    }


}
