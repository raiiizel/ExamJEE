package ma.raizel.examismailmoufatih.dto;

public class ParticipantDto {
    private Integer id;
    private String nom;
    private String email;
    private String photo;
    private String genre;

    public ParticipantDto(Integer id, String nom, String email, String photo, String genre) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.photo = photo;
        this.genre = genre;
    }

    public ParticipantDto() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoto() {
        return this.photo;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
