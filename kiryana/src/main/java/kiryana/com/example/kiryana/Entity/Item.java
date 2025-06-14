package kiryana.com.example.kiryana.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor 
public class Item 
{
    @Id
    @GeneratedValue
    private int itemId;
    private String itemName;
    private String description;
    private Double price;
    private String imageUrl;

    @ManyToOne
    private Store store;
}
