package com.withings.cycletracking.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import bk.e;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import dn.b;
import java.time.MonthDay;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.LocalDate;
import ym.a;
/* compiled from: VerticalCalendarPeriodLogViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/VerticalCalendarPeriodLogViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VerticalCalendarPeriodLogViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final ym.a f35838a;

    /* renamed from: b  reason: collision with root package name */
    private final ym.f f35839b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35840c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<Throwable> f35841d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<Throwable> f35842e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<List<wm.f>> f35843f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<List<a.C1937a>> f35844g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<List<a.C1937a>> f35845h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<Integer> f35846i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<List<wm.f>> f35847j;

    /* renamed from: k  reason: collision with root package name */
    private final StateFlow<List<b.a>> f35848k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<List<e.o>> f35849l;

    /* compiled from: VerticalCalendarPeriodLogViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel$onDayClicked$1", f = "VerticalCalendarPeriodLogViewModel.kt", l = {208}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MutableStateFlow f35850a;

        /* renamed from: b  reason: collision with root package name */
        VerticalCalendarPeriodLogViewModel f35851b;

        /* renamed from: c  reason: collision with root package name */
        LocalDate f35852c;

        /* renamed from: d  reason: collision with root package name */
        Object f35853d;

        /* renamed from: e  reason: collision with root package name */
        int f35854e;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LocalDate f35856g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LocalDate localDate, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f35856g = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f35856g, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:12:0x004c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r7.f35854e
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r7.f35853d
                org.joda.time.LocalDate r3 = r7.f35852c
                com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel r4 = r7.f35851b
                kotlinx.coroutines.flow.MutableStateFlow r5 = r7.f35850a
                nm0.l.b(r8)
                goto L4c
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                nm0.l.b(r8)
                com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel r8 = com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.j0(r8)
                org.joda.time.LocalDate r3 = r7.f35856g
                r4 = r8
                r5 = r1
            L2a:
                java.lang.Object r1 = r5.getValue()
                r8 = r1
                java.util.List r8 = (java.util.List) r8
                kotlinx.coroutines.flow.StateFlow r6 = com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.i0(r4)
                java.lang.Object r6 = r6.getValue()
                java.util.List r6 = (java.util.List) r6
                r7.f35850a = r5
                r7.f35851b = r4
                r7.f35852c = r3
                r7.f35853d = r1
                r7.f35854e = r2
                java.io.Serializable r8 = com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.m0(r4, r8, r3, r6, r7)
                if (r8 != r0) goto L4c
                return r0
            L4c:
                java.util.List r8 = (java.util.List) r8
                boolean r8 = r5.compareAndSet(r1, r8)
                if (r8 == 0) goto L2a
                nm0.y r8 = nm0.y.f85009a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VerticalCalendarPeriodLogViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel$onSave$1", f = "VerticalCalendarPeriodLogViewModel.kt", l = {128, ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35857a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ VerticalCalendarPeriodLogViewModel f35860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, VerticalCalendarPeriodLogViewModel verticalCalendarPeriodLogViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f35859c = aVar;
            this.f35860d = verticalCalendarPeriodLogViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f35859c, this.f35860d, dVar);
            bVar.f35858b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35857a;
            VerticalCalendarPeriodLogViewModel verticalCalendarPeriodLogViewModel = this.f35860d;
            try {
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        this.f35859c.invoke();
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f35858b;
                this.f35857a = 1;
                if (verticalCalendarPeriodLogViewModel.f35838a.b(verticalCalendarPeriodLogViewModel.t0(), verticalCalendarPeriodLogViewModel.p0().getValue(), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = nm0.y.f85009a;
            if (nm0.k.b(a11) != null) {
                MutableSharedFlow mutableSharedFlow = verticalCalendarPeriodLogViewModel.f35841d;
                SyncFailedException syncFailedException = new SyncFailedException();
                this.f35858b = a11;
                this.f35857a = 2;
                if (mutableSharedFlow.emit(syncFailedException, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f35859c.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r12v9, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public VerticalCalendarPeriodLogViewModel(u0 savedStateHandle, vm.v vVar, vm.n nVar, um.a aVar, vm.a aVar2, vm.j jVar) {
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f35838a = aVar2;
        this.f35839b = jVar;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f35840c = longValue;
            MutableSharedFlow<Throwable> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
            this.f35841d = MutableSharedFlow$default;
            this.f35842e = FlowKt.asSharedFlow(MutableSharedFlow$default);
            Flow flowOn = FlowKt.flowOn(vVar.a(longValue), Dispatchers.getIO());
            CoroutineScope a11 = h1.a(this);
            SharingStarted.Companion companion = SharingStarted.Companion;
            SharedFlow<List<wm.f>> shareIn = FlowKt.shareIn(flowOn, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            this.f35843f = shareIn;
            i0 i0Var = i0.f76187a;
            MutableStateFlow<List<a.C1937a>> MutableStateFlow = StateFlowKt.MutableStateFlow(i0Var);
            this.f35844g = MutableStateFlow;
            StateFlow<List<a.C1937a>> asStateFlow = FlowKt.asStateFlow(MutableStateFlow);
            this.f35845h = asStateFlow;
            this.f35846i = nVar.d(aVar.e(longValue), longValue);
            this.f35847j = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(shareIn, new kotlin.coroutines.jvm.internal.i(2, null)), Dispatchers.getIO()), h1.a(this), companion.getEagerly(), i0Var);
            StateFlow<List<b.a>> stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(shareIn, asStateFlow, new v(this, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), i0Var);
            this.f35848k = stateIn;
            this.f35849l = FlowKt.stateIn(FlowKt.flowOn(FlowKt.mapLatest(stateIn, new kotlin.coroutines.jvm.internal.i(2, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), i0Var);
            return;
        }
        throw new Exception("user id shouldn't be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x031d, code lost:
        if (r4.b() != false) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m0(com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel r17, java.util.List r18, org.joda.time.LocalDate r19, java.util.List r20, qm0.d r21) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel.m0(com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel, java.util.List, org.joda.time.LocalDate, java.util.List, qm0.d):java.io.Serializable");
    }

    public final StateFlow<List<a.C1937a>> p0() {
        return this.f35845h;
    }

    public final SharedFlow<Throwable> q0() {
        return this.f35842e;
    }

    public final StateFlow<List<e.o>> r0() {
        return this.f35849l;
    }

    public final long t0() {
        return this.f35840c;
    }

    public final void y0(MonthDay monthDay, int i11) {
        kotlin.jvm.internal.u.j(monthDay, "monthDay");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(new LocalDate(i11, monthDay.getMonthValue(), monthDay.getDayOfMonth()), null), 2, null);
    }

    public final void z0(ym0.a<nm0.y> aVar) {
        if (!this.f35845h.getValue().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(aVar, this, null), 2, null);
        }
    }
}
