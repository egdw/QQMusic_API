package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Music {

    private int code;
    private Data data;
    private String message;
    private String notice;
    private int subcode;
    private int time;
    private String tips;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setNotice(String notice) {
         this.notice = notice;
     }
     public String getNotice() {
         return notice;
     }

    public void setSubcode(int subcode) {
         this.subcode = subcode;
     }
     public int getSubcode() {
         return subcode;
     }

    public void setTime(int time) {
         this.time = time;
     }
     public int getTime() {
         return time;
     }

    public void setTips(String tips) {
         this.tips = tips;
     }
     public String getTips() {
         return tips;
     }
	@Override
	public String toString() {
		return "Music [code=" + code + ", data=" + data + ", message=" + message + ", notice=" + notice + ", subcode="
				+ subcode + ", time=" + time + ", tips=" + tips + "]";
	}
     
     
}