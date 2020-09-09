package com.springcourse.giftme.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gifts")
public class Gift {
    @Id
    @NotNull
    @GeneratedValue
    private long id;
    
    @NotNull
    @NotBlank
    @Length(min = 5, max = 80)
    private String title;
    
    @NotNull
    @Length(min = 10, max = 150)
    private String info;
    
    @OneToOne
    @NotNull
    @NotBlank
    @Column(name = "owner_id")
    private long ownerId;
    
    @OneToOne
    @Column(name="taker_id")
    private long takerId;
    
    /*
    @OneToOne
    @NotNull
    @NotBlank
    private Image image; */
    
    @Column(name="creation_date")
    @CreationTimestamp
    private Date creationTime;
    
    @Column(name="is_group_post")
    private boolean isGroupPost;
    
    @OneToOne
    @Column(name = "group_name")
    private String groupName;
    
}
