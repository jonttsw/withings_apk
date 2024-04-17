package com.withings.wiscale2.heart.heartrate;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$aggregateForDay$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_NOPWDUPDATECODE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<ActivityAggregate>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57644a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57645b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57646c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f57646c = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f0 f0Var = new f0(this.f57646c, dVar);
        f0Var.f57645b = obj;
        return f0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<ActivityAggregate> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActivityAggregateManager activityAggregateManager;
        User user;
        DateTime dateTime;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57644a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            e0 e0Var = this.f57646c;
            qm0.f coroutineContext = androidx.lifecycle.h1.a(e0Var).getCoroutineContext();
            activityAggregateManager = e0Var.f57588e;
            user = e0Var.f57584a;
            dateTime = e0Var.f57585b;
            ca0.a aVar = new ca0.a(coroutineContext, activityAggregateManager, null, user, dateTime);
            this.f57644a = 1;
            if (((androidx.lifecycle.h0) this.f57645b).a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
