package com.kurento.kms.idl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataItem extends NamedElement {

	private TypeRef type;
	private boolean optional;

	public DataItem(String name, Doc doc, TypeRef type, boolean optional) {
		super(name, doc);
		this.type = type;
		this.optional = optional;
	}

	public TypeRef getType() {
		return type;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	public void setType(TypeRef type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (optional ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataItem other = (DataItem) obj;
		if (optional != other.optional)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public List<ModelElement> getChildren() {
		return new ArrayList<ModelElement>(Arrays.asList(type));
	}
	
}
