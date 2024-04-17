package com.withings.weight.presentation.ui;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.common.compose.component.t1;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import ws.b;
/* compiled from: WeightExploreDataActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/weight/presentation/ui/WeightExploreDataActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeightExploreDataActivity extends Hilt_WeightExploreDataActivity {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f47163e = new i1(kotlin.jvm.internal.q0.b(WeightExploreDataViewModel.class), new c(this), new b(this), new d(this));
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public n90.n f47164f;

    /* renamed from: g  reason: collision with root package name */
    public StateFlow<? extends ws.b> f47165g;

    /* compiled from: WeightExploreDataActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1059840354, new v0(WeightExploreDataActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47167a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f47167a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f47167a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47168a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f47168a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f47168a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47169a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f47169a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f47169a.getDefaultViewModelCreationExtras();
        }
    }

    public static final WeightExploreDataViewModel z3(WeightExploreDataActivity weightExploreDataActivity) {
        return (WeightExploreDataViewModel) weightExploreDataActivity.f47163e.getValue();
    }

    @Override // com.withings.weight.presentation.ui.Hilt_WeightExploreDataActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i1 i1Var = this.f47163e;
        r0 r0Var = new r0(((WeightExploreDataViewModel) i1Var.getValue()).z0(), this);
        LifecycleCoroutineScopeImpl l5 = m0.t.l(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow shareIn = FlowKt.shareIn(r0Var, l5, companion.getEagerly(), 1);
        String string = getString(C1987R.string._TREND_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        StateFlow<? extends ws.b> stateIn = FlowKt.stateIn(FlowKt.combine(shareIn, ((WeightExploreDataViewModel) i1Var.getValue()).y0(), ((WeightExploreDataViewModel) i1Var.getValue()).A0(), ((WeightExploreDataViewModel) i1Var.getValue()).r0(), new s0(this, new t1(string), null)), m0.t.l(this), companion.getEagerly(), b.a.f106052a);
        kotlin.jvm.internal.u.j(stateIn, "<set-?>");
        this.f47165g = stateIn;
        e.k.a(this, new s1.a(true, -718246968, new a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i11 = v70.a.f103433b;
        v70.a.c("explore_data_view", kotlin.collections.s0.i(new nm0.j("view_type", "weight")), 2);
    }
}
