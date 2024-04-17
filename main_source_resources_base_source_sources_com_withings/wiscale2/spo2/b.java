package com.withings.wiscale2.spo2;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.user.User;
import org.joda.time.DateTime;
/* compiled from: SpO2LiveData.kt */
/* loaded from: classes5.dex */
public final class b extends j0<ActivityAggregate> {

    /* compiled from: SpO2LiveData.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<ActivityAggregate, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(ActivityAggregate activityAggregate) {
            ActivityAggregate activityAggregate2 = activityAggregate;
            if (activityAggregate2 == null || (activityAggregate2.getAverageSpO2() <= 0.0f && activityAggregate2.getAverageSpO2US() <= 0.0f)) {
                activityAggregate2 = null;
            }
            b.this.postValue(activityAggregate2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SpO2LiveData.kt */
    /* renamed from: com.withings.wiscale2.spo2.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0782b implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61651a;

        C0782b(ym0.l lVar) {
            this.f61651a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61651a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61651a;
        }

        public final int hashCode() {
            return this.f61651a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61651a.invoke(obj);
        }
    }

    public b(User user, DateTime date, qm0.f coroutineContext, ActivityAggregateManager activityAggregateManager) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        addSource(new ca0.a(coroutineContext, activityAggregateManager, null, user, date), new C0782b(new a()));
    }
}
