package doNotSkipConstructors

fun main(args: Array<String>) {
    //Breakpoint!
    A()
    val b = 1
}

class A {
    init {
        val a = 1
    }
}

// SKIP_CONSTRUCTORS: false
// STEP_INTO: 3
