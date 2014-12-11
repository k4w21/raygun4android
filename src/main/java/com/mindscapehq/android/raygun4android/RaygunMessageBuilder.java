package main.java.com.mindscapehq.android.raygun4android;

import android.content.Context;
import main.java.com.mindscapehq.android.raygun4android.messages.RaygunClientMessage;
import main.java.com.mindscapehq.android.raygun4android.messages.RaygunEnvironmentMessage;
import main.java.com.mindscapehq.android.raygun4android.messages.RaygunErrorMessage;
import main.java.com.mindscapehq.android.raygun4android.messages.RaygunMessage;

import java.util.List;
import java.util.Map;

public class RaygunMessageBuilder implements IRaygunMessageBuilder {

  private RaygunMessage _raygunMessage;

  public RaygunMessageBuilder()
  {
    _raygunMessage = new RaygunMessage();
  }

  public RaygunMessage Build()
  {
    return _raygunMessage;
  }

  @Override
  public IRaygunMessageBuilder SetMachineName(String machineName) {
    _raygunMessage.getDetails().setMachineName(machineName);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetExceptionDetails(Throwable throwable) {
    _raygunMessage.getDetails().setError(new RaygunErrorMessage(throwable));
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetClientDetails() {
    _raygunMessage.getDetails().setClient(new RaygunClientMessage());
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetEnvironmentDetails(Context context) {
    _raygunMessage.getDetails().setEnvironment(new RaygunEnvironmentMessage(context));
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetVersion(String version) {
    _raygunMessage.getDetails().setVersion(version);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetTags(List tags) {
    _raygunMessage.getDetails().setTags(tags);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetUserCustomData(Map userCustomData) {
    _raygunMessage.getDetails().setUserCustomData(userCustomData);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetAppContext(String identifier)
  {
    _raygunMessage.getDetails().setAppContext(identifier);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetUserContext(Context context)
  {
    _raygunMessage.getDetails().setUserContext(context);
    return this;
  }

  @Override
  public IRaygunMessageBuilder SetNetworkInfo(Context context)
  {
    _raygunMessage.getDetails().setNetworkInfo(context);
    return this;
  }

  public static RaygunMessageBuilder New() {
    return new RaygunMessageBuilder();
  }


}
