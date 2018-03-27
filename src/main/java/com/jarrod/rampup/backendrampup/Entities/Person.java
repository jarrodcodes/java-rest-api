package com.jarrod.rampup.backendrampup.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    @Entity
    public class Person {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;
        private String email;

        protected Person() {}

        public Person(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format(
                    "Person[id=%d, firstName='%s', lastName='%s']",
                    id, firstName, lastName);
        }

}
