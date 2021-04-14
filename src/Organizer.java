abstract class Organizer {


    abstract Translator dealTranslator(Enum<TranslatorLevel> type);

    Translator callTranslator(Enum<TranslatorLevel> type){
        Translator translator;
        translator= dealTranslator(type);
        System.out.println("Organizer made an agreement with the translator.\n");
        return translator;
    }



}
