package com.withings.wiscale2.device.common.feature.afib;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import com.google.android.material.button.MaterialButton;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AfibActivationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/afib/AfibActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "Lcom/withings/wiscale2/device/common/feature/FeatureActivationDocumentFragment$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AfibActivationActivity extends Hilt_AfibActivationActivity implements e.b, FeatureActivationDocumentFragment.a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50972j = {androidx.camera.core.v.c(AfibActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public i f50976h;

    /* renamed from: e  reason: collision with root package name */
    private final c f50973e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f50974f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f50975g = nm0.h.b(new a());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f50977i = nm0.h.b(new d());

    /* compiled from: AfibActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<tb0.m> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.m invoke() {
            return tb0.m.a(AfibActivationActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: AfibActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(AfibActivationActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50980a = nm0.h.b(new com.withings.wiscale2.device.common.feature.afib.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f50981b;

        public c(Activity activity) {
            this.f50981b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f50980a.getValue();
        }
    }

    /* compiled from: AfibActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<h> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final h invoke() {
            AfibActivationActivity afibActivationActivity = AfibActivationActivity.this;
            return (h) new k1(afibActivationActivity, new com.withings.wiscale2.device.common.feature.afib.c(afibActivationActivity)).a(h.class);
        }
    }

    public static void A3(AfibActivationActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.afib_intro) {
            this$0.getNavController().H(C1987R.id.action_intro_to_untreated, null);
        } else if (num != null && num.intValue() == C1987R.id.afib_untreated) {
            this$0.getNavController().H(C1987R.id.action_untreated_to_heart_attack, null);
        } else if (num != null && num.intValue() == C1987R.id.afib_heart_attack) {
            this$0.getNavController().H(C1987R.id.action_heart_attack_to_auto_check, null);
        } else if (num != null && num.intValue() == C1987R.id.afib_auto_check) {
            this$0.getNavController().H(C1987R.id.action_auto_check_to_alerts, null);
        } else {
            nm0.g gVar = this$0.f50977i;
            if (num != null && num.intValue() == C1987R.id.afib_alerts) {
                h hVar = (h) gVar.getValue();
                hVar.getClass();
                BuildersKt__Builders_commonKt.launch$default(h1.a(hVar), Dispatchers.getIO(), null, new g(hVar, true, null), 2, null);
                this$0.getNavController().H(C1987R.id.action_alerts_to_take_ecg, null);
            } else if (num != null && num.intValue() == C1987R.id.afib_take_ecg) {
                if (((h) gVar.getValue()).m0()) {
                    this$0.finish();
                    return;
                }
                Integer d11 = mw.a.d((Device) this$0.f50973e.getValue(this$0, f50972j[0]));
                if (d11 != null) {
                    this$0.getNavController().K(com.withings.wiscale2.b.a(d11.intValue()));
                    return;
                }
                this$0.finish();
            } else if (num != null && num.intValue() == C1987R.id.afib_document) {
                h hVar2 = (h) gVar.getValue();
                hVar2.getClass();
                BuildersKt__Builders_commonKt.launch$default(h1.a(hVar2), Dispatchers.getIO(), null, new e(hVar2, null), 2, null);
            }
        }
    }

    public static final Device B3(AfibActivationActivity afibActivationActivity) {
        afibActivationActivity.getClass();
        return (Device) afibActivationActivity.f50973e.getValue(afibActivationActivity, f50972j[0]);
    }

    private final tb0.m D3() {
        return (tb0.m) this.f50975g.getValue();
    }

    private final void E3() {
        Integer num;
        D3().f99319b.setEnabled(true);
        View hackSpacingBottom = D3().f99318a;
        kotlin.jvm.internal.u.i(hackSpacingBottom, "hackSpacingBottom");
        hackSpacingBottom.setVisibility(0);
        MaterialButton primaryButton = D3().f99319b;
        kotlin.jvm.internal.u.i(primaryButton, "primaryButton");
        primaryButton.setVisibility(0);
        androidx.navigation.t y11 = getNavController().y();
        Integer num2 = null;
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.afib_intro) {
            D3().f99319b.setText(C1987R.string._START_);
        } else if (num != null && num.intValue() == C1987R.id.afib_alerts) {
            D3().f99319b.setText(C1987R.string._AT_ACTIVATE_NOW_);
        } else if (num != null && num.intValue() == C1987R.id.afib_take_ecg) {
            D3().f99319b.setText(C1987R.string.hwa09_ecgPositionTutorialButton);
        } else if (num != null && num.intValue() == C1987R.id.afib_document) {
            MaterialButton materialButton = D3().f99319b;
            materialButton.setText(C1987R.string.accept__activate);
            materialButton.setEnabled(false);
        } else {
            D3().f99319b.setText(C1987R.string._NEXT_);
        }
        androidx.navigation.t y12 = getNavController().y();
        if (y12 != null) {
            num2 = Integer.valueOf(y12.r());
        }
        if (num2 != null && num2.intValue() == C1987R.id.afib_alerts) {
            MaterialButton secondaryButton = D3().f99321d;
            kotlin.jvm.internal.u.i(secondaryButton, "secondaryButton");
            secondaryButton.setVisibility(0);
            D3().f99321d.setText(C1987R.string.heartevents_afib_tutorial_alert_notNow);
        } else if (num2 != null && num2.intValue() == C1987R.id.afib_take_ecg) {
            MaterialButton secondaryButton2 = D3().f99321d;
            kotlin.jvm.internal.u.i(secondaryButton2, "secondaryButton");
            secondaryButton2.setVisibility(0);
            D3().f99321d.setText(C1987R.string._LEARN_MORE_);
        } else {
            MaterialButton secondaryButton3 = D3().f99321d;
            kotlin.jvm.internal.u.i(secondaryButton3, "secondaryButton");
            secondaryButton3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.f50974f.getValue();
    }

    public static void z3(AfibActivationActivity this$0) {
        Integer num;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.navigation.t y11 = this$0.getNavController().y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C1987R.id.afib_alerts) {
            h hVar = (h) this$0.f50977i.getValue();
            hVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(hVar), Dispatchers.getIO(), null, new g(hVar, false, null), 2, null);
            this$0.getNavController().H(C1987R.id.action_alerts_to_take_ecg, null);
        } else if (num != null && num.intValue() == C1987R.id.afib_take_ecg) {
            String string = this$0.getString(C1987R.string.ecg_detail_staticUnderstandEcgMeasurementUrl);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            this$0.startActivity(HMWebActivity.f35395c.c(this$0, null, string));
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.FeatureActivationDocumentFragment.a
    public final void F2() {
        D3().f99319b.setEnabled(true);
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, androidx.navigation.t destination, Bundle bundle) {
        kotlin.jvm.internal.u.j(controller, "controller");
        kotlin.jvm.internal.u.j(destination, "destination");
        E3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        androidx.navigation.t y11 = getNavController().y();
        if (y11 != null && y11.r() == C1987R.id.afib_document) {
            finish();
        } else if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.afib.Hilt_AfibActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(D3().f99320c);
        ConstraintLayout root = D3().f99320c;
        kotlin.jvm.internal.u.i(root, "root");
        ay.b.t(root);
        Toolbar toolbar = D3().f99322e;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        ay.b.m(toolbar, true, false, 29);
        View hackSpacingBottom = D3().f99318a;
        kotlin.jvm.internal.u.i(hackSpacingBottom, "hackSpacingBottom");
        ay.b.m(hackSpacingBottom, false, true, 23);
        getNavController().p(this);
        setSupportActionBar(D3().f99322e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        E3();
        D3().f99319b.setOnClickListener(new androidx.viewpager.widget.d(this, 4));
        D3().f99321d.setOnClickListener(new vn.d(this, 4));
        xw.d.c(this, ((h) this.f50977i.getValue()).j0(), new com.withings.wiscale2.device.common.feature.afib.a(this));
    }

    @Override // com.withings.wiscale2.device.common.feature.afib.Hilt_AfibActivationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        getNavController().W(this);
        super.onDestroy();
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
