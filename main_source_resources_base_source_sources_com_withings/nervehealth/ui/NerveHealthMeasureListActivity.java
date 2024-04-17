package com.withings.nervehealth.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.c5;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import com.withings.common.compose.component.y3;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: NerveHealthMeasureListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/nervehealth/ui/NerveHealthMeasureListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthMeasureListActivity extends Hilt_NerveHealthMeasureListActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public com.withings.nervehealth.ui.usecases.q f42386e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public com.withings.nervehealth.ui.usecases.l f42387f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public com.withings.nervehealth.ui.usecases.f f42388g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public vf.c f42389h;

    /* renamed from: i  reason: collision with root package name */
    private final d f42390i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private final e f42391j = new e(this);

    /* renamed from: k  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f42392k;

    /* renamed from: l  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f42393l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f42394m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f42385o = {androidx.camera.core.v.c(NerveHealthMeasureListActivity.class, "category", "getCategory()Lcom/withings/nervehealth/core/model/MeasureCategory;", 0), androidx.camera.core.v.c(NerveHealthMeasureListActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f42384n = new Object();

    /* compiled from: NerveHealthMeasureListActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: NerveHealthMeasureListActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            vf.c cVar = NerveHealthMeasureListActivity.this.f42389h;
            if (cVar != null) {
                return Boolean.valueOf(cVar.h().c().a());
            }
            kotlin.jvm.internal.u.s("accountManager");
            throw null;
        }
    }

    /* compiled from: NerveHealthMeasureListActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1852063086, new l0(NerveHealthMeasureListActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, MeasureCategory> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42397a = nm0.h.b(new m0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42398b;

        public d(Activity activity) {
            this.f42398b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.nervehealth.core.model.MeasureCategory, java.lang.Object] */
        @Override // bn0.d
        public final MeasureCategory getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42397a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42399a = nm0.h.b(new n0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42400b;

        public e(Activity activity) {
            this.f42400b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42399a.getValue();
        }
    }

    public NerveHealthMeasureListActivity() {
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        f11 = androidx.compose.runtime.l0.f(null, v0.f8878a);
        this.f42392k = f11;
        f12 = androidx.compose.runtime.l0.f(0, v0.f8878a);
        this.f42393l = f12;
        this.f42394m = nm0.h.b(new b());
    }

    public static final MeasureCategory A3(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        return (MeasureCategory) nerveHealthMeasureListActivity.f42390i.getValue(nerveHealthMeasureListActivity, f42385o[0]);
    }

    public static final long D3(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        return ((Number) nerveHealthMeasureListActivity.f42391j.getValue(nerveHealthMeasureListActivity, f42385o[1])).longValue();
    }

    public static final void E3(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        nerveHealthMeasureListActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(nerveHealthMeasureListActivity), Dispatchers.getIO(), null, new f0(nerveHealthMeasureListActivity, null), 2, null);
    }

    public static final boolean F3(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        return ((Boolean) nerveHealthMeasureListActivity.f42394m.getValue()).booleanValue();
    }

    public static final void z3(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, c5 c5Var, androidx.compose.runtime.a aVar, int i11) {
        nerveHealthMeasureListActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(97211367);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        nk.a0.i(0, 0, 28, 0L, g11, x0.g(aVar2, yk.h.o(), yk.h.B()), null, ay.b.u(C1987R.string.options, g11));
        com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
        y3.c(null, ay.b.u(C1987R.string.measurementList_options_title, g11), null, null, 0.0f, 0L, s1.b.b(g11, -356749501, new b0(nerveHealthMeasureListActivity)), g11, 1572864, 61);
        com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
        com.withings.common.compose.component.l.a(x0.g(aVar2, yk.h.o(), yk.h.h()), ay.b.u(C1987R.string.programsArticle_done_btn, g11), null, false, null, null, false, new d0(nerveHealthMeasureListActivity, a11, c5Var), g11, 0, 124);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e0(nerveHealthMeasureListActivity, c5Var, i11));
        }
    }

    @Override // com.withings.nervehealth.ui.Hilt_NerveHealthMeasureListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getIO(), null, new f0(this, null), 2, null);
        e.k.a(this, new s1.a(true, -1196995720, new c()));
    }
}
