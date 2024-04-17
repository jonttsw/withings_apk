package com.withings.nutrisync.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ky.d;
import m10.a;
import nm0.y;
/* compiled from: NutrisyncMeasureListViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/nutrisync/ui/viewmodel/NutriSyncMeasureListViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NutriSyncMeasureListViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final n10.a f43287a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<Throwable> f43288b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<Throwable> f43289c;

    /* renamed from: d  reason: collision with root package name */
    private final Flow<List<d>> f43290d;

    /* renamed from: e  reason: collision with root package name */
    private final a f43291e;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Flow<a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f43292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NutriSyncMeasureListViewModel f43293b;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0580a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f43294a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NutriSyncMeasureListViewModel f43295b;

            /* compiled from: Emitters.kt */
            @e(c = "com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$special$$inlined$map$1$2", f = "NutrisyncMeasureListViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0581a extends c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f43296a;

                /* renamed from: b  reason: collision with root package name */
                int f43297b;

                public C0581a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43296a = obj;
                    this.f43297b |= Integer.MIN_VALUE;
                    return C0580a.this.emit(null, this);
                }
            }

            public C0580a(FlowCollector flowCollector, NutriSyncMeasureListViewModel nutriSyncMeasureListViewModel) {
                this.f43294a = flowCollector;
                this.f43295b = nutriSyncMeasureListViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel.a.C0580a.C0581a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$a$a$a r0 = (com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel.a.C0580a.C0581a) r0
                    int r1 = r0.f43297b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f43297b = r1
                    goto L18
                L13:
                    com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$a$a$a r0 = new com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f43296a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f43297b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L4e
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    m10.a$b r6 = new m10.a$b
                    com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel r2 = r4.f43295b
                    n10.a r2 = com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel.f0(r2)
                    java.util.ArrayList r5 = r2.a(r5)
                    r6.<init>(r5)
                    r0.f43297b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f43294a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.nutrisync.ui.viewmodel.NutriSyncMeasureListViewModel.a.C0580a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(Flow flow, NutriSyncMeasureListViewModel nutriSyncMeasureListViewModel) {
            this.f43292a = flow;
            this.f43293b = nutriSyncMeasureListViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super a.b> flowCollector, qm0.d dVar) {
            Object collect = this.f43292a.collect(new C0580a(flowCollector, this.f43293b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    @Inject
    public NutriSyncMeasureListViewModel(u0 savedStateHandle, n10.a aVar) {
        u.j(savedStateHandle, "savedStateHandle");
        this.f43287a = aVar;
        if (((Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID)) != null) {
            MutableStateFlow<Throwable> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            this.f43288b = MutableStateFlow;
            this.f43289c = FlowKt.asStateFlow(MutableStateFlow);
            Flow<List<d>> flowOf = FlowKt.flowOf(i0.f76187a);
            this.f43290d = flowOf;
            this.f43291e = new a(flowOf, this);
            return;
        }
        throw new Exception("user id shouldn't be null");
    }

    public final a g0() {
        return this.f43291e;
    }
}
