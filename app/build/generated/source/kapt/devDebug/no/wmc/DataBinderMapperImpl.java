package no.wmc;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import no.wmc.databinding.ActivityMainBindingImpl;
import no.wmc.databinding.AddNewCategoryBottomsheetBindingImpl;
import no.wmc.databinding.CountriesListDialogBindingImpl;
import no.wmc.databinding.CountryListItemBindingImpl;
import no.wmc.databinding.DialogConfirmOrderCardBindingImpl;
import no.wmc.databinding.DialogTranslateBindingImpl;
import no.wmc.databinding.EditCardBottomDialogBindingImpl;
import no.wmc.databinding.ExpandableCardBindingImpl;
import no.wmc.databinding.FragmentAddMedicalInfoBindingImpl;
import no.wmc.databinding.FragmentDashBindingImpl;
import no.wmc.databinding.FragmentDocumentMetadataBindingImpl;
import no.wmc.databinding.FragmentEmergencyBindingImpl;
import no.wmc.databinding.FragmentMainBindingImpl;
import no.wmc.databinding.FragmentMyCardBindingImpl;
import no.wmc.databinding.FragmentNewRegisterBindingImpl;
import no.wmc.databinding.FragmentNewSubscriptionBindingImpl;
import no.wmc.databinding.FragmentOTPBindingImpl;
import no.wmc.databinding.FragmentOtpNewBindingImpl;
import no.wmc.databinding.FragmentRegisterBindingImpl;
import no.wmc.databinding.HomeListItemBindingImpl;
import no.wmc.databinding.HomeListItemNewBindingImpl;
import no.wmc.databinding.HomeNewScreenBindingImpl;
import no.wmc.databinding.HomeScreenBindingImpl;
import no.wmc.databinding.IntroPageContentBindingImpl;
import no.wmc.databinding.IntroScreenBindingImpl;
import no.wmc.databinding.ItemAddBindingImpl;
import no.wmc.databinding.ItemAddMedicalInfoBindingImpl;
import no.wmc.databinding.ItemDocumentBindingImpl;
import no.wmc.databinding.ItemDocumentDetailBindingImpl;
import no.wmc.databinding.ItemEmergencyContactBindingImpl;
import no.wmc.databinding.ItemInsuranceBindingImpl;
import no.wmc.databinding.ItemNewSubscriptionBindingImpl;
import no.wmc.databinding.ItemSubscriptionBenefitBindingImpl;
import no.wmc.databinding.ItemSubscriptionMemberBindingImpl;
import no.wmc.databinding.ItemSubscriptionOverviewBindingImpl;
import no.wmc.databinding.ItemTranslateBindingImpl;
import no.wmc.databinding.ItemViewAddNewCategoryBindingImpl;
import no.wmc.databinding.LandingScreenBindingImpl;
import no.wmc.databinding.LoginScreenBindingImpl;
import no.wmc.databinding.LoginScreenNewBindingImpl;
import no.wmc.databinding.LytDeleteAccountBindingImpl;
import no.wmc.databinding.LytLoadingBindingImpl;
import no.wmc.databinding.LytMedicinesBindingImpl;
import no.wmc.databinding.LytNewCardBindingImpl;
import no.wmc.databinding.MainBottomDialogBindingImpl;
import no.wmc.databinding.NewBottomBarBindingImpl;
import no.wmc.databinding.OrderCardBottomBindingImpl;
import no.wmc.databinding.ProfileExpandableCardBindingImpl;
import no.wmc.databinding.ProfileScreenBindingImpl;
import no.wmc.databinding.RedeemCodeBottomBindingImpl;
import no.wmc.databinding.RegisterScreenBindingImpl;
import no.wmc.databinding.ResetPasswordScreenBindingImpl;
import no.wmc.databinding.SplashScreenBindingImpl;
import no.wmc.databinding.SubscriptionDetailScreenBindingImpl;
import no.wmc.databinding.SubscriptionInvitationScreenBindingImpl;
import no.wmc.databinding.SubscriptionOverviewScreenBindingImpl;
import no.wmc.databinding.TermsScreenBindingImpl;
import no.wmc.databinding.TopbarUserInfoLayoutBindingImpl;
import no.wmc.databinding.ViewSearchBarBindingImpl;
import no.wmc.databinding.WmcBannerBindingImpl;
import no.wmc.databinding.WmcBannerBottomDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADDNEWCATEGORYBOTTOMSHEET = 2;

  private static final int LAYOUT_COUNTRIESLISTDIALOG = 3;

  private static final int LAYOUT_COUNTRYLISTITEM = 4;

  private static final int LAYOUT_DIALOGCONFIRMORDERCARD = 5;

  private static final int LAYOUT_DIALOGTRANSLATE = 6;

  private static final int LAYOUT_EDITCARDBOTTOMDIALOG = 7;

  private static final int LAYOUT_EXPANDABLECARD = 8;

  private static final int LAYOUT_FRAGMENTADDMEDICALINFO = 9;

  private static final int LAYOUT_FRAGMENTDASH = 10;

  private static final int LAYOUT_FRAGMENTDOCUMENTMETADATA = 11;

  private static final int LAYOUT_FRAGMENTEMERGENCY = 12;

  private static final int LAYOUT_FRAGMENTMAIN = 13;

  private static final int LAYOUT_FRAGMENTMYCARD = 14;

  private static final int LAYOUT_FRAGMENTNEWREGISTER = 15;

  private static final int LAYOUT_FRAGMENTNEWSUBSCRIPTION = 16;

  private static final int LAYOUT_FRAGMENTOTP = 17;

  private static final int LAYOUT_FRAGMENTOTPNEW = 18;

  private static final int LAYOUT_FRAGMENTREGISTER = 19;

  private static final int LAYOUT_HOMELISTITEM = 20;

  private static final int LAYOUT_HOMELISTITEMNEW = 21;

  private static final int LAYOUT_HOMENEWSCREEN = 22;

  private static final int LAYOUT_HOMESCREEN = 23;

  private static final int LAYOUT_INTROPAGECONTENT = 24;

  private static final int LAYOUT_INTROSCREEN = 25;

  private static final int LAYOUT_ITEMADD = 26;

  private static final int LAYOUT_ITEMADDMEDICALINFO = 27;

  private static final int LAYOUT_ITEMDOCUMENT = 28;

  private static final int LAYOUT_ITEMDOCUMENTDETAIL = 29;

  private static final int LAYOUT_ITEMEMERGENCYCONTACT = 30;

  private static final int LAYOUT_ITEMINSURANCE = 31;

  private static final int LAYOUT_ITEMNEWSUBSCRIPTION = 32;

  private static final int LAYOUT_ITEMSUBSCRIPTIONBENEFIT = 33;

  private static final int LAYOUT_ITEMSUBSCRIPTIONMEMBER = 34;

  private static final int LAYOUT_ITEMSUBSCRIPTIONOVERVIEW = 35;

  private static final int LAYOUT_ITEMTRANSLATE = 36;

  private static final int LAYOUT_ITEMVIEWADDNEWCATEGORY = 37;

  private static final int LAYOUT_LANDINGSCREEN = 38;

  private static final int LAYOUT_LOGINSCREEN = 39;

  private static final int LAYOUT_LOGINSCREENNEW = 40;

  private static final int LAYOUT_LYTDELETEACCOUNT = 41;

  private static final int LAYOUT_LYTLOADING = 42;

  private static final int LAYOUT_LYTMEDICINES = 43;

  private static final int LAYOUT_LYTNEWCARD = 44;

  private static final int LAYOUT_MAINBOTTOMDIALOG = 45;

  private static final int LAYOUT_NEWBOTTOMBAR = 46;

  private static final int LAYOUT_ORDERCARDBOTTOM = 47;

  private static final int LAYOUT_PROFILEEXPANDABLECARD = 48;

  private static final int LAYOUT_PROFILESCREEN = 49;

  private static final int LAYOUT_REDEEMCODEBOTTOM = 50;

  private static final int LAYOUT_REGISTERSCREEN = 51;

  private static final int LAYOUT_RESETPASSWORDSCREEN = 52;

  private static final int LAYOUT_SPLASHSCREEN = 53;

  private static final int LAYOUT_SUBSCRIPTIONDETAILSCREEN = 54;

  private static final int LAYOUT_SUBSCRIPTIONINVITATIONSCREEN = 55;

  private static final int LAYOUT_SUBSCRIPTIONOVERVIEWSCREEN = 56;

  private static final int LAYOUT_TERMSSCREEN = 57;

  private static final int LAYOUT_TOPBARUSERINFOLAYOUT = 58;

  private static final int LAYOUT_VIEWSEARCHBAR = 59;

  private static final int LAYOUT_WMCBANNER = 60;

  private static final int LAYOUT_WMCBANNERBOTTOMDIALOG = 61;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(61);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.add_new_category_bottomsheet, LAYOUT_ADDNEWCATEGORYBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.countries_list_dialog, LAYOUT_COUNTRIESLISTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.country_list_item, LAYOUT_COUNTRYLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.dialog_confirm_order_card, LAYOUT_DIALOGCONFIRMORDERCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.dialog_translate, LAYOUT_DIALOGTRANSLATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.edit_card_bottom_dialog, LAYOUT_EDITCARDBOTTOMDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.expandable_card, LAYOUT_EXPANDABLECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_add_medical_info, LAYOUT_FRAGMENTADDMEDICALINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_dash, LAYOUT_FRAGMENTDASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_document_metadata, LAYOUT_FRAGMENTDOCUMENTMETADATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_emergency, LAYOUT_FRAGMENTEMERGENCY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_my_card, LAYOUT_FRAGMENTMYCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_new_register, LAYOUT_FRAGMENTNEWREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_new_subscription, LAYOUT_FRAGMENTNEWSUBSCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_o_t_p, LAYOUT_FRAGMENTOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_otp_new, LAYOUT_FRAGMENTOTPNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.home_list_item, LAYOUT_HOMELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.home_list_item_new, LAYOUT_HOMELISTITEMNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.home_new_screen, LAYOUT_HOMENEWSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.home_screen, LAYOUT_HOMESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.intro_page_content, LAYOUT_INTROPAGECONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.intro_screen, LAYOUT_INTROSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_add, LAYOUT_ITEMADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_add_medical_info, LAYOUT_ITEMADDMEDICALINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_document, LAYOUT_ITEMDOCUMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_document_detail, LAYOUT_ITEMDOCUMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_emergency_contact, LAYOUT_ITEMEMERGENCYCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_insurance, LAYOUT_ITEMINSURANCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_new_subscription, LAYOUT_ITEMNEWSUBSCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_subscription_benefit, LAYOUT_ITEMSUBSCRIPTIONBENEFIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_subscription_member, LAYOUT_ITEMSUBSCRIPTIONMEMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_subscription_overview, LAYOUT_ITEMSUBSCRIPTIONOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_translate, LAYOUT_ITEMTRANSLATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.item_view_add_new_category, LAYOUT_ITEMVIEWADDNEWCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.landing_screen, LAYOUT_LANDINGSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.login_screen, LAYOUT_LOGINSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.login_screen_new, LAYOUT_LOGINSCREENNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.lyt_delete_account, LAYOUT_LYTDELETEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.lyt_loading, LAYOUT_LYTLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.lyt_medicines, LAYOUT_LYTMEDICINES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.lyt_new_card, LAYOUT_LYTNEWCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.main_bottom_dialog, LAYOUT_MAINBOTTOMDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.new_bottom_bar, LAYOUT_NEWBOTTOMBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.order_card_bottom, LAYOUT_ORDERCARDBOTTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.profile_expandable_card, LAYOUT_PROFILEEXPANDABLECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.profile_screen, LAYOUT_PROFILESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.redeem_code_bottom, LAYOUT_REDEEMCODEBOTTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.register_screen, LAYOUT_REGISTERSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.reset_password_screen, LAYOUT_RESETPASSWORDSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.splash_screen, LAYOUT_SPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.subscription_detail_screen, LAYOUT_SUBSCRIPTIONDETAILSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.subscription_invitation_screen, LAYOUT_SUBSCRIPTIONINVITATIONSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.subscription_overview_screen, LAYOUT_SUBSCRIPTIONOVERVIEWSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.terms_screen, LAYOUT_TERMSSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.topbar_user_info_layout, LAYOUT_TOPBARUSERINFOLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.view_search_bar, LAYOUT_VIEWSEARCHBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.wmc_banner, LAYOUT_WMCBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(no.wmc.R.layout.wmc_banner_bottom_dialog, LAYOUT_WMCBANNERBOTTOMDIALOG);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDNEWCATEGORYBOTTOMSHEET: {
        if ("layout/add_new_category_bottomsheet_0".equals(tag)) {
          return new AddNewCategoryBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_new_category_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_COUNTRIESLISTDIALOG: {
        if ("layout/countries_list_dialog_0".equals(tag)) {
          return new CountriesListDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for countries_list_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_COUNTRYLISTITEM: {
        if ("layout/country_list_item_0".equals(tag)) {
          return new CountryListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for country_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCONFIRMORDERCARD: {
        if ("layout/dialog_confirm_order_card_0".equals(tag)) {
          return new DialogConfirmOrderCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_confirm_order_card is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGTRANSLATE: {
        if ("layout/dialog_translate_0".equals(tag)) {
          return new DialogTranslateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_translate is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITCARDBOTTOMDIALOG: {
        if ("layout/edit_card_bottom_dialog_0".equals(tag)) {
          return new EditCardBottomDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_card_bottom_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_EXPANDABLECARD: {
        if ("layout/expandable_card_0".equals(tag)) {
          return new ExpandableCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for expandable_card is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDMEDICALINFO: {
        if ("layout/fragment_add_medical_info_0".equals(tag)) {
          return new FragmentAddMedicalInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_medical_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDASH: {
        if ("layout/fragment_dash_0".equals(tag)) {
          return new FragmentDashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_dash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDOCUMENTMETADATA: {
        if ("layout/fragment_document_metadata_0".equals(tag)) {
          return new FragmentDocumentMetadataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_document_metadata is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEMERGENCY: {
        if ("layout/fragment_emergency_0".equals(tag)) {
          return new FragmentEmergencyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_emergency is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAIN: {
        if ("layout/fragment_main_0".equals(tag)) {
          return new FragmentMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYCARD: {
        if ("layout/fragment_my_card_0".equals(tag)) {
          return new FragmentMyCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_card is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNEWREGISTER: {
        if ("layout/fragment_new_register_0".equals(tag)) {
          return new FragmentNewRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_new_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNEWSUBSCRIPTION: {
        if ("layout/fragment_new_subscription_0".equals(tag)) {
          return new FragmentNewSubscriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_new_subscription is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOTP: {
        if ("layout/fragment_o_t_p_0".equals(tag)) {
          return new FragmentOTPBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_o_t_p is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOTPNEW: {
        if ("layout/fragment_otp_new_0".equals(tag)) {
          return new FragmentOtpNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_otp_new is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMELISTITEM: {
        if ("layout/home_list_item_0".equals(tag)) {
          return new HomeListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMELISTITEMNEW: {
        if ("layout/home_list_item_new_0".equals(tag)) {
          return new HomeListItemNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_list_item_new is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMENEWSCREEN: {
        if ("layout/home_new_screen_0".equals(tag)) {
          return new HomeNewScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_new_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMESCREEN: {
        if ("layout/home_screen_0".equals(tag)) {
          return new HomeScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_INTROPAGECONTENT: {
        if ("layout/intro_page_content_0".equals(tag)) {
          return new IntroPageContentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for intro_page_content is invalid. Received: " + tag);
      }
      case  LAYOUT_INTROSCREEN: {
        if ("layout/intro_screen_0".equals(tag)) {
          return new IntroScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for intro_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADD: {
        if ("layout/item_add_0".equals(tag)) {
          return new ItemAddBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_add is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMADDMEDICALINFO: {
        if ("layout/item_add_medical_info_0".equals(tag)) {
          return new ItemAddMedicalInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_add_medical_info is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOCUMENT: {
        if ("layout/item_document_0".equals(tag)) {
          return new ItemDocumentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_document is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOCUMENTDETAIL: {
        if ("layout/item_document_detail_0".equals(tag)) {
          return new ItemDocumentDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_document_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMEMERGENCYCONTACT: {
        if ("layout/item_emergency_contact_0".equals(tag)) {
          return new ItemEmergencyContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_emergency_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMINSURANCE: {
        if ("layout/item_insurance_0".equals(tag)) {
          return new ItemInsuranceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_insurance is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNEWSUBSCRIPTION: {
        if ("layout/item_new_subscription_0".equals(tag)) {
          return new ItemNewSubscriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_new_subscription is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSUBSCRIPTIONBENEFIT: {
        if ("layout/item_subscription_benefit_0".equals(tag)) {
          return new ItemSubscriptionBenefitBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_subscription_benefit is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSUBSCRIPTIONMEMBER: {
        if ("layout/item_subscription_member_0".equals(tag)) {
          return new ItemSubscriptionMemberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_subscription_member is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSUBSCRIPTIONOVERVIEW: {
        if ("layout/item_subscription_overview_0".equals(tag)) {
          return new ItemSubscriptionOverviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_subscription_overview is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTRANSLATE: {
        if ("layout/item_translate_0".equals(tag)) {
          return new ItemTranslateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_translate is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMVIEWADDNEWCATEGORY: {
        if ("layout/item_view_add_new_category_0".equals(tag)) {
          return new ItemViewAddNewCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_view_add_new_category is invalid. Received: " + tag);
      }
      case  LAYOUT_LANDINGSCREEN: {
        if ("layout/landing_screen_0".equals(tag)) {
          return new LandingScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for landing_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGINSCREEN: {
        if ("layout/login_screen_0".equals(tag)) {
          return new LoginScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for login_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGINSCREENNEW: {
        if ("layout/login_screen_new_0".equals(tag)) {
          return new LoginScreenNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for login_screen_new is invalid. Received: " + tag);
      }
      case  LAYOUT_LYTDELETEACCOUNT: {
        if ("layout/lyt_delete_account_0".equals(tag)) {
          return new LytDeleteAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for lyt_delete_account is invalid. Received: " + tag);
      }
      case  LAYOUT_LYTLOADING: {
        if ("layout/lyt_loading_0".equals(tag)) {
          return new LytLoadingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for lyt_loading is invalid. Received: " + tag);
      }
      case  LAYOUT_LYTMEDICINES: {
        if ("layout/lyt_medicines_0".equals(tag)) {
          return new LytMedicinesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for lyt_medicines is invalid. Received: " + tag);
      }
      case  LAYOUT_LYTNEWCARD: {
        if ("layout/lyt_new_card_0".equals(tag)) {
          return new LytNewCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for lyt_new_card is invalid. Received: " + tag);
      }
      case  LAYOUT_MAINBOTTOMDIALOG: {
        if ("layout/main_bottom_dialog_0".equals(tag)) {
          return new MainBottomDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for main_bottom_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_NEWBOTTOMBAR: {
        if ("layout/new_bottom_bar_0".equals(tag)) {
          return new NewBottomBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for new_bottom_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDERCARDBOTTOM: {
        if ("layout/order_card_bottom_0".equals(tag)) {
          return new OrderCardBottomBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for order_card_bottom is invalid. Received: " + tag);
      }
      case  LAYOUT_PROFILEEXPANDABLECARD: {
        if ("layout/profile_expandable_card_0".equals(tag)) {
          return new ProfileExpandableCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for profile_expandable_card is invalid. Received: " + tag);
      }
      case  LAYOUT_PROFILESCREEN: {
        if ("layout/profile_screen_0".equals(tag)) {
          return new ProfileScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for profile_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_REDEEMCODEBOTTOM: {
        if ("layout/redeem_code_bottom_0".equals(tag)) {
          return new RedeemCodeBottomBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for redeem_code_bottom is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_REGISTERSCREEN: {
        if ("layout/register_screen_0".equals(tag)) {
          return new RegisterScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for register_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_RESETPASSWORDSCREEN: {
        if ("layout/reset_password_screen_0".equals(tag)) {
          return new ResetPasswordScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for reset_password_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_SPLASHSCREEN: {
        if ("layout/splash_screen_0".equals(tag)) {
          return new SplashScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for splash_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBSCRIPTIONDETAILSCREEN: {
        if ("layout/subscription_detail_screen_0".equals(tag)) {
          return new SubscriptionDetailScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subscription_detail_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBSCRIPTIONINVITATIONSCREEN: {
        if ("layout/subscription_invitation_screen_0".equals(tag)) {
          return new SubscriptionInvitationScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subscription_invitation_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBSCRIPTIONOVERVIEWSCREEN: {
        if ("layout/subscription_overview_screen_0".equals(tag)) {
          return new SubscriptionOverviewScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subscription_overview_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_TERMSSCREEN: {
        if ("layout/terms_screen_0".equals(tag)) {
          return new TermsScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for terms_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_TOPBARUSERINFOLAYOUT: {
        if ("layout/topbar_user_info_layout_0".equals(tag)) {
          return new TopbarUserInfoLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for topbar_user_info_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWSEARCHBAR: {
        if ("layout/view_search_bar_0".equals(tag)) {
          return new ViewSearchBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_search_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_WMCBANNER: {
        if ("layout/wmc_banner_0".equals(tag)) {
          return new WmcBannerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for wmc_banner is invalid. Received: " + tag);
      }
      case  LAYOUT_WMCBANNERBOTTOMDIALOG: {
        if ("layout/wmc_banner_bottom_dialog_0".equals(tag)) {
          return new WmcBannerBottomDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for wmc_banner_bottom_dialog is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "addressData");
      sKeys.put(2, "emergencyContactsData");
      sKeys.put(3, "isEditMode");
      sKeys.put(4, "isLoading");
      sKeys.put(5, "model");
      sKeys.put(6, "number");
      sKeys.put(7, "profile");
      sKeys.put(8, "profileData");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(61);

    static {
      sKeys.put("layout/activity_main_0", no.wmc.R.layout.activity_main);
      sKeys.put("layout/add_new_category_bottomsheet_0", no.wmc.R.layout.add_new_category_bottomsheet);
      sKeys.put("layout/countries_list_dialog_0", no.wmc.R.layout.countries_list_dialog);
      sKeys.put("layout/country_list_item_0", no.wmc.R.layout.country_list_item);
      sKeys.put("layout/dialog_confirm_order_card_0", no.wmc.R.layout.dialog_confirm_order_card);
      sKeys.put("layout/dialog_translate_0", no.wmc.R.layout.dialog_translate);
      sKeys.put("layout/edit_card_bottom_dialog_0", no.wmc.R.layout.edit_card_bottom_dialog);
      sKeys.put("layout/expandable_card_0", no.wmc.R.layout.expandable_card);
      sKeys.put("layout/fragment_add_medical_info_0", no.wmc.R.layout.fragment_add_medical_info);
      sKeys.put("layout/fragment_dash_0", no.wmc.R.layout.fragment_dash);
      sKeys.put("layout/fragment_document_metadata_0", no.wmc.R.layout.fragment_document_metadata);
      sKeys.put("layout/fragment_emergency_0", no.wmc.R.layout.fragment_emergency);
      sKeys.put("layout/fragment_main_0", no.wmc.R.layout.fragment_main);
      sKeys.put("layout/fragment_my_card_0", no.wmc.R.layout.fragment_my_card);
      sKeys.put("layout/fragment_new_register_0", no.wmc.R.layout.fragment_new_register);
      sKeys.put("layout/fragment_new_subscription_0", no.wmc.R.layout.fragment_new_subscription);
      sKeys.put("layout/fragment_o_t_p_0", no.wmc.R.layout.fragment_o_t_p);
      sKeys.put("layout/fragment_otp_new_0", no.wmc.R.layout.fragment_otp_new);
      sKeys.put("layout/fragment_register_0", no.wmc.R.layout.fragment_register);
      sKeys.put("layout/home_list_item_0", no.wmc.R.layout.home_list_item);
      sKeys.put("layout/home_list_item_new_0", no.wmc.R.layout.home_list_item_new);
      sKeys.put("layout/home_new_screen_0", no.wmc.R.layout.home_new_screen);
      sKeys.put("layout/home_screen_0", no.wmc.R.layout.home_screen);
      sKeys.put("layout/intro_page_content_0", no.wmc.R.layout.intro_page_content);
      sKeys.put("layout/intro_screen_0", no.wmc.R.layout.intro_screen);
      sKeys.put("layout/item_add_0", no.wmc.R.layout.item_add);
      sKeys.put("layout/item_add_medical_info_0", no.wmc.R.layout.item_add_medical_info);
      sKeys.put("layout/item_document_0", no.wmc.R.layout.item_document);
      sKeys.put("layout/item_document_detail_0", no.wmc.R.layout.item_document_detail);
      sKeys.put("layout/item_emergency_contact_0", no.wmc.R.layout.item_emergency_contact);
      sKeys.put("layout/item_insurance_0", no.wmc.R.layout.item_insurance);
      sKeys.put("layout/item_new_subscription_0", no.wmc.R.layout.item_new_subscription);
      sKeys.put("layout/item_subscription_benefit_0", no.wmc.R.layout.item_subscription_benefit);
      sKeys.put("layout/item_subscription_member_0", no.wmc.R.layout.item_subscription_member);
      sKeys.put("layout/item_subscription_overview_0", no.wmc.R.layout.item_subscription_overview);
      sKeys.put("layout/item_translate_0", no.wmc.R.layout.item_translate);
      sKeys.put("layout/item_view_add_new_category_0", no.wmc.R.layout.item_view_add_new_category);
      sKeys.put("layout/landing_screen_0", no.wmc.R.layout.landing_screen);
      sKeys.put("layout/login_screen_0", no.wmc.R.layout.login_screen);
      sKeys.put("layout/login_screen_new_0", no.wmc.R.layout.login_screen_new);
      sKeys.put("layout/lyt_delete_account_0", no.wmc.R.layout.lyt_delete_account);
      sKeys.put("layout/lyt_loading_0", no.wmc.R.layout.lyt_loading);
      sKeys.put("layout/lyt_medicines_0", no.wmc.R.layout.lyt_medicines);
      sKeys.put("layout/lyt_new_card_0", no.wmc.R.layout.lyt_new_card);
      sKeys.put("layout/main_bottom_dialog_0", no.wmc.R.layout.main_bottom_dialog);
      sKeys.put("layout/new_bottom_bar_0", no.wmc.R.layout.new_bottom_bar);
      sKeys.put("layout/order_card_bottom_0", no.wmc.R.layout.order_card_bottom);
      sKeys.put("layout/profile_expandable_card_0", no.wmc.R.layout.profile_expandable_card);
      sKeys.put("layout/profile_screen_0", no.wmc.R.layout.profile_screen);
      sKeys.put("layout/redeem_code_bottom_0", no.wmc.R.layout.redeem_code_bottom);
      sKeys.put("layout/register_screen_0", no.wmc.R.layout.register_screen);
      sKeys.put("layout/reset_password_screen_0", no.wmc.R.layout.reset_password_screen);
      sKeys.put("layout/splash_screen_0", no.wmc.R.layout.splash_screen);
      sKeys.put("layout/subscription_detail_screen_0", no.wmc.R.layout.subscription_detail_screen);
      sKeys.put("layout/subscription_invitation_screen_0", no.wmc.R.layout.subscription_invitation_screen);
      sKeys.put("layout/subscription_overview_screen_0", no.wmc.R.layout.subscription_overview_screen);
      sKeys.put("layout/terms_screen_0", no.wmc.R.layout.terms_screen);
      sKeys.put("layout/topbar_user_info_layout_0", no.wmc.R.layout.topbar_user_info_layout);
      sKeys.put("layout/view_search_bar_0", no.wmc.R.layout.view_search_bar);
      sKeys.put("layout/wmc_banner_0", no.wmc.R.layout.wmc_banner);
      sKeys.put("layout/wmc_banner_bottom_dialog_0", no.wmc.R.layout.wmc_banner_bottom_dialog);
    }
  }
}
