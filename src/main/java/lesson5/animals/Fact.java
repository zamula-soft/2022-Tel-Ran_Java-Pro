package lesson5.animals;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fact {
    //делаем классы
    // https://www.jsonschema2pojo.org/

    @SerializedName("status")
    @Expose
    private Status status;

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    @SerializedName("createdAt")
    @Expose
    private String createdAt;

    @SerializedName("user")
    @Expose
    private String user;

    @SerializedName("text")
    @Expose
    private String text;

    public Fact(Status status, String id, String updatedAt, String createdAt, String user, String text) {
        this.status = status;
        this.id = id;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.user = user;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Status getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUser() {
        return user;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
