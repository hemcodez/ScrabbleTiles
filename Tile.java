public class Tile {

    // --- Set attributes for a character and integer
    String letter;
    int value;

    // --- Constructor to tile object
    public void Tile(){

    } //end constructor

    // --- Constructor that initializes the attributes
    public void Tile(String letter, int value){
        setLetter(letter);
        setValue(value);

    } //end constructor

    // --- Accessor Methods of Tile Class ->  Getters and Setters
    public String getLetter() {return letter; } //end getLetter() method
    public void setLetter(String letter) { this.letter = letter; } //end setLetter() method

    public int getValue() { return value; } //end getValue() method
    public void setValue(int value) { this.value = value; } //end setValue() method

    // --- printTile method
    void printTiles() {
        System.out.println("Letter: " + letter);
        System.out.println("Value: " + value);
    }

} // end class
