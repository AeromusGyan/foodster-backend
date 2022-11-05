package sciaku.com.foodster.foodster.model;

import javax.persistence.*;

@Entity
public class MemberRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberRoleId;

    //Member
    @ManyToOne(fetch = FetchType.EAGER)
    private Member member;

    //Role
    @ManyToOne
    private Role role;

    public MemberRole() {
    }

    public Long getMemberRoleId() {
        return memberRoleId;
    }

    public void setMemberRoleId(Long memberRoleId) {
        this.memberRoleId = memberRoleId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
