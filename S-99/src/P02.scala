/**
 * User: Nuno
 * Date: 23-07-2013
 * Time: 22:30
 */

/**
 * Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object P02 {

  def penultimate[A](list : List[A]) : A = list.init.last

}
