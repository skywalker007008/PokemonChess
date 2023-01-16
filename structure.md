## Pokemon Auto Chess Sturcture

> This is the demo structure description

### Stone

All the stone extends the **Chess** class, which implements the interface **ChessAction**.

The **Chess** class has all the following members:
+ id, uniqueId, name
+ physical/magical + Attack/Defense
+ dodge/critical Chance
+ attack Range/Speed
+ star
+ List of jobs and equipments

The **ChessAction** requires all the following opertaions:
+ move
+ attack
+ ultAttack
+ suffer
+ evolve
+ equip
+ (re/de)activeJob

### Board

The **Board** is the information of the player's board. It at least requires these:
+ Array of the board stones
+ List of the Waiting Bench
+ List of the equipments
+ Gold, interest, shop, health

On the board, it will call the interface of the **ChessAction** to modify the chess information.

### Equip

sss
