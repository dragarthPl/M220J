package mflix.api.models;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Session extends AbstractSession {

  @BsonProperty(value = "user_id")
  private String userId;

  private String jwt;

  public Session() {
    super();
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  public Session withNewId() {
    setId(new ObjectId().toHexString());
    return this;
  }
}
