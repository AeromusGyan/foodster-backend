package sciaku.com.foodster.foodster.model.foodster;

import sciaku.com.foodster.foodster.model.Member;

import javax.persistence.*;

@Entity
@Table(name = "donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String no_of_food;

    private String name_of_food;

    private String food_description;

    private String quantity;

    private String image;

    private String pick_up_location;

    private String date_of_donation;

    private Boolean status;

    private Boolean terms_condition;

    @ManyToOne(fetch = FetchType.EAGER)
    private Member member;

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", no_of_food='" + no_of_food + '\'' +
                ", name_of_food='" + name_of_food + '\'' +
                ", food_description='" + food_description + '\'' +
                ", quantity='" + quantity + '\'' +
                ", image='" + image + '\'' +
                ", pick_up_location='" + pick_up_location + '\'' +
                ", date_of_donation='" + date_of_donation + '\'' +
                ", status=" + status +
                ", terms_condition=" + terms_condition +
                ", member=" + member +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo_of_food() {
        return no_of_food;
    }

    public void setNo_of_food(String no_of_food) {
        this.no_of_food = no_of_food;
    }

    public String getName_of_food() {
        return name_of_food;
    }

    public void setName_of_food(String name_of_food) {
        this.name_of_food = name_of_food;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPick_up_location() {
        return pick_up_location;
    }

    public void setPick_up_location(String pick_up_location) {
        this.pick_up_location = pick_up_location;
    }

    public String getDate_of_donation() {
        return date_of_donation;
    }

    public void setDate_of_donation(String date_of_donation) {
        this.date_of_donation = date_of_donation;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getTerms_condition() {
        return terms_condition;
    }

    public void setTerms_condition(Boolean terms_condition) {
        this.terms_condition = terms_condition;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Donation(Long id, String no_of_food, String name_of_food, String food_description, String quantity, String image, String pick_up_location, String date_of_donation, Boolean status, Boolean terms_condition, Member member) {
        this.id = id;
        this.no_of_food = no_of_food;
        this.name_of_food = name_of_food;
        this.food_description = food_description;
        this.quantity = quantity;
        this.image = image;
        this.pick_up_location = pick_up_location;
        this.date_of_donation = date_of_donation;
        this.status = status;
        this.terms_condition = terms_condition;
        this.member = member;
    }

    public Donation() {
    }
}
