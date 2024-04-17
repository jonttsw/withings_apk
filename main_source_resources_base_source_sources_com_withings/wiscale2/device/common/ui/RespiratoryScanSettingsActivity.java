package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.withings.device.Device;
import com.withings.features.platform.api.PlatformFeatureHelper;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: RespiratoryScanSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/RespiratoryScanSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RespiratoryScanSettingsActivity extends Hilt_RespiratoryScanSettingsActivity {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f53740l = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public j2 f53741e;

    /* renamed from: h  reason: collision with root package name */
    private boolean f53744h;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f53742f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f53743g = nm0.h.b(new c());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f53745i = nm0.h.b(new h());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f53746j = nm0.h.b(new f());

    /* renamed from: k  reason: collision with root package name */
    private int f53747k = -1;

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            Intent intent = new Intent(context, RespiratoryScanSettingsActivity.class);
            intent.putExtra("device", device);
            return intent;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<tb0.j0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.j0 invoke() {
            return tb0.j0.b(RespiratoryScanSettingsActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Device> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = RespiratoryScanSettingsActivity.this.getIntent();
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

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean>, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean> jVar) {
            nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean> jVar2 = jVar;
            if (jVar2 != null) {
                nm0.y yVar = (nm0.y) cr.a.a(jVar2, new e2(RespiratoryScanSettingsActivity.this));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends a2, ? extends Boolean>, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(nm0.j<? extends a2, ? extends Boolean> jVar) {
            nm0.j<? extends a2, ? extends Boolean> jVar2 = jVar;
            if (jVar2 != null) {
                boolean booleanValue = jVar2.d().booleanValue();
                RespiratoryScanSettingsActivity.G3(RespiratoryScanSettingsActivity.this, jVar2.c(), booleanValue);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<h2> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final h2 invoke() {
            RespiratoryScanSettingsActivity respiratoryScanSettingsActivity = RespiratoryScanSettingsActivity.this;
            j2 j2Var = respiratoryScanSettingsActivity.f53741e;
            if (j2Var != null) {
                return j2Var.a(RespiratoryScanSettingsActivity.B3(respiratoryScanSettingsActivity));
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53753a;

        g(ym0.l lVar) {
            this.f53753a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f53753a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53753a;
        }

        public final int hashCode() {
            return this.f53753a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53753a.invoke(obj);
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<List<? extends View>> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final List<? extends View> invoke() {
            RespiratoryScanSettingsActivity respiratoryScanSettingsActivity = RespiratoryScanSettingsActivity.this;
            MaterialCardView nextScanInfoCard = respiratoryScanSettingsActivity.H3().f99225f;
            kotlin.jvm.internal.u.i(nextScanInfoCard, "nextScanInfoCard");
            TextView nextScanTitle = respiratoryScanSettingsActivity.H3().f99226g;
            kotlin.jvm.internal.u.i(nextScanTitle, "nextScanTitle");
            TextView nextScanDescription = respiratoryScanSettingsActivity.H3().f99224e;
            kotlin.jvm.internal.u.i(nextScanDescription, "nextScanDescription");
            return kotlin.collections.x.W(nextScanInfoCard, nextScanTitle, nextScanDescription);
        }
    }

    public static final Device B3(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity) {
        return (Device) respiratoryScanSettingsActivity.f53743g.getValue();
    }

    public static final h2 C3(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity) {
        return (h2) respiratoryScanSettingsActivity.f53746j.getValue();
    }

    public static final void D3(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity, List list) {
        boolean z5;
        boolean z11;
        boolean z12;
        respiratoryScanSettingsActivity.getClass();
        PlatformFeatureHelper.Companion companion = PlatformFeatureHelper.Companion;
        nm0.g gVar = respiratoryScanSettingsActivity.f53743g;
        PlatformFeatureHelper.RespiratoryScanState respiratoryScanState = companion.getRespiratoryScanState(list, ((Device) gVar.getValue()).getId());
        gi.b[] bVarArr = new gi.b[2];
        String string = respiratoryScanSettingsActivity.getString(C1987R.string.status_off);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = respiratoryScanSettingsActivity.getString(C1987R.string.respiratoryScan_settings_off_description);
        int i11 = 0;
        if (respiratoryScanState == PlatformFeatureHelper.RespiratoryScanState.Off) {
            z5 = true;
        } else {
            z5 = false;
        }
        bVarArr[0] = new gi.b(string, string2, z5, true);
        String string3 = respiratoryScanSettingsActivity.getString(C1987R.string.status_alwaysOn);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        String string4 = respiratoryScanSettingsActivity.getString(C1987R.string.respiratoryScan_settings_alwaysOn_description);
        if (respiratoryScanState == PlatformFeatureHelper.RespiratoryScanState.AlwaysOn) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVarArr[1] = new gi.b(string3, string4, z11, companion.isFeatureEnabled(9, list, ((Device) gVar.getValue()).getId()));
        ArrayList i02 = kotlin.collections.x.i0(bVarArr);
        if (respiratoryScanSettingsActivity.f53744h) {
            String string5 = respiratoryScanSettingsActivity.getString(C1987R.string.status_automaticRecommended);
            kotlin.jvm.internal.u.i(string5, "getString(...)");
            String string6 = respiratoryScanSettingsActivity.getString(C1987R.string.respiratoryScan_settings_automatic_description);
            if (respiratoryScanState == PlatformFeatureHelper.RespiratoryScanState.Auto) {
                z12 = true;
            } else {
                z12 = false;
            }
            i02.add(1, new gi.b(string5, string6, z12, companion.isFeatureEnabled(9, list, ((Device) gVar.getValue()).getId())));
        }
        Iterator it = i02.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((gi.b) it.next()).b()) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        respiratoryScanSettingsActivity.f53747k = i11;
        respiratoryScanSettingsActivity.H3().f99223d.E0(new d2(respiratoryScanSettingsActivity), i02);
    }

    public static final void G3(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity, a2 a2Var, boolean z5) {
        boolean z11;
        int i11 = 0;
        if (a2Var != null) {
            for (View view : (List) respiratoryScanSettingsActivity.f53745i.getValue()) {
                if (z5 && a2Var.b() != NextScanStatus.f53736a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
            respiratoryScanSettingsActivity.H3().f99226g.setText(respiratoryScanSettingsActivity.getString(C1987R.string.next_scan_date, a2Var.c()));
            respiratoryScanSettingsActivity.H3().f99224e.setText(respiratoryScanSettingsActivity.getString(a2Var.a()));
            MaterialCardView materialCardView = respiratoryScanSettingsActivity.H3().f99225f;
            if (!z5) {
                materialCardView = null;
            }
            if (materialCardView != null) {
                materialCardView.setOnClickListener(new androidx.media3.ui.i(respiratoryScanSettingsActivity, 11));
            }
        }
        TextView batteryLow = respiratoryScanSettingsActivity.H3().f99222c;
        kotlin.jvm.internal.u.i(batteryLow, "batteryLow");
        if (!(!z5)) {
            i11 = 8;
        }
        batteryLow.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.j0 H3() {
        return (tb0.j0) this.f53742f.getValue();
    }

    public static void z3(RespiratoryScanSettingsActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((h2) this$0.f53746j.getValue()).r0(this$0.f53747k);
    }

    @Override // com.withings.wiscale2.device.common.ui.Hilt_RespiratoryScanSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(H3().a());
        CoordinatorLayout a11 = H3().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        AppBarLayout appBarLayout = H3().f99221b;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        NestedScrollView scrollView = H3().f99227h;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        ay.b.n(scrollView, false, true, 23);
        setSupportActionBar(H3().f99228i);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        h2 h2Var = (h2) this.f53746j.getValue();
        h2Var.p0().observe(this, new g(new d()));
        h2Var.q0().observe(this, new g(new e()));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
