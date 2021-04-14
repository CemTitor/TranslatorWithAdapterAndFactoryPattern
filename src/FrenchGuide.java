public class FrenchGuide implements Guide{
    private String race;

    public String getRace() {
        return race;
    }

    FrenchGuide() {
        this.race="French";
    }

    @Override
    public void tellAboutArchitecture(String architecture) {
        System.out.println("- "+architecture + " is an architectural work of 10 years.");
    }

    @Override
    public void tellAboutCity(String city, String country) {
        System.out.println("- "+city + " is one of the famous city in the " + country + ".");
    }

    @Override
    public void tellAncientStory(String legendName) {
        System.out.println("- Lets talk about this fascinating legend of, " + legendName + " !");

    }

}
