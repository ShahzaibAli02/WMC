// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class WmcBannerBottomDialogBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton printCardButton;

  @NonNull
  public final MaterialButton reorderCardButton;

  protected WmcBannerBottomDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton printCardButton, MaterialButton reorderCardButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.printCardButton = printCardButton;
    this.reorderCardButton = reorderCardButton;
  }

  @NonNull
  public static WmcBannerBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.wmc_banner_bottom_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static WmcBannerBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<WmcBannerBottomDialogBinding>inflateInternal(inflater, R.layout.wmc_banner_bottom_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static WmcBannerBottomDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.wmc_banner_bottom_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static WmcBannerBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<WmcBannerBottomDialogBinding>inflateInternal(inflater, R.layout.wmc_banner_bottom_dialog, null, false, component);
  }

  public static WmcBannerBottomDialogBinding bind(@NonNull View view) {
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
  public static WmcBannerBottomDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (WmcBannerBottomDialogBinding)bind(component, view, R.layout.wmc_banner_bottom_dialog);
  }
}
