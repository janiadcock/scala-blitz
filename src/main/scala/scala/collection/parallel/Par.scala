package scala.collection.parallel






class Par[Repr](val xs: Repr) extends AnyVal


object Par {

  implicit class ops[Repr](val xs: Repr) extends AnyVal {
    def toPar = new Par(xs)
  }

  implicit def range2zippable(r: Par[collection.immutable.Range]): Zippable[Int] = ???
    
  implicit def conc2zippable[T](a: Par[Conc[T]]) = ???

  /* aliases */

  val WorkstealingRanges = workstealing.Ranges

}


