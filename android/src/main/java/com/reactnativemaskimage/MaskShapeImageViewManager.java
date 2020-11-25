//package com.reactnativemaskimage;
//
//import androidx.core.content.ContextCompat;
//
//import com.facebook.react.uimanager.SimpleViewManager;
//import com.facebook.react.uimanager.ThemedReactContext;
//import com.facebook.react.uimanager.annotations.ReactProp;
//import com.squareup.picasso.Picasso;
//
//public class MaskShapeImageViewManager extends SimpleViewManager<MaskShapeImageView> {
//  public static final String REACT_CLASS = "TestTextView";
//
//  @Override
//  public String getName() {
//    return REACT_CLASS;
//  }
//
//  @Override
//  protected MaskShapeImageView createViewInstance(ThemedReactContext reactContext) {
//
//    MaskShapeImageView maskShapeImageView = new MaskShapeImageView(reactContext);
//
//    maskShapeImageView.setShape(ContextCompat.getDrawable(reactContext, R.drawable.hexagon));
//
//    return maskShapeImageView;
//  }
//
//  @ReactProp(name = "urlImage")
//  public void setUrlImageProp(MaskShapeImageView maskShapeImageView, String urlImage) {
//
//
//
//    Picasso.get()
//      .load(urlImage)
//      .into(maskShapeImageView);
//  }
//}
