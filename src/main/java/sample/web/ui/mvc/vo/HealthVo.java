package sample.web.ui.mvc.vo;

public class HealthVo {
    private String status;

    public HealthVo() {}
    public String getHealth() {
        return status;
    }

    public void setHealth(String status) {
        this.status = status;
    }
}
