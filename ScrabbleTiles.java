public class ScrabbleTiles {

    public static void main(String[] args){

        //Create a new tile object
        Tile tile = new Tile();

        //set attribute of tile
        tile.setLetter("Z");
        tile.setValue(10);

        //Display Scrabble Tiles as output
        System.out.println("S C R A B B L E  T I L E S");
        System.out.println("...........................");
        System.out.print("\n");
        tile.printTiles();
        System.out.print("\n");
        System.out.println("...........................");

    } //end main method

} //end class
