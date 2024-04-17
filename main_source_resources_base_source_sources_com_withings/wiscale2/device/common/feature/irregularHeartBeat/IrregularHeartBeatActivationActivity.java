package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import com.google.android.material.button.MaterialButton;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: IrregularHeartBeatActivationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/irregularHeartBeat/IrregularHeartBeatActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IrregularHeartBeatActivationActivity extends Hilt_IrregularHeartBeatActivationActivity implements e.b {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52326j = {v.c(IrregularHeartBeatActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public j f52327e;

    /* renamed from: f  reason: collision with root package name */
    private final c f52328f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f52329g = nm0.h.b(new b());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f52330h = nm0.h.b(new a());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f52331i = nm0.h.b(new d());

    /* compiled from: IrregularHeartBeatActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<tb0.o> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.o invoke() {
            return tb0.o.a(IrregularHeartBeatActivationActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: IrregularHeartBeatActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(IrregularHeartBeatActivationActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52334a = nm0.h.b(new com.withings.wiscale2.device.common.feature.irregularHeartBeat.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52335b;

        public c(Activity activity) {
            this.f52335b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f52334a.getValue();
        }
    }

    /* compiled from: IrregularHeartBeatActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<i> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final i invoke() {
            IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity = IrregularHeartBeatActivationActivity.this;
            return (i) new k1(irregularHeartBeatActivationActivity, new e(irregularHeartBeatActivationActivity)).a(i.class);
        }
    }

    public static void A3(IrregularHeartBeatActivationActivity this$0) {
        u.j(this$0, "this$0");
        i iVar = (i) this$0.f52331i.getValue();
        iVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(iVar), Dispatchers.getIO(), null, new h(iVar, false, null), 2, null);
    }

    public static final Device B3(IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity) {
        return (Device) irregularHeartBeatActivationActivity.f52328f.getValue(irregularHeartBeatActivationActivity, f52326j[0]);
    }

    private final tb0.o D3() {
        return (tb0.o) this.f52330h.getValue();
    }

    private final void E3() {
        Integer num;
        int i11;
        D3().f99381b.setEnabled(true);
        View hackSpacingBottom = D3().f99380a;
        u.i(hackSpacingBottom, "hackSpacingBottom");
        int i12 = 0;
        hackSpacingBottom.setVisibility(0);
        MaterialButton primaryButton = D3().f99381b;
        u.i(primaryButton, "primaryButton");
        primaryButton.setVisibility(0);
        MaterialButton materialButton = D3().f99381b;
        androidx.navigation.t y11 = getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_intro) {
            i11 = C1987R.string._START_;
        } else if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_alerts) {
            i11 = C1987R.string._AT_ACTIVATE_NOW_;
        } else {
            i11 = C1987R.string._NEXT_;
        }
        materialButton.setText(i11);
        MaterialButton secondaryButton = D3().f99383d;
        u.i(secondaryButton, "secondaryButton");
        androidx.navigation.t y12 = getNavController().y();
        secondaryButton.setVisibility((y12 == null || y12.r() != C1987R.id.irregular_heartbeat_alerts) ? 8 : 8);
        D3().f99383d.setText(C1987R.string.heartevents_afib_tutorial_alert_notNow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f52329g.getValue();
    }

    public static void z3(IrregularHeartBeatActivationActivity this$0) {
        Integer num;
        u.j(this$0, "this$0");
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_intro) {
            this$0.getNavController().H(C1987R.id.action_intro_to_untreated, null);
        } else if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_untreated) {
            this$0.getNavController().H(C1987R.id.action_untreated_to_heart_attack, null);
        } else if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_heart_attack) {
            this$0.getNavController().H(C1987R.id.action_heart_attack_to_auto_check, null);
        } else if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_auto_check) {
            this$0.getNavController().H(C1987R.id.action_auto_check_to_alerts, null);
        } else if (num != null && num.intValue() == C1987R.id.irregular_heartbeat_alerts) {
            i iVar = (i) this$0.f52331i.getValue();
            iVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(iVar), Dispatchers.getIO(), null, new h(iVar, true, null), 2, null);
        }
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, androidx.navigation.t destination, Bundle bundle) {
        u.j(controller, "controller");
        u.j(destination, "destination");
        E3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.Hilt_IrregularHeartBeatActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(D3().f99382c);
        ConstraintLayout root = D3().f99382c;
        u.i(root, "root");
        ay.b.t(root);
        Toolbar toolbar = D3().f99384e;
        u.i(toolbar, "toolbar");
        ay.b.m(toolbar, true, false, 29);
        View hackSpacingBottom = D3().f99380a;
        u.i(hackSpacingBottom, "hackSpacingBottom");
        ay.b.m(hackSpacingBottom, false, true, 23);
        getNavController().p(this);
        setSupportActionBar(D3().f99384e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        E3();
        D3().f99381b.setOnClickListener(new androidx.media3.ui.h(this, 10));
        D3().f99383d.setOnClickListener(new androidx.media3.ui.i(this, 10));
        xw.d.c(this, ((i) this.f52331i.getValue()).k0(), new com.withings.wiscale2.device.common.feature.irregularHeartBeat.c(this));
    }

    @Override // com.withings.wiscale2.device.common.feature.irregularHeartBeat.Hilt_IrregularHeartBeatActivationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        getNavController().W(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
