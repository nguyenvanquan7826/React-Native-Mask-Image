package com.reactnativemaskimage

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.squareup.picasso.Picasso


class MaskShapeImageViewManager : SimpleViewManager<MaskShapeImageView?>() {
  override fun getName(): String {
    return REACT_CLASS
  }

  lateinit var context: Context
  private var urlImage: String = ""
  private var urlMask: String = ""

  override fun createViewInstance(reactContext: ThemedReactContext): MaskShapeImageView {
    this.context = reactContext

    val maskShapeImageView = MaskShapeImageView(reactContext)
    maskShapeImageView.setShape(ContextCompat.getDrawable(reactContext, R.drawable.hexagon))

    return maskShapeImageView
  }

  @ReactProp(name = "urlMask")
  fun setUrlMaskProp(maskShapeImageView: MaskShapeImageView, urlMask: String) {
    this.urlMask = urlMask
    build(maskShapeImageView)
  }

  @ReactProp(name = "urlImage")
  fun setUrlImageProp(maskShapeImageView: MaskShapeImageView, urlImage: String) {
    this.urlImage = urlImage
    build(maskShapeImageView)
  }

  private fun build(maskShapeImageView: MaskShapeImageView?) {
    if (TextUtils.isEmpty(urlImage) || TextUtils.isEmpty(urlMask)) {
      Log.e(name, "urlImage or urlMask empty")
      return
    }

    Picasso.get().load(urlMask).into(object : com.squareup.picasso.Target {
      override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}
      override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {
        Toast.makeText(context, "Fail " + e.toString(), Toast.LENGTH_SHORT).show()
      }

      override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
        val drawImage = BitmapDrawable(context.resources, bitmap)
        maskShapeImageView?.setShape(drawImage)
        Picasso.get().load(urlImage).into(maskShapeImageView)
      }

    })
  }

  companion object {
    const val REACT_CLASS = "MaskImageView"
  }
}
