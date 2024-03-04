public class Racetest {
    public static void main(String[] args) {
        Race degrees = new Race();
        degrees.addPerson(341, "Kadir");
        degrees.addPerson(273, "Gökhan");
        degrees.addPerson(278, "Hakan");
        degrees.addPerson(329, "Suzan");
        degrees.addPerson(445, "Pınar");
        degrees.addPerson(402, "Mehmet");
        degrees.addPerson(388, "Ali");
        degrees.addPerson(270, "Emel");
        degrees.addPerson(243, "Fırat");
        degrees.addPerson(334, "James");
        degrees.addPerson(412, "Jale");
        degrees.addPerson(393, "Ersin");
        degrees.addPerson(299, "Deniz");
        degrees.addPerson(343, "Gözde");
        degrees.addPerson(317, "Anıl");
        degrees.addPerson(265, "Burak");

        degrees.bestOfThree();
        degrees.allTimes();
    }
}
