package com.withings.measurements.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.k1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.core.model.StartTrackingMetricItem;
import com.withings.measurements.ui.verticals.HealthVerticalActivityViewModel;
import com.withings.user.core.models.User;
import gz.j0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/measurements/ui/HealthVerticalActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/measurements/ui/verticals/a;", "verticalState", "", "isSexualHealthVerticalInfoCardSeen", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthVerticalActivity extends Hilt_HealthVerticalActivity {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f41914k = {androidx.camera.core.v.c(HealthVerticalActivity.class, "initialMeasurementsVertical", "getInitialMeasurementsVertical()I", 0), androidx.camera.core.v.c(HealthVerticalActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0)};
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ch.d f41917g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public s1 f41918h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public cz.l f41919i;

    /* renamed from: e  reason: collision with root package name */
    private final c f41915e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f41916f = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.i1 f41920j = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(HealthVerticalActivityViewModel.class), new f(this), new e(this), new g(this));

    /* compiled from: HealthVerticalActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<MeasurementsVertical> f41921a = sm0.b.a(MeasurementsVertical.values());
    }

    /* compiled from: HealthVerticalActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasurementsVertical f41923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MeasurementsVertical measurementsVertical) {
            super(2);
            this.f41923b = measurementsVertical;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -660955481, new k1(HealthVerticalActivity.this, this.f41923b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41924a = nm0.h.b(new l1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41925b;

        public c(Activity activity) {
            this.f41925b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41924a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41926a = nm0.h.b(new m1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41927b;

        public d(Activity activity) {
            this.f41927b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41926a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f41928a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f41928a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f41929a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f41929a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f41930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f41930a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f41930a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(HealthVerticalActivity healthVerticalActivity) {
        ch.d dVar = healthVerticalActivity.f41917g;
        if (dVar != null) {
            dVar.o().getClass();
            healthVerticalActivity.startActivity(ah.c.a(healthVerticalActivity));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void B3(HealthVerticalActivity healthVerticalActivity, j0.a aVar) {
        s1 s1Var = healthVerticalActivity.f41918h;
        if (s1Var != null) {
            s1Var.a(healthVerticalActivity, aVar, o70.a.e(healthVerticalActivity.I3()));
        } else {
            kotlin.jvm.internal.u.s("measurementRedirection");
            throw null;
        }
    }

    public static final void C3(HealthVerticalActivity healthVerticalActivity, kw.d dVar) {
        healthVerticalActivity.getClass();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(dVar.a()));
        healthVerticalActivity.startActivity(intent);
    }

    public static final void D3(HealthVerticalActivity healthVerticalActivity, MeasurementsVertical measurementsVertical) {
        String str;
        healthVerticalActivity.getClass();
        int i11 = v70.a.f103433b;
        kotlin.jvm.internal.u.j(measurementsVertical, "<this>");
        switch (measurementsVertical.ordinal()) {
            case 0:
                str = "his_activity";
                break;
            case 1:
                str = "his_body";
                break;
            case 2:
                str = "his_heart";
                break;
            case 3:
                str = "his_nutrition";
                break;
            case 4:
                str = "his_respiratory";
                break;
            case 5:
                str = "his_sleep";
                break;
            case 6:
                str = "his_sexual";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        v70.a.c("explore_data_view", kotlin.collections.s0.i(new nm0.j("view_type", str)), 2);
        ch.d dVar = healthVerticalActivity.f41917g;
        if (dVar != null) {
            ah.k g11 = dVar.g();
            long id2 = healthVerticalActivity.I3().getId();
            Integer valueOf = Integer.valueOf(measurementsVertical.ordinal());
            g11.getClass();
            healthVerticalActivity.startActivity(ah.k.l(healthVerticalActivity, id2, valueOf));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void E3(HealthVerticalActivity healthVerticalActivity, String str, MeasurementsVertical measurementsVertical) {
        healthVerticalActivity.getClass();
        String d11 = androidx.room.a.d(measurementsVertical);
        int i11 = v70.a.f103433b;
        v70.a.d("learn_more_about_his", "learn_more_about_his", kotlin.collections.s0.i(new nm0.j("health_vertical", d11)), true);
        ch.d dVar = healthVerticalActivity.f41917g;
        if (dVar != null) {
            healthVerticalActivity.startActivity(ch.l.a(dVar.t(), healthVerticalActivity, null, null, str, new HMWebViewDelegate(), 6));
        } else {
            kotlin.jvm.internal.u.s("intentBuilder");
            throw null;
        }
    }

    public static final void F3(HealthVerticalActivity healthVerticalActivity, j0.a aVar) {
        s1 s1Var = healthVerticalActivity.f41918h;
        if (s1Var != null) {
            s1Var.b(healthVerticalActivity, aVar, o70.a.e(healthVerticalActivity.I3()));
        } else {
            kotlin.jvm.internal.u.s("measurementRedirection");
            throw null;
        }
    }

    public static final Object G3(HealthVerticalActivity healthVerticalActivity, qm0.d dVar) {
        cz.l lVar = healthVerticalActivity.f41919i;
        if (lVar != null) {
            Object a11 = lVar.a(healthVerticalActivity.I3().getId(), dVar);
            if (a11 != CoroutineSingletons.f76214a) {
                return nm0.y.f85009a;
            }
            return a11;
        }
        kotlin.jvm.internal.u.s("healthScoreInfoCardRepository");
        throw null;
    }

    public static final void H3(HealthVerticalActivity healthVerticalActivity, StartTrackingMetricItem startTrackingMetricItem) {
        String str;
        healthVerticalActivity.getClass();
        String string = healthVerticalActivity.getString(l2.d.h(startTrackingMetricItem).a());
        kotlin.jvm.internal.u.i(string, "getString(...)");
        int i11 = v70.a.f103433b;
        switch (startTrackingMetricItem.ordinal()) {
            case 0:
                str = "steps";
                break;
            case 1:
                str = "workout";
                break;
            case 2:
                str = "fitness_level";
                break;
            case 3:
                str = "weight";
                break;
            case 4:
                str = "body_composition";
                break;
            case 5:
                str = "electrodermal_assessment";
                break;
            case 6:
                str = ConstantsWs.SUBCATEGORY_FEATURE_BODY_TEMPERATURE;
                break;
            case 7:
                str = "heart_sound";
                break;
            case 8:
                str = ConstantsWs.JSON_SESSION_KEY_ECG;
                break;
            case 9:
                str = "heart_rate";
                break;
            case 10:
                str = "spo2";
                break;
            case 11:
                str = "sleep_spo2";
                break;
            case 12:
                str = "afib_event";
                break;
            case 13:
                str = "blood_pressure";
                break;
            case 14:
                str = "pulse_wave_velocity";
                break;
            case 15:
                str = "vascular_age";
                break;
            case 16:
                str = "sleep";
                break;
            case 17:
                str = "sleep_apnea";
                break;
            case 18:
                str = "breathing_disturbance";
                break;
            case 19:
                str = "cycle_tracking";
                break;
            case 20:
                str = "vitamin_c";
                break;
            case 21:
                str = "ketones";
                break;
            case 22:
                str = "specific_gravity";
                break;
            case 23:
                str = "ph";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        v70.a.c("start_tracking_".concat(str), null, 6);
        ch.d dVar = healthVerticalActivity.f41917g;
        if (dVar != null) {
            dVar.h().getClass();
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(healthVerticalActivity.getPackageName(), "com.withings.overview.ui.StartTrackingActivity").putExtra("url", string);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            healthVerticalActivity.startActivity(putExtra);
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User I3() {
        return (User) this.f41916f.getValue(this, f41914k[1]);
    }

    public final HealthVerticalActivityViewModel J3() {
        return (HealthVerticalActivityViewModel) this.f41920j.getValue();
    }

    @Override // com.withings.measurements.ui.Hilt_HealthVerticalActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 642197121, new b((MeasurementsVertical) a.f41921a.get(((Number) this.f41915e.getValue(this, f41914k[0])).intValue()))));
    }
}
