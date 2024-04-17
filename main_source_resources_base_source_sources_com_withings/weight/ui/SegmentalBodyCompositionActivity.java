package com.withings.weight.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.view.l1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.google.android.filament.utils.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SegmentalBodyCompositionActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/weight/ui/SegmentalBodyCompositionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lu90/i;", "screenState", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionActivity extends Hilt_SegmentalBodyCompositionActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47592j = {androidx.camera.core.v.c(SegmentalBodyCompositionActivity.class, "measureGroupId", "getMeasureGroupId()J", 0), androidx.camera.core.v.c(SegmentalBodyCompositionActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ch.d f47595g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public a0 f47596h;

    /* renamed from: e  reason: collision with root package name */
    private final c f47593e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f47594f = new d(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f47597i = nm0.h.b(new e());

    /* compiled from: SegmentalBodyCompositionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionActivity$Companion$1", f = "SegmentalBodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Utils.INSTANCE.init();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SegmentalBodyCompositionActivity.kt */
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
                yk.o.b(false, s1.b.b(aVar2, -1745148440, new q(SegmentalBodyCompositionActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47599a = nm0.h.b(new r(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47600b;

        public c(Activity activity) {
            this.f47600b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47599a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47601a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47602b;

        public d(Activity activity) {
            this.f47602b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47601a.getValue();
        }
    }

    /* compiled from: SegmentalBodyCompositionActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<v> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final v invoke() {
            SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = SegmentalBodyCompositionActivity.this;
            return (v) new k1(segmentalBodyCompositionActivity.getViewModelStore(), new t(segmentalBodyCompositionActivity)).a(v.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    static {
        BuildersKt.runBlocking(Dispatchers.getIO(), new kotlin.coroutines.jvm.internal.i(2, null));
    }

    public static final long A3(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        return ((Number) segmentalBodyCompositionActivity.f47594f.getValue(segmentalBodyCompositionActivity, f47592j[1])).longValue();
    }

    public static final v B3(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        return (v) segmentalBodyCompositionActivity.f47597i.getValue();
    }

    public static final void C3(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity, r8.n nVar) {
        v vVar = (v) segmentalBodyCompositionActivity.f47597i.getValue();
        vVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(vVar), null, null, new z(vVar, null), 3, null);
        nVar.J(SegmentalBodyCompositionDestination.f47604c.d(), com.withings.weight.ui.c.f47614a);
    }

    public static final long z3(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        return ((Number) segmentalBodyCompositionActivity.f47593e.getValue(segmentalBodyCompositionActivity, f47592j[0])).longValue();
    }

    @Override // com.withings.weight.ui.Hilt_SegmentalBodyCompositionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1031280574, new b()));
    }
}
