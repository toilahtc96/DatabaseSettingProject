package com.ezy.databasesetting.entitiy;

import lombok.*;

import javax.persistence.*;

@Table(name = "database_list")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DatabaseList {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "meaning")
    private String meaning;
}
