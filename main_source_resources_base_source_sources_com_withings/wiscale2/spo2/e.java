package com.withings.wiscale2.spo2;

import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SpO2DayViewModel.kt */
/* loaded from: classes5.dex */
public final class e extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final k0<Period> f61654a;

    /* renamed from: b  reason: collision with root package name */
    private final k0<DateTime> f61655b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.o<Period, DateTime, DateTime, nm0.o<Period, DateTime, DateTime>> f61656c;

    /* compiled from: SpO2DayViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.SpO2DayViewModel$firstDataDate$1", f = "SpO2DayViewModel.kt", l = {38, 48}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<DateTime>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        DateTime f61657a;

        /* renamed from: b  reason: collision with root package name */
        DateTime f61658b;

        /* renamed from: c  reason: collision with root package name */
        n f61659c;

        /* renamed from: d  reason: collision with root package name */
        int f61660d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f61661e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ei0.q f61662f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ User f61663g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ActivityAggregateManager f61664h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ fy.n f61665i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ lj0.h0 f61666j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ei0.q qVar, User user, ActivityAggregateManager activityAggregateManager, fy.n nVar, lj0.h0 h0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61662f = qVar;
            this.f61663g = user;
            this.f61664h = activityAggregateManager;
            this.f61665i = nVar;
            this.f61666j = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f61662f, this.f61663g, this.f61664h, this.f61665i, this.f61666j, dVar);
            aVar.f61661e = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(h0<DateTime> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DateTime dateTime;
            DateTime dateTime2;
            Serializable a11;
            h0 h0Var;
            DateTime dateTime3;
            n nVar;
            Date date;
            DateTime dateTime4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61660d;
            User user = this.f61663g;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n nVar2 = this.f61659c;
                DateTime dateTime5 = this.f61658b;
                dateTime3 = this.f61657a;
                h0Var = (h0) this.f61661e;
                nm0.l.b(obj);
                dateTime2 = dateTime5;
                nVar = nVar2;
                a11 = obj;
            } else {
                nm0.l.b(obj);
                h0 h0Var2 = (h0) this.f61661e;
                Track r7 = this.f61662f.r(user.q());
                if (r7 != null) {
                    dateTime = r7.getStartDate();
                } else {
                    dateTime = null;
                }
                ActivityAggregate firstAggregate = this.f61664h.getFirstAggregate(user.q());
                if (firstAggregate != null) {
                    dateTime2 = firstAggregate.getMidnight();
                } else {
                    dateTime2 = null;
                }
                n nVar3 = n.f61682a;
                this.f61661e = h0Var2;
                this.f61657a = dateTime;
                this.f61658b = dateTime2;
                this.f61659c = nVar3;
                this.f61660d = 1;
                a11 = this.f61665i.a(user.q(), new Long(new DateTime(0L).getMillis()), true, null, new int[]{54}, this);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h0Var = h0Var2;
                dateTime3 = dateTime;
                nVar = nVar3;
            }
            MeasuresGroup measuresGroup = (MeasuresGroup) kotlin.collections.x.K(n.d(nVar, hy.g.f((List) a11)));
            if (measuresGroup != null) {
                date = measuresGroup.getDate();
            } else {
                date = null;
            }
            Vasistas g11 = this.f61666j.g(user.q(), Vasistas.Category.SPO2);
            if (g11 != null) {
                dateTime4 = g11.getStartDate();
            } else {
                dateTime4 = null;
            }
            DateTime dateTime6 = (DateTime) kotlin.collections.x.d0(kotlin.collections.l.z(new DateTime[]{dateTime3, dateTime2, new DateTime(date), dateTime4}));
            if (dateTime6 == null) {
                dateTime6 = DateTime.now();
                kotlin.jvm.internal.u.i(dateTime6, "now(...)");
            }
            this.f61661e = null;
            this.f61657a = null;
            this.f61658b = null;
            this.f61659c = null;
            this.f61660d = 2;
            if (h0Var.emit(dateTime6, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public e(User user, DateTime initialDate, Period initialPeriod, fy.n nVar, lj0.h0 h0Var, ei0.q qVar, ActivityAggregateManager activityAggregateManager) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(initialDate, "initialDate");
        kotlin.jvm.internal.u.j(initialPeriod, "initialPeriod");
        k0<Period> b10 = xw.d.b(initialPeriod);
        this.f61654a = b10;
        k0<DateTime> b11 = xw.d.b(initialDate);
        this.f61655b = b11;
        this.f61656c = xw.a.c(new nm0.o(b10, androidx.lifecycle.h.a(Dispatchers.getIO(), new a(qVar, user, activityAggregateManager, nVar, h0Var, null), 2), b11));
    }

    public final xw.o<Period, DateTime, DateTime, nm0.o<Period, DateTime, DateTime>> f0() {
        return this.f61656c;
    }

    public final void g0(DateTime dateTime) {
        this.f61655b.postValue(dateTime);
        this.f61654a.postValue(Period.f43721f);
    }

    public final void i0(Period destinationPeriod) {
        kotlin.jvm.internal.u.j(destinationPeriod, "destinationPeriod");
        this.f61654a.postValue(destinationPeriod);
    }
}
