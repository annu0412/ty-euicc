package com.whty.euicc.packets.message.request;

import com.whty.euicc.packets.message.MsgType;
/**
 * SM_SR切换请求
 * @author Administrator
 *
 */
@MsgType("srChangeSend")
public class SrChangeSendReqBody extends EuiccReqBody{
	
	private String targetSmsrId;
	
	public String getTargetSmsrId() {
		return targetSmsrId;
	}
	public void setTargetSmsrId(String targetSmsrId) {
		this.targetSmsrId = targetSmsrId;
	}
}
