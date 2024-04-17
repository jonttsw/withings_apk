package com.withings.wiscale2.manuallogging.ui.addSleep;

import android.os.Bundle;
import androidx.core.view.l1;
import androidx.lifecycle.k1;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.wiscale2.activity.model.builder.e;
import ei0.q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import ym0.p;
/* compiled from: AddSleepTrackActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/manuallogging/ui/addSleep/AddSleepTrackActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/activity/model/builder/e$b;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AddSleepTrackActivity extends Hilt_AddSleepTrackActivity implements e.b {

    /* renamed from: e  reason: collision with root package name */
    private r8.n f58020e;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ActivityAggregateManager f58022g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public q f58023h;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f58021f = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f58024i = nm0.h.b(new c());

    /* compiled from: AddSleepTrackActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 2116691831, new j(AddSleepTrackActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: AddSleepTrackActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Long> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long q11;
            Bundle extras = AddSleepTrackActivity.this.getIntent().getExtras();
            if (extras != null) {
                q11 = extras.getLong("EXTRA_USER");
            } else {
                q11 = m70.i.b().e().q();
            }
            return Long.valueOf(q11);
        }
    }

    /* compiled from: AddSleepTrackActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<px.b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final px.b invoke() {
            AddSleepTrackActivity addSleepTrackActivity = AddSleepTrackActivity.this;
            return (px.b) new k1(addSleepTrackActivity, new l(addSleepTrackActivity)).a(px.b.class);
        }
    }

    public static final long A3(AddSleepTrackActivity addSleepTrackActivity) {
        return ((Number) addSleepTrackActivity.f58021f.getValue()).longValue();
    }

    public static final px.b B3(AddSleepTrackActivity addSleepTrackActivity) {
        return (px.b) addSleepTrackActivity.f58024i.getValue();
    }

    @Override // com.withings.wiscale2.manuallogging.ui.addSleep.Hilt_AddSleepTrackActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 276238045, new a()));
    }

    @Override // com.withings.wiscale2.activity.model.builder.e.b
    public final DateTimeZone y1(com.withings.wiscale2.activity.model.builder.e eVar, long j5, DateTime dateTime) {
        Object a11;
        ActivityAggregateManager activityAggregateManager;
        String str;
        u.j(dateTime, "dateTime");
        try {
            activityAggregateManager = this.f58022g;
            str = null;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (activityAggregateManager != null) {
            ActivityAggregate aggregateForTime = activityAggregateManager.getAggregateForTime(j5, dateTime);
            if (aggregateForTime != null) {
                str = aggregateForTime.getTimezone();
            }
            a11 = DateTimeZone.forID(str);
            if (nm0.k.b(a11) != null) {
                a11 = DateTimeZone.getDefault();
            }
            u.i(a11, "getOrElse(...)");
            return (DateTimeZone) a11;
        }
        u.s("activityAggregateManager");
        throw null;
    }
}
