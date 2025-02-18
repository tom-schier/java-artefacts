package au.org.consumerdatastandards.holder.model.energy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a tariff based on time.  Mandatory if tariffUType is set to timeVaryingTariffs
 */
@ApiModel(description = "Represents a tariff based on time.  Mandatory if tariffUType is set to timeVaryingTariffs")
@Entity
public class EnergyPlanContractTimeVaryingTariffs {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @JsonIgnore
    private String id;

    /**
     * The type of the charging time period. If absent applies to all periods
     */
    public enum TypeEnum {
        PEAK,
        OFF_PEAK,
        SHOULDER
    }

    private TypeEnum type;

    private String amount;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    private List<EnergyPlanContractTimeVaryingTariffsTimeVariations> timeVariations = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnergyPlanContractTimeVaryingTariffs type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the charging time period. If absent applies to all periods
     *
     * @return type
     */
    @ApiModelProperty(value = "The type of the charging time period. If absent applies to all periods")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EnergyPlanContractTimeVaryingTariffs amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The tariff amount
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "The tariff amount")
    @NotNull
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public EnergyPlanContractTimeVaryingTariffs timeVariations(List<EnergyPlanContractTimeVaryingTariffsTimeVariations> timeVariations) {
        this.timeVariations = timeVariations;
        return this;
    }

    public EnergyPlanContractTimeVaryingTariffs addTimeVariationsItem(EnergyPlanContractTimeVaryingTariffsTimeVariations timeVariationsItem) {
        this.timeVariations.add(timeVariationsItem);
        return this;
    }

    /**
     * Array of time periods for which this tariff is applicable
     *
     * @return timeVariations
     */
    @ApiModelProperty(required = true, value = "Array of time periods for which this tariff is applicable")
    @NotNull
    @Valid
    public List<EnergyPlanContractTimeVaryingTariffsTimeVariations> getTimeVariations() {
        return timeVariations;
    }

    public void setTimeVariations(List<EnergyPlanContractTimeVaryingTariffsTimeVariations> timeVariations) {
        this.timeVariations = timeVariations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyPlanContractTimeVaryingTariffs energyPlanContractTimeVaryingTariffs = (EnergyPlanContractTimeVaryingTariffs) o;
        return Objects.equals(this.type, energyPlanContractTimeVaryingTariffs.type) &&
                Objects.equals(this.amount, energyPlanContractTimeVaryingTariffs.amount) &&
                Objects.equals(this.timeVariations, energyPlanContractTimeVaryingTariffs.timeVariations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount, timeVariations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyPlanContractTimeVaryingTariffs {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    timeVariations: ").append(toIndentedString(timeVariations)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
