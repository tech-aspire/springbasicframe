/**
 * 
 */
package com.aspire.location.numberlocation.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author bikeda
 *
 */
public class SectionLocationVersion implements Serializable,Comparable<SectionLocationVersion> {
	private static final long serialVersionUID = 1L;

	private long version;
    private String remark;
    private Date createtime;
    private int isavailable;
    public int getIsavailable() {
        return isavailable;
    }
    public void setIsavailable(int isavailable) {
        this.isavailable = isavailable;
    }
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "SectionLocationVersion [version=" + version + ", remark=" + remark + ", createtime=" + createtime
                + ", isavailable=" + isavailable + "]";
    }
    @Override
    public int compareTo(SectionLocationVersion o) {
        
        return this.getCreatetime().compareTo(o.getCreatetime());
    }
	
}
