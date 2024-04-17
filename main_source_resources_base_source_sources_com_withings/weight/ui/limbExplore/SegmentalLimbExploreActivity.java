package com.withings.weight.ui.limbExplore;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.periodsbar.Period;
import com.withings.weight.core.model.LimbModel;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SegmentalLimbExploreActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/weight/ui/limbExplore/SegmentalLimbExploreActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lws/b;", "state", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalLimbExploreActivity extends Hilt_SegmentalLimbExploreActivity {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47644k = {androidx.camera.core.v.c(SegmentalLimbExploreActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(SegmentalLimbExploreActivity.class, "limbOrdinal", "getLimbOrdinal()I", 0), androidx.camera.core.v.c(SegmentalLimbExploreActivity.class, "date", "getDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(SegmentalLimbExploreActivity.class, "period", "getPeriod()Lcom/withings/periodsbar/Period;", 0)};
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public b0 f47649i;

    /* renamed from: e  reason: collision with root package name */
    private final c f47645e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f47646f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final e f47647g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    private final f f47648h = new f(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f47650j = nm0.h.b(new g());

    /* compiled from: SegmentalLimbExploreActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<LimbModel> f47651a = sm0.b.a(LimbModel.values());
    }

    /* compiled from: SegmentalLimbExploreActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -731432779, new com.withings.weight.ui.limbExplore.f(SegmentalLimbExploreActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47653a = nm0.h.b(new com.withings.weight.ui.limbExplore.g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47654b;

        public c(Activity activity) {
            this.f47654b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47653a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47655a = nm0.h.b(new h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47656b;

        public d(Activity activity) {
            this.f47656b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47655a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47657a = nm0.h.b(new i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47658b;

        public e(Activity activity) {
            this.f47658b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47657a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, Period> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47659a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47660b;

        public f(Activity activity) {
            this.f47660b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.periodsbar.Period, java.lang.Object] */
        @Override // bn0.d
        public final Period getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47659a.getValue();
        }
    }

    /* compiled from: SegmentalLimbExploreActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<a0> {

        /* compiled from: SegmentalLimbExploreActivity.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<LimbModel> f47662a = sm0.b.a(LimbModel.values());
        }

        g() {
            super(0);
        }

        @Override // ym0.a
        public final a0 invoke() {
            SegmentalLimbExploreActivity segmentalLimbExploreActivity = SegmentalLimbExploreActivity.this;
            return (a0) new k1(segmentalLimbExploreActivity.getViewModelStore(), new k(segmentalLimbExploreActivity)).a(a0.class);
        }
    }

    public static final int A3(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        segmentalLimbExploreActivity.getClass();
        return ((Number) segmentalLimbExploreActivity.f47646f.getValue(segmentalLimbExploreActivity, f47644k[1])).intValue();
    }

    public static final Period B3(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        segmentalLimbExploreActivity.getClass();
        return (Period) segmentalLimbExploreActivity.f47648h.getValue(segmentalLimbExploreActivity, f47644k[3]);
    }

    public static final long C3(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        return ((Number) segmentalLimbExploreActivity.f47645e.getValue(segmentalLimbExploreActivity, f47644k[0])).longValue();
    }

    public static final a0 D3(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        return (a0) segmentalLimbExploreActivity.f47650j.getValue();
    }

    public static final DateTime z3(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        segmentalLimbExploreActivity.getClass();
        return (DateTime) segmentalLimbExploreActivity.f47647g.getValue(segmentalLimbExploreActivity, f47644k[2]);
    }

    @Override // com.withings.weight.ui.limbExplore.Hilt_SegmentalLimbExploreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sm0.a<LimbModel> aVar = a.f47651a;
        fn0.k<Object>[] kVarArr = f47644k;
        p90.a.b((LimbModel) aVar.get(((Number) this.f47646f.getValue(this, kVarArr[1])).intValue()), (Period) this.f47648h.getValue(this, kVarArr[3]), (DateTime) this.f47647g.getValue(this, kVarArr[2]));
        e.k.a(this, new s1.a(true, -1950925297, new b()));
    }
}
