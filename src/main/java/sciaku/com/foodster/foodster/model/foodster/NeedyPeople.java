package sciaku.com.foodster.foodster.model.foodster;

import javax.persistence.*;

@Entity
@Table(name = "needy_family")
public class NeedyPeople {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_of_needy_people;

    private String contact;

    private String address;

    private String city;

    private String no_of_person;

    private String pincode;

    private String date_of_joining;

    private String drop_of_location;

    private String description;

    private String image;

    private Boolean status = true;

    public NeedyPeople() {
    }

    public NeedyPeople(Long id, String name_of_needy_people, String contact, String address, String city, String no_of_person, String pincode, String date_of_joining, String drop_of_location, String description, String image, Boolean status) {
        this.id = id;
        this.name_of_needy_people = name_of_needy_people;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.no_of_person = no_of_person;
        this.pincode = pincode;
        this.date_of_joining = date_of_joining;
        this.drop_of_location = drop_of_location;
        this.description = description;
        this.image = image;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_of_needy_people() {
        return name_of_needy_people;
    }

    public void setName_of_needy_people(String name_of_needy_people) {
        this.name_of_needy_people = name_of_needy_people;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNo_of_person() {
        return no_of_person;
    }

    public void setNo_of_person(String no_of_person) {
        this.no_of_person = no_of_person;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDrop_of_location() {
        return drop_of_location;
    }

    public void setDrop_of_location(String drop_of_location) {
        this.drop_of_location = drop_of_location;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NeedyPeople{" +
                "id=" + id +
                ", name_of_needy_people='" + name_of_needy_people + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", no_of_person='" + no_of_person + '\'' +
                ", pincode='" + pincode + '\'' +
                ", date_of_joining='" + date_of_joining + '\'' +
                ", drop_of_location='" + drop_of_location + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", status=" + status +
                '}';
    }
}
