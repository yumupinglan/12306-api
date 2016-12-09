package com.aishuishui.ticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.aishuishui.ticket.api.bean.LeftTicketBean;
import com.aishuishui.ticket.api.bean.LoginAysnSuggestBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TicketApi api = new TicketApi(null, true);
		try {
			System.out.println(api.obtainCookie());
			LoginAysnSuggestBean bean = api.loginAysnSuggest("aaa", "bb", "ccc");
			System.out.println(bean.getMessages());

			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, 20);
			LeftTicketBean ticket = api.queryLeftTicket(df.format(c.getTime()), "BXP", "HAN");
			System.out.println(ticket.getData().getDatas().get(0).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
