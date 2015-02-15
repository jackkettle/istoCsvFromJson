package objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
	List<Club> items;

    public List<Club> getItems() {
        return items;
    }

    public void setItems(List<Club> items) {
        this.items = items;
    }
}
