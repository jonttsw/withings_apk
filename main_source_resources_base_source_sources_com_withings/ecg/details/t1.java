package com.withings.ecg.details;

import android.annotation.SuppressLint;
import android.content.Context;
import com.withings.ecg.details.n2;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import com.withings.user.core.models.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: EcgListViewModel.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class t1 extends androidx.lifecycle.g1 implements HeartSignalRepository.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final Long f38311a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f38312b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f38313c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f38314d;

    /* renamed from: e  reason: collision with root package name */
    private final HeartSignalRepository f38315e;

    /* renamed from: f  reason: collision with root package name */
    private final NoteRepository f38316f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f38317g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.n<Boolean> f38318h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<User> f38319i;

    /* renamed from: j  reason: collision with root package name */
    private Flow<m1> f38320j;

    /* renamed from: k  reason: collision with root package name */
    private final StateFlow<n2> f38321k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EcgListViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Long f38322a;

        /* renamed from: b  reason: collision with root package name */
        private final Long f38323b;

        public a(Long l5, Long l6) {
            this.f38322a = l5;
            this.f38323b = l6;
        }

        public final Long a() {
            return this.f38323b;
        }

        public final Long b() {
            return this.f38322a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f38322a, aVar.f38322a) && kotlin.jvm.internal.u.e(this.f38323b, aVar.f38323b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i11 = 0;
            Long l5 = this.f38322a;
            if (l5 == null) {
                hashCode = 0;
            } else {
                hashCode = l5.hashCode();
            }
            int i12 = hashCode * 31;
            Long l6 = this.f38323b;
            if (l6 != null) {
                i11 = l6.hashCode();
            }
            return i12 + i11;
        }

        public final String toString() {
            return "HeartSignalIds(wsId=" + this.f38322a + ", localId=" + this.f38323b + ")";
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class b implements Flow<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f38324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1 f38325b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f38326a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t1 f38327b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgListViewModel$special$$inlined$map$1$2", f = "EcgListViewModel.kt", l = {224, 223}, m = "emit")
            /* renamed from: com.withings.ecg.details.t1$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0503a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f38328a;

                /* renamed from: b  reason: collision with root package name */
                int f38329b;

                /* renamed from: c  reason: collision with root package name */
                a f38330c;

                /* renamed from: e  reason: collision with root package name */
                FlowCollector f38332e;

                /* renamed from: f  reason: collision with root package name */
                User f38333f;

                public C0503a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f38328a = obj;
                    this.f38329b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, t1 t1Var) {
                this.f38326a = flowCollector;
                this.f38327b = t1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x016e A[RETURN] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r19, qm0.d r20) {
                /*
                    Method dump skipped, instructions count: 370
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.details.t1.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public b(Flow flow, t1 t1Var) {
            this.f38324a = flow;
            this.f38325b = t1Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super m1> flowCollector, qm0.d dVar) {
            Object collect = this.f38324a.collect(new a(flowCollector, this.f38325b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes3.dex */
    public static final class c implements Flow<n2> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f38334a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f38335a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgListViewModel$special$$inlined$map$2$2", f = "EcgListViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.ecg.details.t1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0504a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f38336a;

                /* renamed from: b  reason: collision with root package name */
                int f38337b;

                public C0504a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f38336a = obj;
                    this.f38337b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f38335a = flowCollector;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
                if (r5 == null) goto L25;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            /* JADX WARN: Type inference failed for: r6v5, types: [com.withings.ecg.details.n2$b] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.ecg.details.t1.c.a.C0504a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.ecg.details.t1$c$a$a r0 = (com.withings.ecg.details.t1.c.a.C0504a) r0
                    int r1 = r0.f38337b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f38337b = r1
                    goto L18
                L13:
                    com.withings.ecg.details.t1$c$a$a r0 = new com.withings.ecg.details.t1$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f38336a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f38337b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L58
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.ecg.details.m1 r5 = (com.withings.ecg.details.m1) r5
                    if (r5 == 0) goto L4b
                    java.util.List r6 = r5.b()
                    boolean r6 = r6.isEmpty()
                    if (r6 == 0) goto L43
                    com.withings.ecg.details.n2$a r5 = com.withings.ecg.details.n2.a.f38274a
                    goto L49
                L43:
                    com.withings.ecg.details.n2$b r6 = new com.withings.ecg.details.n2$b
                    r6.<init>(r5)
                    r5 = r6
                L49:
                    if (r5 != 0) goto L4d
                L4b:
                    com.withings.ecg.details.n2$a r5 = com.withings.ecg.details.n2.a.f38274a
                L4d:
                    r0.f38337b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f38335a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L58
                    return r1
                L58:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.details.t1.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(Flow flow) {
            this.f38334a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super n2> flowCollector, qm0.d dVar) {
            Object collect = this.f38334a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    public t1(Long l5, Long l6, Long l11, Long l12, Context context, HeartSignalRepository heartSignalRepository, NoteRepository noteRepository, r70.c userRepository) {
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f38311a = l6;
        this.f38312b = l11;
        this.f38313c = l12;
        this.f38314d = context;
        this.f38315e = heartSignalRepository;
        this.f38316f = noteRepository;
        this.f38317g = new androidx.lifecycle.k0<>();
        this.f38318h = new xw.n<>();
        Flow<User> f11 = (l5 == null || (f11 = userRepository.g(l5.longValue())) == null) ? userRepository.f() : f11;
        this.f38319i = f11;
        Flow<m1> flowOn = FlowKt.flowOn(new b(f11, this), Dispatchers.getIO());
        this.f38320j = flowOn;
        this.f38321k = FlowKt.stateIn(new c(flowOn), androidx.lifecycle.h1.a(this), SharingStarted.Companion.getLazily(), n2.a.f38274a);
        heartSignalRepository.registerListener(this);
    }

    public static final ArrayList g0(t1 t1Var, List list) {
        ArrayList arrayList = null;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                List<NoteGroup> list2 = list;
                arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (NoteGroup noteGroup : list2) {
                    arrayList.add(new a(noteGroup.getSignalId(), noteGroup.getLocalHeartSignalMeasurementId()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f38315e.unregisterListener(this);
        super.onCleared();
    }

    @Override // com.withings.ecg.model.HeartSignalRepository.Listener
    public final void onHeartSignalDeleted(long j5, long j11) {
        this.f38318h.postValue(Boolean.TRUE);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository.Listener
    public final void onHeartSignalInserted(HeartSignalMeasurement heartSignalMeasurement) {
        kotlin.jvm.internal.u.j(heartSignalMeasurement, "heartSignalMeasurement");
    }

    public final xw.n<Boolean> q0() {
        return this.f38318h;
    }

    public final androidx.lifecycle.k0<Integer> r0() {
        return this.f38317g;
    }

    public final StateFlow<n2> t0() {
        return this.f38321k;
    }
}
