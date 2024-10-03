// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

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
import com.google.android.material.button.MaterialButton;
import in.aabhasjindal.otptextview.OtpTextView;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class FragmentOtpNewBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnVerify;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final View loading;

  @NonNull
  public final TextView otpTimer;

  @NonNull
  public final OtpTextView otpView;

  @NonNull
  public final TextView phone;

  @NonNull
  public final MaterialButton resendOTPButton;

  @NonNull
  public final TextView subtitle;

  @NonNull
  public final TextView title;

  @Bindable
  protected String mNumber;

  protected FragmentOtpNewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnVerify, ImageView imgBack, View loading, TextView otpTimer,
      OtpTextView otpView, TextView phone, MaterialButton resendOTPButton, TextView subtitle,
      TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnVerify = btnVerify;
    this.imgBack = imgBack;
    this.loading = loading;
    this.otpTimer = otpTimer;
    this.otpView = otpView;
    this.phone = phone;
    this.resendOTPButton = resendOTPButton;
    this.subtitle = subtitle;
    this.title = title;
  }

  public abstract void setNumber(@Nullable String number);

  @Nullable
  public String getNumber() {
    return mNumber;
  }

  @NonNull
  public static FragmentOtpNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_otp_new, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOtpNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOtpNewBinding>inflateInternal(inflater, R.layout.fragment_otp_new, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOtpNewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_otp_new, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOtpNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOtpNewBinding>inflateInternal(inflater, R.layout.fragment_otp_new, null, false, component);
  }

  public static FragmentOtpNewBinding bind(@NonNull View view) {
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
  public static FragmentOtpNewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOtpNewBinding)bind(component, view, R.layout.fragment_otp_new);
  }
}
