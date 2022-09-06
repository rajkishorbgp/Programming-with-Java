/*
 *             Interfaces
 *          -> All methods are public, abstract & without implementation
 *          -> Used to achieve total abstraction
 *          -> Variables in the interface are final, public and static 
 * 
 */

public class InterFaces {
 public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
 }   
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer {
    public void moves () {
        System.out.println("up , down , left , right , diagonal ( in all 4 dirns )");
    }
}


class Rook implements ChessPlayer {
    public void moves () {
        System.out.println("up , down , left , right");
    }
}


class King  implements ChessPlayer {
    public void moves () {
        System.out.println("up , down , left , right , diagonal -( by 1 step )");
    }
}
interface Herbivore{

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore{
    
}

/*
 *  Output
 *  up , down , left , right , diagonal ( in all 4 dirns )
 */