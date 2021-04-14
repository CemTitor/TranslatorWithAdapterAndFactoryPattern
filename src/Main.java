public class Main {
    public static void main(String[] args) {

        /**
         * Adapter design pattern part
         */

        TurkishTourist client=new TurkishTourist();

        BritishGuide adaptee1=new BritishGuide();

        BritishTranslator adapter1=new BritishTranslator(adaptee1);

        client.listenTranslator(adapter1);


        System.out.println();

        /**
         * Factory design pattern part
         */
        Organizer britishOrg=new BritishOrganizer();
        Organizer greekOrg=new GreekOrganizer();

        System.out.println(((BritishOrganizer) britishOrg).getRace()+" organizator called translator for business");
        Translator translator1=britishOrg.callTranslator(TranslatorLevel.EXPERT);


        System.out.println(((GreekOrganizer) greekOrg).getRace()+" organizator called translator for business");
        translator1=greekOrg.callTranslator(TranslatorLevel.JUNIOR);







    }
}
