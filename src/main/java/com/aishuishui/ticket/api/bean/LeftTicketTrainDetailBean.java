package com.aishuishui.ticket.api.bean;

public class LeftTicketTrainDetailBean {
	private String train_no; // 列车编号
	private String station_train_code; // 车次
	private String start_station_telecode; // 始发站编码
	private String start_station_name; // 始发站名
	private String end_station_telecode; // 终到站编码
	private String end_station_name; // 终到站名
	private String from_station_telecode; // 查询输入经过站编码
	private String from_station_name; // 查询输入经过站名
	private String to_station_telecode; // 查询输入到站编码
	private String to_station_name; // 查询输入到站名
	private String start_time; // 出发时间
	private String arrive_time; // 到站时间
	private String day_difference; // 花费天数
	private String train_class_name;
	private String lishi; // 历时
	private String canWebBuy; // 是否可以预定
	private String lishiValue;
	private String yp_info;
	private String control_train_day;
	private String start_train_date;
	private String seat_feature;
	private String yp_ex;
	private String train_seat_feature;
	private String seat_types;
	private String location_code;
	private String from_station_no;
	private String to_station_no;
	private int control_day;
	private String sale_time; // 出票时间点hhmm
	private String is_support_card;
	private String note;
	private String controlled_train_flag;
	private String controlled_train_message;
	private String gg_num;
	private String gr_num; // 高级软卧座剩余数
	private String qt_num; // 其他座剩余数
	private String rw_num; // 软卧座剩余数
	private String rz_num; // 软座座剩余数
	private String tz_num; // 特等座剩余数
	private String wz_num; // 无座座剩余数
	private String yb_num;
	private String yw_num; // 硬卧座剩余数
	private String yz_num;// 硬座座剩余数
	private String ze_num;// 二等座剩余数
	private String zy_num;// 一等座剩余数
	private String swz_num; // 商务座剩余数

	public LeftTicketTrainDetailBean() {
		super();
	}

	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	public String getStation_train_code() {
		return station_train_code;
	}

	public void setStation_train_code(String station_train_code) {
		this.station_train_code = station_train_code;
	}

	public String getStart_station_telecode() {
		return start_station_telecode;
	}

	public void setStart_station_telecode(String start_station_telecode) {
		this.start_station_telecode = start_station_telecode;
	}

	public String getStart_station_name() {
		return start_station_name;
	}

	public void setStart_station_name(String start_station_name) {
		this.start_station_name = start_station_name;
	}

	public String getEnd_station_telecode() {
		return end_station_telecode;
	}

	public void setEnd_station_telecode(String end_station_telecode) {
		this.end_station_telecode = end_station_telecode;
	}

	public String getEnd_station_name() {
		return end_station_name;
	}

	public void setEnd_station_name(String end_station_name) {
		this.end_station_name = end_station_name;
	}

	public String getFrom_station_telecode() {
		return from_station_telecode;
	}

	public void setFrom_station_telecode(String from_station_telecode) {
		this.from_station_telecode = from_station_telecode;
	}

	public String getFrom_station_name() {
		return from_station_name;
	}

	public void setFrom_station_name(String from_station_name) {
		this.from_station_name = from_station_name;
	}

	public String getTo_station_telecode() {
		return to_station_telecode;
	}

	public void setTo_station_telecode(String to_station_telecode) {
		this.to_station_telecode = to_station_telecode;
	}

	public String getTo_station_name() {
		return to_station_name;
	}

	public void setTo_station_name(String to_station_name) {
		this.to_station_name = to_station_name;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getArrive_time() {
		return arrive_time;
	}

	public void setArrive_time(String arrive_time) {
		this.arrive_time = arrive_time;
	}

	public String getDay_difference() {
		return day_difference;
	}

	public void setDay_difference(String day_difference) {
		this.day_difference = day_difference;
	}

	public String getTrain_class_name() {
		return train_class_name;
	}

	public void setTrain_class_name(String train_class_name) {
		this.train_class_name = train_class_name;
	}

	public String getLishi() {
		return lishi;
	}

	public void setLishi(String lishi) {
		this.lishi = lishi;
	}

	public String getCanWebBuy() {
		return canWebBuy;
	}

	public void setCanWebBuy(String canWebBuy) {
		this.canWebBuy = canWebBuy;
	}

	public String getLishiValue() {
		return lishiValue;
	}

	public void setLishiValue(String lishiValue) {
		this.lishiValue = lishiValue;
	}

	public String getYp_info() {
		return yp_info;
	}

	public void setYp_info(String yp_info) {
		this.yp_info = yp_info;
	}

	public String getControl_train_day() {
		return control_train_day;
	}

	public void setControl_train_day(String control_train_day) {
		this.control_train_day = control_train_day;
	}

	public String getStart_train_date() {
		return start_train_date;
	}

	public void setStart_train_date(String start_train_date) {
		this.start_train_date = start_train_date;
	}

	public String getSeat_feature() {
		return seat_feature;
	}

	public void setSeat_feature(String seat_feature) {
		this.seat_feature = seat_feature;
	}

	public String getYp_ex() {
		return yp_ex;
	}

	public void setYp_ex(String yp_ex) {
		this.yp_ex = yp_ex;
	}

	public String getTrain_seat_feature() {
		return train_seat_feature;
	}

	public void setTrain_seat_feature(String train_seat_feature) {
		this.train_seat_feature = train_seat_feature;
	}

	public String getSeat_types() {
		return seat_types;
	}

	public void setSeat_types(String seat_types) {
		this.seat_types = seat_types;
	}

	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}

	public String getFrom_station_no() {
		return from_station_no;
	}

	public void setFrom_station_no(String from_station_no) {
		this.from_station_no = from_station_no;
	}

	public String getTo_station_no() {
		return to_station_no;
	}

	public void setTo_station_no(String to_station_no) {
		this.to_station_no = to_station_no;
	}

	public int getControl_day() {
		return control_day;
	}

	public void setControl_day(int control_day) {
		this.control_day = control_day;
	}

	public String getSale_time() {
		return sale_time;
	}

	public void setSale_time(String sale_time) {
		this.sale_time = sale_time;
	}

	public String getIs_support_card() {
		return is_support_card;
	}

	public void setIs_support_card(String is_support_card) {
		this.is_support_card = is_support_card;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getControlled_train_flag() {
		return controlled_train_flag;
	}

	public void setControlled_train_flag(String controlled_train_flag) {
		this.controlled_train_flag = controlled_train_flag;
	}

	public String getControlled_train_message() {
		return controlled_train_message;
	}

	public void setControlled_train_message(String controlled_train_message) {
		this.controlled_train_message = controlled_train_message;
	}

	public String getGg_num() {
		return gg_num;
	}

	public void setGg_num(String gg_num) {
		this.gg_num = gg_num;
	}

	public String getGr_num() {
		return gr_num;
	}

	public void setGr_num(String gr_num) {
		this.gr_num = gr_num;
	}

	public String getQt_num() {
		return qt_num;
	}

	public void setQt_num(String qt_num) {
		this.qt_num = qt_num;
	}

	public String getRw_num() {
		return rw_num;
	}

	public void setRw_num(String rw_num) {
		this.rw_num = rw_num;
	}

	public String getRz_num() {
		return rz_num;
	}

	public void setRz_num(String rz_num) {
		this.rz_num = rz_num;
	}

	public String getTz_num() {
		return tz_num;
	}

	public void setTz_num(String tz_num) {
		this.tz_num = tz_num;
	}

	public String getWz_num() {
		return wz_num;
	}

	public void setWz_num(String wz_num) {
		this.wz_num = wz_num;
	}

	public String getYb_num() {
		return yb_num;
	}

	public void setYb_num(String yb_num) {
		this.yb_num = yb_num;
	}

	public String getYw_num() {
		return yw_num;
	}

	public void setYw_num(String yw_num) {
		this.yw_num = yw_num;
	}

	public String getYz_num() {
		return yz_num;
	}

	public void setYz_num(String yz_num) {
		this.yz_num = yz_num;
	}

	public String getZe_num() {
		return ze_num;
	}

	public void setZe_num(String ze_num) {
		this.ze_num = ze_num;
	}

	public String getZy_num() {
		return zy_num;
	}

	public void setZy_num(String zy_num) {
		this.zy_num = zy_num;
	}

	public String getSwz_num() {
		return swz_num;
	}

	public void setSwz_num(String swz_num) {
		this.swz_num = swz_num;
	}

	@Override
	public String toString() {
		return "LeftTicketTrainDetailBean [train_no=" + train_no + ", station_train_code=" + station_train_code + ", start_station_telecode=" + start_station_telecode + ", start_station_name=" + start_station_name + ", end_station_telecode=" + end_station_telecode
				+ ", end_station_name=" + end_station_name + ", from_station_telecode=" + from_station_telecode + ", from_station_name=" + from_station_name + ", to_station_telecode=" + to_station_telecode + ", to_station_name=" + to_station_name + ", start_time=" + start_time
				+ ", arrive_time=" + arrive_time + ", day_difference=" + day_difference + ", train_class_name=" + train_class_name + ", lishi=" + lishi + ", canWebBuy=" + canWebBuy + ", lishiValue=" + lishiValue + ", yp_info=" + yp_info + ", control_train_day="
				+ control_train_day + ", start_train_date=" + start_train_date + ", seat_feature=" + seat_feature + ", yp_ex=" + yp_ex + ", train_seat_feature=" + train_seat_feature + ", seat_types=" + seat_types + ", location_code=" + location_code + ", from_station_no="
				+ from_station_no + ", to_station_no=" + to_station_no + ", control_day=" + control_day + ", sale_time=" + sale_time + ", is_support_card=" + is_support_card + ", note=" + note + ", controlled_train_flag=" + controlled_train_flag + ", controlled_train_message="
				+ controlled_train_message + ", gg_num=" + gg_num + ", gr_num=" + gr_num + ", qt_num=" + qt_num + ", rw_num=" + rw_num + ", rz_num=" + rz_num + ", tz_num=" + tz_num + ", wz_num=" + wz_num + ", yb_num=" + yb_num + ", yw_num=" + yw_num + ", yz_num=" + yz_num
				+ ", ze_num=" + ze_num + ", zy_num=" + zy_num + ", swz_num=" + swz_num + "]";
	}

}
