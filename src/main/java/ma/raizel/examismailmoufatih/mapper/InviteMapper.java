package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Invite;
import ma.raizel.examismailmoufatih.dto.InviteDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InviteMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public InviteDto fromInviteToInviteDto(Invite invite) {
        return modelmapper.map(invite, InviteDto.class);
    }
    public Invite fromInviteDtoToInvite(InviteDto inviteDto) {
        return modelmapper.map(inviteDto, Invite.class);
    }

}
