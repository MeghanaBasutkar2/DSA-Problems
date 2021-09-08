package threads

open class MyThread : Thread() {

    override fun run() {
        getPrimeGreaterThan(20)
    }

    fun getPrimeGreaterThan(max: Int) {
        var minPrime: Int = 1
        while (minPrime < max) {
            if (isPrime(++minPrime))
                println(minPrime)
        }
    }

    private fun isPrime(nextMinPrime: Int): Boolean {
        for (i in 2..100) {
            if ((nextMinPrime % i != 0)) {
                return true
            }
            return false
        }
        return false
    }
}