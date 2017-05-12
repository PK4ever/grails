

import com.evdb.javaapi.APIConfiguration
import com.evdb.javaapi.data.Event
import com.evdb.javaapi.data.Location
import com.evdb.javaapi.data.request.EventSearchRequest
import com.evdb.javaapi.operations.EventOperations

class EventfulService {
    def String API_KEY = "qX2dNH9TZGLvBT8B"
    def String USER_NAME = "events420"
    def String PASSWORD = "pass55word"

    def EventOperations eventOperations
    def EventSearchRequest eventSearchRequest
    def Location location

    EventfulService(){
        APIConfiguration apiConfiguration = new APIConfiguration()
        apiConfiguration.setApiKey(API_KEY)
        apiConfiguration.setEvdbUser(USER_NAME)
        apiConfiguration.setEvdbPassword(PASSWORD)

        eventOperations = new EventOperations()
        eventSearchRequest = new EventSearchRequest()
        eventSearchRequest.setPageSize(10)
        location = new Location()
        location.setCountry("United Kingdom")
        eventSearchRequest.setCategory("soccer")
    }
//    def serviceMethod() {
//
//    }
    public List<Event> search(String keyWord){
        eventSearchRequest.setKeywords(keyWord)
        eventSearchRequest.setLocation(location.getCountry())

        return eventOperations.search(eventSearchRequest).getEvents()
    }
}
