/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10117161.rakapanji.no3;

/**
 *
 * @author GPS-2
 */
public class UTS10117161RakaPanjiNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rnb  blues = new Rnb();
        blues.setArtistName("Jimmy Hendrik");
        blues.genreBlues(blues.get.ArtistName());
        
        Rnb  jazz = new Rnb();
        jazz.setArtistName("chad baker");
        jazz.genreJazz(jazz.get.ArtistName());
        
        Folk  folk = new Folk();
        folk.setArtistName("Jimmy Hendrik");
        folk.genreFolk(folk.get.ArtistName());
        
        Rockbility  rockbility = new Rockbility();
        rockbility.setArtistName("Bob Dylan");
        rockbility.genreRockbility(rockbility.get.ArtistName());
		
		Hardrock  hardrock= new Hardrock();
        hardrock.setArtistName("Bob Dylan");
        hardrock.genreHardrock(hardrock.get.ArtistName());
		
		
    }
    
}
