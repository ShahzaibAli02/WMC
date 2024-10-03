package no.wmc.ui.main.healthapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J-\u0010-\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0/2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\u001a\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020\u0018H\u0002J\b\u00106\u001a\u00020\u0018H\u0002J\b\u00107\u001a\u00020\u0018H\u0002J\b\u00108\u001a\u00020\u0018H\u0002J\u0006\u00109\u001a\u00020\u0018J\u000e\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lno/wmc/ui/main/healthapp/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "PERMISSION_REQUEST_CODE", "", "binding", "Lno/wmc/databinding/FragmentMainBinding;", "fitnessOptions", "Lcom/google/android/gms/fitness/FitnessOptions;", "getFitnessOptions", "()Lcom/google/android/gms/fitness/FitnessOptions;", "setFitnessOptions", "(Lcom/google/android/gms/fitness/FitnessOptions;)V", "goalHydration", "goalsReadRequest", "Lcom/google/android/gms/fitness/request/GoalsReadRequest;", "getGoalsReadRequest", "()Lcom/google/android/gms/fitness/request/GoalsReadRequest;", "goalsReadRequest$delegate", "Lkotlin/Lazy;", "stepsGoal", "", "totalSteps", "accessGoogleFit", "", "calculateTimeAgo", "", "currentTimeMillis", "", "timestampMillis", "getGoogleAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "readBloodPressure", "readGoals", "readHearRate", "readHydrationLevel", "readTodayStepCount", "setGraphSteps", "percentage", "wmc-3.1.40-b11_devDebug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private no.wmc.databinding.FragmentMainBinding binding;
    private final int PERMISSION_REQUEST_CODE = 11;
    public com.google.android.gms.fitness.FitnessOptions fitnessOptions;
    private double totalSteps = 0.0;
    private int goalHydration = 5;
    private double stepsGoal = 0.0;
    private final kotlin.Lazy goalsReadRequest$delegate = null;
    
    public MainFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.fitness.FitnessOptions getFitnessOptions() {
        return null;
    }
    
    public final void setFitnessOptions(@org.jetbrains.annotations.NotNull
    com.google.android.gms.fitness.FitnessOptions p0) {
    }
    
    public final void readTodayStepCount() {
    }
    
    private final void readHydrationLevel() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void accessGoogleFit() {
    }
    
    private final void readHearRate() {
    }
    
    private final void readBloodPressure() {
    }
    
    private final java.lang.String calculateTimeAgo(long currentTimeMillis, long timestampMillis) {
        return null;
    }
    
    private final com.google.android.gms.fitness.request.GoalsReadRequest getGoalsReadRequest() {
        return null;
    }
    
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleAccount() {
        return null;
    }
    
    public final void setGraphSteps(int percentage) {
    }
    
    private final void readGoals() {
    }
}