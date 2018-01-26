  package com.reactlibrary;
 
  import android.widget.TextView;
  import com.facebook.react.uimanager.SimpleViewManager;
  import com.facebook.react.uimanager.ThemedReactContext;
  import com.facebook.react.uimanager.annotations.ReactProp;
  import com.facebook.react.bridge.ReactApplicationContext;
  import com.facebook.react.bridge.ReactContextBaseJavaModule;
  import com.facebook.react.bridge.ReactMethod;
  
  import javax.annotation.Nullable;
   
  public class RNCustomTextViewManager extends SimpleViewManager {
      @Override
      public String getName() {
          return "RNCustomText";
      }
   
      @Override
      protected TextView createViewInstance(ThemedReactContext reactContext) {
          return new TextView(reactContext);
      }
   
      @ReactProp(name = "text")
      public void setText(TextView view, @Nullable String text) {
          view.setText(text);
      }
  }