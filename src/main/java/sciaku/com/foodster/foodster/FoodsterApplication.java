package sciaku.com.foodster.foodster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sciaku.com.foodster.foodster.helper.UserFoundException;
import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.model.MemberRole;
import sciaku.com.foodster.foodster.model.Role;
import sciaku.com.foodster.foodster.services.MemberService;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class FoodsterApplication implements CommandLineRunner {

	@Autowired
	private MemberService memberService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FoodsterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started...9090");
//		try
//		{
//		Member member = new Member();
//		member.setUsername("foodster");
//		member.setFirstname("Gyan");
//		member.setLastname("Prakash");
//		member.setEmail("foodster0@gmail.com");
//		member.setPassword(this.bCryptPasswordEncoder.encode("15nov2002"));
//		member.setProfile("default.jpg");
//		member.setContact("7985079740");
//		member.setCity("Lucknow");
//		member.setStatus(true);
//
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<MemberRole> memberRoleSet=new HashSet<>();
//
//		MemberRole memberRole = new MemberRole();
//		memberRole.setRole(role1);
//		memberRole.setMember(member);
//
//		memberRoleSet.add(memberRole);
//
//		Member member1 = this.memberService.createMember(member, memberRoleSet);
//
//		System.out.println(member1.getUsername());
//		}catch (UserFoundException e){
//			e.printStackTrace();
//		}
	}
}
