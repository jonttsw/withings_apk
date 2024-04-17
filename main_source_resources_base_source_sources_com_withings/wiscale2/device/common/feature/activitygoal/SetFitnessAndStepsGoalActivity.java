package com.withings.wiscale2.device.common.feature.activitygoal;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.navigation.e;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SetFitnessAndStepsGoalActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/activitygoal/SetFitnessAndStepsGoalActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetFitnessAndStepsGoalActivity extends Hilt_SetFitnessAndStepsGoalActivity {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50897l = {androidx.camera.core.v.c(SetFitnessAndStepsGoalActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(SetFitnessAndStepsGoalActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final b f50898e;

    /* renamed from: f  reason: collision with root package name */
    private final c f50899f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f50900g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public m70.i f50901h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f50902i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public PlatformFeatureRepository f50903j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public com.withings.wiscale2.device.common.feature.u f50904k;

    /* compiled from: SetFitnessAndStepsGoalActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<androidx.navigation.e> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(SetFitnessAndStepsGoalActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50906a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f50907b;

        public b(Activity activity) {
            this.f50907b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f50906a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50908a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f50909b;

        public c(Activity activity) {
            this.f50909b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f50908a.getValue();
        }
    }

    /* compiled from: SetFitnessAndStepsGoalActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<User> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity = SetFitnessAndStepsGoalActivity.this;
            m70.i iVar = setFitnessAndStepsGoalActivity.f50901h;
            if (iVar != null) {
                return iVar.i(SetFitnessAndStepsGoalActivity.A3(setFitnessAndStepsGoalActivity));
            }
            kotlin.jvm.internal.u.s("userManager");
            throw null;
        }
    }

    public SetFitnessAndStepsGoalActivity() {
        super(0);
        this.f50898e = new b(this);
        this.f50899f = new c(this);
        this.f50900g = nm0.h.b(new a());
        this.f50902i = nm0.h.b(new d());
    }

    public static final long A3(SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity) {
        return ((Number) setFitnessAndStepsGoalActivity.f50898e.getValue(setFitnessAndStepsGoalActivity, f50897l[0])).longValue();
    }

    public static final Device z3(SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity) {
        setFitnessAndStepsGoalActivity.getClass();
        return (Device) setFitnessAndStepsGoalActivity.f50899f.getValue(setFitnessAndStepsGoalActivity, f50897l[1]);
    }

    public final void B3() {
        androidx.navigation.e eVar = (androidx.navigation.e) this.f50900g.getValue();
        eVar.N();
        eVar.H(C1987R.id.activity_goal_settings, androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, (User) this.f50902i.getValue()), new nm0.j("device", (Device) this.f50899f.getValue(this, f50897l[1]))));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.withings.wiscale2.device.common.feature.activitygoal.Hilt_SetFitnessAndStepsGoalActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C1987R.id.container);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ay.b.t(findViewById);
        nm0.g gVar = this.f50900g;
        androidx.navigation.v b10 = ((androidx.navigation.e) gVar.getValue()).C().b(C1987R.navigation.activity_goal_nav_graph);
        b10.Q(C1987R.id.activity_goal_intro);
        ((androidx.navigation.e) gVar.getValue()).a0(b10, androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, (User) this.f50902i.getValue()), new nm0.j("device", (Device) this.f50899f.getValue(this, f50897l[1]))));
        ((androidx.navigation.e) gVar.getValue()).p(new e.b() { // from class: com.withings.wiscale2.device.common.feature.activitygoal.w
            @Override // androidx.navigation.e.b
            public final void X0(androidx.navigation.e eVar, androidx.navigation.t destination, Bundle bundle2) {
                fn0.k<Object>[] kVarArr = SetFitnessAndStepsGoalActivity.f50897l;
                SetFitnessAndStepsGoalActivity this$0 = SetFitnessAndStepsGoalActivity.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                kotlin.jvm.internal.u.j(eVar, "<anonymous parameter 0>");
                kotlin.jvm.internal.u.j(destination, "destination");
                if (destination.r() == C1987R.id.activity_goal_settings) {
                    BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getIO(), null, new x(this$0, null), 2, null);
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
