package hw6

class EventDB {
    String title
    String venue
    String seID

    static constraints = {
        seID unique: ['title']
    }
}
