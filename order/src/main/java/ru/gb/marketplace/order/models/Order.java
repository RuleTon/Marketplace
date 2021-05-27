package ru.gb.marketplace.order.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @OneToMany(mappedBy = "order")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<ru.gb.marketplace.order.models.OrderItem> items;

    @Column(name = "address")
    private String address;

    @Column(name = "price")
    private int price;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Order(ru.gb.marketplace.order.models.Cart cart, Long userId, String address) {
        this.items = new ArrayList<>();
        this.userId = userId;
        this.address = address;
        this.price = cart.getPrice();
        for (ru.gb.marketplace.order.models.CartItem ci : cart.getItems()) {
            ru.gb.marketplace.order.models.OrderItem oi = new ru.gb.marketplace.order.models.OrderItem(ci);
            oi.setOrder(this);
            this.items.add(oi);
        }
    }

}
