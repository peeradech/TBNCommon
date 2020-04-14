package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(tbncommon.actions.FormatDateTimeWithLocale.class);
    registrator.registerUserAction(tbncommon.actions.ParseDateTimeWithLocale.class);
  }
}
