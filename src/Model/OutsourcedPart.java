package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ayindewilliams
 */
public class OutsourcedPart extends Part {

    private final StringProperty companyName;
    public OutsourcedPart() {
        super();
        companyName = new SimpleStringProperty();
    }

    public void setPartCompanyName(String companyName) {
        this.companyName.set(companyName);
    }

    public String getPartCompanyName() {
        return this.companyName.get();
    }
}