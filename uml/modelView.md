"@startuml Domain"

abstract class GameView
class Game

StartView *-down-> Game



GameView <|-down-StartView
GameView <|-down-PlayView
GameView <|-down-ResumeView



Game *-down-> Board
BoardView -down-> Game

BoardView -down-> ColorView


ColorView o-down-> Coordinate


@enduml