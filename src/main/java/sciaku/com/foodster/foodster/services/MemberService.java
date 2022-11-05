package sciaku.com.foodster.foodster.services;

import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.model.MemberRole;

import java.util.List;
import java.util.Set;

public interface MemberService {
    public Member createMember(Member member, Set<MemberRole> memberRoles) throws Exception;

    public Member getMember(String username);

    public List<Member> getAllMember();
}
