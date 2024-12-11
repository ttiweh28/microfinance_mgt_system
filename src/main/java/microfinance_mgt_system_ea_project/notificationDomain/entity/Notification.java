package microfinance_mgt_system_ea_project.notificationDomain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import microfinance_mgt_system_ea_project.entity.User;

import java.util.Date;

@Entity
public class Notification {
    @Id@GeneratedValue
    private int id;

    private String message;
    private Date notificationDate;
    @Transient
    private User user;

    protected Notification() {}
    public Notification(String message, Date notificationDate, User user) {
        this.message = message;
        this.notificationDate = notificationDate;
        this.user = user;
    }
    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
