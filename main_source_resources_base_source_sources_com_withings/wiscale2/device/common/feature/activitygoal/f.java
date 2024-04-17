package com.withings.wiscale2.device.common.feature.activitygoal;

import androidx.lifecycle.LiveData;
import com.withings.device.Device;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.target.Target;
import com.withings.target.data.TargetRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: DailyStepsGoalLiveData.kt */
/* loaded from: classes5.dex */
public final class f extends LiveData<Integer> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f50927f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f50928a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f50929b;

    /* renamed from: c  reason: collision with root package name */
    private final TargetRepository f50930c;

    /* renamed from: d  reason: collision with root package name */
    private final m70.i f50931d;

    /* renamed from: e  reason: collision with root package name */
    private final fy.p f50932e;

    /* compiled from: DailyStepsGoalLiveData.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.DailyStepsGoalLiveData$onActive$1$1", f = "DailyStepsGoalLiveData.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50933a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f50935c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DailyStepsGoalLiveData.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.DailyStepsGoalLiveData$onActive$1$1$1", f = "DailyStepsGoalLiveData.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.device.common.feature.activitygoal.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0689a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Target, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f50936a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f50937b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f50938c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f50939d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0689a(f fVar, long j5, qm0.d<? super C0689a> dVar) {
                super(2, dVar);
                this.f50938c = fVar;
                this.f50939d = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0689a c0689a = new C0689a(this.f50938c, this.f50939d, dVar);
                c0689a.f50937b = obj;
                return c0689a;
            }

            @Override // ym0.p
            public final Object invoke(Target target, qm0.d<? super nm0.y> dVar) {
                return ((C0689a) create(target, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                f fVar;
                f fVar2;
                int asInt;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f50936a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        fVar2 = (f) this.f50937b;
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    Target target = (Target) this.f50937b;
                    fVar = this.f50938c;
                    if (target != null) {
                        asInt = target.getAsInt();
                        fVar.postValue(new Integer(asInt));
                        return nm0.y.f85009a;
                    }
                    this.f50937b = fVar;
                    this.f50936a = 1;
                    int i12 = f.f50927f;
                    fVar.getClass();
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new e(fVar, this.f50939d, null), this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fVar2 = fVar;
                }
                asInt = ((Number) obj).intValue();
                fVar = fVar2;
                fVar.postValue(new Integer(asInt));
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f50935c = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f50935c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50933a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                f fVar = f.this;
                TargetRepository x11 = fVar.x();
                long j5 = this.f50935c;
                Flow flowOn = FlowKt.flowOn(x11.getLastActiveStepTargetFlow(j5), Dispatchers.getIO());
                C0689a c0689a = new C0689a(fVar, j5, null);
                this.f50933a = 1;
                if (FlowKt.collectLatest(flowOn, c0689a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public f(CoroutineScope coroutineScope, Long l5, Device device, TargetRepository targetRepository, m70.i userManager, fy.p pVar) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f50928a = coroutineScope;
        this.f50929b = l5;
        this.f50930c = targetRepository;
        this.f50931d = userManager;
        this.f50932e = pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Job launch$default;
        super.onActive();
        Long l5 = this.f50929b;
        if (l5 != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.f50928a, null, null, new a(l5.longValue(), null), 3, null);
            if (launch$default != null) {
                return;
            }
        }
        postValue(Integer.valueOf(zx.a.b(FitnessLevel.f41673g)));
        nm0.y yVar = nm0.y.f85009a;
    }

    public final fy.p v() {
        return this.f50932e;
    }

    public final TargetRepository x() {
        return this.f50930c;
    }

    public final m70.i y() {
        return this.f50931d;
    }
}
