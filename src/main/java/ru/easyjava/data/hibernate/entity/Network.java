package ru.easyjava.data.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import ru.easyjava.data.hibernate.type.NetworkObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Network storing entity.
 */
@SuppressWarnings("PMD")
@Entity
@ToString
public class Network {
    /**
     * Entity id.
     */
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    /**
     * Network data.
     */
    @Type(type = "ru.easyjava.data.hibernate.type.NetworkObjectType")
    @Getter
    @Setter
    private NetworkObject network;
}
