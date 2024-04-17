package com.withings.wiscale2.profile;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: AllTimeStats.kt */
/* loaded from: classes5.dex */
public final class c extends androidx.lifecycle.j0<List<? extends com.withings.wiscale2.profile.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f59289a;

    /* renamed from: b  reason: collision with root package name */
    private final m70.c f59290b;

    /* renamed from: c  reason: collision with root package name */
    private final iy.e f59291c;

    /* renamed from: d  reason: collision with root package name */
    private final ActivityAggregateManager f59292d;

    /* renamed from: e  reason: collision with root package name */
    private final om.d f59293e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f59294f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f59295g;

    /* renamed from: h  reason: collision with root package name */
    private final ym0.l<qm0.d<? super Boolean>, Object> f59296h;

    /* renamed from: i  reason: collision with root package name */
    private final NumberFormat f59297i;

    /* compiled from: AllTimeStats.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(User user) {
            c.A(c.this);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AllTimeStats.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<om.a, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(om.a aVar) {
            c.A(c.this);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(CoroutineScope coroutineScope, m70.c cVar, iy.e measuresGroupRepositoryV2, ActivityAggregateManager activityAggregateManager, om.d dVar, Context context, kn.e deviceManager, ym0.l<? super qm0.d<? super Boolean>, ? extends Object> lVar) {
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f59289a = coroutineScope;
        this.f59290b = cVar;
        this.f59291c = measuresGroupRepositoryV2;
        this.f59292d = activityAggregateManager;
        this.f59293e = dVar;
        this.f59294f = context;
        this.f59295g = deviceManager;
        this.f59296h = lVar;
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        kotlin.jvm.internal.u.i(integerInstance, "getIntegerInstance(...)");
        this.f59297i = integerInstance;
        addSource(cVar, new f(new a()));
        addSource(dVar, new f(new b()));
    }

    public static final void A(c cVar) {
        cr.a.a(new nm0.j(cVar.f59290b.getValue(), cVar.f59293e.getValue()), new e(cVar));
    }

    public static final com.withings.wiscale2.profile.b B(c cVar, Stat stat, g dataBaseCache, jm.a measureFormatter) {
        com.withings.wiscale2.profile.b bVar;
        Iterator<T> it;
        Object next;
        cVar.getClass();
        int ordinal = stat.ordinal();
        int i11 = 0;
        NumberFormat numberFormat = cVar.f59297i;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            kotlin.jvm.internal.u.j(dataBaseCache, "dataBaseCache");
                            kotlin.jvm.internal.u.j(numberFormat, "numberFormat");
                            int i12 = 0;
                            for (ActivityAggregate activityAggregate : dataBaseCache.b()) {
                                i12 += activityAggregate.getSteps();
                            }
                            if (i12 <= 0) {
                                return null;
                            }
                            List<ActivityAggregate> b10 = dataBaseCache.b();
                            if (!(b10 instanceof Collection) || !b10.isEmpty()) {
                                for (ActivityAggregate activityAggregate2 : b10) {
                                    if (activityAggregate2.getSteps() > 10000 && (i11 = i11 + 1) < 0) {
                                        kotlin.collections.x.J0();
                                        throw null;
                                    }
                                }
                            }
                            String format = numberFormat.format(Integer.valueOf(i11));
                            kotlin.jvm.internal.u.i(format, "format(...)");
                            bVar = new com.withings.wiscale2.profile.b((int) C1987R.string._NB_TOTAL_REACHED_OBJECTIVE_DAY_, format, (String) null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        kotlin.jvm.internal.u.j(dataBaseCache, "dataBaseCache");
                        kotlin.jvm.internal.u.j(measureFormatter, "measureFormatter");
                        Context context = cVar.f59294f;
                        kotlin.jvm.internal.u.j(context, "context");
                        Iterator<T> it2 = dataBaseCache.b().iterator();
                        if (!it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int steps = ((ActivityAggregate) next).getSteps();
                                do {
                                    Object next2 = it2.next();
                                    int steps2 = ((ActivityAggregate) next2).getSteps();
                                    if (steps < steps2) {
                                        next = next2;
                                        steps = steps2;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        ActivityAggregate activityAggregate3 = (ActivityAggregate) next;
                        if (activityAggregate3 == null) {
                            bVar = new com.withings.wiscale2.profile.b((String) null, 0, 7);
                        } else if (activityAggregate3.getSteps() <= 0) {
                            return null;
                        } else {
                            String b11 = measureFormatter.b(activityAggregate3.getSteps(), 36);
                            DateTime midnight = activityAggregate3.getMidnight();
                            kotlin.jvm.internal.u.i(midnight, "getMidnight(...)");
                            return new com.withings.wiscale2.profile.b((int) C1987R.string._BEST_DAY_, b11, b50.b.i(context, midnight));
                        }
                    }
                } else {
                    kotlin.jvm.internal.u.j(dataBaseCache, "dataBaseCache");
                    kotlin.jvm.internal.u.j(measureFormatter, "measureFormatter");
                    double d11 = 0.0d;
                    while (dataBaseCache.b().iterator().hasNext()) {
                        d11 += ((ActivityAggregate) it.next()).getDistance();
                    }
                    if (d11 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        return null;
                    }
                    return new com.withings.wiscale2.profile.b(jm.a.c(measureFormatter, 40, d11, 0, 0, 60).toString(), (int) C1987R.string._NB_TOTAL_DISTANCE_, 4);
                }
            } else {
                kotlin.jvm.internal.u.j(dataBaseCache, "dataBaseCache");
                kotlin.jvm.internal.u.j(measureFormatter, "measureFormatter");
                for (ActivityAggregate activityAggregate4 : dataBaseCache.b()) {
                    i11 += activityAggregate4.getSteps();
                }
                if (i11 <= 0) {
                    return null;
                }
                return new com.withings.wiscale2.profile.b(measureFormatter.b(i11, 36), (int) C1987R.string._PROFILE_NUMBER_OF_STEPS_, 4);
            }
        } else {
            boolean z5 = !cVar.f59295g.h(1).isEmpty();
            if (dataBaseCache.c().size() <= 100 && !z5) {
                bVar = new com.withings.wiscale2.profile.b((String) null, 0, 7);
            } else {
                kotlin.jvm.internal.u.j(numberFormat, "numberFormat");
                String format2 = numberFormat.format(Integer.valueOf(dataBaseCache.c().size()));
                kotlin.jvm.internal.u.i(format2, "format(...)");
                bVar = new com.withings.wiscale2.profile.b((int) C1987R.string._NB_TOTAL_WEIGHT_, format2, (String) null);
            }
        }
        return bVar;
    }
}
