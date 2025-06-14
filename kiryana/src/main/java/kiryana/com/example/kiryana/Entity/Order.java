package kiryana.com.example.kiryana.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "orders") 
public class Order {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime orderTime;
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Store store;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    private String deliveryAddress;
    private Double deliveryLat;
    private Double deliveryLon;
}

