package com.springcourse.giftme.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User //implements UserDetails {
{
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Length(min = 3, max = 30)
    private String username;
    
    @NotNull
    @Length(min = 5, max = 30)
    private String password;
    
    @NotNull
    @Length(min = 1, max = 60)
    @Column(name = "full_name")
    private String fullName;
    
    
    @NotNull
    @Email(message = "Email not valid")
    @Length(min = 9, max = 254)
    private String email;
    
    @NotNull
    @Column(name = "phone_number")
    @Length(min = 5, max = 30)
    private String phoneNumber;
    
    @NotNull private Role role;
    
    @OneToMany private List<String> notifications;
    
    //   @OneToMany private List<Long> friendshipIds;
    
    
}
