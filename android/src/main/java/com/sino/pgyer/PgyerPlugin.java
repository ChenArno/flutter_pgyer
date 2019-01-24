package com.sino.pgyer;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** PgyerPlugin */
public class PgyerPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "pgyer");
    channel.setMethodCallHandler(new PgyerPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else {
      result.notImplemented();
    }
  }


}
