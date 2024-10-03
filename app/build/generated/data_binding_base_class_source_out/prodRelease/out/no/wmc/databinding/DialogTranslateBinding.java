// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class DialogTranslateBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView itemList;

  @NonNull
  public final TextView itemsTitle;

  @NonNull
  public final TextView title;

  @NonNull
  public final ImageView topBar;

  @NonNull
  public final FrameLayout translateLanguageFrame;

  @NonNull
  public final AppCompatSpinner translateLanguageSpinner;

  protected DialogTranslateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView itemList, TextView itemsTitle, TextView title, ImageView topBar,
      FrameLayout translateLanguageFrame, AppCompatSpinner translateLanguageSpinner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemList = itemList;
    this.itemsTitle = itemsTitle;
    this.title = title;
    this.topBar = topBar;
    this.translateLanguageFrame = translateLanguageFrame;
    this.translateLanguageSpinner = translateLanguageSpinner;
  }

  @NonNull
  public static DialogTranslateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_translate, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogTranslateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogTranslateBinding>inflateInternal(inflater, R.layout.dialog_translate, root, attachToRoot, component);
  }

  @NonNull
  public static DialogTranslateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_translate, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogTranslateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogTranslateBinding>inflateInternal(inflater, R.layout.dialog_translate, null, false, component);
  }

  public static DialogTranslateBinding bind(@NonNull View view) {
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
  public static DialogTranslateBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogTranslateBinding)bind(component, view, R.layout.dialog_translate);
  }
}
