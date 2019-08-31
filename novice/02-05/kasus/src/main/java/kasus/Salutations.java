package kasus;

public class Salutations {

    private int salutation_id;
    private String salutation;

    public Salutations() {}

    public Salutations(int salutation_id, String salutation) {
        this.salutation_id = salutation_id;
        this.salutation = salutation;
    }

    public Integer getId() {
        return salutation_id;
    }

    public String getSalutation() {
        return salutation;
    }
}