package Toilet;
// hvis der er en cleanning person så må det ikke være flere
//dem der de bruge toilet de er writers og det må være flere
//cleaning person er reader og det mår være kun en ad gang
public interface PublicToilet {
    void stepIntoCabin();
    void leaveCabin();
    void startCleaning();
    void endCleaning();
}
