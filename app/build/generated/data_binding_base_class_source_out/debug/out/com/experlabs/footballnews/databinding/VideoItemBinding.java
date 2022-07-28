// Generated by data binding compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.portal.models.News;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VideoItemBinding extends ViewDataBinding {
  @NonNull
  public final Button fullscreenBt;

  @NonNull
  public final Button videoshareBt;

  @NonNull
  public final YouTubePlayerView youtubeView;

  @Bindable
  protected News mVideoItem;

  protected VideoItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button fullscreenBt, Button videoshareBt, YouTubePlayerView youtubeView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fullscreenBt = fullscreenBt;
    this.videoshareBt = videoshareBt;
    this.youtubeView = youtubeView;
  }

  public abstract void setVideoItem(@Nullable News videoItem);

  @Nullable
  public News getVideoItem() {
    return mVideoItem;
  }

  @NonNull
  public static VideoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.video_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VideoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VideoItemBinding>inflateInternal(inflater, R.layout.video_item, root, attachToRoot, component);
  }

  @NonNull
  public static VideoItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.video_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VideoItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VideoItemBinding>inflateInternal(inflater, R.layout.video_item, null, false, component);
  }

  public static VideoItemBinding bind(@NonNull View view) {
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
  public static VideoItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (VideoItemBinding)bind(component, view, R.layout.video_item);
  }
}
