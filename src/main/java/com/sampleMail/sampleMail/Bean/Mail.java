package com.sampleMail.sampleMail.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mail {

    @Id
    private String senderMailId;

    @Embedded
    private List<String> reciever = new ArrayList<>();

    private String msg;

}
