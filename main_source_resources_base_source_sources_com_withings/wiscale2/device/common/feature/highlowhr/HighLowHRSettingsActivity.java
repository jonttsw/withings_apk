package com.withings.wiscale2.device.common.feature.highlowhr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import gi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
/* compiled from: HighLowHRSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HighLowHRSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HighLowHRSettingsActivity extends Hilt_HighLowHRSettingsActivity {

    /* renamed from: e  reason: collision with root package name */
    private final d f52197e;

    /* renamed from: f  reason: collision with root package name */
    private final e f52198f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public k f52199g;

    /* renamed from: h  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f52200h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f52201i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f52202j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52196l = {androidx.camera.core.v.c(HighLowHRSettingsActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(HighLowHRSettingsActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(HighLowHRSettingsActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityHeartrateThresholdsSettingsBinding;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f52195k = new Object();

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device, User user) {
            kotlin.jvm.internal.u.j(device, "device");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, HighLowHRSettingsActivity.class).putExtra("EXTRA_USER", user).putExtra("EXTRA_DEVICE", device);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, Device device) {
            User e11 = m70.i.b().e();
            kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
            aVar.getClass();
            return a(context, device, e11);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(HighLowHRSettingsActivity.this);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f52204a;

        c(ym0.l lVar) {
            this.f52204a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f52204a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f52204a;
        }

        public final int hashCode() {
            return this.f52204a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52204a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52205a = nm0.h.b(new e0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52206b;

        public d(Activity activity) {
            this.f52206b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52205a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52207a = nm0.h.b(new f0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52208b;

        public e(Activity activity) {
            this.f52208b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52207a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.x> {
        @Override // ym0.l
        public final tb0.x invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.x.a(e11);
        }
    }

    /* compiled from: HighLowHRSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.device.common.feature.highlowhr.a> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.common.feature.highlowhr.a invoke() {
            HighLowHRSettingsActivity highLowHRSettingsActivity = HighLowHRSettingsActivity.this;
            k kVar = highLowHRSettingsActivity.f52199g;
            if (kVar != null) {
                return kVar.a(HighLowHRSettingsActivity.E3(highLowHRSettingsActivity), HighLowHRSettingsActivity.G3(highLowHRSettingsActivity));
            }
            kotlin.jvm.internal.u.s("viewmModelFactory");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HighLowHRSettingsActivity() {
        super(0);
        this.f52197e = new d(this);
        this.f52198f = new e(this);
        this.f52200h = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f52201i = nm0.h.b(new b());
        this.f52202j = nm0.h.b(new g());
    }

    public static void A3(HighLowHRSettingsActivity this$0) {
        int b10;
        boolean z5;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Integer num = (Integer) this$0.L3().F0().getValue();
        n0 n0Var = new n0();
        if (num != null) {
            b10 = num.intValue();
        } else {
            b10 = LowHRThresholds.f52224b.b();
        }
        n0Var.f76254a = b10;
        sm0.a<LowHRThresholds> a11 = LowHRThresholds.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it = ((kotlin.collections.c) a11).iterator();
        while (it.hasNext()) {
            LowHRThresholds lowHRThresholds = (LowHRThresholds) it.next();
            String K3 = this$0.K3(Integer.valueOf(lowHRThresholds.b()));
            int b11 = lowHRThresholds.b();
            if (num != null && b11 == num.intValue()) {
                z5 = true;
            } else {
                z5 = false;
            }
            arrayList.add(new gi.b(8, K3, null, z5, false));
        }
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        j.a aVar = new j.a(supportFragmentManager);
        aVar.y(this$0.getString(C1987R.string._LOW_HEART_RATE_));
        aVar.a(this$0.getString(C1987R.string.heartEvents_LowHeartRate_setting_description));
        aVar.r(new c0(n0Var), arrayList);
        String string = this$0.getString(C1987R.string._CONFIRM_YES_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        aVar.q(string, new d0(this$0, n0Var));
        aVar.x();
    }

    public static final void B3(HighLowHRSettingsActivity highLowHRSettingsActivity, LineCellView lineCellView, HRThresholdMode hRThresholdMode) {
        boolean z5;
        boolean z11;
        highLowHRSettingsActivity.getClass();
        HRThresholdMode hRThresholdMode2 = HRThresholdMode.f52175c;
        boolean z12 = false;
        if (hRThresholdMode == hRThresholdMode2) {
            z5 = true;
        } else {
            z5 = false;
        }
        lineCellView.setShowRightValueIcon(z5);
        if (hRThresholdMode == hRThresholdMode2) {
            z11 = true;
        } else {
            z11 = false;
        }
        lineCellView.setEnabled(z11);
        if (hRThresholdMode != HRThresholdMode.f52173a) {
            z12 = true;
        }
        lineCellView.setAlphaEnable(Boolean.valueOf(z12));
    }

    public static final void C3(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        tb0.x J3 = highLowHRSettingsActivity.J3();
        J3.f99601d.setOnClickListener(new sg.c(highLowHRSettingsActivity, 7));
        tb0.x J32 = highLowHRSettingsActivity.J3();
        J32.f99603f.setOnClickListener(new sg.d(highLowHRSettingsActivity, 6));
    }

    public static final Device E3(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        return (Device) highLowHRSettingsActivity.f52198f.getValue(highLowHRSettingsActivity, f52196l[1]);
    }

    public static final User G3(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        return (User) highLowHRSettingsActivity.f52197e.getValue(highLowHRSettingsActivity, f52196l[0]);
    }

    public static final void I3(HighLowHRSettingsActivity highLowHRSettingsActivity, List list) {
        tb0.x J3 = highLowHRSettingsActivity.J3();
        List<nm0.j> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (nm0.j jVar : list2) {
            arrayList.add((gi.b) jVar.c());
        }
        J3.f99605h.E0(new g0(list), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.x J3() {
        Object value = ((LifecycleViewBindingProperty) this.f52200h).getValue(this, f52196l[2]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.x) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String K3(Integer num) {
        if (num != null) {
            String obj = jm.a.c((jm.a) this.f52201i.getValue(), 11, num.intValue(), 0, 0, 60).toString();
            if (obj != null) {
                return obj;
            }
        }
        String string = getString(C1987R.string._ALARM_OFF_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.withings.wiscale2.device.common.feature.highlowhr.a L3() {
        return (com.withings.wiscale2.device.common.feature.highlowhr.a) this.f52202j.getValue();
    }

    public static void z3(HighLowHRSettingsActivity this$0) {
        int b10;
        boolean z5;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Integer num = (Integer) this$0.L3().B0().getValue();
        n0 n0Var = new n0();
        if (num != null) {
            b10 = num.intValue();
        } else {
            b10 = HighHRThresholds.f52177b.b();
        }
        n0Var.f76254a = b10;
        sm0.a<HighHRThresholds> a11 = HighHRThresholds.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it = ((kotlin.collections.c) a11).iterator();
        while (it.hasNext()) {
            HighHRThresholds highHRThresholds = (HighHRThresholds) it.next();
            String K3 = this$0.K3(Integer.valueOf(highHRThresholds.b()));
            int b11 = highHRThresholds.b();
            if (num != null && b11 == num.intValue()) {
                z5 = true;
            } else {
                z5 = false;
            }
            arrayList.add(new gi.b(8, K3, null, z5, false));
        }
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        j.a aVar = new j.a(supportFragmentManager);
        aVar.y(this$0.getString(C1987R.string._HIGH_HEART_RATE_));
        aVar.a(this$0.getString(C1987R.string.heartEvents_highHeartRate_setting_description));
        aVar.r(new a0(n0Var), arrayList);
        String string = this$0.getString(C1987R.string._CONFIRM_YES_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        aVar.q(string, new b0(this$0, n0Var));
        aVar.x();
    }

    @Override // com.withings.wiscale2.device.common.feature.highlowhr.Hilt_HighLowHRSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CoordinatorLayout b10 = J3().b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.t(b10);
        AppBarLayout appBarLayout = J3().f99599b;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        CoordinatorLayout b11 = J3().b();
        kotlin.jvm.internal.u.i(b11, "getRoot(...)");
        ay.b.n(b11, false, true, 23);
        ProgressBar loading = J3().f99602e;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
        NestedScrollView scrollView = J3().f99604g;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        scrollView.setVisibility(8);
        setSupportActionBar(J3().f99606i);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        L3().K0().observe(this, new c(new u(this)));
        L3().z0().observe(this, new c(new v(this)));
        L3().F0().observe(this, new c(new w(this)));
        L3().B0().observe(this, new c(new x(this)));
        L3().G0().observe(this, new c(new z(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
