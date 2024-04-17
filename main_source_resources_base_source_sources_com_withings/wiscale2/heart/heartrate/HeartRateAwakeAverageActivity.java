package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.util.ArrayList;
import jm.a;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: HeartRateAwakeAverageActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/HeartRateAwakeAverageActivity;", "Lcom/withings/wiscale2/heart/heartrate/BaseHeartRateScoreActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeartRateAwakeAverageActivity extends BaseHeartRateScoreActivity {

    /* renamed from: f  reason: collision with root package name */
    private fm.b f57489f;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57485i = {androidx.camera.core.v.c(HeartRateAwakeAverageActivity.class, "date", "getDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(HeartRateAwakeAverageActivity.class, "hrZonesAggregate", "getHrZonesAggregate()Lcom/withings/wiscale2/vasistas/body/HRZonesAggregate;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f57484h = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final d f57486c = new d(this);

    /* renamed from: d  reason: collision with root package name */
    private final e f57487d = new e(this);

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f57488e = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f57490g = nm0.h.b(new f());

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(HeartRateAwakeAverageActivity.this);
        }
    }

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57492a;

        c(ym0.l lVar) {
            this.f57492a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57492a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57492a;
        }

        public final int hashCode() {
            return this.f57492a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57492a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57493a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57494b;

        public d(Activity activity) {
            this.f57494b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57493a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, HRZonesAggregate> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57495a = nm0.h.b(new o(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57496b;

        public e(Activity activity) {
            this.f57496b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.wiscale2.vasistas.body.HRZonesAggregate, java.lang.Object] */
        @Override // bn0.d
        public final HRZonesAggregate getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57495a.getValue();
        }
    }

    /* compiled from: HeartRateAwakeAverageActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.heart.heartrate.a> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.heart.heartrate.a invoke() {
            HeartRateAwakeAverageActivity heartRateAwakeAverageActivity = HeartRateAwakeAverageActivity.this;
            Application application = heartRateAwakeAverageActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            return new com.withings.wiscale2.heart.heartrate.a(application, HeartRateAwakeAverageActivity.F3(heartRateAwakeAverageActivity), HeartRateAwakeAverageActivity.E3(heartRateAwakeAverageActivity), b50.b.s(heartRateAwakeAverageActivity, HeartRateAwakeAverageActivity.D3(heartRateAwakeAverageActivity)));
        }
    }

    public static final DateTime D3(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        heartRateAwakeAverageActivity.getClass();
        return (DateTime) heartRateAwakeAverageActivity.f57486c.getValue(heartRateAwakeAverageActivity, f57485i[0]);
    }

    public static final HRZonesAggregate E3(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        return (HRZonesAggregate) heartRateAwakeAverageActivity.f57487d.getValue(heartRateAwakeAverageActivity, f57485i[1]);
    }

    public static final jm.a F3(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity) {
        return (jm.a) heartRateAwakeAverageActivity.f57488e.getValue();
    }

    public static final void G3(HeartRateAwakeAverageActivity heartRateAwakeAverageActivity, ArrayList arrayList) {
        int i11;
        fm.b bVar = heartRateAwakeAverageActivity.f57489f;
        if (bVar != null) {
            TextView hrZonesGraphTitle = bVar.f67699b;
            kotlin.jvm.internal.u.i(hrZonesGraphTitle, "hrZonesGraphTitle");
            int i12 = 8;
            if (!arrayList.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            hrZonesGraphTitle.setVisibility(i11);
            fm.b bVar2 = heartRateAwakeAverageActivity.f57489f;
            if (bVar2 != null) {
                ComposeView hrZonesBarGraph = (ComposeView) bVar2.f67700c;
                kotlin.jvm.internal.u.i(hrZonesBarGraph, "hrZonesBarGraph");
                if (!arrayList.isEmpty()) {
                    i12 = 0;
                }
                hrZonesBarGraph.setVisibility(i12);
                fm.b bVar3 = heartRateAwakeAverageActivity.f57489f;
                if (bVar3 != null) {
                    bVar3.f67699b.setText(b50.b.s(heartRateAwakeAverageActivity, (DateTime) heartRateAwakeAverageActivity.f57486c.getValue(heartRateAwakeAverageActivity, f57485i[0])));
                    fm.b bVar4 = heartRateAwakeAverageActivity.f57489f;
                    if (bVar4 != null) {
                        ((ComposeView) bVar4.f67700c).setContent(new s1.a(true, 32709093, new l(arrayList)));
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("binding");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.wiscale2.heart.heartrate.BaseHeartRateScoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57489f = fm.b.c(getLayoutInflater(), z3().f99569d);
        nm0.g gVar = this.f57490g;
        ((com.withings.wiscale2.heart.heartrate.a) gVar.getValue()).k0().observe(this, new c(new h(this)));
        ((com.withings.wiscale2.heart.heartrate.a) gVar.getValue()).j0().observe(this, new c(new i(this)));
        ((com.withings.wiscale2.heart.heartrate.a) gVar.getValue()).i0().observe(this, new c(new j(this)));
        fm.b bVar = this.f57489f;
        if (bVar != null) {
            ((DefinitionView) bVar.f67701d).setButtonClickListener(new m(this));
        } else {
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }
}
