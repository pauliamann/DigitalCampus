package at.dcv.w08.codingcampus;

public class JavaCoding extends Course {

    public String unterrichtsmaterial;

    public JavaCoding (String name, String description, int maxParticipants, int dauer, String unterrichtsmaterial) {
        super(name, description, maxParticipants, dauer);
        this.unterrichtsmaterial = unterrichtsmaterial;
    }

}
