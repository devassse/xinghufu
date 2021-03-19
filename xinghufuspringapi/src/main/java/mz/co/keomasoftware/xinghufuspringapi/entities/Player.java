package mz.co.keomasoftware.xinghufuspringapi.entities;

public class Player {
    private long id;
    private String nickname;
    private String profile_pic;
    private String height;
    private String weight;
    private String power;
    private String speed;
    private long person_id;
    private long team_id;
    private long status;
    private String created_at;
    private String updated_at;

    public Player(){
    }

    public Player(long id, String nickname, String profile_pic, String height, String weight, String power, String speed, long person_id, long team_id, long status, String created_at, String updated_at) {
        this.id = id;
        this.nickname = nickname;
        this.profile_pic = profile_pic;
        this.height = height;
        this.weight = weight;
        this.power = power;
        this.speed = speed;
        this.person_id = person_id;
        this.team_id = team_id;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(long team_id) {
        this.team_id = team_id;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
