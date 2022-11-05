package sciaku.com.foodster.foodster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sciaku.com.foodster.foodster.helper.UserFoundException;
import sciaku.com.foodster.foodster.model.Member;
import sciaku.com.foodster.foodster.model.MemberRole;
import sciaku.com.foodster.foodster.model.Role;
import sciaku.com.foodster.foodster.services.MemberService;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/test")
    public String test(){
        return "Welcome to foodster";
    }

    @PostMapping("/")
    public Member createMember(@RequestBody Member member) throws Exception {
//      encoding password by bcrypt
        member.setPassword(this.bCryptPasswordEncoder.encode(member.getPassword()));
        Set<MemberRole> roles= new HashSet<>();
        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");
//
        MemberRole memberRole = new MemberRole();
        memberRole.setMember(member);
        memberRole.setRole(role);
        roles.add(memberRole);
        return  this.memberService.createMember(member,roles);
    }
    @GetMapping("/{username}")
    public Member getMember(@PathVariable("username") String username)
    {
        return this.memberService.getMember(username);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllMember()
    {
        return ResponseEntity.ok(this.memberService.getAllMember());
    }

    @ExceptionHandler(UserFoundException.class)
    public UserFoundException exceptionHandler(UserFoundException e){
        return e;
    }
}
