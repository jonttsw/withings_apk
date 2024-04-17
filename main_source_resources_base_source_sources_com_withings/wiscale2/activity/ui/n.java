package com.withings.wiscale2.activity.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k0;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.vasistas.model.Vasistas;
import java.util.List;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import lj0.h0;
import org.joda.time.DateTime;
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
public final class n extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f48644a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityAggregateManager f48645b;

    /* renamed from: c  reason: collision with root package name */
    private final long f48646c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTime f48647d;

    /* renamed from: e  reason: collision with root package name */
    private k0<a> f48648e;

    /* compiled from: VasistasInfoActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityAggregate f48649a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Vasistas> f48650b;

        public a() {
            this(0);
        }

        public final ActivityAggregate a() {
            return this.f48649a;
        }

        public final List<Vasistas> b() {
            return this.f48650b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f48649a, aVar.f48649a) && u.e(this.f48650b, aVar.f48650b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            ActivityAggregate activityAggregate = this.f48649a;
            if (activityAggregate == null) {
                hashCode = 0;
            } else {
                hashCode = activityAggregate.hashCode();
            }
            return this.f48650b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "DataDayInfo(aggregate=" + this.f48649a + ", vasistasList=" + this.f48650b + ")";
        }

        public a(ActivityAggregate activityAggregate, List<Vasistas> vasistasList) {
            u.j(vasistasList, "vasistasList");
            this.f48649a = activityAggregate;
            this.f48650b = vasistasList;
        }

        public /* synthetic */ a(int i11) {
            this(null, i0.f76187a);
        }
    }

    public n(h0 h0Var, ActivityAggregateManager activityAggregateManager, long j5, DateTime day) {
        u.j(activityAggregateManager, "activityAggregateManager");
        u.j(day, "day");
        this.f48644a = h0Var;
        this.f48645b = activityAggregateManager;
        this.f48646c = j5;
        this.f48647d = day;
        this.f48648e = xw.d.b(new a(0));
    }

    public final k0<a> k0() {
        return this.f48648e;
    }
}
