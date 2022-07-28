// Generated by data binding compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.portal.models.News;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FactItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView factImageView;

  @NonNull
  public final ImageButton openBt;

  @NonNull
  public final ImageButton shareBt;

  @NonNull
  public final TextView titleText;

  @Bindable
  protected News mFactItem;

  protected FactItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView factImageView, ImageButton openBt, ImageButton shareBt, TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.factImageView = factImageView;
    this.openBt = openBt;
    this.shareBt = shareBt;
    this.titleText = titleText;
  }

  public abstract void setFactItem(@Nullable News factItem);

  @Nullable
  public News getFactItem() {
    return mFactItem;
  }

  @NonNull
  public static FactItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fact_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FactItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FactItemBinding>inflateInternal(inflater, R.layout.fact_item, root, attachToRoot, component);
  }

  @NonNull
  public static FactItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fact_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FactItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FactItemBinding>inflateInternal(inflater, R.layout.fact_item, null, false, component);
  }

  public static FactItemBinding bind(@NonNull View view) {
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
  public static FactItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (FactItemBinding)bind(component, view, R.layout.fact_item);
  }
}
