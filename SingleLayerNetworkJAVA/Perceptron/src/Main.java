
public class Main
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

        Layer l = new Layer("/Users/smykolaj/SEMESTER4/NAI/SingleLayerNetworkJAVA/Perceptron/lang.train.csv", "/Users/smykolaj/SEMESTER4/NAI/SingleLayerNetworkJAVA/Perceptron/lang.test.csv", 1000 );
        String text1 = "Familie Müller plant ihren Urlaub. Sie geht in ein Reisebüro und lässt sich von einem Angestellten beraten. Als Reiseziel wählt sie Mallorca aus. Familie Müller bucht einen Flug auf die Mittelmeerinsel. Sie bucht außerdem zwei Zimmer in einem großen Hotel direkt am Strand. Familie Müller badet gerne im Meer.\n" +
                "\n" +
                "Am Abflugtag fahren Herr und Frau Müller mit ihren beiden Kindern im Taxi zum Flughafen. Dort warten schon viele Urlauber. Alle wollen nach Mallorca fliegen. Familie Müller hat viel Gepäck dabei: drei große Koffer und zwei Taschen. Die Taschen sind Handgepäck. Familie Müller nimmt sie mit in das Flugzeug. Am Flugschalter checkt die Familie ein und erhält ihre Bordkarten. Die Angestellte am Flugschalter erklärt Herrn Müller den Weg zum Flugsteig. Es ist nicht mehr viel Zeit bis zum Abflug. Familie Müller geht durch die Sicherheitskontrolle. Als alle das richtige Gate erreichen, setzen sie sich in den Wartebereich. Kurz darauf wird ihre Flugnummer aufgerufen und Familie Müller steigt mit vielen anderen Passagieren in das Flugzeug nach Mallorca. Beim Starten fühlt sich Herr Müller nicht wohl. Ihm wird ein wenig übel. Nach zwei Stunden landet das Flugzeug. Am Gepäckband warten alle Passagiere noch auf ihr fehlendes Gepäck. Danach kann endlich der Urlaub beginnen.";
        l.classifyText(text1);

        String text2 = "Nazywam się Tomek i lubię uprawiać sport. Interesuję się piłką nożną. Gram w drużynie piłkarskiej od kilku lat. Umiem też pływać i jeździć na rowerze, ale wolę grać w piłkę nożną. Oprócz tego gram też w gry na konsoli. Moją ulubioną jest FIFA. Nie lubię gier typu The Sims i Zoo Tycoon.\n" +
                "\n" +
                "Moja starsza siostra Ala w wolnym czasie też gra w gry. Po szkole uczy się jeździć konno. Konie to jej ulubione zwierzęta. Czyta dużo książek o koniach, kotach i psach. Interesuje się nawet wężami. Często spotyka się z koleżankami, żeby się z nimi uczyć. Czasami wychodzą też razem na zakupy. Kupują ubrania albo torebki. Rodzice są czasem źli, że wydaje dużo pieniędzy.\n" +
                "\n" +
                "Mam też drugą siostrę, nazywa się Sara. Ma tylko 7 lat. Dużo czasu spędza jeszcze z rodzicami. Wspólnie słuchają muzyki, dlatego Sara chce nauczyć się grać na perkusji. Nie lubię perkusji. To bardzo głośny instrument. Mam nadzieję, że wybierze bardziej cichy instrument.\n" +
                "\n" +
                "Wszyscy razem chodzimy czasami na spacery. Często oglądamy też telewizję. Najbardziej lubię filmy akcji, ale Sara jest na nie za mała. Najczęściej oglądamy filmy familijne i bajki.";
        l.classifyText(text2);

        String text3 ="Hi! Nice to meet you! My name is John Smith. I am 19 and a student in college. I go to college in New York. My favorite courses are Geometry, French, and History. English is my hardest course. My professors are very friendly and smart. It’s my second year in college now. I love it!\n" +
                "\n" +
                "I live in a big house on Ivy Street. It’s near the college campus. I share the house with three other students. Their names are Bill, Tony, and Paul. We help each other with homework. On the weekend, we play football together.\n" +
                "\n" +
                "I have a younger brother. He just started high school. He is 14 and lives with my parents. They live on Mulberry Street in Boston. Sometimes they visit me in New York. I am happy when they visit. My Mom always brings me sweets and candy when they come. I really miss them, too!";
        l.classifyText(text3);

        String text4 = "Gabriela trabaja en una tienda de ropa. Ella ama su trabajo porque le gusta la moda y disfruta recomendar a los clientes la ropa más adecuada según sus gustos y necesidades.\n" +
                "\n" +
                "Por la mañana, una cliente le pide ayuda para elegir ropa formal para una entrevista de trabajo. Gabriela le recomienda una camisa blanca y una falda gris, con unos zapatos que combinan con su bolso. El cielo está nublado, así que lleva un paraguas por si acaso.\n" +
                "\n" +
                "Más tarde, otra cliente pide ayuda para elegir el mejor regalo para su novio. Gabriela le muestra unas corbatas muy bonitas, un elegante reloj y unas modernas gafas de sol. Ella se decide por una corbata a rayas rojo y azul.\n" +
                "\n" +
                "Un cliente va a comprar ropa para sus vacaciones en la playa. Elije unos pantalones cortos, un sombrero para protegerse del sol y una camisa de algodón.\n" +
                "\n" +
                "Poco antes de cerrar la tienda, llega un hombre muy apurado porque debe hacer un viaje a Finlandia y no tiene ropa abrigada. Gabriela le sugiere que lleve unas botas, una bufanda para cubrir su cara y una gruesa chaqueta. Asi es, Gabriela ama su trabajo.";

        l.classifyText(text4);

        long endTime = System.currentTimeMillis(); // End time in milliseconds
        long duration = endTime - startTime; // Compute duration in milliseconds

        System.out.println("Execution time in milliseconds: " + duration);

    }
}


