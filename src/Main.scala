object Main extends App {

  print("Zadanie 1\n")

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

  print("\nZadanie 2\n")

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


  print("\nZadanie 3\n")

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


  print("\nZadanie 4\n")

}
