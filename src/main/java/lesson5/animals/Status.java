package lesson5.animals;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("verified")
    @Expose
    private Boolean verified;

    @SerializedName("sentCount")
    @Expose
    private Integer sentCount;

    public Boolean getVerified(){
        return verified;
    }

    public void setVerified(Boolean verified){
        this.verified = verified;
    }
    public Integer getSentCount() {
        return sentCount;
    }

    public void setSentCount(Integer sentCount){
        this.sentCount = sentCount;
    }


}

