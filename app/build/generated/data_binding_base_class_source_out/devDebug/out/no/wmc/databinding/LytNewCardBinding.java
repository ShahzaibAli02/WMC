// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class LytNewCardBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout parent;

  @NonNull
  public final TextView txtBirthDate;

  @NonNull
  public final TextView txtEmergencyPhone;

  @NonNull
  public final TextView txtIssuedOn;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtNationalId;

  @NonNull
  public final TextView txtNationality;

  @NonNull
  public final TextView txtOrganDonation;

  @NonNull
  public final TextView txtPolicyNumber;

  @NonNull
  public final TextView txtTravelInsuranceCompanyName;

  protected LytNewCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout parent, TextView txtBirthDate, TextView txtEmergencyPhone, TextView txtIssuedOn,
      TextView txtName, TextView txtNationalId, TextView txtNationality, TextView txtOrganDonation,
      TextView txtPolicyNumber, TextView txtTravelInsuranceCompanyName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.parent = parent;
    this.txtBirthDate = txtBirthDate;
    this.txtEmergencyPhone = txtEmergencyPhone;
    this.txtIssuedOn = txtIssuedOn;
    this.txtName = txtName;
    this.txtNationalId = txtNationalId;
    this.txtNationality = txtNationality;
    this.txtOrganDonation = txtOrganDonation;
    this.txtPolicyNumber = txtPolicyNumber;
    this.txtTravelInsuranceCompanyName = txtTravelInsuranceCompanyName;
  }

  @NonNull
  public static LytNewCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lyt_new_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LytNewCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LytNewCardBinding>inflateInternal(inflater, R.layout.lyt_new_card, root, attachToRoot, component);
  }

  @NonNull
  public static LytNewCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.lyt_new_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LytNewCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LytNewCardBinding>inflateInternal(inflater, R.layout.lyt_new_card, null, false, component);
  }

  public static LytNewCardBinding bind(@NonNull View view) {
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
  public static LytNewCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (LytNewCardBinding)bind(component, view, R.layout.lyt_new_card);
  }
}
