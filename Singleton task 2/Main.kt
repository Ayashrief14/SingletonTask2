fun main (){
    var helper1 = Helper1()
    var helper2 = Helper2()
    helper1.incrementStaticCount()
    helper2.incrementStaticCount()
    helper1.incrementStaticCount()
    helper2.incrementStaticCount()

    helper1.incrementCount()
    helper2.incrementCount()
    helper1.incrementCount()
    helper2.incrementCount()
}