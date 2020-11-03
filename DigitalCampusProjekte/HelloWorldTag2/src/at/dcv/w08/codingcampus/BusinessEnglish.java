package at.dcv.w08.codingcampus;

public class BusinessEnglish extends Course {

    public String unterrichtsmaterial;

    public BusinessEnglish (String name, String description, int maxParticipants, int dauer, String unterrichtsmaterial) {
        super(name,description, maxParticipants, dauer );
        this.unterrichtsmaterial = unterrichtsmaterial;
    }
}
