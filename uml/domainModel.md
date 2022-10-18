"@startuml Domain"

class Token
class Player
class Board
class Conecta4
enum Color

Conecta4 *-down-> Turn

Turn *-down->"2" Player

Turn .down.>Token

Conecta4 *-down-> Board

CircleSpace o-down->Token

Board *-down->"7x6" CircleSpace

Token *-down-> Color

Player .down.> "3..21" Move

Move .down.>Token

Player *-down->"0..21" Token

Player -down-> Board

Player *-down-> Color

Player -down->Result

Result .down.> Move

CircleSpace *-down-> Coordinate

Result <|-down-WinnerResult
Result <|-down-DrawResult
WinnerResult <|-down-Vertical
WinnerResult <|-down-Horizontal
WinnerResult <|-down-Diagonal
WinnerResult <|-down-InvertedDiagonal

Result ...down...>CircleSpace

@enduml