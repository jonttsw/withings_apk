package com.withings.wiscale2.device.common.feature.spo2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.k1;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.device.Device;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.ToggleCellView;
import com.withings.views.widget.LineCellView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import tb0.n0;
/* compiled from: SpO2SettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/spo2/SpO2SettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/m;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpO2SettingsActivity extends Hilt_SpO2SettingsActivity implements com.withings.views.view.m {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public s f52497e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f52498f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f52499g = nm0.h.b(new b());

    /* renamed from: h  reason: collision with root package name */
    private final e f52500h = new e(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f52501i = nm0.h.b(new f());

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52496k = {v.c(SpO2SettingsActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f52495j = new Object();

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            Intent intent = new Intent(context, SpO2SettingsActivity.class);
            intent.putExtra("device", device);
            return intent;
        }
    }

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<n0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final n0 invoke() {
            return n0.b(SpO2SettingsActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.l<Boolean, y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            int i11;
            boolean booleanValue = bool.booleanValue();
            SpO2SettingsActivity spO2SettingsActivity = SpO2SettingsActivity.this;
            DefinitionView medicalDefinition = spO2SettingsActivity.C3().f99352d;
            u.i(medicalDefinition, "medicalDefinition");
            int i12 = 8;
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            medicalDefinition.setVisibility(i11);
            LineCellView instructionOfUse = spO2SettingsActivity.C3().f99351c;
            u.i(instructionOfUse, "instructionOfUse");
            if (booleanValue) {
                i12 = 0;
            }
            instructionOfUse.setVisibility(i12);
            return y.f85009a;
        }
    }

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.l<Boolean, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            SpO2SettingsActivity.B3(SpO2SettingsActivity.this, bool.booleanValue());
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52505a = nm0.h.b(new com.withings.wiscale2.device.common.feature.spo2.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52506b;

        public e(Activity activity) {
            this.f52506b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f52505a.getValue();
        }
    }

    /* compiled from: SpO2SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<t> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final t invoke() {
            SpO2SettingsActivity spO2SettingsActivity = SpO2SettingsActivity.this;
            return (t) new k1(spO2SettingsActivity, new com.withings.wiscale2.device.common.feature.spo2.f(spO2SettingsActivity)).a(t.class);
        }
    }

    public static final Device A3(SpO2SettingsActivity spO2SettingsActivity) {
        spO2SettingsActivity.getClass();
        return (Device) spO2SettingsActivity.f52500h.getValue(spO2SettingsActivity, f52496k[0]);
    }

    public static final void B3(SpO2SettingsActivity spO2SettingsActivity, boolean z5) {
        spO2SettingsActivity.C3().f99353e.setChecked(z5);
        spO2SettingsActivity.C3().f99353e.setToggleListener(spO2SettingsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0 C3() {
        return (n0) this.f52499g.getValue();
    }

    @Override // com.withings.views.view.m
    public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
        u.j(toggleView, "toggleView");
        ((t) this.f52501i.getValue()).k0(z5);
    }

    @Override // com.withings.wiscale2.device.common.feature.spo2.Hilt_SpO2SettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3().a());
        CoordinatorLayout a11 = C3().a();
        u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        CoordinatorLayout a12 = C3().a();
        u.i(a12, "getRoot(...)");
        ay.b.n(a12, false, true, 23);
        AppBarLayout appBarLayout = C3().f99350b;
        u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        setSupportActionBar(C3().f99354f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        Integer d11 = mw.a.d((Device) this.f52500h.getValue(this, f52496k[0]));
        if (d11 != null) {
            C3().f99351c.setOnClickListener(new com.withings.wiscale2.device.common.feature.afib.j(1, this, d11));
        } else {
            LineCellView instructionOfUse = C3().f99351c;
            u.i(instructionOfUse, "instructionOfUse");
            instructionOfUse.setVisibility(8);
        }
        t tVar = (t) this.f52501i.getValue();
        xw.d.c(this, tVar.j0(), new c());
        xw.d.c(this, tVar.i0(), new d());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
