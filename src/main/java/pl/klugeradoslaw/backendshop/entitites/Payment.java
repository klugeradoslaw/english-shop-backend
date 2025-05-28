package pl.klugeradoslaw.backendshop.entitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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
