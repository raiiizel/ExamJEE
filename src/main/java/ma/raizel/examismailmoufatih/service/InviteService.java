package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.InviteDto;

import java.util.List;

public interface InviteService {
    public InviteDto addInvite(InviteDto inviteDto);
    public List<InviteDto> getAllInvites();
    public InviteDto getInviteById(int id);
    public void deleteInvite(int id);
    public InviteDto updateInvite(InviteDto inviteDto);

}
