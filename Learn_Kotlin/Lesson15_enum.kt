fun main(args : Array<String>) {
  for (card in Card.values()) {
    println("${card.ordinal} : ${card.name}")
  }
  val card = Card.DIAMOND;

  when(card) {
    Card.CLUB -> println("Card is Club")
    Card.HEART -> println("Card is Heart")
    Card.SPADE -> println("Card is Spade")
    Card.DIAMOND -> println("Card is Diamond")
  }

  when(card) {
    Card.CLUB -> println("Card is ${card.color}")
    Card.HEART -> println("Card is ${card.color}")
    Card.SPADE -> println("Card is ${card.color}")
    Card.DIAMOND -> println("Card is ${card.color}")
  }
}

enum class Card(val color: String) {
  HEART("Red"),
  DIAMOND("Red"),
  CLUB("Black"),
  SPADE("Black")
}