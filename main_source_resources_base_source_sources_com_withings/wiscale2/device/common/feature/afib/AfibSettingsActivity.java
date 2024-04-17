package com.withings.wiscale2.device.common.feature.afib;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.k1;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.device.Device;
import com.withings.views.view.ToggleCellView;
import com.withings.views.widget.LineCellView;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: AfibSettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/afib/AfibSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/m;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AfibSettingsActivity extends Hilt_AfibSettingsActivity implements com.withings.views.view.m {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f50991j = 0;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public t f50994g;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ch.d f50996i;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f50992e = nm0.h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f50993f = nm0.h.b(new d());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f50995h = nm0.h.b(new b());

    /* compiled from: AfibSettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            kotlin.jvm.internal.u.j(device, "device");
            Intent intent = new Intent(context, AfibSettingsActivity.class);
            intent.putExtra("device", device);
            return intent;
        }
    }

    /* compiled from: AfibSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<s> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final s invoke() {
            AfibSettingsActivity afibSettingsActivity = AfibSettingsActivity.this;
            return (s) new k1(afibSettingsActivity, new k(afibSettingsActivity)).a(s.class);
        }
    }

    /* compiled from: AfibSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<tb0.c> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.c invoke() {
            return tb0.c.b(AfibSettingsActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: AfibSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<Device> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = AfibSettingsActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("device", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            kotlin.jvm.internal.u.g(obj);
            return (Device) obj;
        }
    }

    public static final void A3(AfibSettingsActivity afibSettingsActivity, boolean z5) {
        ProgressBar loading = afibSettingsActivity.D3().f98890e;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(8);
        NestedScrollView scrollView = afibSettingsActivity.D3().f98892g;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        scrollView.setVisibility(0);
        afibSettingsActivity.D3().f98891f.setChecked(z5);
        afibSettingsActivity.D3().f98891f.setToggleListener(afibSettingsActivity);
    }

    public static final void B3(AfibSettingsActivity afibSettingsActivity, boolean z5) {
        afibSettingsActivity.D3().f98888c.setChecked(z5);
        afibSettingsActivity.D3().f98888c.setToggleListener(afibSettingsActivity);
    }

    public static final void C3(AfibSettingsActivity afibSettingsActivity, nm0.j jVar) {
        afibSettingsActivity.getClass();
        if (((Boolean) jVar.c()).booleanValue()) {
            afibSettingsActivity.D3().f98891f.y();
        } else {
            afibSettingsActivity.D3().f98891f.w();
        }
    }

    private final tb0.c D3() {
        return (tb0.c) this.f50992e.getValue();
    }

    public static final Device z3(AfibSettingsActivity afibSettingsActivity) {
        return (Device) afibSettingsActivity.f50993f.getValue();
    }

    @Override // com.withings.views.view.m
    public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
        kotlin.jvm.internal.u.j(toggleView, "toggleView");
        boolean e11 = kotlin.jvm.internal.u.e(toggleView, D3().f98888c);
        nm0.g gVar = this.f50995h;
        if (e11) {
            ((s) gVar.getValue()).p0(z5);
        } else if (kotlin.jvm.internal.u.e(toggleView, D3().f98891f)) {
            ((s) gVar.getValue()).q0(z5);
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.afib.Hilt_AfibSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(D3().a());
        CoordinatorLayout a11 = D3().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        AppBarLayout appBarLayout = D3().f98887b;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        CoordinatorLayout a12 = D3().a();
        kotlin.jvm.internal.u.i(a12, "getRoot(...)");
        ay.b.n(a12, false, true, 23);
        ProgressBar loading = D3().f98890e;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
        NestedScrollView scrollView = D3().f98892g;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        scrollView.setVisibility(8);
        D3().f98891f.w();
        setSupportActionBar(D3().f98893h);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        Integer d11 = mw.a.d((Device) this.f50993f.getValue());
        if (d11 != null) {
            D3().f98889d.setOnClickListener(new j(0, this, d11));
        } else {
            LineCellView instructionOfUse = D3().f98889d;
            kotlin.jvm.internal.u.i(instructionOfUse, "instructionOfUse");
            instructionOfUse.setVisibility(8);
        }
        s sVar = (s) this.f50995h.getValue();
        xw.d.c(this, sVar.k0(), new l(this));
        xw.d.c(this, sVar.j0(), new m(this));
        xw.d.c(this, sVar.g0(), new n(this));
        xw.d.c(this, sVar.m0(), new o(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
