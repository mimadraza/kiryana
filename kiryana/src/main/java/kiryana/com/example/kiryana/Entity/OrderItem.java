package kiryana.com.example.kiryana.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class OrderItem {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Item item;

    private int quantity;
}
