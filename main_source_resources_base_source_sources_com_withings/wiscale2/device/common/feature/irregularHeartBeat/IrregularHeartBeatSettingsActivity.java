package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.k1;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.device.Device;
import com.withings.views.view.ToggleCellView;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.b0;
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/irregularHeartBeat/IrregularHeartBeatSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/m;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IrregularHeartBeatSettingsActivity extends Hilt_IrregularHeartBeatSettingsActivity implements com.withings.views.view.m {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f52345i = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public t f52346e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f52347f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f52348g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private s f52349h;

    /* compiled from: IrregularHeartBeatSettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            u.j(context, "context");
            u.j(device, "device");
            Intent intent = new Intent(context, IrregularHeartBeatSettingsActivity.class);
            intent.putExtra("device", device);
            return intent;
        }
    }

    /* compiled from: IrregularHeartBeatSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<b0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final b0 invoke() {
            return b0.b(IrregularHeartBeatSettingsActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: IrregularHeartBeatSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Device> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = IrregularHeartBeatSettingsActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("device", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            u.g(obj);
            return (Device) obj;
        }
    }

    public static final void A3(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity, boolean z5) {
        irregularHeartBeatSettingsActivity.D3().f98872d.setChecked(z5);
        irregularHeartBeatSettingsActivity.D3().f98872d.setToggleListener(irregularHeartBeatSettingsActivity);
    }

    public static final void B3(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity, boolean z5) {
        irregularHeartBeatSettingsActivity.D3().f98871c.setChecked(z5);
        irregularHeartBeatSettingsActivity.D3().f98871c.setToggleListener(irregularHeartBeatSettingsActivity);
    }

    public static final void C3(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity, nm0.j jVar) {
        irregularHeartBeatSettingsActivity.getClass();
        boolean booleanValue = ((Boolean) jVar.c()).booleanValue();
        ToggleCellView toggleCellView = irregularHeartBeatSettingsActivity.D3().f98872d;
        if (booleanValue) {
            toggleCellView.y();
        } else {
            toggleCellView.w();
        }
    }

    private final b0 D3() {
        return (b0) this.f52347f.getValue();
    }

    public static final Device z3(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        return (Device) irregularHeartBeatSettingsActivity.f52348g.getValue();
    }

    @Override // com.withings.views.view.m
    public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
        u.j(toggleView, "toggleView");
        if (u.e(toggleView, D3().f98871c)) {
            s sVar = this.f52349h;
            if (sVar != null) {
                sVar.p0(z5);
            } else {
                u.s("irregularHeartBeatViewModel");
                throw null;
            }
        } else if (u.e(toggleView, D3().f98872d)) {
            s sVar2 = this.f52349h;
            if (sVar2 != null) {
                sVar2.q0(z5);
            } else {
                u.s("irregularHeartBeatViewModel");
                throw null;
            }
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.Hilt_IrregularHeartBeatSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(D3().a());
        CoordinatorLayout a11 = D3().a();
        u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        AppBarLayout appBarLayout = D3().f98870b;
        u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        CoordinatorLayout a12 = D3().a();
        u.i(a12, "getRoot(...)");
        ay.b.n(a12, false, true, 23);
        setSupportActionBar(D3().f98873e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        D3().f98872d.w();
        s sVar = (s) new k1(this, new k(this)).a(s.class);
        xw.d.c(this, sVar.j0(), new l(this));
        xw.d.c(this, sVar.i0(), new m(this));
        xw.d.c(this, sVar.k0(), new n(this));
        xw.d.c(this, sVar.m0(), new o(this));
        this.f52349h = sVar;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
