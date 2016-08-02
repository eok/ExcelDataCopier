package com.koguze.edc;
import javax.xml.bind.annotation.*;
/**
 * Created by E00741454 on 8/2/2016.
 */



@XmlRootElement //(name = "op")
public class Operation {

    private String srcfilepath     ;
    private String srcsheet        ;
    private int srcrowstart     ;
    private int srcrowend       ;
    private int srccolumnstart  ;
    private int srccolumnend    ;
    private String dstfilepath     ;
    private String dstsheet        ;
    private int dstrowstart     ;
    private int dstrowend       ;
    private int dstcolumnstart  ;
    private int dstcolumnend    ;

    @XmlElement ( name = "srcfilepath" )
    public void setSrcfilepath(String srcfilepath) {
        this.srcfilepath = srcfilepath;
    }
    @XmlElement ( name = "srcsheet" )
    public void setSrcsheet(String srcsheet) {
        this.srcsheet = srcsheet;
    }
    @XmlElement ( name = "srcrowstart" )
    public void setSrcrowstart(int srcrowstart) {
        this.srcrowstart = srcrowstart;
    }
    @XmlElement ( name = "srcrowend" )
    public void setSrcrowend(int srcrowend) {
        this.srcrowend = srcrowend;
    }
    @XmlElement ( name = "srccolumnstart" )
    public void setSrccolumnstart(int srccolumnstart) {
        this.srccolumnstart = srccolumnstart;
    }
    @XmlElement ( name = "srccolumnend" )
    public void setSrccolumnend(int srccolumnend) {
        this.srccolumnend = srccolumnend;
    }
    @XmlElement ( name = "dstfilepath" )
    public void setDstfilepath(String dstfilepath) {
        this.dstfilepath = dstfilepath;
    }
    @XmlElement ( name = "dstsheet" )
    public void setDstsheet(String dstsheet) {
        this.dstsheet = dstsheet;
    }
    @XmlElement ( name = "dstrowstart" )
    public void setDstrowstart(int dstrowstart) {
        this.dstrowstart = dstrowstart;
    }
    @XmlElement ( name = "dstrowend" )
    public void setDstrowend(int dstrowend) {
        this.dstrowend = dstrowend;
    }
    @XmlElement ( name = "dstcolumnstart" )
    public void setDstcolumnstart(int dstcolumnstart) {
        this.dstcolumnstart = dstcolumnstart;
    }
    @XmlElement ( name = "dstcolumnend" )
    public void setDstcolumnend(int dstcolumnend) {
        this.dstcolumnend = dstcolumnend;
    }
    public String getSrcfilepath() {
        return srcfilepath;
    }
    public String getSrcsheet() {
        return srcsheet;
    }
    public int getSrcrowstart() {
        return srcrowstart;
    }
    public int getSrcrowend() {
        return srcrowend;
    }

    public int getSrccolumnstart() {
        return srccolumnstart;
    }

    public int getSrccolumnend() {
        return srccolumnend;
    }

    public String getDstfilepath() {
        return dstfilepath;
    }

    public String getDstsheet() {
        return dstsheet;
    }

    public int getDstrowstart() {
        return dstrowstart;
    }

    public int getDstrowend() {
        return dstrowend;
    }

    public int getDstcolumnstart() {
        return dstcolumnstart;
    }

    public int getDstcolumnend() {
        return dstcolumnend;
    }

}
