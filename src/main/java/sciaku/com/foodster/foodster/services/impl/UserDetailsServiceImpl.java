package sciaku.com.foodster.foodster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.repo.MemberRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = this.memberRepository.findByUsername(username);

        if (member==null)
        {
            System.out.println("Member not found");
            throw new UsernameNotFoundException("No Member found!");
        }
        return member;
    }
}
