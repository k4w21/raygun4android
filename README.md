Raygun4Android
==============

The world's best Android crash reporter.

Installation
=============

Configuration
==============

1. In your **AndroidManifest.xml**, make sure you have granted Internet permissions: `<uses-permission android:name="android.permission.INTERNET" />`

## Documentation

### Frequently Asked Questions

* Environment Data

A selection of enironment data will be attached and available in the Environment tab in the dashboard. This data is gathered from android.os.Build - if you wish to see other fields you can add them on the userCustomData object.

- The OS version will be the end-user version, ie 4.0.3. 

### Developing

Run `mvn install` to grab the dependencies and install the library to your local Maven repo. Runs with Android 2.2 (API level 8) and JDK 1.6

`mvn source:jar` to generate source jar for debugging

Changelog
=========

Version 0.0.1: Initial release with basic functionality.