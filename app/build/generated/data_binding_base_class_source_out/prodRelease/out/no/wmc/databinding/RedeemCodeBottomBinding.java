// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class RedeemCodeBottomBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnCancel;

  @NonNull
  public final MaterialButton btnRedeemNow;

  @NonNull
  public final TextInputLayout etCode;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final MaterialCardView wmcCard;

  @NonNull
  public final LinearLayout wmcOrderLayout;

  @NonNull
  public final TextView wmcOrderTitle;

  protected RedeemCodeBottomBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnCancel, MaterialButton btnRedeemNow, TextInputLayout etCode,
      ProgressBar progressBar, MaterialCardView wmcCard, LinearLayout wmcOrderLayout,
      TextView wmcOrderTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCancel = btnCancel;
    this.btnRedeemNow = btnRedeemNow;
    this.etCode = etCode;
    this.progressBar = progressBar;
    this.wmcCard = wmcCard;
    this.wmcOrderLayout = wmcOrderLayout;
    this.wmcOrderTitle = wmcOrderTitle;
  }

  @NonNull
  public static RedeemCodeBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.redeem_code_bottom, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RedeemCodeBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RedeemCodeBottomBinding>inflateInternal(inflater, R.layout.redeem_code_bottom, root, attachToRoot, component);
  }

  @NonNull
  public static RedeemCodeBottomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.redeem_code_bottom, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RedeemCodeBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RedeemCodeBottomBinding>inflateInternal(inflater, R.layout.redeem_code_bottom, null, false, component);
  }

  public static RedeemCodeBottomBinding bind(@NonNull View view) {
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
  public static RedeemCodeBottomBinding bind(@NonNull View view, @Nullable Object component) {
    return (RedeemCodeBottomBinding)bind(component, view, R.layout.redeem_code_bottom);
  }
}
