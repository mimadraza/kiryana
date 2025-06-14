package kiryana.com.example.kiryana.Entity;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue
    private int storeId;
    private String storeName;
    private String address;
    private double longitude;
    private double latitude;
    private String category;

    @ManyToOne
    private Customer owner;
}
