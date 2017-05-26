package Model

/**
 * Created by aishpratap on 5/25/17.
 */

class Video {

    var id: String? = null
    var title: String? = null
    var description: String? = null
    var bitmap: Int = 0

    constructor() {

    }

    constructor(id: String, title: String, description: String, bitmap: Int) {

        this.id = id
        this.title = title
        this.description = description
        this.bitmap = bitmap
    }
}
