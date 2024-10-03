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

public abstract class MainBottomDialogBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton signOutButton;

  @NonNull
  public final MaterialButton subscriptionButton;

  @NonNull
  public final MaterialButton termsButton;

  protected MainBottomDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton signOutButton, MaterialButton subscriptionButton, MaterialButton termsButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.signOutButton = signOutButton;
    this.subscriptionButton = subscriptionButton;
    this.termsButton = termsButton;
  }

  @NonNull
  public static MainBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_bottom_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainBottomDialogBinding>inflateInternal(inflater, R.layout.main_bottom_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static MainBottomDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_bottom_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainBottomDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainBottomDialogBinding>inflateInternal(inflater, R.layout.main_bottom_dialog, null, false, component);
  }

  public static MainBottomDialogBinding bind(@NonNull View view) {
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
  public static MainBottomDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainBottomDialogBinding)bind(component, view, R.layout.main_bottom_dialog);
  }
}
