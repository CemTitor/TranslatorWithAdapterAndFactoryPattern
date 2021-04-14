class BritishOrganizer extends Organizer {
    private final String race="British";


    String getRace() {
        return this.race;
    }

    @Override
    //this part is for factory pattern
    Translator dealTranslator(Enum<TranslatorLevel> type) {
        if(type.equals(TranslatorLevel.EXPERT)){
            return new BritishTranslator();
        }else return null;
    }
}
