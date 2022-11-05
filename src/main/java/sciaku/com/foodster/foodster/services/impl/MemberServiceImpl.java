package sciaku.com.foodster.foodster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.model.MemberRole;
import sciaku.com.foodster.foodster.repo.MemberRepository;
import sciaku.com.foodster.foodster.repo.RoleRepository;
import sciaku.com.foodster.foodster.services.MemberService;

import java.util.List;
import java.util.Set;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override

    public Member createMember(Member member, Set<MemberRole> memberRoles) throws Exception {
        Member uName = this.memberRepository.findByUsername(member.getUsername());
        Member email = this.memberRepository.findByEmail(member.getEmail());
        if ((uName != null) && (email !=null))
        {
            System.out.println("Member ia already there !!");
            throw new Exception("Member is already present !!");
        }
        else
        {
            //Member Create
            for (MemberRole mr:memberRoles)
            {
                roleRepository.save(mr.getRole());
            }
            member.getMemberRoles().addAll(memberRoles);
            uName = this.memberRepository.save(member);
        }
        return uName;
    }

    @Override
    public Member getMember(String username) {
        return this.memberRepository.findByUsername(username);
    }

    @Override
    public List<Member> getAllMember() {
        return (List<Member>) this.memberRepository.findAll();
    }
}
