//adapter class

public class BritishTranslator implements Translator {

    private String race = "British";
    private BritishGuide guide;
    public String getRace() {
        return race;
    }

    BritishTranslator() {
    }

    BritishTranslator(BritishGuide guide) {
        this.guide = guide;
    }

    @Override
    public void translate() {
        //We can use Guide interface method in here.
        guide.tellAboutCity("London","England");
        guide.tellAboutArchitecture("Buckingham Palace");
        guide.tellAncientStory("Vikings !\n");
        System.out.println("Translator translate english sentence to the turkish.\n");

    }
}
