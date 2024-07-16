class Helper2 {
    fun incrementStaticCount(){
        Counter.staticCount += 1
        println( Counter.staticCount)
    }
    val counter = Counter()
    fun incrementCount(){
        counter.count += 1
        println(counter.count)
    }

}