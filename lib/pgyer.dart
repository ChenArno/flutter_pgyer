import 'dart:async';

import 'package:flutter/services.dart';

class Pgyer {
  static const MethodChannel _channel =
      const MethodChannel('pgyer');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
