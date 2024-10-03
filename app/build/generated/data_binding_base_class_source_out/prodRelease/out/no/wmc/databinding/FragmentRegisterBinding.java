// Generated by data binding compiler. Do not edit!
package no.wmc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import no.wmc.R;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final Barrier barrier;

  @NonNull
  public final TextView btnForEmergency;

  @NonNull
  public final TextView btnInsurance;

  @NonNull
  public final TextView btnPersonalInfo;

  @NonNull
  public final TextView btnPostalAddress;

  @NonNull
  public final TextInputLayout city;

  @NonNull
  public final TextInputLayout country;

  @NonNull
  public final TextInputLayout cprFlag;

  @NonNull
  public final TextInputLayout cprNumber;

  @NonNull
  public final TextInputLayout dateOfBirth;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final Guideline endGuideline;

  @NonNull
  public final TextInputLayout firstName;

  @NonNull
  public final TextInputLayout gender;

  @NonNull
  public final Group groupEmergencyContact;

  @NonNull
  public final Group groupInsurance;

  @NonNull
  public final Group groupPersonalInfo;

  @NonNull
  public final Group groupPostalAddress;

  @NonNull
  public final TextView labelEmergency;

  @NonNull
  public final TextView labelEmergencySubTitle;

  @NonNull
  public final TextView labelInsurance;

  @NonNull
  public final TextView labelInsuranceSubTitle;

  @NonNull
  public final TextView labelPersonalInfo;

  @NonNull
  public final TextView labelPersonalInfoSubTitle;

  @NonNull
  public final TextView labelPostalAddress;

  @NonNull
  public final TextView labelPostalAddressSubTitle;

  @NonNull
  public final TextView labelTitleOrganDonor;

  @NonNull
  public final TextView labelWarning;

  @NonNull
  public final TextInputLayout lastName;

  @NonNull
  public final View loading;

  @NonNull
  public final LinearLayout lytPassStrength;

  @NonNull
  public final FrameLayout mtCard;

  @NonNull
  public final TextInputLayout nationality;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final NestedScrollView nestedScrollView2;

  @NonNull
  public final LytNewCardBinding newCardDesign;

  @NonNull
  public final MaterialButton next;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final ProgressBar passwordStrengthProgressBar;

  @NonNull
  public final TextView passwordStrengthTextView;

  @NonNull
  public final TextInputLayout postalAddress;

  @NonNull
  public final TextInputLayout postalCode;

  @NonNull
  public final RecyclerView recyclerEmergency;

  @NonNull
  public final RecyclerView recyclerInsurance;

  @NonNull
  public final TextInputLayout relationship;

  @NonNull
  public final Guideline startGuideline;

  @NonNull
  public final TextInputLayout tlfNr;

  @NonNull
  public final TextInputLayout tlfNr2;

  @NonNull
  public final TextInputLayout tlfNrOrganDonor;

  @NonNull
  public final Toolbar toolbar;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier barrier, TextView btnForEmergency, TextView btnInsurance, TextView btnPersonalInfo,
      TextView btnPostalAddress, TextInputLayout city, TextInputLayout country,
      TextInputLayout cprFlag, TextInputLayout cprNumber, TextInputLayout dateOfBirth,
      TextInputLayout email, Guideline endGuideline, TextInputLayout firstName,
      TextInputLayout gender, Group groupEmergencyContact, Group groupInsurance,
      Group groupPersonalInfo, Group groupPostalAddress, TextView labelEmergency,
      TextView labelEmergencySubTitle, TextView labelInsurance, TextView labelInsuranceSubTitle,
      TextView labelPersonalInfo, TextView labelPersonalInfoSubTitle, TextView labelPostalAddress,
      TextView labelPostalAddressSubTitle, TextView labelTitleOrganDonor, TextView labelWarning,
      TextInputLayout lastName, View loading, LinearLayout lytPassStrength, FrameLayout mtCard,
      TextInputLayout nationality, NestedScrollView nestedScrollView,
      NestedScrollView nestedScrollView2, LytNewCardBinding newCardDesign, MaterialButton next,
      TextInputLayout password, ProgressBar passwordStrengthProgressBar,
      TextView passwordStrengthTextView, TextInputLayout postalAddress, TextInputLayout postalCode,
      RecyclerView recyclerEmergency, RecyclerView recyclerInsurance, TextInputLayout relationship,
      Guideline startGuideline, TextInputLayout tlfNr, TextInputLayout tlfNr2,
      TextInputLayout tlfNrOrganDonor, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.barrier = barrier;
    this.btnForEmergency = btnForEmergency;
    this.btnInsurance = btnInsurance;
    this.btnPersonalInfo = btnPersonalInfo;
    this.btnPostalAddress = btnPostalAddress;
    this.city = city;
    this.country = country;
    this.cprFlag = cprFlag;
    this.cprNumber = cprNumber;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.endGuideline = endGuideline;
    this.firstName = firstName;
    this.gender = gender;
    this.groupEmergencyContact = groupEmergencyContact;
    this.groupInsurance = groupInsurance;
    this.groupPersonalInfo = groupPersonalInfo;
    this.groupPostalAddress = groupPostalAddress;
    this.labelEmergency = labelEmergency;
    this.labelEmergencySubTitle = labelEmergencySubTitle;
    this.labelInsurance = labelInsurance;
    this.labelInsuranceSubTitle = labelInsuranceSubTitle;
    this.labelPersonalInfo = labelPersonalInfo;
    this.labelPersonalInfoSubTitle = labelPersonalInfoSubTitle;
    this.labelPostalAddress = labelPostalAddress;
    this.labelPostalAddressSubTitle = labelPostalAddressSubTitle;
    this.labelTitleOrganDonor = labelTitleOrganDonor;
    this.labelWarning = labelWarning;
    this.lastName = lastName;
    this.loading = loading;
    this.lytPassStrength = lytPassStrength;
    this.mtCard = mtCard;
    this.nationality = nationality;
    this.nestedScrollView = nestedScrollView;
    this.nestedScrollView2 = nestedScrollView2;
    this.newCardDesign = newCardDesign;
    this.next = next;
    this.password = password;
    this.passwordStrengthProgressBar = passwordStrengthProgressBar;
    this.passwordStrengthTextView = passwordStrengthTextView;
    this.postalAddress = postalAddress;
    this.postalCode = postalCode;
    this.recyclerEmergency = recyclerEmergency;
    this.recyclerInsurance = recyclerInsurance;
    this.relationship = relationship;
    this.startGuideline = startGuideline;
    this.tlfNr = tlfNr;
    this.tlfNr2 = tlfNr2;
    this.tlfNrOrganDonor = tlfNrOrganDonor;
    this.toolbar = toolbar;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, null, false, component);
  }

  public static FragmentRegisterBinding bind(@NonNull View view) {
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
  public static FragmentRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterBinding)bind(component, view, R.layout.fragment_register);
  }
}
