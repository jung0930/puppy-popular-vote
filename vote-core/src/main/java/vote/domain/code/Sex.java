package vote.domain.code;

public enum Sex {

    MALE("M", "수컷"),
    FEMALE("F", "암컷");

    private String value;
    private String description;

    Sex(String value, String description) {
        this.value = value;
        this.description = description;
    }

}
