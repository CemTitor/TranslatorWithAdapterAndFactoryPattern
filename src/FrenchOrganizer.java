public class FrenchOrganizer extends Organizer {

    private String race="French";


    public String getRace() {
        return race;
    }

    Translator dealTranslator(Enum<TranslatorLevel> type) {
        if(type.equals(TranslatorLevel.EXPERT)) {
            return new FrenchTranslator();
        }else return null;
    }
}
