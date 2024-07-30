

## Flow Chart
```mermaid
flowchart TB
    Start((Start)) --> GameSet
    GameSet[Game set-up] --> GetGuess
    GetGuess[Get user guess] --> CheckGuess{Check guess}
    CheckGuess -->|kill| removeDotCom
    removeCell[remove location cell] --> GetGuess
    checkAlive -->|no| display[display user score/rating]
    display --> Over((game over))
    CheckGuess -->|hit| removeCell
    CheckGuess -->|miss| GetGuess
    removeDotCom[remove Dot Com] --> checkAlive{still some Dot Coms Alive?} -->|yes| GetGuess
```

## ADT
```mermaid
classDiagram 
    SimpleDotComGame --> SimpleDotCom
    SimpleDotComGame : void main()
    class SimpleDotCom{
        int[] locationCells
        int numOfHits
        SimpleDotCom()
        String checkYourself(String guess)
    }
```

<br>  

### SimpleDotComGame  
> main function

<br>  

### SimpleDotCom  
> <details>  
> <summary><font size=3>Member Variable</font></summary>  
>
> - **Declare** an `int` array to keep the location. Call it <font style="background-color:#404040" color=jade>*locationCells*</font>   
> - **Declare** an `int` to count the number of hits. Call it <font style="background-color:#404040" color=jade>*numOfHits*</font>. **Set** it to 0 
> </details>
>
> <details>  
> <summary><font size=3>Member Function</font></summary>
>
> - **Declare** a <font style="background-color:#FFCA99" color=red>*Constructer*</font> that takes an `int` array (which has three cell locations as `int`)  
> - **Declare** a <font style="background-color:#FFCA99" color=red>*checkYourself*</font> method that take a `String` for the user's guess \(\"1\", \"4\", etc\), checks it, and returns a result representing a \"hit\", \"miss\", or \"kill\"  

<br>  
<br>  

## Prep Code  
### SimpleDotComGame  
![alt text](SimpleDotComGGame_prep_main.jpg =500x)

<br>  

### SimpleDotCom  
![alt text](SimpleDotCom_prep_Constructer.png =400x)
![SimpleDotCom prep_code](SimpleDotCom_prep_checkYourself.jpg =500x)  

<br>  
