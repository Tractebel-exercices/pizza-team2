package tractebel.exercice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MENUORDER")
public class MenuOrder {

    private String restaurant;
    private Integer menuItem;

    @Column(name = "RESTAURANT")
    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Column(name = "MENU_ITEM")
    public Integer getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(Integer menuItem) {
        this.menuItem = menuItem;
    }

}
