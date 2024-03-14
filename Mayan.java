public class Mayan extends Language{
    public Mayan(String languageName, int speakers){
   super(languageName, speakers, "Central America", "verb-object-subject");
    }
    @Override 
      public void getInfo(){
        System.out.println(this.name +" is spoken by "+this.numSpeakers +" people mainly in "+this.regionSpoken+".\nThe language follows the word order: "+this.wordOrder+".\n Fun fact: Mayan is an ergative language.");
      }
  }