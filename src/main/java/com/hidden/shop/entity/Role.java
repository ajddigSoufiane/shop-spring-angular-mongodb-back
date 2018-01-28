package com.hidden.shop.entity;

import org.bson.types.ObjectId;
//import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;


@Document
public class Role implements Serializable {

	@Id
	private ObjectId _id_role;

	private String rolename;
    
    private Set<User> userRoles;

    
    
    public Role(String rolename, Set<User> userRoles) {
		super();
		this.rolename = rolename;
		this.userRoles = userRoles;
	}

	public Role() {
		super();
	}

	public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Set<User> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<User> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return String.format("%s(id=%d, rolename='%s')",
                this.getClass().getSimpleName(),
                this.get_id_role(), this.getRolename());
    }
    public ObjectId get_id_role() {
		return _id_role;
	}

	public void set_id_role(ObjectId _id_role) {
		this._id_role = _id_role;
	}

   /* @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;

        if (o instanceof Role) {
            final Role other = (Role) o;
            return Objects.equal(getId(), other.getId())
                    && Objects.equal(getRolename(), other.getRolename());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getRolename());
    }*/
}
