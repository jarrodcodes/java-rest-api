package com.jarrod.rampup.backendrampup.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;


@Entity

public class Role {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)

        private UUID id;
        private String role;

        protected Role() {}

        public Role(UUID id, String role) {
            this.id = id;
            this.role = role;
        }

        @Override
        public String toString() {
            return String.format(
                    "Role[id=%d, role='%s']",
                    id, role);
        }

}