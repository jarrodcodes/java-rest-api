package com.jarrod.rampup.backendrampup.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity

public class Permission {


        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)

        private UUID id;
        private String permission;

        protected Permission() {}

        public Permission(UUID id, String role) {
            this.id = id;
            this.permission = permission;
        }

        @Override
        public String toString() {
            return String.format(
                    "Permission[id=%d, permission='%s']",
                    id, permission);
        }

    }
