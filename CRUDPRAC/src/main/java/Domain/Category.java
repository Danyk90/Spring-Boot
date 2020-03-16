package Domain;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long category_id;

    @Column(nullable = false,unique = true)
    private String categoryName;

}
