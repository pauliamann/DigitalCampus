package at.dcv.w03;

import java.util.Arrays;

public class W03Tag2SehrlangerString {

    /*  1.: Anzahl der Charactere
     *   2.: Anzahl "echte" Charactere
     *   3.: Anzahl Wörter
     *   4.: Kürzestes & längstes Wort
     *   5.: lineare Suche:  erstes / letztes Wort (Alphabetisch) (nicht sortieren)
     *   6.: Anzahl von Wort "Hesse"
     *   7.: Anzahl Wörter die nur Kleinbuchstaben / Großbuchstaben enthalten
     *   8.: Sortierung der Wörter nach Wortlänge (längstes zuerst, kürzestes zuletzt)
     *  */

    private final static String text = "Zur Zeit des Zweiten Weltkriegs waren seine großen Werke Siddhartha und Der Steppenwolf noch verboten. Heute gehört Hermann Hesse zu den bekanntesten deutschen Schriftstellern. Mehr über den Weltveränderer lest ihr hier\n" +
            "Hermann Hesse\n" +
            "\n" +
            "Hermann Hesse erhielt den Nobelpreis für Literatur\n" +
            "Hermann Hesse: Kurz-Steckbrief\n" +
            "\n" +
            "    Vollständiger Name: Hermann Karl Hesse\n" +
            "    Lebensdaten: 2. Juli 1877 bis 9. August 1962\n" +
            "    Nationalität: deutsch, später schweizerisch\n" +
            "    Zitat: \"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es auf jeden Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "\n" +
            "Als Schriftsteller, Dichter und Maler prägte Hermann Hesse die Literatur und Kunst des 19. Jahrhunderts.\n" +
            "Wie Hermann Hesse lebte\n" +
            "\n" +
            "Hermann Hesse wurde am 2. Juli 1877 in Calw, einer Stadt in Württemberg geboren. Seine Familie war sehr religiös, der Vater Johannes sogar Missionar, also so genannter \"Gesandter\", der seinen Glauben weiterverbreiten wollte.\n" +
            "\n" +
            "So sollten auch die Kinder in die Fußstapfen der religiösen Eltern treten. Hesse war davon aber gar nicht begeistert und soll einmal gesagt haben, dass er \"entweder Dichter oder gar nichts werden\" wolle.\n" +
            "\n" +
            "1893 verließ der junge Hesse das Gymnasium mit dem Abschluss der Mittleren Reife. Danach schloss er zwei Lehren ab: eine als Turmuhrenmechaniker und eine als Buchhändler.\n" +
            "\n" +
            "Gegen den Willen seiner Eltern ließ er sich in der Schweizer Stadt Basel nieder, um seinem Traum vom Dichter-Dasein näher zu kommen. 1899 veröffentlichte er seine erste Lyriksammlung. In dieser Zeit heiratete er auch seine erste Frau Maria Bernoulli, von der er sich aber 15 Jahre später wieder trennte. Aus der Ehe gingen drei Söhne hervor.\n" +
            "\n" +
            "Zwölf Jahre lang ist Adolf Hitler Deutschlands Reichskanzler. Viele Menschen sind damals von ihm begeistert, doch es wird eine Schreckensherrschaft. Wir haben die Geschichte des Nationalsozialismus auf dieser Themenseite für euch zusammengefasst\n" +
            "\n" +
            "\n" +
            "Wie Hermann Hesse die Welt veränderte\n" +
            "\n" +
            "Um das Jahr 1904 gelang ihm der Durchbruch. Der Roman \"Peter Camenzind\" stimmt an vielen Stellen mit Hesses Leben überein. Literatur-Experten handeln das Werk als \"Beginn des modernen Bildungsromans\". Auf den ersten großen Erfolg folgten weitere beeindruckende Erzählungen und Romane.\n" +
            "\n" +
            "1914, als der erste Weltkrieg begann, meldete sich der Schriftsteller zum Militärdienst für das Deutsche Reich. Aufgrund seiner Kurzsichtigkeit wurde er aber ausgemustert und der deutschen Kriegsgefangenenfürsorge zugeteilt. Seine Aufgabe war es, für die Gefangenen Bücher zu sammeln. Außerdem leitete er die \"Bücherei für deutsche Kriegsgefangene\".\n" +
            "\n" +
            "Diese Erfahrungen prägten Hesse sehr. In vielen seiner folgenden Texte sprach er sich deutlich gegen Krieg und Patriotismus (\"Vaterlandsliebe\") aus. Zusätzlich belasteten ihn familiäre Schicksalsschläge: 1916 starb sein Vater, sein Sohn litt an einer schweren Erkrankung und seine Ehe mit Bernoulli ging in die Brüche. Das ging Hesse so nahe, dass er eine Therapie machte. In dieser Phase seines Lebens widmete er sich auch erstmals der Malerei.\n" +
            "\n" +
            "Innerhalb kurzer Zeit heiratete er daraufhin zweimal: 1924 Ruth Wenger, die Tochter einer bekannten Schriftstellerin, 1931 die Kunsthistorikerin Ninon Dolbin. Gleichzeitig begann der Zweite Weltkrieg. Die Nationalsozialisten erklärten seine Werke als volksfeindlich und verbaten beispielsweise \"Unterm Rad\", \"Der Steppenwolf\" und \"Betrachtungen\". Hesses Verleger Peter Suhrkamp wurde 1944 sogar verhaftet.\n" +
            "\n" +
            "Hermann Hesse ließ sich den Mund aber nicht verbieten: Weiterhin schrieb er Regime-kritische Texte, also Texte, die die nationalsozialistische Herrschaft unter Adolf Hitler angriffen. Nach dem Zweiten Weltkrieg wurden diese dann auch veröffentlicht.\n" +
            "\n" +
            "Er hasste den Krieg. In seinem Testament widmete der Physiker und Chemiker Alfred Nobel sein Vermögen unter anderem der Vergabe des jährlichen Friedenspreises\n" +
            "Hermann Hesses Tod in der Schweiz\n" +
            "\n" +
            "1946 zog sich Hesse zurück, da sein Gesundheitszustand immer schlechter wurde. \"Das Glasperlenspiel\" und \"Krieg und Frieden\" waren Anlass dafür, dass er am 14. November desselben Jahres mit dem Nobelpreis für Literatur ausgezeichnet wurde. Für sein Lebenswerk wurde er ein Jahr später zum Ehrendoktor sowie Ehrenbürger von Calw, seiner Geburtsstadt, ernannt. 1955 folgte der Friedenspreis des Deutschen Buchhandels.\n" +
            "\n" +
            "Am 9. August 1962 starb Hermann Hesse an einem Gehirnschlag in seinem Haus in der Schweiz. Heute gehört Hermann Hesse zu denbekanntesten deutschsprachigenr Schriftstellern. Seine Werke wurden in 55 Sprachen übersetzt.\n" +
            "Zitate von Hermann Hesse\n" +
            "\n" +
            "\"Man muß das Unmögliche versuchen, um das Mögliche zu erreichen.\"\n" +
            "Hermann Hesse\n" +
            " \n" +
            "\n" +
            "\"Man braucht vor niemand Angst zu haben. Wenn man jemanden fürchtet, dann kommt es daher, daß man diesem Jemand Macht über sich eingeräumt hat.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Man hat nur Angst, wenn man mit sich selber nicht einig ist.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Recht als wolle es ihn mit der Nase darauf stoßen, hatte sein Glück ihm diese prächtige Figur in seinen Weg gestellt, daß er sich an sie halte. Aber der Mensch ist zu nichts schwerer zu bringen als zu seinem Glück.\"\n" +
            "Hermann Hesse, Der Weltverbesserer\n" +
            " \n" +
            "\n" +
            "\"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es in jedem Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "Hermann Hesse, Das Glasperlenspiel\n" +
            " \n" +
            "\n" +
            "\"Die Welt zu durchschauen, sie zu verachten, mag großer Denker Sache sein. Mir aber liegt einzig daran, die Welt lieben zu können, sie und mich und alle Wesen mit Liebe und Bewunderung und Ehrfurcht betrachten zu können.\"\n" +
            "Hermann Hesse";

    public static void main(String[] args) {

        System.out.println("1.: Anzahl der Zeichen: " + textLength(text));
        System.out.println("2.: Anzahl Charaktere: " + textLengthStrip(text));
        System.out.print("3.: Anzahl Worte: " + wordCount(text));
        System.out.println(" 3a.: Clemens Anzahl Wort: " + wordCountClemens(text));
        System.out.print("4.: Längstes Wort: " + longestString(text));
        System.out.println(" 4a .: Kürzestes Wort: " + shortestString(text));
        System.out.println("5.: erstes Wort alphabetisch: " + firstWord(text));
        System.out.println("6.: Anzahl Hesse: " +wordCountHesse(text));
        System.out.println("7.: LowerCaseCount: " + lowerCaseCount(text));
        System.out.println("8.: UpperCaseCount: " + upperCaseCount(text));


//         *   8.: Sortierung der Wörter nach Wortlänge (längstes zuerst, kürzestes zuletzt)


    }

    //         1.: Anzahl der Charactere
    public static int textLength (String text) {
        int textLength = text.length();
        return textLength;
    }

    //         2.: Anzahl "echte" Charactere   . , ( usw auch rauslöschen.
    public static int textLengthStrip (String text) {

//        String emptyReplaced = text.replaceAll("\\s" , ""); // Die Regex-Expression für Whitespace Characters ist \s https://www.w3schools.com/jsref/jsref_regexp_whitespace.asp
        String emptyReplaced = text.replaceAll("[^a-zA-Z0-9ÄÜÖäüöß]", ""); // hier wird mit Regex alle Zeichen außer den Definierten rausgelöscht
//        System.out.println(emptyReplaced);
        int textLengthStripped = emptyReplaced.length();
        return textLengthStripped;
    }

    //         3.: Anzahl Wörter
    public static int wordCount (String text) {
        //     Definition Wort: Charactere mit Leerfeld davor und danach

        String emptyReplaced = text.replaceAll("[,0-9.:()\"]", "")
                .replaceAll("[-\n]", " ")
                .replaceAll("[ ]+", " ");
        String[] textArray = emptyReplaced.split(" ");
        int textArrayLength = textArray.length;
        System.out.println(Arrays.toString(textArray));

        return textArrayLength;

    }

    //          4.: Das längstes Wort
    public static String longestString (String text){
        String emptyReplaced = text.replaceAll("[\\n0-9.:\\t()\\\"]", "");  // noch regex [ ]+ zufügen, um die mehreren Leerzeichen zu entfernen.
        String emptyReplacedExtended = emptyReplaced.replaceAll("[ ]+" , " ");
        String[] textArrayS = emptyReplacedExtended.split(" ");

        String longestWord = textArrayS[0];
        for (int i = 0; i < textArrayS.length-1; i++) {
            if (longestWord.length() < textArrayS[i+1].length()){
                longestWord = textArrayS[i+1];
            }
        }
        return longestWord;
    }

    //          4.: Das kürzeste Wort
    public static String shortestString (String text){
        String emptyReplaced = text.replaceAll("[\\n0-9.:\\t()\\\"]", "");  // noch regex [ ]+ zufügen, um die mehreren Leerzeichen zu entfernen.
        String emptyReplacedExtended = emptyReplaced.replaceAll("[ ]+" , " ");
        String[] textArrayS = emptyReplacedExtended.split(" ");

        String shortestWord = textArrayS[0];
        for (int i = 0; i < textArrayS.length-1; i++) {
            if (shortestWord.length() > textArrayS[i+1].length()){
                shortestWord = textArrayS[i+1];
            }
        }
        return shortestWord;
    }

    //          5.: Das Erste & Letzte Wort lt. Alphabet anzeigen

    public static String firstWord (String text) {
        String emptyReplaced = text.replaceAll("[,0-9.:()\"]", "")
                .replaceAll("[-\n]", " ")
                .replaceAll("[ ]+", " ")
                .replace("ü", "ue")
                .replace("ö", "oe")
                .replace("ä", "ae")
                .replace("ß", "ss");
        String[] textArrayS = emptyReplaced.split(" ");


//        String emptyReplaced = text.replaceAll("[\\n0-9.:\\t()\\\"]", "");  // noch regex [ ]+ zufügen, um die mehreren Leerzeichen zu entfernen.
//        String emptyReplacedExtended = emptyReplaced.replaceAll("[ ]+" , " ");
//        String ohneUmlaute = emptyReplacedExtended.replace("ü", "ue")
//                .replace("ö", "oe")
//                .replace("ä", "ae")
//                .replace("ß", "ss");
//        String[] textArrayS = ohneUmlaute.split(" ");

// prüfen ob der erste Buchstabe eines Strings kommt früher im Alphabet als der erste Buchstabe vom String davor. Wenn, dann wird er als erterString gespeichert
        int erstesWort = 0;
        for (int i = 0; i < textArrayS.length-1; i++) {
            if (textArrayS[erstesWort].compareToIgnoreCase(textArrayS[i+1]) > 0){
                erstesWort = i;
            }
        }


//        String firstWord = textArrayS[0];
//        for (int i = 0; i < textArrayS.length-1; i++) {
//            int compare = textArrayS[i].compareToIgnoreCase(textArrayS[i+1]);
////            System.out.println(i + ". Runde");
//            if (compare < 0) {
//                firstWord = textArrayS[i];
//            }
////            System.out.println(firstWord);
//        }
        return textArrayS[erstesWort];
    }

    //         6.: Anzahl von Wort "Hesse"
    public static int wordCountHesse (String text) {

        String emptyReplaced = text.replaceAll("\\b", "");
        String[] textArray = emptyReplaced.split(" ");
        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains("Hesse")) {
                ++count;
            }
        }
//        System.out.println(Arrays.toString(textArray));
        return count;
    }

    //         7.: Anzahl Wörter mit ausschließlich Kleinschreibung
    public static int lowerCaseCount (String text) {
        String emptyReplaced = text.replaceAll("[,0-9.:()\"]", "")
                .replaceAll("[-\n]", " ")
                .replaceAll("[ ]+", " ");
        String[] textArrayS = emptyReplaced.split(" ");


        int lowerCaseCount = 0;
        for (int i = 0; i < textArrayS.length; i++) {
            if (textArrayS[i].equals(textArrayS[i].toLowerCase())) {
                ++lowerCaseCount;
            }
        }
//        System.out.println("LowercaseCount: " + lowerCaseCount);
        return lowerCaseCount;
    }

    //         8.: Anzahl Wörter mit ausschließlich Großschreibung
    public static int upperCaseCount (String text) {
        String emptyReplaced = text.replaceAll("[,0-9.:()\"]", "")
                .replaceAll("[-\n]", " ")
                .replaceAll("[ ]+", " ");
        String[] textArrayS = emptyReplaced.split(" ");

        int upperCaseCount = 0;
        for (int i = 0; i < textArrayS.length; i++) {
//            if (String.valueOf(textArrayS[i].charAt(0)).equals(String.valueOf(textArrayS[i].charAt(0)).toUpperCase())) // Funktioniert auch. Aber die Lösung in der Zeile darunter ist einfacher.
            if (Character.isUpperCase(textArrayS[i].charAt(0)))  {
                ++upperCaseCount;
            }
        }
        return upperCaseCount;
    }

    //          9.: Sortiere die Wörter der Wortlänge Absteigend

    public static int wordCountClemens (String text) {
        int words = 0;

        for (int i = 1; i < text.length(); i++)
        {
            Character charOne = text.charAt(i - 1);
            Character charTwo = text.charAt(i);
            if (Character.isLetter(charOne) == true && Character.isLetter(charTwo) == false) words++; // Zählt ob davor bzw danach immer ein bzw kein Buchstabe ist.
            if (i == text.length() - 1 && Character.isLetter(charOne)) words++; //  Definiert das Letzte Wort

        } return words;
    }
}

