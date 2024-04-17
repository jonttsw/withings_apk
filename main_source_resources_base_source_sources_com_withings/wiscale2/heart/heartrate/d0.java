package com.withings.wiscale2.heart.heartrate;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayActivity.kt */
/* loaded from: classes5.dex */
public final class d0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f57570a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityAggregateManager f57571b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.n<Track> f57572c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.f f57573d;

    /* compiled from: HeartRateDayActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayPagerViewModel$firstAggregateEver$1", f = "HeartRateDayActivity.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<DateTime>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57574a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f57575b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f57575b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<DateTime> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DateTime now;
            DateTime midnight;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57574a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57575b;
                d0 d0Var = d0.this;
                ActivityAggregate firstAggregate = d0Var.f0().getFirstAggregate(d0Var.getUser().q());
                if (firstAggregate == null || (midnight = firstAggregate.getMidnight()) == null || (now = midnight.withTimeAtStartOfDay()) == null) {
                    now = DateTime.now();
                }
                kotlin.jvm.internal.u.g(now);
                this.f57574a = 1;
                if (h0Var.emit(now, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public d0(User user, ActivityAggregateManager activityAggregateManager) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        this.f57570a = user;
        this.f57571b = activityAggregateManager;
        this.f57572c = new xw.n<>();
        this.f57573d = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(null), 2);
    }

    public final ActivityAggregateManager f0() {
        return this.f57571b;
    }

    public final androidx.lifecycle.f g0() {
        return this.f57573d;
    }

    public final User getUser() {
        return this.f57570a;
    }

    public final xw.n<Track> i0() {
        return this.f57572c;
    }
}
