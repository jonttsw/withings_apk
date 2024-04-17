package com.withings.wiscale2.legacyprograms;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.DurationDomain;
import com.withings.programs.model.program.FeatureDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.program.ScreenshotDomain;
import com.withings.programs.model.program.SpecificsDomain;
import com.withings.programs.model.program.SponsorsDomain;
import com.withings.user.User;
import com.withings.views.view.HeightRatioImageView;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.legacyprograms.WellnessProgramJoiner;
import ga.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import u8.b;
import w6.o;
import x30.h;
import x30.j;
import x30.l;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u0002:\u0002Ë\u0001B\b¢\u0006\u0005\bÊ\u0001\u0010\u000eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010#J\u001d\u0010*\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u0002000'H\u0002¢\u0006\u0004\b2\u0010+J\u001d\u00106\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b6\u0010+J\u0017\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010\u000eR\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bC\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR#\u0010[\u001a\n V*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR#\u0010`\u001a\n V*\u0004\u0018\u00010\\0\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R#\u0010e\u001a\n V*\u0004\u0018\u00010a0a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010dR#\u0010j\u001a\n V*\u0004\u0018\u00010f0f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bh\u0010iR#\u0010o\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010X\u001a\u0004\bm\u0010nR#\u0010r\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010X\u001a\u0004\bq\u0010nR#\u0010u\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010X\u001a\u0004\bt\u0010nR#\u0010x\u001a\n V*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010X\u001a\u0004\bw\u0010ZR#\u0010}\u001a\n V*\u0004\u0018\u00010y0y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010X\u001a\u0004\b{\u0010|R$\u0010\u0080\u0001\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010X\u001a\u0004\b\u007f\u0010nR&\u0010\u0083\u0001\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010X\u001a\u0005\b\u0082\u0001\u0010nR&\u0010\u0086\u0001\u001a\n V*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010X\u001a\u0005\b\u0085\u0001\u0010ZR)\u0010\u008b\u0001\u001a\f V*\u0005\u0018\u00010\u0087\u00010\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010X\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u0090\u0001\u001a\f V*\u0005\u0018\u00010\u008c\u00010\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010X\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0093\u0001\u001a\n V*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010X\u001a\u0005\b\u0092\u0001\u0010ZR)\u0010\u0096\u0001\u001a\f V*\u0005\u0018\u00010\u008c\u00010\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010X\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001R&\u0010\u0099\u0001\u001a\n V*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010X\u001a\u0005\b\u0098\u0001\u0010ZR&\u0010\u009c\u0001\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010X\u001a\u0005\b\u009b\u0001\u0010nR)\u0010¡\u0001\u001a\f V*\u0005\u0018\u00010\u009d\u00010\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009e\u0001\u0010X\u001a\u0006\b\u009f\u0001\u0010 \u0001R&\u0010¤\u0001\u001a\n V*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¢\u0001\u0010X\u001a\u0005\b£\u0001\u0010nR)\u0010©\u0001\u001a\f V*\u0005\u0018\u00010¥\u00010¥\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010X\u001a\u0006\b§\u0001\u0010¨\u0001R)\u0010®\u0001\u001a\f V*\u0005\u0018\u00010ª\u00010ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010X\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010³\u0001\u001a\u00030¯\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b°\u0001\u0010X\u001a\u0006\b±\u0001\u0010²\u0001R\u001f\u0010·\u0001\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b´\u0001\u0010X\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001f\u0010¹\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¸\u0001\u0010X\u001a\u0006\b¹\u0001\u0010º\u0001R\"\u0010¿\u0001\u001a\u0005\u0018\u00010»\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¼\u0001\u0010X\u001a\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010À\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R \u0010Æ\u0001\u001a\u00030Â\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÃ\u0001\u0010X\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010È\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner$Delegate;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onJoinStarted", "()V", "onJoinFailed", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onJoinSuccess", "(Landroid/content/Intent;)V", "onMissingRequiredDevice", "initStatusBar", "initToolbar", "", "alphaPercent", "updateToolbarColor", "(F)V", "", "scrollY", "getToolbarAlpha", "(I)F", "initViewModel", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "showProgramDetails", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "setDuration", "program", "showEndorsed", "", "Lcom/withings/programs/model/program/FeatureDomain;", "features", "showFeatures", "(Ljava/util/List;)V", "feature", "Landroid/view/View;", "generateFeatureView", "(Lcom/withings/programs/model/program/FeatureDomain;)Landroid/view/View;", "Lcom/withings/programs/model/program/ScreenshotDomain;", "screenshots", "displayScreenshots", "", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "devices", "displayDevices", "isLoading", "setLoading", "(Z)V", "scrollToDeviceSection", "Lx30/j;", "getProgramByIdUseCase", "Lx30/j;", "getGetProgramByIdUseCase", "()Lx30/j;", "setGetProgramByIdUseCase", "(Lx30/j;)V", "Lx30/l;", "isProgramRunningUseCase", "Lx30/l;", "()Lx30/l;", "setProgramRunningUseCase", "(Lx30/l;)V", "Lx30/h;", "getMostRecentEnrolledProgramLastUpdateUseCase", "Lx30/h;", "getGetMostRecentEnrolledProgramLastUpdateUseCase", "()Lx30/h;", "setGetMostRecentEnrolledProgramLastUpdateUseCase", "(Lx30/h;)V", "Lj30/c;", "enrolledRepository", "Lj30/c;", "getEnrolledRepository", "()Lj30/c;", "setEnrolledRepository", "(Lj30/c;)V", "kotlin.jvm.PlatformType", "topSeparator$delegate", "Lnm0/g;", "getTopSeparator", "()Landroid/view/View;", "topSeparator", "Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/core/widget/NestedScrollView;", "scrollview$delegate", "getScrollview", "()Landroidx/core/widget/NestedScrollView;", "scrollview", "Lcom/withings/views/view/HeightRatioImageView;", "image$delegate", "getImage", "()Lcom/withings/views/view/HeightRatioImageView;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Landroid/widget/TextView;", "title$delegate", "getTitle", "()Landroid/widget/TextView;", "title", "subtitle$delegate", "getSubtitle", "subtitle", "about$delegate", "getAbout", "about", "featuresContainer$delegate", "getFeaturesContainer", "featuresContainer", "Landroid/widget/LinearLayout;", "featuresView$delegate", "getFeaturesView", "()Landroid/widget/LinearLayout;", "featuresView", "programType$delegate", "getProgramType", "programType", "programDuration$delegate", "getProgramDuration", "programDuration", "deviceSectionContainer$delegate", "getDeviceSectionContainer", "deviceSectionContainer", "Lcom/withings/views/view/SectionView;", "deviceSectionTitleView$delegate", "getDeviceSectionTitleView", "()Lcom/withings/views/view/SectionView;", "deviceSectionTitleView", "Landroidx/recyclerview/widget/RecyclerView;", "devicesRecyclerView$delegate", "getDevicesRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "devicesRecyclerView", "screenshotsContainer$delegate", "getScreenshotsContainer", "screenshotsContainer", "screenshotsRecyclerView$delegate", "getScreenshotsRecyclerView", "screenshotsRecyclerView", "endorsedContainer$delegate", "getEndorsedContainer", "endorsedContainer", "endorsedName$delegate", "getEndorsedName", "endorsedName", "Landroid/widget/ImageView;", "endorsedImage$delegate", "getEndorsedImage", "()Landroid/widget/ImageView;", "endorsedImage", "endorsedDescription$delegate", "getEndorsedDescription", "endorsedDescription", "Landroid/widget/Button;", "joinButton$delegate", "getJoinButton", "()Landroid/widget/Button;", "joinButton", "Landroid/widget/ProgressBar;", "joinLoader$delegate", "getJoinLoader", "()Landroid/widget/ProgressBar;", "joinLoader", "Lcom/withings/user/User;", "user$delegate", "getUser", "()Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "programId$delegate", "getProgramId", "()I", NavigationArguments.PROGRAM_ID, "isLastIterationFinished$delegate", "isLastIterationFinished", "()Z", "Landroid/graphics/drawable/Drawable;", "upIcon$delegate", "getUpIcon", "()Landroid/graphics/drawable/Drawable;", "upIcon", "upIconColorFromPalette", "I", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "wellnessProgramJoiner$delegate", "getWellnessProgramJoiner", "()Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoiner;", "wellnessProgramJoiner", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailViewModel;", "viewModel", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailViewModel;", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailsActivity extends Hilt_WellnessProgramDetailsActivity implements WellnessProgramJoiner.Delegate {
    public static final long DAYS = 1;
    private static final String EXTRA_LAST_ITERATION_FINISHED = "EXTRA_LAST_ITERATION_FINISHED";
    private static final String EXTRA_USER = "EXTRA_USER";
    private static final String EXTRA_WELLNESS_PROGRAM_ID = "EXTRA_WELLNESS_PROGRAM_ID";
    public static final long MONTHS = 3;
    private static final int NB_ANIM_PX = 100;
    private static final float STATUS_BAR_ALPHA_START = 0.4f;
    public static final long WEEKS = 2;
    public static final long YEARS = 4;
    @Inject
    public j30.c enrolledRepository;
    @Inject
    public h getMostRecentEnrolledProgramLastUpdateUseCase;
    @Inject
    public j getProgramByIdUseCase;
    @Inject
    public l isProgramRunningUseCase;
    private WellnessProgramDetailViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g topSeparator$delegate = nm0.h.b(new WellnessProgramDetailsActivity$topSeparator$2(this));
    private final g toolbar$delegate = nm0.h.b(new WellnessProgramDetailsActivity$toolbar$2(this));
    private final g scrollview$delegate = nm0.h.b(new WellnessProgramDetailsActivity$scrollview$2(this));
    private final g image$delegate = nm0.h.b(new WellnessProgramDetailsActivity$image$2(this));
    private final g title$delegate = nm0.h.b(new WellnessProgramDetailsActivity$title$2(this));
    private final g subtitle$delegate = nm0.h.b(new WellnessProgramDetailsActivity$subtitle$2(this));
    private final g about$delegate = nm0.h.b(new WellnessProgramDetailsActivity$about$2(this));
    private final g featuresContainer$delegate = nm0.h.b(new WellnessProgramDetailsActivity$featuresContainer$2(this));
    private final g featuresView$delegate = nm0.h.b(new WellnessProgramDetailsActivity$featuresView$2(this));
    private final g programType$delegate = nm0.h.b(new WellnessProgramDetailsActivity$programType$2(this));
    private final g programDuration$delegate = nm0.h.b(new WellnessProgramDetailsActivity$programDuration$2(this));
    private final g deviceSectionContainer$delegate = nm0.h.b(new WellnessProgramDetailsActivity$deviceSectionContainer$2(this));
    private final g deviceSectionTitleView$delegate = nm0.h.b(new WellnessProgramDetailsActivity$deviceSectionTitleView$2(this));
    private final g devicesRecyclerView$delegate = nm0.h.b(new WellnessProgramDetailsActivity$devicesRecyclerView$2(this));
    private final g screenshotsContainer$delegate = nm0.h.b(new WellnessProgramDetailsActivity$screenshotsContainer$2(this));
    private final g screenshotsRecyclerView$delegate = nm0.h.b(new WellnessProgramDetailsActivity$screenshotsRecyclerView$2(this));
    private final g endorsedContainer$delegate = nm0.h.b(new WellnessProgramDetailsActivity$endorsedContainer$2(this));
    private final g endorsedName$delegate = nm0.h.b(new WellnessProgramDetailsActivity$endorsedName$2(this));
    private final g endorsedImage$delegate = nm0.h.b(new WellnessProgramDetailsActivity$endorsedImage$2(this));
    private final g endorsedDescription$delegate = nm0.h.b(new WellnessProgramDetailsActivity$endorsedDescription$2(this));
    private final g joinButton$delegate = nm0.h.b(new WellnessProgramDetailsActivity$joinButton$2(this));
    private final g joinLoader$delegate = nm0.h.b(new WellnessProgramDetailsActivity$joinLoader$2(this));
    private final g user$delegate = nm0.h.b(new WellnessProgramDetailsActivity$user$2(this));
    private final g programId$delegate = nm0.h.b(new WellnessProgramDetailsActivity$programId$2(this));
    private final g isLastIterationFinished$delegate = nm0.h.b(new WellnessProgramDetailsActivity$isLastIterationFinished$2(this));
    private final g upIcon$delegate = nm0.h.b(new WellnessProgramDetailsActivity$upIcon$2(this));
    private int upIconColorFromPalette = -1;
    private final g wellnessProgramJoiner$delegate = nm0.h.b(new WellnessProgramDetailsActivity$wellnessProgramJoiner$2(this));

    /* compiled from: WellnessProgramDetailsActivity.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailsActivity$Companion;", "", "()V", "DAYS", "", WellnessProgramDetailsActivity.EXTRA_LAST_ITERATION_FINISHED, "", WellnessProgramDetailsActivity.EXTRA_USER, WellnessProgramDetailsActivity.EXTRA_WELLNESS_PROGRAM_ID, "MONTHS", "NB_ANIM_PX", "", "STATUS_BAR_ALPHA_START", "", "WEEKS", "YEARS", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", NavigationArguments.PROGRAM_ID, "ProgramDurationUnit", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {

        /* compiled from: WellnessProgramDetailsActivity.kt */
        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramDetailsActivity$Companion$ProgramDurationUnit;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public @interface ProgramDurationUnit {
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, User user, int i11) {
            u.j(context, "context");
            u.j(user, "user");
            Intent putExtra = new Intent(context, WellnessProgramDetailsActivity.class).putExtra(WellnessProgramDetailsActivity.EXTRA_WELLNESS_PROGRAM_ID, i11).putExtra(WellnessProgramDetailsActivity.EXTRA_USER, user);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public final void displayDevices(List<ProgramDeviceContainer> list) {
        int i11;
        View deviceSectionContainer = getDeviceSectionContainer();
        u.i(deviceSectionContainer, "<get-deviceSectionContainer>(...)");
        if (!list.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        deviceSectionContainer.setVisibility(i11);
        getDevicesRecyclerView().setAdapter(new ProgramDeviceAdapter(getUser().q(), list));
    }

    public final void displayScreenshots(List<ScreenshotDomain> list) {
        int i11;
        View screenshotsContainer = getScreenshotsContainer();
        u.i(screenshotsContainer, "<get-screenshotsContainer>(...)");
        if (!list.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        screenshotsContainer.setVisibility(i11);
        getScreenshotsRecyclerView().setAdapter(new ProgramScreenshotsAdapter(list));
    }

    private final View generateFeatureView(FeatureDomain featureDomain) {
        String a11;
        if (featureDomain.getLabel().length() == 0) {
            a11 = featureDomain.getSummary();
        } else {
            a11 = o.a(featureDomain.getLabel(), ": ", featureDomain.getSummary());
        }
        View inflate = getLayoutInflater().inflate(C1987R.layout.view_feature_text, (ViewGroup) null);
        ((TextView) inflate.findViewById(C1987R.id.feature_text)).setText(a11);
        return inflate;
    }

    private final TextView getAbout() {
        return (TextView) this.about$delegate.getValue();
    }

    private final View getDeviceSectionContainer() {
        return (View) this.deviceSectionContainer$delegate.getValue();
    }

    public final SectionView getDeviceSectionTitleView() {
        return (SectionView) this.deviceSectionTitleView$delegate.getValue();
    }

    private final RecyclerView getDevicesRecyclerView() {
        return (RecyclerView) this.devicesRecyclerView$delegate.getValue();
    }

    private final View getEndorsedContainer() {
        return (View) this.endorsedContainer$delegate.getValue();
    }

    private final TextView getEndorsedDescription() {
        return (TextView) this.endorsedDescription$delegate.getValue();
    }

    private final ImageView getEndorsedImage() {
        return (ImageView) this.endorsedImage$delegate.getValue();
    }

    private final TextView getEndorsedName() {
        return (TextView) this.endorsedName$delegate.getValue();
    }

    private final View getFeaturesContainer() {
        return (View) this.featuresContainer$delegate.getValue();
    }

    private final LinearLayout getFeaturesView() {
        return (LinearLayout) this.featuresView$delegate.getValue();
    }

    private final HeightRatioImageView getImage() {
        return (HeightRatioImageView) this.image$delegate.getValue();
    }

    private final Button getJoinButton() {
        return (Button) this.joinButton$delegate.getValue();
    }

    private final ProgressBar getJoinLoader() {
        return (ProgressBar) this.joinLoader$delegate.getValue();
    }

    private final TextView getProgramDuration() {
        return (TextView) this.programDuration$delegate.getValue();
    }

    public final int getProgramId() {
        return ((Number) this.programId$delegate.getValue()).intValue();
    }

    private final TextView getProgramType() {
        return (TextView) this.programType$delegate.getValue();
    }

    private final View getScreenshotsContainer() {
        return (View) this.screenshotsContainer$delegate.getValue();
    }

    private final RecyclerView getScreenshotsRecyclerView() {
        return (RecyclerView) this.screenshotsRecyclerView$delegate.getValue();
    }

    private final NestedScrollView getScrollview() {
        return (NestedScrollView) this.scrollview$delegate.getValue();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle$delegate.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    private final float getToolbarAlpha(int i11) {
        int bottom = (getImage().getBottom() - (getToolbar().getHeight() / 2)) - wq.a.h(this);
        if (i11 > bottom + 100) {
            return 1.0f;
        }
        if (i11 < bottom) {
            return 0.0f;
        }
        return (i11 - bottom) / 100;
    }

    private final View getTopSeparator() {
        return (View) this.topSeparator$delegate.getValue();
    }

    public final Drawable getUpIcon() {
        return (Drawable) this.upIcon$delegate.getValue();
    }

    public final User getUser() {
        return (User) this.user$delegate.getValue();
    }

    public final WellnessProgramJoiner getWellnessProgramJoiner() {
        return (WellnessProgramJoiner) this.wellnessProgramJoiner$delegate.getValue();
    }

    private final void initStatusBar() {
        int i11;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        int i12 = systemUiVisibility | 1024;
        View decorView = getWindow().getDecorView();
        if (ah.u.D(this)) {
            i11 = i12 & (-8193);
        } else {
            i11 = systemUiVisibility | 9216;
        }
        decorView.setSystemUiVisibility(i11);
    }

    private final void initToolbar() {
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.s(getUpIcon());
            supportActionBar.q(true);
        }
        this.upIconColorFromPalette = ah.u.w(C1987R.attr.colorOnPrimary, this, -65281);
        updateToolbarColor(0.0f);
        getScrollview().setOnScrollChangeListener(new y3.b(this));
    }

    public static final void initToolbar$lambda$1(WellnessProgramDetailsActivity this$0, NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        u.j(this$0, "this$0");
        this$0.updateToolbarColor(this$0.getToolbarAlpha(i12));
    }

    private final void initViewModel() {
        WellnessProgramDetailViewModel wellnessProgramDetailViewModel = (WellnessProgramDetailViewModel) new k1(this, new k1.b() { // from class: com.withings.wiscale2.legacyprograms.WellnessProgramDetailsActivity$initViewModel$$inlined$withViewModel$1
            @Override // androidx.lifecycle.k1.b
            public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar) {
                return super.create(cls, aVar);
            }

            @Override // androidx.lifecycle.k1.b
            public <U extends g1> U create(Class<U> modelClass) {
                User user;
                int programId;
                WellnessProgramJoiner wellnessProgramJoiner;
                u.j(modelClass, "modelClass");
                Application application = WellnessProgramDetailsActivity.this.getApplication();
                u.i(application, "getApplication(...)");
                user = WellnessProgramDetailsActivity.this.getUser();
                u.i(user, "access$getUser(...)");
                programId = WellnessProgramDetailsActivity.this.getProgramId();
                j getProgramByIdUseCase = WellnessProgramDetailsActivity.this.getGetProgramByIdUseCase();
                wellnessProgramJoiner = WellnessProgramDetailsActivity.this.getWellnessProgramJoiner();
                return new WellnessProgramDetailViewModel(application, user, programId, getProgramByIdUseCase, wellnessProgramJoiner);
            }
        }).a(WellnessProgramDetailViewModel.class);
        xw.d.c(this, wellnessProgramDetailViewModel.getWellnessProgram(), new WellnessProgramDetailsActivity$initViewModel$2$1(this));
        xw.d.c(this, wellnessProgramDetailViewModel.getFeatures(), new WellnessProgramDetailsActivity$initViewModel$2$2(this));
        xw.d.c(this, wellnessProgramDetailViewModel.getDeviceSectionTitle(), new WellnessProgramDetailsActivity$initViewModel$2$3(this));
        xw.d.c(this, wellnessProgramDetailViewModel.getScreenshots(), new WellnessProgramDetailsActivity$initViewModel$2$4(this));
        xw.d.c(this, wellnessProgramDetailViewModel.getProgramDevices(), new WellnessProgramDetailsActivity$initViewModel$2$5(this));
        this.viewModel = wellnessProgramDetailViewModel;
    }

    private final boolean isLastIterationFinished() {
        return ((Boolean) this.isLastIterationFinished$delegate.getValue()).booleanValue();
    }

    private final void scrollToDeviceSection() {
        Rect rect = new Rect();
        getDeviceSectionTitleView().getGlobalVisibleRect(rect);
        getScrollview().u(0, rect.top - getDeviceSectionTitleView().getHeight());
    }

    private final void setDuration(ProgramDomain.LegacyDomain legacyDomain) {
        Integer num;
        DurationDomain durationJson;
        Long l5;
        boolean z5;
        DurationDomain durationJson2 = legacyDomain.getDurationJson();
        String str = null;
        if (durationJson2 != null) {
            num = Integer.valueOf(durationJson2.getValue());
        } else {
            num = null;
        }
        TextView programDuration = getProgramDuration();
        if (legacyDomain.getDurationJson() != null) {
            l5 = Long.valueOf(durationJson.getValue());
        } else {
            l5 = null;
        }
        if (l5 != null && l5.longValue() == 1) {
            str = num + " " + getString(C1987R.string._PROGRAM_DURATION_DAYS_);
        } else if (l5 != null && l5.longValue() == 2) {
            str = num + " " + getString(C1987R.string._PROGRAM_DURATION_WEEKS_);
        } else if (l5 != null && l5.longValue() == 3) {
            str = num + " " + getString(C1987R.string._PROGRAM_DURATION_MONTHS_);
        } else if (l5 != null && l5.longValue() == 4) {
            str = num + " " + getString(C1987R.string._PROGRAM_DURATION_YEARS_);
        }
        programDuration.setText(str);
        if (num != null) {
            TextView programDuration2 = getProgramDuration();
            u.i(programDuration2, "<get-programDuration>(...)");
            int i11 = 0;
            if (num.intValue() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i11 = 8;
            }
            programDuration2.setVisibility(i11);
        }
    }

    private final void setLoading(boolean z5) {
        int i11;
        SpecificsDomain specifics;
        ProgressBar joinLoader = getJoinLoader();
        u.i(joinLoader, "<get-joinLoader>(...)");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        joinLoader.setVisibility(i11);
        getJoinButton().setEnabled(!z5);
        Button joinButton = getJoinButton();
        WellnessProgramDetailViewModel wellnessProgramDetailViewModel = this.viewModel;
        String str = null;
        if (wellnessProgramDetailViewModel != null) {
            ProgramDomain.LegacyDomain value = wellnessProgramDetailViewModel.getWellnessProgram().getValue();
            if (value != null && (specifics = value.getSpecifics()) != null) {
                str = specifics.getCta();
            }
            joinButton.setText(str);
            return;
        }
        u.s("viewModel");
        throw null;
    }

    private final void showEndorsed(ProgramDomain.LegacyDomain legacyDomain) {
        int i11;
        String image;
        String description;
        String name;
        View endorsedContainer = getEndorsedContainer();
        u.i(endorsedContainer, "<get-endorsedContainer>(...)");
        if (legacyDomain.getSpecifics().getSponsors() != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        endorsedContainer.setVisibility(i11);
        SponsorsDomain sponsors = legacyDomain.getSpecifics().getSponsors();
        if (sponsors != null && (name = sponsors.getName()) != null) {
            getEndorsedName().setText(getString(C1987R.string._ENDORSED_BY_) + "\n" + name);
        }
        SponsorsDomain sponsors2 = legacyDomain.getSpecifics().getSponsors();
        if (sponsors2 != null && (description = sponsors2.getDescription()) != null) {
            getEndorsedDescription().setText(description);
        }
        SponsorsDomain sponsors3 = legacyDomain.getSpecifics().getSponsors();
        if (sponsors3 != null && (image = sponsors3.getImage()) != null) {
            ImageView endorsedImage = getEndorsedImage();
            u.i(endorsedImage, "<get-endorsedImage>(...)");
            w9.g a11 = w9.a.a(endorsedImage.getContext());
            f.a aVar = new f.a(endorsedImage.getContext());
            aVar.d(image);
            aVar.q(endorsedImage);
            aVar.s(new ja.a());
            a11.d(aVar.b());
        }
    }

    public final void showFeatures(List<FeatureDomain> list) {
        int i11;
        View featuresContainer = getFeaturesContainer();
        u.i(featuresContainer, "<get-featuresContainer>(...)");
        if (list.isEmpty()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        featuresContainer.setVisibility(i11);
        for (FeatureDomain featureDomain : list) {
            getFeaturesView().addView(generateFeatureView(featureDomain), 0);
        }
        getScrollview().scrollTo(0, 0);
    }

    public final void showProgramDetails(ProgramDomain.LegacyDomain legacyDomain) {
        String cta;
        setTitle(legacyDomain.getSpecifics().getTitle());
        HeightRatioImageView image = getImage();
        u.i(image, "<get-image>(...)");
        String str = legacyDomain.getSpecifics().getImageFull() + "?" + System.currentTimeMillis();
        w9.g a11 = w9.a.a(image.getContext());
        f.a aVar = new f.a(image.getContext());
        aVar.d(str);
        aVar.q(image);
        aVar.s(new ja.c() { // from class: com.withings.wiscale2.legacyprograms.WellnessProgramDetailsActivity$showProgramDetails$1$1
            private final String cacheKey = "paletteTransformer";

            @Override // ja.c
            public String getCacheKey() {
                return this.cacheKey;
            }

            @Override // ja.c
            public Object transform(Bitmap bitmap, ha.e eVar, qm0.d<? super Bitmap> dVar) {
                int i11;
                Drawable upIcon;
                int i12;
                u8.b a12 = new b.C1696b(bitmap).a();
                WellnessProgramDetailsActivity wellnessProgramDetailsActivity = WellnessProgramDetailsActivity.this;
                b.d b10 = a12.b(u8.c.f101584g);
                if (b10 != null) {
                    i11 = b10.e();
                } else {
                    i11 = -1;
                }
                wellnessProgramDetailsActivity.upIconColorFromPalette = i11;
                upIcon = WellnessProgramDetailsActivity.this.getUpIcon();
                if (upIcon != null) {
                    i12 = WellnessProgramDetailsActivity.this.upIconColorFromPalette;
                    upIcon.setTint(i12);
                }
                return bitmap;
            }
        });
        a11.d(aVar.b());
        getTitle().setText(legacyDomain.getSpecifics().getTitle());
        getSubtitle().setText(legacyDomain.getSpecifics().getSubtitle());
        getAbout().setText(legacyDomain.getSpecifics().getAbout());
        getProgramType().setText((CharSequence) x.I(legacyDomain.getSpecifics().getTags()));
        setDuration(legacyDomain);
        Button joinButton = getJoinButton();
        if (isLastIterationFinished()) {
            cta = getString(C1987R.string.programsOverview_restart_btn);
        } else {
            cta = legacyDomain.getSpecifics().getCta();
        }
        joinButton.setText(cta);
        getJoinButton().setOnClickListener(new je0.c(2, this, legacyDomain));
        showEndorsed(legacyDomain);
    }

    public static final void showProgramDetails$lambda$5(WellnessProgramDetailsActivity this$0, ProgramDomain.LegacyDomain wellnessProgram, View view) {
        u.j(this$0, "this$0");
        u.j(wellnessProgram, "$wellnessProgram");
        WellnessProgramDetailViewModel wellnessProgramDetailViewModel = this$0.viewModel;
        if (wellnessProgramDetailViewModel != null) {
            wellnessProgramDetailViewModel.joinProgram(wellnessProgram);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    private final void updateToolbarColor(float f11) {
        int i11;
        Context context = getToolbar().getContext();
        u.i(context, "getContext(...)");
        int w11 = ah.u.w(C1987R.attr.colorOnSurface, context, -65281);
        Drawable background = getTopSeparator().getBackground();
        u.h(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        int color = ((ColorDrawable) background).getColor();
        Context context2 = getToolbar().getContext();
        u.i(context2, "getContext(...)");
        int w12 = ah.u.w(C1987R.attr.colorSurface, context2, -65281);
        getToolbar().setTitleTextColor(ah.u.j(f11, w11));
        getTopSeparator().setBackgroundColor(ah.u.j(f11, color));
        getToolbar().setBackgroundColor(ah.u.j(f11, w12));
        float f12 = STATUS_BAR_ALPHA_START;
        if (f11 >= STATUS_BAR_ALPHA_START) {
            f12 = f11;
        }
        getWindow().setStatusBarColor(ah.u.j(f12, w12));
        Drawable upIcon = getUpIcon();
        if (upIcon != null) {
            if (f11 >= 1.0f) {
                i11 = ah.u.w(C1987R.attr.colorOnPrimary, this, -65281);
            } else {
                i11 = this.upIconColorFromPalette;
            }
            upIcon.setTint(i11);
        }
    }

    public final j30.c getEnrolledRepository() {
        j30.c cVar = this.enrolledRepository;
        if (cVar != null) {
            return cVar;
        }
        u.s("enrolledRepository");
        throw null;
    }

    public final h getGetMostRecentEnrolledProgramLastUpdateUseCase() {
        h hVar = this.getMostRecentEnrolledProgramLastUpdateUseCase;
        if (hVar != null) {
            return hVar;
        }
        u.s("getMostRecentEnrolledProgramLastUpdateUseCase");
        throw null;
    }

    public final j getGetProgramByIdUseCase() {
        j jVar = this.getProgramByIdUseCase;
        if (jVar != null) {
            return jVar;
        }
        u.s("getProgramByIdUseCase");
        throw null;
    }

    public final l isProgramRunningUseCase() {
        l lVar = this.isProgramRunningUseCase;
        if (lVar != null) {
            return lVar;
        }
        u.s("isProgramRunningUseCase");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.wiscale2.legacyprograms.Hilt_WellnessProgramDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wellness_program_details);
        initStatusBar();
        initToolbar();
        initViewModel();
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.Delegate
    public void onJoinFailed() {
        setLoading(false);
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.Delegate
    public void onJoinStarted() {
        setLoading(true);
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.Delegate
    public void onJoinSuccess(Intent intent) {
        u.j(intent, "intent");
        setLoading(false);
        startActivity(intent);
        finish();
    }

    @Override // com.withings.wiscale2.legacyprograms.WellnessProgramJoiner.Delegate
    public void onMissingRequiredDevice() {
        setLoading(false);
        RecyclerView.Adapter adapter = getDevicesRecyclerView().getAdapter();
        u.h(adapter, "null cannot be cast to non-null type com.withings.wiscale2.legacyprograms.ProgramDeviceAdapter");
        ((ProgramDeviceAdapter) adapter).highlightMissingDevices();
        scrollToDeviceSection();
        Toast.makeText(this, (int) C1987R.string._PROGRAM_REQUIRED_DEVICE_TOAST_MESSAGE_, 1).show();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public final void setEnrolledRepository(j30.c cVar) {
        u.j(cVar, "<set-?>");
        this.enrolledRepository = cVar;
    }

    public final void setGetMostRecentEnrolledProgramLastUpdateUseCase(h hVar) {
        u.j(hVar, "<set-?>");
        this.getMostRecentEnrolledProgramLastUpdateUseCase = hVar;
    }

    public final void setGetProgramByIdUseCase(j jVar) {
        u.j(jVar, "<set-?>");
        this.getProgramByIdUseCase = jVar;
    }

    public final void setProgramRunningUseCase(l lVar) {
        u.j(lVar, "<set-?>");
        this.isProgramRunningUseCase = lVar;
    }
}
