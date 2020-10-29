object Main extends App {

  println("Zadanie 1\n")

  def getDescriptionForWeekDayName(day: String): String = day.toLowerCase match  {
    case "poniedziałek" => "Praca"
    case "wtorek" => "Praca"
    case "sroda" => "Praca"
    case "czwartek" => "Praca"
    case "piątek" => "Praca"
    case "sobota" => "Weekend"
    case "niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia tygodnia :v"
  }

  println(getDescriptionForWeekDayName("Wtorek"))
  println(getDescriptionForWeekDayName("Niedziela"))
  println(getDescriptionForWeekDayName("co - jajco"))

  println("\nZadanie 2\n")

  class KontoBankowe(val stanKonta: Double){
    def this(){
      this(0)
    }

    override def toString = s"KontoBankowe($stanKonta)"
  }

  var kb1 = new KontoBankowe()
  var kb2 = new KontoBankowe(33d)
  println(kb1.toString)
  println(kb2.toString)


  println("\nZadanie 3\n")

  class Osoba(var imie: String, var nazwisko: String)

  var osoba1 = new Osoba("Konrad", "Maciborski")
  var osoba2 = new Osoba("Zuzanna", "Nować")
  var osoba3 = new Osoba("Wojciech", "Olejarz")
  var osoba4 = new Osoba("Jakiś", "Ziom")

  def greetPerson(osoba: Osoba): String = osoba.nazwisko match {
    case "Maciborski" => "Dzień dobry Konradzie Maciborski"
    case "Nować" => "Dzień dobry Zuzanno Nować"
    case "Olejarz" => "Dzień dobry Wojciechu Olejarz"
    case _ => "Dzień dobry: " + osoba.imie + " " + osoba.nazwisko
  }

  println(greetPerson(osoba1))
  println(greetPerson(osoba2))
  println(greetPerson(osoba3))
  println(greetPerson(osoba4))


  println("\nZadanie 4\n")

  def sqr(wrt: Int): Int = wrt * wrt

  def sqrThree(wrt: Int, func: Int => Int) = {
     func(func(func(wrt)))
  }

  println(sqrThree(2, sqr))


  println("\nZadanie 5\n")


  class Osobaa(val imie: String, val nazwisko: String, val podatek: Double){
    def this(imie: String, nazwisko: String){
      this(imie, nazwisko, 0)
    }
  }

  trait Pracownik extends Osobaa {
    val pensja = 0d
    def this(imie: String, nazwisko: String, _pensja: Double){
      this(imie, nazwisko)
      this.pensja = _pensja
    }
  }

  trait Student extends Osobaa {
    override def podatek: Double = 0
  }

  trait Nauczyciel extends Pracownik {
    override def podatek: Double = pensja * 0.1
  }

  val pracownik1 = new Osobaa("Konrad", "Maciborski", 10d) with Pracownik

}
