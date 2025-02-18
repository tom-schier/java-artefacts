package au.org.consumerdatastandards.holder.model.energy;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnergyAccountDetailAllOfPlans
 */
public class EnergyAccountDetailPlans {
    private String nickname;

    @Valid
    private List<String> servicePointIds = new ArrayList<>();

    private EnergyAccountPlanOverview planOverview;

    private EnergyAccountDetailPlanDetail planDetail;

    @Valid
    private List<EnergyAccountDetailAuthorisedContacts> authorisedContacts = null;

    public EnergyAccountDetailPlans nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * Optional display name for the plan provided by the customer to help differentiate multiple plans
     *
     * @return nickname
     */
    @ApiModelProperty(value = "Optional display name for the plan provided by the customer to help differentiate multiple plans")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public EnergyAccountDetailPlans servicePointIds(List<String> servicePointIds) {
        this.servicePointIds = servicePointIds;
        return this;
    }

    public EnergyAccountDetailPlans addServicePointIdsItem(String servicePointIdsItem) {
        this.servicePointIds.add(servicePointIdsItem);
        return this;
    }

    /**
     * An array of servicePointIds, representing NMIs, that this account is linked to
     *
     * @return servicePointIds
     */
    @ApiModelProperty(required = true,
            value = "An array of servicePointIds, representing NMIs, that this account is linked to")
    @NotNull
    public List<String> getServicePointIds() {
        return servicePointIds;
    }

    public void setServicePointIds(List<String> servicePointIds) {
        this.servicePointIds = servicePointIds;
    }

    public EnergyAccountDetailPlans planOverview(EnergyAccountPlanOverview planOverview) {
        this.planOverview = planOverview;
        return this;
    }

    /**
     * Get planOverview
     *
     * @return planOverview
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public EnergyAccountPlanOverview getPlanOverview() {
        return planOverview;
    }

    public void setPlanOverview(EnergyAccountPlanOverview planOverview) {
        this.planOverview = planOverview;
    }

    public EnergyAccountDetailPlans planDetail(EnergyAccountDetailPlanDetail planDetail) {
        this.planDetail = planDetail;
        return this;
    }

    /**
     * Get planDetail
     *
     * @return planDetail
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public EnergyAccountDetailPlanDetail getPlanDetail() {
        return planDetail;
    }

    public void setPlanDetail(EnergyAccountDetailPlanDetail planDetail) {
        this.planDetail = planDetail;
    }

    public EnergyAccountDetailPlans authorisedContacts(List<EnergyAccountDetailAuthorisedContacts> authorisedContacts) {
        this.authorisedContacts = authorisedContacts;
        return this;
    }

    public EnergyAccountDetailPlans addAuthorisedContactsItem(EnergyAccountDetailAuthorisedContacts authorisedContactsItem) {
        if (this.authorisedContacts == null) {
            this.authorisedContacts = new ArrayList<>();
        }
        this.authorisedContacts.add(authorisedContactsItem);
        return this;
    }

    /**
     * An array of additional contacts that are authorised to act on this account
     *
     * @return authorisedContacts
     */
    @ApiModelProperty(value = "An array of additional contacts that are authorised to act on this account")
    @Valid
    public List<EnergyAccountDetailAuthorisedContacts> getAuthorisedContacts() {
        return authorisedContacts;
    }

    public void setAuthorisedContacts(List<EnergyAccountDetailAuthorisedContacts> authorisedContacts) {
        this.authorisedContacts = authorisedContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnergyAccountDetailPlans energyAccountDetailPlans = (EnergyAccountDetailPlans) o;
        return Objects.equals(this.nickname, energyAccountDetailPlans.nickname) &&
                Objects.equals(this.servicePointIds, energyAccountDetailPlans.servicePointIds) &&
                Objects.equals(this.planOverview, energyAccountDetailPlans.planOverview) &&
                Objects.equals(this.planDetail, energyAccountDetailPlans.planDetail) &&
                Objects.equals(this.authorisedContacts, energyAccountDetailPlans.authorisedContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, servicePointIds, planOverview, planDetail, authorisedContacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnergyAccountDetailAllOfPlans {\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    servicePointIds: ").append(toIndentedString(servicePointIds)).append("\n");
        sb.append("    planOverview: ").append(toIndentedString(planOverview)).append("\n");
        sb.append("    planDetail: ").append(toIndentedString(planDetail)).append("\n");
        sb.append("    authorisedContacts: ").append(toIndentedString(authorisedContacts)).append("\n");
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
