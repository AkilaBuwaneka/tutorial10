package tutorial10

object Q02 {
  def main(args: Array[String]) {
    def countLetterOccurrences(l:List[String]):Int = {
      val len_arr:List[Int] = l.map((x) => x.length);
      val total_count = len_arr.reduce((x,y) => x+y);
      return total_count;
    }
    val count = countLetterOccurrences(List("apple","banana","cherry","date"));
    println("Total count of letter occurrences : "+count);
  }
}