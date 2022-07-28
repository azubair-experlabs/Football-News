// Generated by data binding compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.portal.models.Picture;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class GalleryItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView galleryImageView;

  @NonNull
  public final TextView galleryText;

  @Bindable
  protected Picture mGalleryItem;

  protected GalleryItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView galleryImageView, TextView galleryText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.galleryImageView = galleryImageView;
    this.galleryText = galleryText;
  }

  public abstract void setGalleryItem(@Nullable Picture gallery_item);

  @Nullable
  public Picture getGalleryItem() {
    return mGalleryItem;
  }

  @NonNull
  public static GalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.gallery_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GalleryItemBinding>inflateInternal(inflater, R.layout.gallery_item, root, attachToRoot, component);
  }

  @NonNull
  public static GalleryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.gallery_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GalleryItemBinding>inflateInternal(inflater, R.layout.gallery_item, null, false, component);
  }

  public static GalleryItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static GalleryItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (GalleryItemBinding)bind(component, view, R.layout.gallery_item);
  }
}