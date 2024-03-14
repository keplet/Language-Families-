public class Language{
    //fields
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;
    public Language(String name, int unmSpeakers, String regionSpoken, String wordOrder){
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionSpoken = regionSpoken;
      this.wordOrder = wordOrder;
      }
      public void  getInfo(){
        System.out.println(this.name +" is spoken by "+this.numSpeakers +" people mainly in "+this.regionSpoken+".\nThe language follows the word order: "+this.wordOrder+".");
      }
      public static void main(String [] agrs){
        Language creole = new Language("Creole", 12000, "Haiti","Subject Verbs");
        creole.getInfo();
        Mayan Mam = new Mayan("Mam",488500);
        Mam.getInfo();
        SinoTibetan chinese = new SinoTibetan("Mandarin Chinese",2333);
        chinese.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese",3457);
        burmese.getInfo();
      }
    }