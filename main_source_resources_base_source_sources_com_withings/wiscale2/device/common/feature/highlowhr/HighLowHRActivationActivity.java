package com.withings.wiscale2.device.common.feature.highlowhr;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import com.google.android.material.button.MaterialButton;
import com.withings.device.Device;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: HighLowHRActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HighLowHRActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HighLowHRActivationActivity extends Hilt_HighLowHRActivationActivity {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52181k = {androidx.camera.core.v.c(HighLowHRActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(HighLowHRActivationActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public j0 f52186i;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f52182e = nm0.h.b(new b());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f52183f = nm0.h.b(new a());

    /* renamed from: g  reason: collision with root package name */
    private final c f52184g = new c(this);

    /* renamed from: h  reason: collision with root package name */
    private final d f52185h = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f52187j = nm0.h.b(new e());

    /* compiled from: HighLowHRActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<tb0.n> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.n invoke() {
            return tb0.n.a(HighLowHRActivationActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: HighLowHRActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(HighLowHRActivationActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52190a = nm0.h.b(new o(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52191b;

        public c(Activity activity) {
            this.f52191b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52190a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52192a = nm0.h.b(new p(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52193b;

        public d(Activity activity) {
            this.f52193b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52192a.getValue();
        }
    }

    /* compiled from: HighLowHRActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<i0> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final i0 invoke() {
            HighLowHRActivationActivity highLowHRActivationActivity = HighLowHRActivationActivity.this;
            return (i0) new k1(highLowHRActivationActivity, new s(highLowHRActivationActivity)).a(i0.class);
        }
    }

    public static void A3(HighLowHRActivationActivity this$0, androidx.navigation.e eVar, androidx.navigation.t destination) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(eVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.u.j(destination, "destination");
        int r7 = destination.r();
        this$0.G3().f99345b.setEnabled(true);
        if (r7 == C1987R.id.high_low_hr_intro || r7 == C1987R.id.high_low_hr_alerts) {
            this$0.G3().f99345b.setText(C1987R.string._NEXT_);
        } else if (r7 == C1987R.id.high_low_hr_activate) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new q(this$0, this$0.G3().f99345b, null), 3, null);
        }
        if (destination.r() == C1987R.id.high_low_hr_activate) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new r(this$0, null), 3, null);
            MaterialButton secondaryButton = this$0.G3().f99347d;
            kotlin.jvm.internal.u.i(secondaryButton, "secondaryButton");
            secondaryButton.setVisibility(0);
            this$0.G3().f99347d.setText(C1987R.string.appleHealth_reactivateNotNowButtonTitle);
            return;
        }
        MaterialButton secondaryButton2 = this$0.G3().f99347d;
        kotlin.jvm.internal.u.i(secondaryButton2, "secondaryButton");
        secondaryButton2.setVisibility(8);
    }

    public static void B3(HighLowHRActivationActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.high_low_hr_intro) {
            this$0.getNavController().H(C1987R.id.action_intro_to_alerts, null);
        } else if (num != null && num.intValue() == C1987R.id.high_low_hr_alerts) {
            this$0.getNavController().H(C1987R.id.action_alerts_to_activate, null);
        } else if (num != null && num.intValue() == C1987R.id.high_low_hr_activate) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new m(this$0, null), 3, null);
        }
    }

    public static final Device D3(HighLowHRActivationActivity highLowHRActivationActivity) {
        return (Device) highLowHRActivationActivity.f52184g.getValue(highLowHRActivationActivity, f52181k[0]);
    }

    public static final long E3(HighLowHRActivationActivity highLowHRActivationActivity) {
        return ((Number) highLowHRActivationActivity.f52185h.getValue(highLowHRActivationActivity, f52181k[1])).longValue();
    }

    public static final i0 F3(HighLowHRActivationActivity highLowHRActivationActivity) {
        return (i0) highLowHRActivationActivity.f52187j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.n G3() {
        return (tb0.n) this.f52183f.getValue();
    }

    private final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f52182e.getValue();
    }

    public static void z3(HighLowHRActivationActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.high_low_hr_activate) {
            this$0.finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.highlowhr.Hilt_HighLowHRActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(G3().f99346c);
        ConstraintLayout root = G3().f99346c;
        kotlin.jvm.internal.u.i(root, "root");
        ay.b.t(root);
        Toolbar toolbar = G3().f99348e;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        ay.b.m(toolbar, true, false, 29);
        View hackSpacingBottom = G3().f99344a;
        kotlin.jvm.internal.u.i(hackSpacingBottom, "hackSpacingBottom");
        ay.b.m(hackSpacingBottom, false, true, 23);
        setSupportActionBar(G3().f99348e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        G3().f99345b.setOnClickListener(new gi.i(this, 3));
        G3().f99347d.setOnClickListener(new com.withings.device.details.scale.z(this, 5));
        getNavController().p(new e.b() { // from class: com.withings.wiscale2.device.common.feature.highlowhr.l
            @Override // androidx.navigation.e.b
            public final void X0(androidx.navigation.e eVar, androidx.navigation.t tVar, Bundle bundle2) {
                HighLowHRActivationActivity.A3(HighLowHRActivationActivity.this, eVar, tVar);
            }
        });
        xw.d.c(this, androidx.lifecycle.q.b(((i0) this.f52187j.getValue()).k0(), null, 3), new n(this));
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
