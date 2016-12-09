package com.aishuishui.ticket.api.bean;

import java.util.List;

public class LeftTicketDataBean {
	private List<LeftTicketTrainDetailBean> datas;
	private boolean flag;
	private String searchDate;

	public LeftTicketDataBean() {
		super();
	}

	public List<LeftTicketTrainDetailBean> getDatas() {
		return datas;
	}

	public void setDatas(List<LeftTicketTrainDetailBean> datas) {
		this.datas = datas;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}

}
