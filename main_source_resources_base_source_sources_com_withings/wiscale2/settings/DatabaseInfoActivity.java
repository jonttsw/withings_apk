package com.withings.wiscale2.settings;

import android.os.Bundle;
import androidx.compose.ui.node.g;
import com.withings.android.activity.WithingsActivity;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.track.data.Track;
import i6.a;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
/* compiled from: DatabaseInfoActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/DatabaseInfoActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "Lcom/withings/wiscale2/settings/DatabaseInfoActivity$c;", "state", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DatabaseInfoActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.ui.e f59626a = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);

    /* renamed from: b  reason: collision with root package name */
    private final NumberFormat f59627b;

    /* compiled from: DatabaseInfoActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f59628a;

        /* renamed from: b  reason: collision with root package name */
        private final int f59629b;

        /* renamed from: c  reason: collision with root package name */
        private final int f59630c;

        /* renamed from: d  reason: collision with root package name */
        private final int f59631d;

        /* renamed from: e  reason: collision with root package name */
        private final int f59632e;

        /* renamed from: f  reason: collision with root package name */
        private final int f59633f;

        /* renamed from: g  reason: collision with root package name */
        private final int f59634g;

        /* renamed from: h  reason: collision with root package name */
        private final int f59635h;

        /* renamed from: i  reason: collision with root package name */
        private final int f59636i;

        /* renamed from: j  reason: collision with root package name */
        private final int f59637j;

        /* renamed from: k  reason: collision with root package name */
        private final int f59638k;

        /* renamed from: l  reason: collision with root package name */
        private final int f59639l;

        /* renamed from: m  reason: collision with root package name */
        private final int f59640m;

        /* renamed from: n  reason: collision with root package name */
        private final int f59641n;

        /* renamed from: o  reason: collision with root package name */
        private final int f59642o;

        /* renamed from: p  reason: collision with root package name */
        private final int f59643p;

        public a() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public final int a() {
            return this.f59634g;
        }

        public final int b() {
            return this.f59635h;
        }

        public final int c() {
            return this.f59636i;
        }

        public final int d() {
            return this.f59637j;
        }

        public final int e() {
            return this.f59638k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f59628a == aVar.f59628a && this.f59629b == aVar.f59629b && this.f59630c == aVar.f59630c && this.f59631d == aVar.f59631d && this.f59632e == aVar.f59632e && this.f59633f == aVar.f59633f && this.f59634g == aVar.f59634g && this.f59635h == aVar.f59635h && this.f59636i == aVar.f59636i && this.f59637j == aVar.f59637j && this.f59638k == aVar.f59638k && this.f59639l == aVar.f59639l && this.f59640m == aVar.f59640m && this.f59641n == aVar.f59641n && this.f59642o == aVar.f59642o && this.f59643p == aVar.f59643p) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f59643p;
        }

        public final int g() {
            return this.f59641n;
        }

        public final int h() {
            return this.f59642o;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59643p) + androidx.appcompat.app.h.a(this.f59642o, androidx.appcompat.app.h.a(this.f59641n, androidx.appcompat.app.h.a(this.f59640m, androidx.appcompat.app.h.a(this.f59639l, androidx.appcompat.app.h.a(this.f59638k, androidx.appcompat.app.h.a(this.f59637j, androidx.appcompat.app.h.a(this.f59636i, androidx.appcompat.app.h.a(this.f59635h, androidx.appcompat.app.h.a(this.f59634g, androidx.appcompat.app.h.a(this.f59633f, androidx.appcompat.app.h.a(this.f59632e, androidx.appcompat.app.h.a(this.f59631d, androidx.appcompat.app.h.a(this.f59630c, androidx.appcompat.app.h.a(this.f59629b, Integer.hashCode(this.f59628a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final int i() {
            return this.f59630c;
        }

        public final int j() {
            return this.f59631d;
        }

        public final int k() {
            return this.f59639l;
        }

        public final int l() {
            return this.f59640m;
        }

        public final int m() {
            return this.f59632e;
        }

        public final int n() {
            return this.f59633f;
        }

        public final int o() {
            return this.f59628a;
        }

        public final int p() {
            return this.f59629b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DatabaseInfo(workoutCount=");
            sb2.append(this.f59628a);
            sb2.append(", workoutMainUserCount=");
            sb2.append(this.f59629b);
            sb2.append(", sleepTrackCount=");
            sb2.append(this.f59630c);
            sb2.append(", sleepTrackMainUserCount=");
            sb2.append(this.f59631d);
            sb2.append(", vasistasCount=");
            sb2.append(this.f59632e);
            sb2.append(", vasistasMainUserCount=");
            sb2.append(this.f59633f);
            sb2.append(", ahiCount=");
            sb2.append(this.f59634g);
            sb2.append(", bedCount=");
            sb2.append(this.f59635h);
            sb2.append(", bodyCount=");
            sb2.append(this.f59636i);
            sb2.append(", motionCount=");
            sb2.append(this.f59637j);
            sb2.append(", pauseCount=");
            sb2.append(this.f59638k);
            sb2.append(", spo2Count=");
            sb2.append(this.f59639l);
            sb2.append(", swimCount=");
            sb2.append(this.f59640m);
            sb2.append(", signalCount=");
            sb2.append(this.f59641n);
            sb2.append(", signalMainUserCount=");
            sb2.append(this.f59642o);
            sb2.append(", rawDumpTraces=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f59643p, ")");
        }

        public a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
            this.f59628a = i11;
            this.f59629b = i12;
            this.f59630c = i13;
            this.f59631d = i14;
            this.f59632e = i15;
            this.f59633f = i16;
            this.f59634g = i17;
            this.f59635h = i18;
            this.f59636i = i19;
            this.f59637j = i21;
            this.f59638k = i22;
            this.f59639l = i23;
            this.f59640m = i24;
            this.f59641n = i25;
            this.f59642o = i26;
            this.f59643p = i27;
        }
    }

    /* compiled from: DatabaseInfoActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends androidx.lifecycle.g1 {

        /* renamed from: a  reason: collision with root package name */
        private final User f59644a;

        /* renamed from: b  reason: collision with root package name */
        private final lj0.h0 f59645b;

        /* renamed from: c  reason: collision with root package name */
        private final HeartSignalRepository f59646c;

        /* renamed from: d  reason: collision with root package name */
        private final Flow<List<Track>> f59647d;

        /* renamed from: e  reason: collision with root package name */
        private final h f59648e;

        /* renamed from: f  reason: collision with root package name */
        private final i f59649f;

        /* renamed from: g  reason: collision with root package name */
        private final Flow<List<Track>> f59650g;

        /* renamed from: h  reason: collision with root package name */
        private final j f59651h;

        /* renamed from: i  reason: collision with root package name */
        private final k f59652i;

        /* renamed from: j  reason: collision with root package name */
        private final Flow<Integer> f59653j;

        /* renamed from: k  reason: collision with root package name */
        private final Flow<Integer> f59654k;

        /* renamed from: l  reason: collision with root package name */
        private final Flow<Integer> f59655l;

        /* renamed from: m  reason: collision with root package name */
        private final Flow<Integer> f59656m;

        /* renamed from: n  reason: collision with root package name */
        private final Flow<Integer> f59657n;

        /* renamed from: o  reason: collision with root package name */
        private final Flow<Integer> f59658o;

        /* renamed from: p  reason: collision with root package name */
        private final Flow<Integer> f59659p;

        /* renamed from: q  reason: collision with root package name */
        private final Flow<Integer> f59660q;

        /* renamed from: r  reason: collision with root package name */
        private final Flow<Integer> f59661r;

        /* renamed from: s  reason: collision with root package name */
        private final Flow<Integer> f59662s;

        /* renamed from: t  reason: collision with root package name */
        private final Flow<Integer> f59663t;

        /* renamed from: u  reason: collision with root package name */
        private final MutableStateFlow<c> f59664u;

        /* renamed from: v  reason: collision with root package name */
        private final MutableStateFlow<c> f59665v;

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$1", f = "DatabaseInfoActivity.kt", l = {192}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59666a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DatabaseInfoActivity.kt */
            /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0769a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f59668a;

                C0769a(b bVar) {
                    this.f59668a = bVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, qm0.d dVar) {
                    this.f59668a.f59664u.setValue(new c.b((a) obj));
                    return nm0.y.f85009a;
                }
            }

            a(qm0.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.f76214a;
                int i11 = this.f59666a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Flow[] flowArr = {bVar.f59648e, bVar.f59649f, bVar.f59651h, bVar.f59652i, bVar.f59653j, bVar.f59654k, bVar.f59655l, bVar.f59656m, bVar.f59657n, bVar.f59658o, bVar.f59659p, bVar.f59660q, bVar.f59661r, bVar.f59662s, bVar.f59663t};
                    C0769a c0769a = new C0769a(bVar);
                    this.f59666a = 1;
                    Object combineInternal = CombineKt.combineInternal(c0769a, flowArr, new com.withings.wiscale2.settings.k(flowArr), new kotlin.coroutines.jvm.internal.i(3, null), this);
                    if (combineInternal != obj2) {
                        combineInternal = nm0.y.f85009a;
                    }
                    if (combineInternal == obj2) {
                        return obj2;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$ahiCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0770b extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59669a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59670b;

            C0770b(qm0.d<? super C0770b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0770b c0770b = new C0770b(dVar);
                c0770b.f59670b = obj;
                return c0770b;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((C0770b) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59669a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.AHI));
                    this.f59669a = 1;
                    if (((FlowCollector) this.f59670b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$bedCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59672a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59673b;

            c(qm0.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.f59673b = obj;
                return cVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((c) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59672a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.BED));
                    this.f59672a = 1;
                    if (((FlowCollector) this.f59673b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$bodyCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59675a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59676b;

            d(qm0.d<? super d> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                d dVar2 = new d(dVar);
                dVar2.f59676b = obj;
                return dVar2;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59675a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.BODY));
                    this.f59675a = 1;
                    if (((FlowCollector) this.f59676b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$mainUserVasistasCount$1", f = "DatabaseInfoActivity.kt", l = {140}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59678a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59679b;

            e(qm0.d<? super e> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                e eVar = new e(dVar);
                eVar.f59679b = obj;
                return eVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((e) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59678a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), null));
                    this.f59678a = 1;
                    if (((FlowCollector) this.f59679b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$motionCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59681a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59682b;

            f(qm0.d<? super f> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                f fVar = new f(dVar);
                fVar.f59682b = obj;
                return fVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((f) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59681a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.MOTION));
                    this.f59681a = 1;
                    if (((FlowCollector) this.f59682b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$pauseCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59684a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59685b;

            g(qm0.d<? super g> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                g gVar = new g(dVar);
                gVar.f59685b = obj;
                return gVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((g) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59684a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.PAUSE));
                    this.f59684a = 1;
                    if (((FlowCollector) this.f59685b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: classes5.dex */
        public static final class h implements Flow<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Flow f59687a;

            /* compiled from: Emitters.kt */
            /* loaded from: classes5.dex */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f59688a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$special$$inlined$map$1$2", f = "DatabaseInfoActivity.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$h$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0771a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f59689a;

                    /* renamed from: b  reason: collision with root package name */
                    int f59690b;

                    public C0771a(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f59689a = obj;
                        this.f59690b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f59688a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.withings.wiscale2.settings.DatabaseInfoActivity.b.h.a.C0771a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$h$a$a r0 = (com.withings.wiscale2.settings.DatabaseInfoActivity.b.h.a.C0771a) r0
                        int r1 = r0.f59690b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f59690b = r1
                        goto L18
                    L13:
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$h$a$a r0 = new com.withings.wiscale2.settings.DatabaseInfoActivity$b$h$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f59689a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.f59690b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r6)
                        goto L48
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        nm0.l.b(r6)
                        java.util.List r5 = (java.util.List) r5
                        int r5 = r5.size()
                        java.lang.Integer r6 = new java.lang.Integer
                        r6.<init>(r5)
                        r0.f59690b = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.f59688a
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        nm0.y r5 = nm0.y.f85009a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.DatabaseInfoActivity.b.h.a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            public h(Flow flow) {
                this.f59687a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
                Object collect = this.f59687a.collect(new a(flowCollector), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: classes5.dex */
        public static final class i implements Flow<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Flow f59692a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f59693b;

            /* compiled from: Emitters.kt */
            /* loaded from: classes5.dex */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f59694a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f59695b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$special$$inlined$map$2$2", f = "DatabaseInfoActivity.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$i$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0772a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f59696a;

                    /* renamed from: b  reason: collision with root package name */
                    int f59697b;

                    public C0772a(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f59696a = obj;
                        this.f59697b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector, b bVar) {
                    this.f59694a = flowCollector;
                    this.f59695b = bVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.withings.wiscale2.settings.DatabaseInfoActivity.b.i.a.C0772a
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$i$a$a r0 = (com.withings.wiscale2.settings.DatabaseInfoActivity.b.i.a.C0772a) r0
                        int r1 = r0.f59697b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f59697b = r1
                        goto L18
                    L13:
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$i$a$a r0 = new com.withings.wiscale2.settings.DatabaseInfoActivity$b$i$a$a
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.f59696a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.f59697b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r10)
                        goto L81
                    L27:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L2f:
                        nm0.l.b(r10)
                        java.util.List r9 = (java.util.List) r9
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        boolean r10 = r9 instanceof java.util.Collection
                        r2 = 0
                        if (r10 == 0) goto L45
                        r10 = r9
                        java.util.Collection r10 = (java.util.Collection) r10
                        boolean r10 = r10.isEmpty()
                        if (r10 == 0) goto L45
                        goto L71
                    L45:
                        java.util.Iterator r9 = r9.iterator()
                    L49:
                        boolean r10 = r9.hasNext()
                        if (r10 == 0) goto L71
                        java.lang.Object r10 = r9.next()
                        com.withings.wiscale2.track.data.Track r10 = (com.withings.wiscale2.track.data.Track) r10
                        long r4 = r10.getUserId()
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b r10 = r8.f59695b
                        com.withings.user.User r10 = r10.getUser()
                        long r6 = r10.q()
                        int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r10 != 0) goto L49
                        int r2 = r2 + 1
                        if (r2 < 0) goto L6c
                        goto L49
                    L6c:
                        kotlin.collections.x.J0()
                        r9 = 0
                        throw r9
                    L71:
                        java.lang.Integer r9 = new java.lang.Integer
                        r9.<init>(r2)
                        r0.f59697b = r3
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.f59694a
                        java.lang.Object r9 = r10.emit(r9, r0)
                        if (r9 != r1) goto L81
                        return r1
                    L81:
                        nm0.y r9 = nm0.y.f85009a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.DatabaseInfoActivity.b.i.a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            public i(Flow flow, b bVar) {
                this.f59692a = flow;
                this.f59693b = bVar;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
                Object collect = this.f59692a.collect(new a(flowCollector, this.f59693b), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: classes5.dex */
        public static final class j implements Flow<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Flow f59699a;

            /* compiled from: Emitters.kt */
            /* loaded from: classes5.dex */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f59700a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$special$$inlined$map$3$2", f = "DatabaseInfoActivity.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$j$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0773a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f59701a;

                    /* renamed from: b  reason: collision with root package name */
                    int f59702b;

                    public C0773a(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f59701a = obj;
                        this.f59702b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f59700a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.withings.wiscale2.settings.DatabaseInfoActivity.b.j.a.C0773a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$j$a$a r0 = (com.withings.wiscale2.settings.DatabaseInfoActivity.b.j.a.C0773a) r0
                        int r1 = r0.f59702b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f59702b = r1
                        goto L18
                    L13:
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$j$a$a r0 = new com.withings.wiscale2.settings.DatabaseInfoActivity$b$j$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f59701a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.f59702b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r6)
                        goto L48
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        nm0.l.b(r6)
                        java.util.List r5 = (java.util.List) r5
                        int r5 = r5.size()
                        java.lang.Integer r6 = new java.lang.Integer
                        r6.<init>(r5)
                        r0.f59702b = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.f59700a
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        nm0.y r5 = nm0.y.f85009a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.DatabaseInfoActivity.b.j.a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            public j(Flow flow) {
                this.f59699a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
                Object collect = this.f59699a.collect(new a(flowCollector), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: classes5.dex */
        public static final class k implements Flow<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Flow f59704a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f59705b;

            /* compiled from: Emitters.kt */
            /* loaded from: classes5.dex */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f59706a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f59707b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$special$$inlined$map$4$2", f = "DatabaseInfoActivity.kt", l = {223}, m = "emit")
                /* renamed from: com.withings.wiscale2.settings.DatabaseInfoActivity$b$k$a$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0774a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f59708a;

                    /* renamed from: b  reason: collision with root package name */
                    int f59709b;

                    public C0774a(qm0.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f59708a = obj;
                        this.f59709b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector, b bVar) {
                    this.f59706a = flowCollector;
                    this.f59707b = bVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, qm0.d r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.withings.wiscale2.settings.DatabaseInfoActivity.b.k.a.C0774a
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$k$a$a r0 = (com.withings.wiscale2.settings.DatabaseInfoActivity.b.k.a.C0774a) r0
                        int r1 = r0.f59709b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f59709b = r1
                        goto L18
                    L13:
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b$k$a$a r0 = new com.withings.wiscale2.settings.DatabaseInfoActivity$b$k$a$a
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.f59708a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                        int r2 = r0.f59709b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        nm0.l.b(r10)
                        goto L81
                    L27:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L2f:
                        nm0.l.b(r10)
                        java.util.List r9 = (java.util.List) r9
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        boolean r10 = r9 instanceof java.util.Collection
                        r2 = 0
                        if (r10 == 0) goto L45
                        r10 = r9
                        java.util.Collection r10 = (java.util.Collection) r10
                        boolean r10 = r10.isEmpty()
                        if (r10 == 0) goto L45
                        goto L71
                    L45:
                        java.util.Iterator r9 = r9.iterator()
                    L49:
                        boolean r10 = r9.hasNext()
                        if (r10 == 0) goto L71
                        java.lang.Object r10 = r9.next()
                        com.withings.wiscale2.track.data.Track r10 = (com.withings.wiscale2.track.data.Track) r10
                        long r4 = r10.getUserId()
                        com.withings.wiscale2.settings.DatabaseInfoActivity$b r10 = r8.f59707b
                        com.withings.user.User r10 = r10.getUser()
                        long r6 = r10.q()
                        int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r10 != 0) goto L49
                        int r2 = r2 + 1
                        if (r2 < 0) goto L6c
                        goto L49
                    L6c:
                        kotlin.collections.x.J0()
                        r9 = 0
                        throw r9
                    L71:
                        java.lang.Integer r9 = new java.lang.Integer
                        r9.<init>(r2)
                        r0.f59709b = r3
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.f59706a
                        java.lang.Object r9 = r10.emit(r9, r0)
                        if (r9 != r1) goto L81
                        return r1
                    L81:
                        nm0.y r9 = nm0.y.f85009a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.DatabaseInfoActivity.b.k.a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            public k(Flow flow, b bVar) {
                this.f59704a = flow;
                this.f59705b = bVar;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Integer> flowCollector, qm0.d dVar) {
                Object collect = this.f59704a.collect(new a(flowCollector, this.f59705b), dVar);
                if (collect == CoroutineSingletons.f76214a) {
                    return collect;
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$spo2Count$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59711a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59712b;

            l(qm0.d<? super l> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                l lVar = new l(dVar);
                lVar.f59712b = obj;
                return lVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((l) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59711a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.SPO2));
                    this.f59711a = 1;
                    if (((FlowCollector) this.f59712b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$swimCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_PH}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59714a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59715b;

            m(qm0.d<? super m> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                m mVar = new m(dVar);
                mVar.f59715b = obj;
                return mVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((m) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59714a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    b bVar = b.this;
                    Integer num = new Integer(bVar.M0().s(bVar.getUser().q(), Vasistas.Category.SWIM));
                    this.f59714a = 1;
                    if (((FlowCollector) this.f59715b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* compiled from: DatabaseInfoActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.DatabaseInfoActivity$DatabaseInfoModel$vasistasCount$1", f = "DatabaseInfoActivity.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Integer>, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f59717a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f59718b;

            n(qm0.d<? super n> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                n nVar = new n(dVar);
                nVar.f59718b = obj;
                return nVar;
            }

            @Override // ym0.p
            public final Object invoke(FlowCollector<? super Integer> flowCollector, qm0.d<? super nm0.y> dVar) {
                return ((n) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f59717a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    Integer num = new Integer(b.this.M0().r());
                    this.f59717a = 1;
                    if (((FlowCollector) this.f59718b).emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        public b() {
            User e11 = m70.i.b().e();
            kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
            this.f59644a = e11;
            WorkoutManager workoutManager = WorkoutManager.Companion.get();
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    lj0.h0 e12 = lj0.h0.e();
                    kotlin.jvm.internal.u.i(e12, "get(...)");
                    this.f59645b = e12;
                    HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
                    if (heartSignalRepository != null) {
                        this.f59646c = heartSignalRepository;
                        Flow<List<Track>> flowOn = FlowKt.flowOn(workoutManager.getAll(), Dispatchers.getIO());
                        this.f59647d = flowOn;
                        this.f59648e = new h(flowOn);
                        this.f59649f = new i(flowOn, this);
                        Flow<List<Track>> flowOn2 = FlowKt.flowOn(qVar.g(), Dispatchers.getIO());
                        this.f59650g = flowOn2;
                        this.f59651h = new j(flowOn2);
                        this.f59652i = new k(flowOn2, this);
                        this.f59653j = FlowKt.flowOn(FlowKt.flow(new n(null)), Dispatchers.getIO());
                        this.f59654k = FlowKt.flowOn(FlowKt.flow(new e(null)), Dispatchers.getIO());
                        this.f59655l = FlowKt.flowOn(FlowKt.flow(new C0770b(null)), Dispatchers.getIO());
                        this.f59656m = FlowKt.flowOn(FlowKt.flow(new c(null)), Dispatchers.getIO());
                        this.f59657n = FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getIO());
                        this.f59658o = FlowKt.flowOn(FlowKt.flow(new f(null)), Dispatchers.getIO());
                        this.f59659p = FlowKt.flowOn(FlowKt.flow(new g(null)), Dispatchers.getIO());
                        this.f59660q = FlowKt.flowOn(FlowKt.flow(new l(null)), Dispatchers.getIO());
                        this.f59661r = FlowKt.flowOn(FlowKt.flow(new m(null)), Dispatchers.getIO());
                        this.f59662s = FlowKt.flowOn(heartSignalRepository.getCountAsFlow(), Dispatchers.getIO());
                        this.f59663t = FlowKt.flowOn(heartSignalRepository.getCountAsFlow(e11.q()), Dispatchers.getIO());
                        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow(c.a.f59720a);
                        this.f59664u = MutableStateFlow;
                        this.f59665v = MutableStateFlow;
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new a(null), 3, null);
                        return;
                    }
                    kotlin.jvm.internal.u.s("heartSignalRepository");
                    throw null;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }

        public final MutableStateFlow<c> K0() {
            return this.f59665v;
        }

        public final lj0.h0 M0() {
            return this.f59645b;
        }

        public final User getUser() {
            return this.f59644a;
        }
    }

    /* compiled from: DatabaseInfoActivity.kt */
    /* loaded from: classes5.dex */
    public static abstract class c {

        /* compiled from: DatabaseInfoActivity.kt */
        /* loaded from: classes5.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f59720a = new c(0);
        }

        /* compiled from: DatabaseInfoActivity.kt */
        /* loaded from: classes5.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final a f59721a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a db2) {
                super(0);
                kotlin.jvm.internal.u.j(db2, "db");
                this.f59721a = db2;
            }

            public final a a() {
                return this.f59721a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f59721a, ((b) obj).f59721a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f59721a.hashCode();
            }

            public final String toString() {
                return "Success(db=" + this.f59721a + ")";
            }
        }

        public /* synthetic */ c(int i11) {
            this();
        }

        private c() {
        }
    }

    /* compiled from: DatabaseInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        d() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            i6.a aVar2;
            androidx.compose.runtime.a aVar3 = aVar;
            if ((num.intValue() & 11) == 2 && aVar3.h()) {
                aVar3.C();
            } else {
                aVar3.s(1729797275);
                androidx.lifecycle.n1 a11 = j6.a.a(aVar3);
                if (a11 != null) {
                    if (a11 instanceof androidx.lifecycle.u) {
                        aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                    } else {
                        aVar2 = a.C1058a.f71431b;
                    }
                    androidx.lifecycle.g1 a12 = j6.b.a(b.class, a11, null, null, aVar2, aVar3);
                    aVar3.J();
                    yk.o.b(false, s1.b.b(aVar3, 772022747, new v((b) a12, DatabaseInfoActivity.this)), aVar3, 48, 1);
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            return nm0.y.f85009a;
        }
    }

    public DatabaseInfoActivity() {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        kotlin.jvm.internal.u.i(numberInstance, "getNumberInstance(...)");
        this.f59627b = numberInstance;
    }

    public static final void A3(DatabaseInfoActivity databaseInfoActivity, a aVar, androidx.compose.runtime.a aVar2, int i11) {
        databaseInfoActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(562872097);
        androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(n0.y0.c(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), n0.y0.b(g11), false, 14), yk.h.o(), yk.h.q());
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(g12);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            com.withings.common.compose.component.y3.d(null, "Workout Tracks", null, 0.0f, 0.0f, 0L, s1.b.b(g11, 792117345, new m(databaseInfoActivity, aVar)), g11, 1572912, 61);
            com.withings.common.compose.component.y3.d(null, "Sleep Tracks", null, 0.0f, 0.0f, 0L, s1.b.b(g11, -862556662, new n(databaseInfoActivity, aVar)), g11, 1572912, 61);
            com.withings.common.compose.component.y3.d(null, "Vasistas", null, 0.0f, 0.0f, 0L, s1.b.b(g11, -626386839, new o(databaseInfoActivity, aVar)), g11, 1572912, 61);
            com.withings.common.compose.component.y3.d(null, "Signals", null, 0.0f, 0.0f, 0L, s1.b.b(g11, -390217016, new p(databaseInfoActivity, aVar)), g11, 1572912, 61);
            com.withings.common.compose.component.y3.d(null, "Other", null, 0.0f, 0.0f, 0L, s1.b.b(g11, -154047193, new q(databaseInfoActivity, aVar)), g11, 1572912, 61);
            androidx.compose.runtime.v b12 = androidx.compose.material.h6.b(g11);
            if (b12 != null) {
                b12.G(new r(databaseInfoActivity, aVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void z3(DatabaseInfoActivity databaseInfoActivity, String str, int i11, boolean z5, androidx.compose.runtime.a aVar, int i12, int i13) {
        boolean z11;
        databaseInfoActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1495337097);
        if ((i13 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z5;
        }
        com.withings.common.compose.component.o.o(databaseInfoActivity.f59626a, null, str, null, databaseInfoActivity.f59627b.format(Integer.valueOf(i11)), z11, false, false, null, null, null, null, null, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | ((i12 << 9) & 458752), 0, 8138);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(databaseInfoActivity, str, i11, z11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 956618805, new d()));
    }
}
