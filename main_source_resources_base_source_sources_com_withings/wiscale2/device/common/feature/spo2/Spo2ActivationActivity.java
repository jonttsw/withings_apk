package com.withings.wiscale2.device.common.feature.spo2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import androidx.navigation.e;
import com.google.android.material.button.MaterialButton;
import com.withings.core.device.FullscreenVideoFragment;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment;
import com.withings.wiscale2.z2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SpO2ActivationActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/spo2/Spo2ActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "Lcom/withings/wiscale2/device/common/feature/FeatureActivationDocumentFragment$a;", "Lcom/withings/core/device/FullscreenVideoFragment$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Spo2ActivationActivity extends Hilt_Spo2ActivationActivity implements e.b, FeatureActivationDocumentFragment.a, FullscreenVideoFragment.a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52508j = {v.c(Spo2ActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f52509k = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public r f52510e;

    /* renamed from: f  reason: collision with root package name */
    private final d f52511f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f52512g = nm0.h.b(new b());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f52513h = nm0.h.b(new a());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f52514i = nm0.h.b(new e());

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<tb0.p> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.p invoke() {
            return tb0.p.a(Spo2ActivationActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(Spo2ActivationActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f52517a;

        c(ym0.l function) {
            u.j(function, "function");
            this.f52517a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(this.f52517a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f52517a;
        }

        public final int hashCode() {
            return this.f52517a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52517a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52518a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52519b;

        public d(Activity activity) {
            this.f52519b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f52518a.getValue();
        }
    }

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<q> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final q invoke() {
            Spo2ActivationActivity spo2ActivationActivity = Spo2ActivationActivity.this;
            return (q) new k1(spo2ActivationActivity, new m(spo2ActivationActivity)).a(q.class);
        }
    }

    public static void A3(Spo2ActivationActivity this$0) {
        Integer num;
        int i11;
        int i12;
        u.j(this$0, "this$0");
        T value = this$0.G3().q0().getValue();
        Boolean bool = Boolean.TRUE;
        boolean e11 = u.e(value, bool);
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.spo2_intro) {
            boolean e12 = u.e(this$0.G3().p0().getValue(), bool);
            Integer d11 = mw.a.d(this$0.F3());
            if (e11 && !e12 && d11 != null) {
                this$0.getNavController().K(new com.withings.wiscale2.device.common.feature.spo2.d(d11.intValue()));
                return;
            }
            this$0.getNavController().H(C1987R.id.action_intro_to_preparation, null);
        } else if (num != null && num.intValue() == C1987R.id.spo2_position) {
            if (this$0.F3().getTrackerWearPosition() == 0) {
                i11 = C1987R.string.hwa09_spo2ExplanationTutorial_video_URL_right;
            } else {
                i11 = C1987R.string.hwa09_spo2ExplanationTutorial_video_URL_left;
            }
            if (this$0.F3().getTrackerWearPosition() == 0) {
                i12 = 2131232682;
            } else {
                i12 = 2131232681;
            }
            this$0.getNavController().K(z2.b(i11, i12));
        } else if (num != null && num.intValue() == C1987R.id.spo2_document) {
            this$0.G3().j0();
        } else if (num != null && num.intValue() == C1987R.id.spo2_done) {
            if (!e11) {
                this$0.G3().j0();
            }
            this$0.finish();
        }
    }

    public static final void D3(Spo2ActivationActivity spo2ActivationActivity, int i11) {
        spo2ActivationActivity.getNavController().K(z2.a(i11));
    }

    private final tb0.p E3() {
        return (tb0.p) this.f52513h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device F3() {
        return (Device) this.f52511f.getValue(this, f52508j[0]);
    }

    private final q G3() {
        return (q) this.f52514i.getValue();
    }

    private final void H3() {
        Integer num;
        E3().f99406b.setEnabled(true);
        View hackSpacingBottom = E3().f99405a;
        u.i(hackSpacingBottom, "hackSpacingBottom");
        hackSpacingBottom.setVisibility(0);
        MaterialButton primaryButton = E3().f99406b;
        u.i(primaryButton, "primaryButton");
        primaryButton.setVisibility(0);
        androidx.navigation.t y11 = getNavController().y();
        Integer num2 = null;
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.spo2_intro) {
            E3().f99406b.setText(C1987R.string._START_);
        } else if (num != null && num.intValue() == C1987R.id.spo2_position) {
            E3().f99406b.setText(C1987R.string._NEXT_);
        } else if (num != null && num.intValue() == C1987R.id.spo2_document) {
            MaterialButton materialButton = E3().f99406b;
            materialButton.setText(C1987R.string.accept__activate);
            materialButton.setEnabled(false);
        } else if (num != null && num.intValue() == C1987R.id.spo2_instructions) {
            MaterialButton primaryButton2 = E3().f99406b;
            u.i(primaryButton2, "primaryButton");
            primaryButton2.setVisibility(8);
            View hackSpacingBottom2 = E3().f99405a;
            u.i(hackSpacingBottom2, "hackSpacingBottom");
            hackSpacingBottom2.setVisibility(8);
        } else if (num != null && num.intValue() == C1987R.id.spo2_measurement) {
            MaterialButton primaryButton3 = E3().f99406b;
            u.i(primaryButton3, "primaryButton");
            primaryButton3.setVisibility(8);
            View hackSpacingBottom3 = E3().f99405a;
            u.i(hackSpacingBottom3, "hackSpacingBottom");
            hackSpacingBottom3.setVisibility(8);
        } else if (num != null && num.intValue() == C1987R.id.spo2_done) {
            E3().f99406b.setText(C1987R.string.hwa09_ecgPositionTutorialButton);
        }
        androidx.navigation.t y12 = getNavController().y();
        if (y12 != null) {
            num2 = Integer.valueOf(y12.r());
        }
        if (num2 != null && num2.intValue() == C1987R.id.spo2_done) {
            MaterialButton secondaryButton = E3().f99408d;
            u.i(secondaryButton, "secondaryButton");
            secondaryButton.setVisibility(0);
            E3().f99408d.setText(C1987R.string._LEARN_MORE_);
            return;
        }
        MaterialButton secondaryButton2 = E3().f99408d;
        u.i(secondaryButton2, "secondaryButton");
        secondaryButton2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f52512g.getValue();
    }

    public static void z3(Spo2ActivationActivity this$0) {
        int i11;
        Integer num;
        u.j(this$0, "this$0");
        if (u.e(this$0.G3().q0().getValue(), Boolean.TRUE)) {
            i11 = C1987R.string.spo2_detail_learnmore_static;
        } else {
            i11 = C1987R.string.spo2NonMed_detail_learnmore_static;
        }
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.spo2_done) {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            Context context = this$0.E3().f99408d.getContext();
            u.i(context, "getContext(...)");
            this$0.startActivity(aVar.b(context, null, i11));
        }
    }

    @Override // com.withings.core.device.FullscreenVideoFragment.a
    public final void E(FullscreenVideoFragment fragment) {
        u.j(fragment, "fragment");
        getNavController().K(z2.a(0));
    }

    @Override // com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment.a
    public final void F2() {
        E3().f99406b.setEnabled(true);
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, androidx.navigation.t destination, Bundle bundle) {
        Integer num;
        u.j(controller, "controller");
        u.j(destination, "destination");
        H3();
        androidx.navigation.t y11 = getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.spo2_position) {
            q G3 = G3();
            G3.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(G3), Dispatchers.getIO(), null, new p(G3, null), 2, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        androidx.navigation.t y11 = getNavController().y();
        if (y11 != null && y11.r() == C1987R.id.spo2_done) {
            finish();
        } else if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.spo2.Hilt_Spo2ActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(E3().f99407c);
        ConstraintLayout root = E3().f99407c;
        u.i(root, "root");
        ay.b.t(root);
        Toolbar toolbar = E3().f99409e;
        u.i(toolbar, "toolbar");
        ay.b.m(toolbar, true, false, 29);
        View hackSpacingBottom = E3().f99405a;
        u.i(hackSpacingBottom, "hackSpacingBottom");
        ay.b.m(hackSpacingBottom, false, true, 23);
        getNavController().p(this);
        setSupportActionBar(E3().f99409e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        H3();
        E3().f99406b.setOnClickListener(new com.withings.alarm.ui.f(this, 7));
        E3().f99408d.setOnClickListener(new androidx.media3.ui.h(this, 11));
        q G3 = G3();
        G3.q0().observe(this, new c(h.f52529a));
        G3.p0().observe(this, new c(new i(this)));
        G3.m0().observe(this, new c(new j(this)));
        G3.k0().observe(this, new c(new k(this)));
    }

    @Override // com.withings.wiscale2.device.common.feature.spo2.Hilt_Spo2ActivationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        getNavController().W(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Integer num;
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            androidx.navigation.t y11 = getNavController().y();
            if (y11 != null) {
                num = Integer.valueOf(y11.r());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == C1987R.id.spo2_measurement) {
                qc.b bVar = new qc.b(this);
                bVar.C(C1987R.string.wpm04Installation_leaveTutorialTitle);
                bVar.g(C1987R.string.wpm04Installation_leaveTutorialDescription);
                bVar.z(C1987R.string._YES_, new ao.g(this, 2)).w(C1987R.string._CANCEL_, new ao.h(1)).s();
                return true;
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
