package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Invite;
import ma.raizel.examismailmoufatih.dao.repositories.InviteRepository;
import ma.raizel.examismailmoufatih.dto.InviteDto;
import ma.raizel.examismailmoufatih.mapper.InviteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InviteManager implements InviteService {
    @Autowired
    private InviteRepository inviteRepository;
    @Autowired
    private InviteMapper inviteMapper;

    @Override
    public InviteDto addInvite(InviteDto inviteDto) {
        return inviteMapper.fromInviteToInviteDto(inviteRepository.save(inviteMapper.fromInviteDtoToInvite(inviteDto)));
    }
    @Override
    public List<InviteDto> getAllInvites() {
        List<Invite> invites = inviteRepository.findAll();
        return invites.stream().map(inviteMapper::fromInviteToInviteDto).collect(Collectors.toList());
    }
    @Override
    public InviteDto getInviteById(int id) {
        return inviteMapper.fromInviteToInviteDto(inviteRepository.findById(id).orElse(null));
    }
    @Override
    public void deleteInvite(int id) {
        inviteRepository.deleteById(id);
    }
    @Override
    public InviteDto updateInvite(InviteDto inviteDto) {
        return inviteMapper.fromInviteToInviteDto(inviteRepository.save(inviteMapper.fromInviteDtoToInvite(inviteDto)));
    }


}
