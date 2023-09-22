package com.gokey.holder.model;

import com.gokey.holder.model.Enum.Material;
import com.gokey.holder.model.Enum.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "holders")
public class holder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Type type;
    private int number;
    private Material material;
    private int order;
    private Long ml;
    private String detName;
    private LocalDateTime dateTime;
    private Long usageCount;
}




