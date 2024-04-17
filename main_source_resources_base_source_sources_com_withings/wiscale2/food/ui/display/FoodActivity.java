package com.withings.wiscale2.food.ui.display;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.e;
import bn0.d;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.food.model.FoodDayDownloadDelegateFactory;
import en0.i;
import fn0.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import org.joda.time.DateTime;
import qw.a;
/* compiled from: FoodActivity.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0007}~\u007f\u0080\u0001\u0081\u0001B\u0007¢\u0006\u0004\b|\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\tJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\tJ\u0017\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR!\u0010J\u001a\b\u0012\u0004\u0012\u00020@0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR!\u0010O\u001a\b\u0012\u0004\u0012\u00020@0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR#\u0010W\u001a\n S*\u0004\u0018\u00010R0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010G\u001a\u0004\bU\u0010VR#\u0010\\\u001a\n S*\u0004\u0018\u00010X0X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010G\u001a\u0004\bZ\u0010[R#\u0010a\u001a\n S*\u0004\u0018\u00010]0]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010G\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u001f\u0010i\u001a\u00060eR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010G\u001a\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u001f\u0010q\u001a\u00060mR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010G\u001a\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0016X\u0096D¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{¨\u0006\u0082\u0001"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onStop", "onDestroy", "outState", "onSaveInstanceState", "onRestoreInstanceState", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "initToolbar", "initViewPager", "loadAdapters", "initDownloadManager", "Lorg/joda/time/DateTime;", "firstDate", "maxDate", "initAdapters", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "updateViewPager", "Lqw/a$c;", "getPositionToDateConverter", "()Lqw/a$c;", "Landroidx/viewpager/widget/e;", "getPagerAdapter", "()Landroidx/viewpager/widget/e;", "Lqw/a$b;", "getDownloaderListener", "()Lqw/a$b;", "Landroidx/viewpager/widget/ViewPager$h;", "getOnPageChangeListener", "()Landroidx/viewpager/widget/ViewPager$h;", "onPeriodChanged", "", "position", "onAdapterPositionChanged", "(I)V", "Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegateFactory;", "foodDayDownloadDelegateFactory", "Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegateFactory;", "getFoodDayDownloadDelegateFactory", "()Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegateFactory;", "setFoodDayDownloadDelegateFactory", "(Lcom/withings/wiscale2/food/model/FoodDayDownloadDelegateFactory;)V", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/periodsbar/Period;", "defaultPeriod$delegate", "getDefaultPeriod", "()Lcom/withings/periodsbar/Period;", "defaultPeriod", "", "periodList$delegate", "Lnm0/g;", "getPeriodList", "()Ljava/util/List;", "periodList", "Lk1/r0;", "period$delegate", "getPeriod", "()Lk1/r0;", "period", "date", "Lorg/joda/time/DateTime;", "Landroidx/appcompat/widget/Toolbar;", "kotlin.jvm.PlatformType", "toolbar$delegate", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/compose/ui/platform/ComposeView;", "topPeriodBar$delegate", "getTopPeriodBar", "()Landroidx/compose/ui/platform/ComposeView;", "topPeriodBar", "Lcom/withings/views/view/BlockableViewPager;", "viewPager$delegate", "getViewPager", "()Lcom/withings/views/view/BlockableViewPager;", "viewPager", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "dayPagerAdapter", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayOnPageChangeListener;", "dayOnPageChangeListener$delegate", "getDayOnPageChangeListener", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayOnPageChangeListener;", "dayOnPageChangeListener", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "weekPagerAdapter", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekOnPageChangeListener;", "weekOnPageChangeListener$delegate", "getWeekOnPageChangeListener", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekOnPageChangeListener;", "weekOnPageChangeListener", "Lqw/a;", "downloadManager", "Lqw/a;", "currentScroll", "I", "", "analyticsDetailsViewIdentifier", "Ljava/lang/String;", "getAnalyticsDetailsViewIdentifier", "()Ljava/lang/String;", "<init>", "Companion", "DayOnPageChangeListener", "DayPagerAdapter", "WeekOnPageChangeListener", "WeekPagerAdapter", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodActivity extends Hilt_FoodActivity implements py.a {
    private static final String EXTRA_DATE = "EXTRA_DATE";
    private static final String EXTRA_PERIOD = "EXTRA_PERIOD";
    private static final String EXTRA_USER = "EXTRA_USER";
    private final int currentScroll;
    private DateTime date;
    private DayPagerAdapter dayPagerAdapter;
    private qw.a downloadManager;
    @Inject
    public FoodDayDownloadDelegateFactory foodDayDownloadDelegateFactory;
    private WeekPagerAdapter weekPagerAdapter;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(FoodActivity.class, "defaultPeriod", "getDefaultPeriod()Lcom/withings/periodsbar/Period;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final d user$delegate = new d<Activity, User>() { // from class: com.withings.wiscale2.food.ui.display.FoodActivity$special$$inlined$extra$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.display.FoodActivity$special$$inlined$extra$1$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends w implements ym0.a<User> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
            @Override // ym0.a
            public final User invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final User getExtra() {
            if (Parcelable.class.isAssignableFrom(User.class)) {
                return (User) b0.F(this, r2);
            }
            if (Serializable.class.isAssignableFrom(User.class)) {
                return (User) b0.H(this, r2);
            }
            String str = r2;
            fn0.d b10 = q0.b(User.class);
            throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.user.User, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public User getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ User getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
        public final User getValue() {
            return this.value$delegate.getValue();
        }
    };
    private final d defaultPeriod$delegate = new d<Activity, Period>() { // from class: com.withings.wiscale2.food.ui.display.FoodActivity$special$$inlined$extra$2
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.display.FoodActivity$special$$inlined$extra$2$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends w implements ym0.a<Period> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.periodsbar.Period, java.lang.Object] */
            @Override // ym0.a
            public final Period invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Period getExtra() {
            if (Parcelable.class.isAssignableFrom(Period.class)) {
                return (Period) b0.F(this, r2);
            }
            if (Serializable.class.isAssignableFrom(Period.class)) {
                return (Period) b0.H(this, r2);
            }
            String str = r2;
            fn0.d b10 = q0.b(Period.class);
            throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.periodsbar.Period, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public Period getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.periodsbar.Period, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ Period getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.periodsbar.Period, java.lang.Object] */
        public final Period getValue() {
            return this.value$delegate.getValue();
        }
    };
    private final g periodList$delegate = h.b(FoodActivity$periodList$2.INSTANCE);
    private final g period$delegate = h.b(new FoodActivity$period$2(this));
    private final g toolbar$delegate = h.b(new FoodActivity$toolbar$2(this));
    private final g topPeriodBar$delegate = h.b(new FoodActivity$topPeriodBar$2(this));
    private final g viewPager$delegate = h.b(new FoodActivity$viewPager$2(this));
    private final g dayOnPageChangeListener$delegate = h.b(new FoodActivity$dayOnPageChangeListener$2(this));
    private final g weekOnPageChangeListener$delegate = h.b(new FoodActivity$weekOnPageChangeListener$2(this));
    private final String analyticsDetailsViewIdentifier = "food";

    /* compiled from: FoodActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity$Companion;", "", "()V", FoodActivity.EXTRA_DATE, "", FoodActivity.EXTRA_PERIOD, FoodActivity.EXTRA_USER, "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "defaultPeriod", "Lcom/withings/periodsbar/Period;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, User user, Period period, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                period = Period.f43721f;
            }
            return companion.createIntent(context, user, period);
        }

        public final Intent createIntent(Context context, User user, Period defaultPeriod) {
            u.j(context, "context");
            u.j(user, "user");
            u.j(defaultPeriod, "defaultPeriod");
            Intent putExtra = new Intent(context, FoodActivity.class).putExtra(FoodActivity.EXTRA_USER, user).putExtra(FoodActivity.EXTRA_PERIOD, defaultPeriod);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FoodActivity.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "Lqy/a;", "Lqw/a$b;", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;", "getFragment", "(Lorg/joda/time/DateTime;)Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;", "", "position", "", "getPageTitle", "(I)Ljava/lang/String;", "start", "end", "Lnm0/y;", "onLoaded", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "getUser", "()Lcom/withings/user/User;", "Landroidx/fragment/app/FragmentManager;", "fm", "firstDate", "mostRecentDay", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/withings/user/User;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class DayPagerAdapter extends qy.a implements a.b {
        private final Context context;
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayPagerAdapter(Context context, FragmentManager fm2, User user, DateTime firstDate, DateTime mostRecentDay) {
            super(fm2, firstDate, mostRecentDay);
            u.j(context, "context");
            u.j(fm2, "fm");
            u.j(user, "user");
            u.j(firstDate, "firstDate");
            u.j(mostRecentDay, "mostRecentDay");
            this.context = context;
            this.user = user;
        }

        public final Context getContext() {
            return this.context;
        }

        public final User getUser() {
            return this.user;
        }

        @Override // qw.a.b
        public void onLoaded(DateTime start, DateTime end) {
            u.j(start, "start");
            u.j(end, "end");
        }

        @Override // qy.a
        public FoodDayFragment getFragment(DateTime day) {
            u.j(day, "day");
            return FoodDayFragment.Companion.newInstance(this.user, day);
        }

        @Override // androidx.viewpager.widget.e
        public String getPageTitle(int i11) {
            DateTime date = getDate(i11);
            u.i(date, "getDate(...)");
            return b50.b.i(this.context, date);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FoodActivity.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "Lty/a;", "Lqw/a$b;", "", "position", "", "getPageTitle", "(I)Ljava/lang/String;", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;", "getFragment", "(Lorg/joda/time/DateTime;)Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;", "start", "end", "Lnm0/y;", "onLoaded", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "getUser", "()Lcom/withings/user/User;", "Landroidx/fragment/app/FragmentManager;", "fm", "firstDate", "mostRecentDay", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lcom/withings/user/User;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class WeekPagerAdapter extends ty.a implements a.b {
        private final Context context;
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeekPagerAdapter(Context context, FragmentManager fm2, User user, DateTime firstDate, DateTime mostRecentDay) {
            super(fm2, firstDate, mostRecentDay);
            u.j(context, "context");
            u.j(fm2, "fm");
            u.j(user, "user");
            u.j(firstDate, "firstDate");
            u.j(mostRecentDay, "mostRecentDay");
            this.context = context;
            this.user = user;
        }

        public final Context getContext() {
            return this.context;
        }

        public final User getUser() {
            return this.user;
        }

        @Override // qw.a.b
        public void onLoaded(DateTime start, DateTime end) {
            u.j(start, "start");
            u.j(end, "end");
        }

        @Override // ty.a
        public FoodWeekFragment getFragment(DateTime day) {
            u.j(day, "day");
            return FoodWeekFragment.Companion.newInstance(this.user, day);
        }

        @Override // androidx.viewpager.widget.e
        public String getPageTitle(int i11) {
            DateTime week = getWeek(i11);
            u.i(week, "getWeek(...)");
            return b50.b.p(this.context, week);
        }
    }

    private final DayOnPageChangeListener getDayOnPageChangeListener() {
        return (DayOnPageChangeListener) this.dayOnPageChangeListener$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Period getDefaultPeriod() {
        return (Period) this.defaultPeriod$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final a.b getDownloaderListener() {
        a.b bVar;
        if (getPeriod().getValue() == Period.f43721f) {
            bVar = this.dayPagerAdapter;
            if (bVar == null) {
                u.s("dayPagerAdapter");
                throw null;
            }
        } else {
            bVar = this.weekPagerAdapter;
            if (bVar == null) {
                u.s("weekPagerAdapter");
                throw null;
            }
        }
        return bVar;
    }

    private final ViewPager.h getOnPageChangeListener() {
        if (getPeriod().getValue() == Period.f43721f) {
            return getDayOnPageChangeListener();
        }
        return getWeekOnPageChangeListener();
    }

    private final e getPagerAdapter() {
        e eVar;
        if (getPeriod().getValue() == Period.f43721f) {
            eVar = this.dayPagerAdapter;
            if (eVar == null) {
                u.s("dayPagerAdapter");
                throw null;
            }
        } else {
            eVar = this.weekPagerAdapter;
            if (eVar == null) {
                u.s("weekPagerAdapter");
                throw null;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0<Period> getPeriod() {
        return (r0) this.period$delegate.getValue();
    }

    private final List<Period> getPeriodList() {
        return (List) this.periodList$delegate.getValue();
    }

    private final a.c getPositionToDateConverter() {
        a.c cVar;
        if (getPeriod().getValue() == Period.f43721f) {
            cVar = this.dayPagerAdapter;
            if (cVar == null) {
                u.s("dayPagerAdapter");
                throw null;
            }
        } else {
            cVar = this.weekPagerAdapter;
            if (cVar == null) {
                u.s("weekPagerAdapter");
                throw null;
            }
        }
        return cVar;
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    private final ComposeView getTopPeriodBar() {
        return (ComposeView) this.topPeriodBar$delegate.getValue();
    }

    private final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlockableViewPager getViewPager() {
        return (BlockableViewPager) this.viewPager$delegate.getValue();
    }

    private final WeekOnPageChangeListener getWeekOnPageChangeListener() {
        return (WeekOnPageChangeListener) this.weekOnPageChangeListener$delegate.getValue();
    }

    private final void initAdapters(DateTime dateTime, DateTime dateTime2) {
        DateTime dateTime3 = this.date;
        if (dateTime3 != null) {
            if (dateTime3.isAfter(dateTime2)) {
                this.date = dateTime2;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            this.dayPagerAdapter = new DayPagerAdapter(this, supportFragmentManager, getUser(), dateTime, dateTime2);
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            u.i(supportFragmentManager2, "getSupportFragmentManager(...)");
            this.weekPagerAdapter = new WeekPagerAdapter(this, supportFragmentManager2, getUser(), dateTime, dateTime2);
            updateViewPager();
            return;
        }
        u.s("date");
        throw null;
    }

    private final void initDownloadManager() {
        qw.a aVar = this.downloadManager;
        if (aVar != null) {
            aVar.q();
        }
        qw.a aVar2 = new qw.a(new ui.b(this), getFoodDayDownloadDelegateFactory().create(getUser(), getPositionToDateConverter()), 1, DateTime.now(), 7);
        aVar2.o(getDownloaderListener());
        aVar2.p();
        this.downloadManager = aVar2;
    }

    private final void initToolbar() {
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }

    private final void initViewPager() {
        getViewPager().setOffscreenPageLimit(2);
    }

    private final void loadAdapters() {
        DateTime h11 = getUser().h();
        u.i(h11, "getCreationDate(...)");
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        initAdapters(h11, now);
        initDownloadManager();
        qw.a aVar = this.downloadManager;
        if (aVar != null) {
            aVar.k(getViewPager().getCurrentItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterPositionChanged(int i11) {
        int i12;
        DateTime date = getPositionToDateConverter().getDate(i11);
        u.i(date, "getDate(...)");
        this.date = date;
        qw.a aVar = this.downloadManager;
        if (aVar != null) {
            if (getPeriod().getValue() == Period.f43721f) {
                i12 = 0;
            } else {
                i12 = 7;
            }
            aVar.k(i12 + i11);
        }
        e pagerAdapter = getPagerAdapter();
        if (pagerAdapter instanceof DayPagerAdapter) {
            DateTime date2 = ((DayPagerAdapter) pagerAdapter).getDate(i11);
            u.i(date2, "getDate(...)");
            b0.V(this, getPeriod().getValue(), date2);
        } else if (pagerAdapter instanceof WeekPagerAdapter) {
            DateTime date3 = ((WeekPagerAdapter) pagerAdapter).getDate(i11);
            u.i(date3, "getDate(...)");
            b0.V(this, getPeriod().getValue(), date3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPeriodChanged() {
        updateViewPager();
        initDownloadManager();
    }

    private final void updateViewPager() {
        BlockableViewPager viewPager = getViewPager();
        viewPager.A(getDayOnPageChangeListener());
        viewPager.A(getWeekOnPageChangeListener());
        viewPager.c(getOnPageChangeListener());
        viewPager.setAdapter(getPagerAdapter());
        viewPager.D(getPagerAdapter().getCount(), false);
    }

    @Override // py.a
    public String getAnalyticsDetailsViewIdentifier() {
        return this.analyticsDetailsViewIdentifier;
    }

    public final FoodDayDownloadDelegateFactory getFoodDayDownloadDelegateFactory() {
        FoodDayDownloadDelegateFactory foodDayDownloadDelegateFactory = this.foodDayDownloadDelegateFactory;
        if (foodDayDownloadDelegateFactory != null) {
            return foodDayDownloadDelegateFactory;
        }
        u.s("foodDayDownloadDelegateFactory");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r4 == null) goto L15;
     */
    @Override // com.withings.wiscale2.food.ui.display.Hilt_FoodActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L25
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L14
            java.io.Serializable r4 = com.withings.wiscale2.food.ui.display.b.a(r4)
            goto L21
        L14:
            java.lang.String r0 = "EXTRA_DATE"
            java.io.Serializable r4 = r4.getSerializableExtra(r0)
            boolean r0 = r4 instanceof org.joda.time.DateTime
            if (r0 != 0) goto L1f
            r4 = 0
        L1f:
            org.joda.time.DateTime r4 = (org.joda.time.DateTime) r4
        L21:
            org.joda.time.DateTime r4 = (org.joda.time.DateTime) r4
            if (r4 != 0) goto L2a
        L25:
            org.joda.time.DateTime r4 = new org.joda.time.DateTime
            r4.<init>()
        L2a:
            r3.date = r4
            r4 = 2131558467(0x7f0d0043, float:1.874225E38)
            r3.setContentView(r4)
            java.util.List r4 = r3.getPeriodList()
            k1.r0 r0 = r3.getPeriod()
            androidx.compose.ui.platform.ComposeView r1 = r3.getTopPeriodBar()
            java.lang.String r2 = "<get-topPeriodBar>(...)"
            kotlin.jvm.internal.u.i(r1, r2)
            com.withings.wiscale2.food.ui.display.FoodActivity$onCreate$1 r2 = new com.withings.wiscale2.food.ui.display.FoodActivity$onCreate$1
            r2.<init>(r3)
            g20.g.f(r4, r0, r1, r2)
            r3.initToolbar()
            r3.initViewPager()
            r3.loadAdapters()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.food.ui.display.FoodActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.activity_food, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.wiscale2.food.ui.display.Hilt_FoodActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        vh.h.b(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C1987R.id.action_food) {
            FoodOptionSheetFragment.Companion.newInstance(getUser()).show(getSupportFragmentManager(), "foodOptionSheet");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Serializable] */
    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Period period;
        Object obj;
        ?? serializable;
        u.j(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        r0<Period> period2 = getPeriod();
        int i11 = Build.VERSION.SDK_INT;
        Serializable serializable2 = null;
        if (i11 >= 33) {
            serializable = savedInstanceState.getSerializable("period", Period.class);
            period = serializable;
        } else {
            Serializable serializable3 = savedInstanceState.getSerializable("period");
            if (!(serializable3 instanceof Period)) {
                serializable3 = null;
            }
            period = (Period) serializable3;
        }
        u.g(period);
        period2.setValue(period);
        if (i11 >= 33) {
            obj = savedInstanceState.getSerializable("date", DateTime.class);
        } else {
            Serializable serializable4 = savedInstanceState.getSerializable("date");
            if (serializable4 instanceof DateTime) {
                serializable2 = serializable4;
            }
            obj = (DateTime) serializable2;
        }
        u.g(obj);
        this.date = (DateTime) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qw.a aVar = this.downloadManager;
        if (aVar != null) {
            aVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        u.j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("period", getPeriod().getValue());
        DateTime dateTime = this.date;
        if (dateTime != null) {
            outState.putSerializable("date", dateTime);
        } else {
            u.s("date");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        qw.a aVar = this.downloadManager;
        if (aVar != null) {
            aVar.q();
        }
        super.onStop();
    }

    public final void setFoodDayDownloadDelegateFactory(FoodDayDownloadDelegateFactory foodDayDownloadDelegateFactory) {
        u.j(foodDayDownloadDelegateFactory, "<set-?>");
        this.foodDayDownloadDelegateFactory = foodDayDownloadDelegateFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FoodActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayOnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$h;", "", "position", "Lnm0/y;", "onPageSelected", "(I)V", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "state", "onPageScrollStateChanged", "Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "activity", "Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "getActivity", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "adapter", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "getAdapter", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;", "<init>", "(Lcom/withings/wiscale2/food/ui/display/FoodActivity;Lcom/withings/wiscale2/food/ui/display/FoodActivity;Lcom/withings/wiscale2/food/ui/display/FoodActivity$DayPagerAdapter;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class DayOnPageChangeListener implements ViewPager.h {
        private final FoodActivity activity;
        private final DayPagerAdapter adapter;
        final /* synthetic */ FoodActivity this$0;

        public DayOnPageChangeListener(FoodActivity foodActivity, FoodActivity activity, DayPagerAdapter adapter) {
            u.j(activity, "activity");
            u.j(adapter, "adapter");
            this.this$0 = foodActivity;
            this.activity = activity;
            this.adapter = adapter;
        }

        public final FoodActivity getActivity() {
            return this.activity;
        }

        public final DayPagerAdapter getAdapter() {
            return this.adapter;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageScrollStateChanged(int i11) {
            Object obj;
            if (i11 == 1) {
                int currentItem = this.activity.getViewPager().getCurrentItem();
                List<Fragment> f02 = this.this$0.getSupportFragmentManager().f0();
                u.i(f02, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : f02) {
                    if (obj2 instanceof FoodDayFragment) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Bundle a11 = yq.b.a((FoodDayFragment) next);
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = a11.getSerializable(FoodDayFragment.ARG_DAY, DateTime.class);
                    } else {
                        Serializable serializable = a11.getSerializable(FoodDayFragment.ARG_DAY);
                        if (!(serializable instanceof DateTime)) {
                            serializable = null;
                        }
                        obj = (DateTime) serializable;
                    }
                    u.g(obj);
                    if (this.adapter.getPosition((DateTime) obj) != currentItem) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((FoodDayFragment) it2.next()).scrollTo(this.activity.currentScroll);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageSelected(int i11) {
            this.activity.onAdapterPositionChanged(i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageScrolled(int i11, float f11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FoodActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekOnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$h;", "", "position", "Lnm0/y;", "onPageSelected", "(I)V", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "state", "onPageScrollStateChanged", "Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "activity", "Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "getActivity", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity;", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "adapter", "Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "getAdapter", "()Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;", "<init>", "(Lcom/withings/wiscale2/food/ui/display/FoodActivity;Lcom/withings/wiscale2/food/ui/display/FoodActivity;Lcom/withings/wiscale2/food/ui/display/FoodActivity$WeekPagerAdapter;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class WeekOnPageChangeListener implements ViewPager.h {
        private final FoodActivity activity;
        private final WeekPagerAdapter adapter;
        final /* synthetic */ FoodActivity this$0;

        public WeekOnPageChangeListener(FoodActivity foodActivity, FoodActivity activity, WeekPagerAdapter adapter) {
            u.j(activity, "activity");
            u.j(adapter, "adapter");
            this.this$0 = foodActivity;
            this.activity = activity;
            this.adapter = adapter;
        }

        public final FoodActivity getActivity() {
            return this.activity;
        }

        public final WeekPagerAdapter getAdapter() {
            return this.adapter;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageScrollStateChanged(int i11) {
            if (i11 == 1) {
                DateTime week = this.adapter.getWeek(this.activity.getViewPager().getCurrentItem());
                i iVar = new i(-1, 1, 1);
                ArrayList<Number> arrayList = new ArrayList();
                for (Integer num : iVar) {
                    if (week.plusDays(num.intValue()).minusSeconds(1).isBefore(this.adapter.getTheMostRecentWeek())) {
                        arrayList.add(num);
                    }
                }
                ArrayList<Fragment> arrayList2 = new ArrayList();
                for (Number number : arrayList) {
                    Fragment aVar = this.adapter.getInstance(week.plusWeeks(number.intValue()));
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                for (Fragment fragment : arrayList2) {
                    u.h(fragment, "null cannot be cast to non-null type com.withings.wiscale2.food.ui.display.FoodWeekFragment");
                    ((FoodWeekFragment) fragment).customScrollTo(this.activity.currentScroll);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageSelected(int i11) {
            this.activity.onAdapterPositionChanged(i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onPageScrolled(int i11, float f11, int i12) {
        }
    }
}
