package com.withings.weight.presentation.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.weight.presentation.viewmodel.WeightViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import m90.f;
/* compiled from: WeightActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/weight/presentation/ui/WeightActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "<init>", "()V", "Lm90/f;", "uiState", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeightActivity extends Hilt_WeightActivity implements py.a {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47145m = {androidx.camera.core.v.c(WeightActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f47146n = 0;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f47148f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public n90.q f47149g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public jm.a f47150h;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f47153k;

    /* renamed from: l  reason: collision with root package name */
    private final String f47154l;

    /* renamed from: e  reason: collision with root package name */
    private final b f47147e = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final i1 f47151i = new i1(kotlin.jvm.internal.q0.b(WeightViewModel.class), new d(this), new c(this), new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f47152j = nm0.h.b(new f());

    /* compiled from: WeightActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StateFlow<m90.f> f47155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeightActivity f47156b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(StateFlow<? extends m90.f> stateFlow, WeightActivity weightActivity) {
            super(2);
            this.f47155a = stateFlow;
            this.f47156b = weightActivity;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1941714296, new o0(this.f47155a, this.f47156b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47157a = nm0.h.b(new p0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47158b;

        public b(Activity activity) {
            this.f47158b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47157a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47159a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f47159a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f47159a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47160a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f47160a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f47160a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47161a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f47161a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f47161a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WeightActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<l70.u> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final l70.u invoke() {
            jm.a aVar = WeightActivity.this.f47150h;
            if (aVar != null) {
                return aVar.g(1);
            }
            kotlin.jvm.internal.u.s("measureFormatter");
            throw null;
        }
    }

    public WeightActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.nervehealth.ui.c(2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f47153k = registerForActivityResult;
        this.f47154l = "weight";
    }

    public static final l70.u C3(WeightActivity weightActivity) {
        return (l70.u) weightActivity.f47152j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightViewModel D3() {
        return (WeightViewModel) this.f47151i.getValue();
    }

    public static final User z3(WeightActivity weightActivity) {
        return (User) weightActivity.f47147e.getValue(weightActivity, f47145m[0]);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f47154l;
    }

    @Override // com.withings.weight.presentation.ui.Hilt_WeightActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1481674846, new a(FlowKt.stateIn(new z(new Flow[]{FlowKt.combine(D3().U0(), D3().c1(), new f0(this, null)), FlowKt.combine(FlowKt.combine(D3().k1(), D3().i1(), new e0(this, null)), D3().m1(), D3().d1(), D3().c1(), new d0(this, null)), FlowKt.combine(D3().V0(), D3().W0(), D3().X0(), new b0(this, null)), FlowKt.combine(D3().Y0(), D3().Z0(), new c0(this, null)), D3().e1(), new a0(D3().l1())}), m0.t.l(this), SharingStarted.Companion.getEagerly(), f.a.f81849a), this)));
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new g0(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        D3().q1();
        super.onStop();
    }
}
