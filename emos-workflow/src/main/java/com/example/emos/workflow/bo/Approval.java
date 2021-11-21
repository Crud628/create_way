package com.example.emos.workflow.bo;

import com.example.emos.workflow.controller.form.DeleteProcessByIdForm;

public class Approval {
	public String getTitle() {
		return this.title;
	}

	private String taskId;

	private String createDate;

	private boolean filing;

	private String title;

	private String processId;

	private String status;

	private String creatorName;

	private String result;

	private String type;

	public String getResult() {
		return this.result;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public String getCreatorName() {
		return this.creatorName;
	}

	public String getType() {
		return this.type;
	}

	public String getProcessId() {
		return this.processId;
	}

	public String getStatus() {
		return this.status;
	}

	public boolean isFiling() {
		return this.filing;
	}

	public void setFiling(int i) {
		this.filing = i;
	}

	public void setResult(String str) {
		this.result = str;
	}

	public void setTaskId(String str) {
		this.taskId = str;
	}

	public void setStatus(String str) {
		this.status = str;
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;
		if (!(object instanceof com.example.emos.workflow.bo.Approval))
			return false;
		if (!(object = object).canEqual(this))
			return false;
		if (isFiling() != object.isFiling())
			return false;
		String str1 = getProcessId(), str2 = object.getProcessId();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getTaskId();
		str2 = object.getTaskId();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getTitle();
		str2 = object.getTitle();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getType();
		str2 = object.getType();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getCreatorName();
		str2 = object.getCreatorName();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getCreateDate();
		str2 = object.getCreateDate();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getStatus();
		str2 = object.getStatus();
		if ((str1 == null) ? (str2 != null) : !str1.equals(str2))
			return false;
		str1 = getResult();
		object = object.getResult();
		return !((str1 == null) ? (object != null) : !str1.equals(object));
	}

	public int hashCode() {
		int i = 59;
		i = (i = 1) * 59 + (isFiling() ? 79 : 97);
		String str = getProcessId();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getTaskId();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getTitle();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getType();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getCreatorName();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getCreateDate();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getStatus();
		i = i * 59 + ((str == null) ? 43 : str.hashCode());
		str = getResult();
		return i = i * 59 + ((str == null) ? 43 : str.hashCode());
	}

	public void setCreatorName(String str) {
		this.creatorName = str;
	}

	public void setProcessId(String str) {
		this.processId = str;
	}

	public String toString() {
		return (new StringBuilder()).insert(0, TbLeave.ALLATORIxDEMO("-R\034P\003T\rNDR\036M\017G\037Q%FQ"))
				.append(getProcessId()).append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\005\007\002\r8\002L"))
				.append(getTaskId()).append(TbLeave.ALLATORIxDEMO("\016LV\005V\000GQ")).append(getTitle())
				.append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\005\037\001\003L")).append(getType())
				.append(TbLeave.ALLATORIxDEMO("\016LA\036G\rV\003P\"C\001GQ")).append(getCreatorName())
				.append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\022\024\024\007\005\0035\007\005\003L"))
				.append(getCreateDate()).append(TbLeave.ALLATORIxDEMO("@\002\037V\rV\031QQ")).append(getStatus())
				.append(DeleteProcessByIdForm.ALLATORIxDEMO("]F\003\003\002\023\035\022L")).append(getResult())
				.append(TbLeave.ALLATORIxDEMO("@\002\nK\000K\002EQ")).append(isFiling())
				.append(DeleteProcessByIdForm.ALLATORIxDEMO("X")).toString();
	}

	public void setType(String str) {
		this.type = str;
	}

	public void setCreateDate(String str) {
		this.createDate = str;
	}

	protected boolean canEqual(Object object) {
		return object instanceof com.example.emos.workflow.bo.Approval;
	}

	public void setTitle(String str) {
		this.title = str;
	}

	public String getTaskId() {
		return this.taskId;
	}
}
