package ma.raizel.examismailmoufatih.dto;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Invite;
import ma.raizel.examismailmoufatih.dao.entities.Participant;
import ma.raizel.examismailmoufatih.dao.entities.Session;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InscriptionDto {
    private Integer id;
    private Date date;
    private String statut;
    private double prix;

    private SessionDto session;

    private InviteDto invite;

}
