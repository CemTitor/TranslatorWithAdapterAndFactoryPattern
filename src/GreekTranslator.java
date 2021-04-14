//adapter clas

public class GreekTranslator implements Translator{


    String race="Greek";

    private GreekGuide guide;

    GreekTranslator() {
    }

    public GreekTranslator(GreekGuide guide) {
        this.guide = guide;
    }


    @Override
    public void translate() {
        //We can use Guide interface method in here.
        guide.tellAboutCity("Atina","Greece");
        guide.tellAboutArchitecture("Apollo Temple");
        guide.tellAncientStory("Ilyada and Odysseia\n");
        System.out.println("Translator translate greek sentence to the turkish.\n");
    }
}
