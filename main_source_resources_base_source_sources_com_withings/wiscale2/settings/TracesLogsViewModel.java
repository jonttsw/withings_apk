package com.withings.wiscale2.settings;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: TracesLogsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/TracesLogsViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TracesLogsViewModel extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59790a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<List<String>> f59791b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<List<String>> f59792c;

    /* compiled from: TracesLogsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.TracesLogsViewModel$1", f = "TracesLogsActivity.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59793a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59793a;
            TracesLogsViewModel tracesLogsViewModel = TracesLogsViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                v5 v5Var = new v5(tracesLogsViewModel.g0());
                this.f59793a = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new u5(v5Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            tracesLogsViewModel.f59791b.setValue(kotlin.collections.x.u0((Iterable) obj));
            return nm0.y.f85009a;
        }
    }

    @Inject
    public TracesLogsViewModel(Context context) {
        this.f59790a = context;
        MutableStateFlow<List<String>> MutableStateFlow = StateFlowKt.MutableStateFlow(kotlin.collections.i0.f76187a);
        this.f59791b = MutableStateFlow;
        this.f59792c = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final Context g0() {
        return this.f59790a;
    }

    public final StateFlow<List<String>> i0() {
        return this.f59792c;
    }
}
