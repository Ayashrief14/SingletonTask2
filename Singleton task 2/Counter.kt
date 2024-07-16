 open class Counter {
     var count : Int = 0
    companion object{
        private var instance : Counter? = null
        var staticCount : Int = 0
    }
}