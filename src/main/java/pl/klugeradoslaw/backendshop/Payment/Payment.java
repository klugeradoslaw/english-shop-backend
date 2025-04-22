package pl.klugeradoslaw.backendshop.Order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.klugeradoslaw.backendshop.OrderItem.OrderItem;
import pl.klugeradoslaw.backendshop.Payment.PaymentStatus;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Order order;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private double amount;
    private String paymentMethod; // np. "Stripe" a może blik itp.
    private String externalPaymentId; // ID transakcji w Stripe
    private LocalDateTime paymentDate;
}
