package com.withings.wiscale2.spo2;

import androidx.lifecycle.LiveData;
import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SpO2LiveData.kt */
/* loaded from: classes5.dex */
public final class a extends LiveData<Track> implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final qm0.f f61643a;

    /* renamed from: b  reason: collision with root package name */
    private final User f61644b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f61645c;

    /* renamed from: d  reason: collision with root package name */
    private final ei0.q f61646d;

    /* compiled from: SpO2LiveData.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.AsleepSpo2TrackLiveData$1", f = "SpO2LiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.spo2.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0781a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        C0781a(qm0.d<? super C0781a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new C0781a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((C0781a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            if (r2.floatValue() > 0.0f) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                nm0.l.b(r5)
                com.withings.wiscale2.spo2.a r5 = com.withings.wiscale2.spo2.a.this
                ei0.q r0 = com.withings.wiscale2.spo2.a.v(r5)
                com.withings.user.User r1 = com.withings.wiscale2.spo2.a.x(r5)
                long r1 = r1.q()
                org.joda.time.DateTime r3 = com.withings.wiscale2.spo2.a.t(r5)
                com.withings.wiscale2.track.data.Track r0 = r0.D(r1, r3)
                r1 = 0
                if (r0 == 0) goto L41
                android.os.Parcelable r2 = r0.getData()
                boolean r3 = r2 instanceof com.withings.wiscale2.track.data.SleepTrackData
                if (r3 == 0) goto L29
                com.withings.wiscale2.track.data.SleepTrackData r2 = (com.withings.wiscale2.track.data.SleepTrackData) r2
                goto L2a
            L29:
                r2 = r1
            L2a:
                r3 = 0
                if (r2 == 0) goto L33
                java.lang.Float r2 = r2.getAverageSpo2()
                if (r2 != 0) goto L38
            L33:
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r3)
            L38:
                float r2 = r2.floatValue()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L41
                goto L42
            L41:
                r0 = r1
            L42:
                com.withings.wiscale2.spo2.a.y(r5, r0)
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.spo2.a.C0781a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(qm0.f coroutineContext, User user, DateTime dateTime, ei0.q sleepTrackManager) {
        kotlin.jvm.internal.u.j(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
        this.f61643a = coroutineContext;
        this.f61644b = user;
        this.f61645c = dateTime;
        this.f61646d = sleepTrackManager;
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new C0781a(null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final qm0.f getCoroutineContext() {
        return this.f61643a;
    }
}
