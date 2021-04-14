class GreekOrganizer extends Organizer {

    private String race="Greek";


    String getRace() {
        return race;
    }

    Translator dealTranslator(Enum<TranslatorLevel> type) {
        if(type.equals(TranslatorLevel.EXPERT)){
            return new GreekTranslator();
        }else return null;
    }
}
