package com.sampleMail.sampleMail.Bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String mailId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Mail> inbox;

    @OneToMany
    @JsonIgnore
    private List<Mail> sent;








}
