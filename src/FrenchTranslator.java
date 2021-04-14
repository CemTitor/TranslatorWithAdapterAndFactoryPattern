//adapter class

public class FrenchTranslator implements Translator{


    String race="French";

    private FrenchGuide guide;

    FrenchTranslator() {
    }

    public FrenchTranslator(FrenchGuide guide) {
        this.guide = guide;
    }


    @Override
    public void translate() {
        //We can use Guide interface method in here.
        guide.tellAboutCity("Paris","France");
        guide.tellAboutArchitecture("Eiffel Tower");
        guide.tellAncientStory("Rolland Saga\n");
        System.out.println("Translator translate french sentence to the turkish.\n");
    }
}
