package br.com.carloslima.todoList.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

@Data // coloca os getteres e setteres
// @Getter //coloca apenas os getteres
// @Setter //coloca apenas os setteres
@Entity(name = "tb_users")

/**
 * Se quiser apenas em um atributo, basta colocar em cima do mesmo. Por Exemplo,
 * apenas no username.
 * 
 * @Getter
 * @Setter
 *         private String username
 * 
 *         private String name
 *         private String password
 * 
 *         Dessa forma, apenas o username recebeu os parâmetros do Getter e
 *         Setter
 */

public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // public void setUsername(String username) {
    // this.username = username;
    // }

    // public String getUsername() {
    // return username;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setPassword(String password) {
    // this.password = password;
    // }

    // public String getPassword() {
    // return password;
    // }

    // Métodos getters e setters - permite que classes em private possam ser
    // acessadas
    // Getters - buscar informação
    // Setters - atualizar a informação
}
