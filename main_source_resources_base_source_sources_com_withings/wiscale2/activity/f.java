package com.withings.wiscale2.activity;

import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: ActivityActivity.kt */
/* loaded from: classes4.dex */
public final class f extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f48262a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityAggregateManager f48263b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.f f48264c;

    /* renamed from: d  reason: collision with root package name */
    private final Flow<Integer> f48265d;

    /* compiled from: ActivityActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.ActivityViewModel$firstAggregateDate$1", f = "ActivityActivity.kt", l = {221}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<h0<DateTime>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48266a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f48267b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f48267b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(h0<DateTime> h0Var, qm0.d<? super y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DateTime withTimeAtStartOfDay;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48266a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                h0 h0Var = (h0) this.f48267b;
                f fVar = f.this;
                ActivityAggregate firstAggregate = fVar.f48263b.getFirstAggregate(fVar.f48262a.q());
                if (firstAggregate == null || (withTimeAtStartOfDay = firstAggregate.getMidnight()) == null) {
                    withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                }
                u.g(withTimeAtStartOfDay);
                this.f48266a = 1;
                if (h0Var.emit(withTimeAtStartOfDay, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class b implements Flow<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f48269a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f48270a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.ActivityViewModel$special$$inlined$map$1$2", f = "ActivityActivity.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.activity.f$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0667a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f48271a;

                /* renamed from: b  reason: collision with root package name */
                int f48272b;

                public C0667a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f48271a = obj;
                    this.f48272b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f48270a = flowCollector;
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
                    boolean r0 = r6 instanceof com.withings.wiscale2.activity.f.b.a.C0667a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.wiscale2.activity.f$b$a$a r0 = (com.withings.wiscale2.activity.f.b.a.C0667a) r0
                    int r1 = r0.f48272b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f48272b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.activity.f$b$a$a r0 = new com.withings.wiscale2.activity.f$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f48271a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f48272b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L48
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    com.withings.target.Target r5 = (com.withings.target.Target) r5
                    int r5 = r5.getAsInt()
                    java.lang.Integer r6 = new java.lang.Integer
                    r6.<init>(r5)
                    r0.f48272b = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f48270a
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.f.b.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f48269a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
            Object collect = this.f48269a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    public f(User user, ActivityAggregateManager activityAggregateManager, TargetRepository targetRepository) {
        u.j(user, "user");
        u.j(activityAggregateManager, "activityAggregateManager");
        this.f48262a = user;
        this.f48263b = activityAggregateManager;
        this.f48264c = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(null), 2);
        this.f48265d = FlowKt.flowOn(new b(targetRepository.getLastActiveStepsTargetOrDefaultFlow(user.q())), Dispatchers.getIO());
    }

    public final androidx.lifecycle.f i0() {
        return this.f48264c;
    }

    public final Flow<Integer> j0() {
        return this.f48265d;
    }
}
