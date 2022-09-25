package jpabook.jpashop.domain;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
public class Delivery extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;
}
