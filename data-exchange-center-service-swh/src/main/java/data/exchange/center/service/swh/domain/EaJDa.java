package data.exchange.center.service.swh.domain;

import java.math.BigDecimal;

public class EaJDa extends EaJDaKey {
    private String xsmc;

    private String wjmc;

    private String wjgs;

    private String wjlj;

    private String ssmlbh;

    private BigDecimal sfsyzq;
    
    private String ajbs;

    private String xh;
    
    private String  sflb;
    


    public String getSflb() {
        return sflb;
    }

    public void setSflb(String sflb) {
        this.sflb = sflb;
    }

    public String getAjbs() {
        return ajbs;
    }

    public void setAjbs(String ajbs) {
        this.ajbs = ajbs == null ? null : ajbs.trim();
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getXsmc() {
        return xsmc;
    }

    public void setXsmc(String xsmc) {
        this.xsmc = xsmc == null ? null : xsmc.trim();
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc == null ? null : wjmc.trim();
    }

    public String getWjgs() {
        return wjgs;
    }

    public void setWjgs(String wjgs) {
        this.wjgs = wjgs == null ? null : wjgs.trim();
    }

    public String getWjlj() {
        return wjlj;
    }

    public void setWjlj(String wjlj) {
        this.wjlj = wjlj == null ? null : wjlj.trim();
    }

    public String getSsmlbh() {
        return ssmlbh;
    }

    public void setSsmlbh(String ssmlbh) {
        this.ssmlbh = ssmlbh == null ? null : ssmlbh.trim();
    }

    public BigDecimal getSfsyzq() {
        return sfsyzq;
    }

    public void setSfsyzq(BigDecimal sfsyzq) {
        this.sfsyzq = sfsyzq;
    }
}