package com.withings.weight.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.weight.presentation.viewmodel.BodyCompViewModel;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import m90.e;
import org.joda.time.DateTime;
/* compiled from: BodyCompositionActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/weight/presentation/ui/BodyCompositionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "<init>", "()V", "a", "Lm90/e;", "uiState", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompositionActivity extends Hilt_BodyCompositionActivity implements py.a {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public n90.m f47117e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f47118f;

    /* renamed from: g  reason: collision with root package name */
    private final i1 f47119g = new i1(kotlin.jvm.internal.q0.b(BodyCompViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final f f47120h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f47121i = nm0.h.b(new e());

    /* renamed from: j  reason: collision with root package name */
    private final String f47122j = "body_composition";

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47116l = {androidx.camera.core.v.c(BodyCompositionActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f47115k = new Object();

    /* compiled from: BodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, User user, DateTime dateTime, Integer num) {
            aVar.getClass();
            kotlin.jvm.internal.u.j(context, "context");
            Intent intent = new Intent(context, BodyCompositionActivity.class);
            intent.putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            intent.putExtra("date", dateTime);
            intent.putExtra("period", (Serializable) null);
            intent.putExtra("measure_type", num);
            intent.putExtra("extra_should_scroll_segmental", false);
            return intent;
        }
    }

    /* compiled from: BodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Period, ? extends DateTime>, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(nm0.j<? extends Period, ? extends DateTime> jVar) {
            nm0.j<? extends Period, ? extends DateTime> jVar2 = jVar;
            kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(BodyCompositionActivity.this, jVar2.a(), jVar2.b());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StateFlow<m90.e> f47124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BodyCompositionActivity f47125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(StateFlow<? extends m90.e> stateFlow, BodyCompositionActivity bodyCompositionActivity) {
            super(2);
            this.f47124a = stateFlow;
            this.f47125b = bodyCompositionActivity;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1227174270, new r(this.f47124a, this.f47125b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f47126a;

        d(ym0.l lVar) {
            this.f47126a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f47126a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f47126a;
        }

        public final int hashCode() {
            return this.f47126a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47126a.invoke(obj);
        }
    }

    /* compiled from: BodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(BodyCompositionActivity.this.getIntent().getBooleanExtra("extra_should_scroll_segmental", false));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47128a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47129b;

        public f(Activity activity) {
            this.f47129b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47128a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f47130a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f47130a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47131a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f47131a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f47131a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f47132a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f47132a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BodyCompViewModel B3() {
        return (BodyCompViewModel) this.f47119g.getValue();
    }

    public static final User z3(BodyCompositionActivity bodyCompositionActivity) {
        return (User) bodyCompositionActivity.f47120h.getValue(bodyCompositionActivity, f47116l[0]);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f47122j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // com.withings.weight.presentation.ui.Hilt_BodyCompositionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        B3().s1().observe(this, new d(new b()));
        boolean booleanValue = ((Boolean) this.f47121i.getValue()).booleanValue();
        Flow flowCombine = FlowKt.flowCombine(new com.withings.weight.presentation.ui.e(B3().o1(), this), B3().r1(), new kotlin.coroutines.jvm.internal.i(3, null));
        LifecycleCoroutineScopeImpl l5 = m0.t.l(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        Flow combine = FlowKt.combine(B3().t1(), B3().k1(), B3().o1(), B3().i1(), FlowKt.stateIn(flowCombine, l5, companion.getEagerly(), kotlin.collections.i0.f76187a), new com.withings.weight.presentation.ui.g(this, null));
        Flow combine2 = FlowKt.combine(B3().z1(), B3().C1(), B3().A1(), new com.withings.weight.presentation.ui.d(this, null));
        e.k.a(this, new s1.a(true, -874480664, new c(FlowKt.stateIn(FlowKt.combine(B3().g1(), combine, FlowKt.combine(B3().q1(), FlowKt.combine(B3().l1(), B3().n1(), B3().m1(), new com.withings.weight.presentation.ui.d(this, null)), FlowKt.combine(B3().v1(), B3().y1(), B3().w1(), new com.withings.weight.presentation.ui.d(this, null)), combine2, B3().F1(), new com.withings.weight.presentation.ui.i(null)), new com.withings.weight.presentation.ui.f(booleanValue, null)), m0.t.l(this), companion.getEagerly(), e.a.f81810a), this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        B3().P1();
        super.onStop();
    }
}
