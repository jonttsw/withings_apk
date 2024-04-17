package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import android.content.Context;
import androidx.health.connect.client.records.Record;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.j;
import nm0.y;
import org.joda.time.DateTime;
import u10.i;
import u10.q;
import ym0.p;
/* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
public final class c implements q<j<? extends Track, ? extends List<? extends Vasistas>>, Record> {

    /* renamed from: a  reason: collision with root package name */
    private final a20.b<Record, fn0.d<? extends Record>, j<Track, List<Vasistas>>> f56698a;

    /* renamed from: b  reason: collision with root package name */
    private final g f56699b;

    /* renamed from: c  reason: collision with root package name */
    private final i<List<j<Track, List<Vasistas>>>> f56700c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56701d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {ConstantsWs.WS_STATUS_WRONGMEASTYPE, ConstantsWs.WS_STATUS_WRONGDEVICETYPE, ConstantsWs.WS_STATUS_NOPRIMARYUSER, ConstantsWs.WS_STATUS_NOPRIMARYUSER}, m = "getSerializedTracksToExport")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56702a;

        /* renamed from: b  reason: collision with root package name */
        c f56703b;

        /* renamed from: c  reason: collision with root package name */
        int f56704c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56705d;

        /* renamed from: f  reason: collision with root package name */
        int f56707f;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56705d = obj;
            this.f56707f |= Integer.MIN_VALUE;
            return c.this.k(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements p<DateTime, List<? extends Integer>, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
            super(2);
            this.f56708a = exchangeTracksWithHealthConnectWorker;
        }

        @Override // ym0.p
        public final y invoke(DateTime dateTime, List<? extends Integer> list) {
            DateTime lastUpdate = dateTime;
            List<? extends Integer> measureTypes = list;
            u.j(lastUpdate, "lastUpdate");
            u.j(measureTypes, "measureTypes");
            for (Number number : measureTypes) {
                this.f56708a.F(number.intValue(), 2, lastUpdate);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {ConstantsWs.WS_STATUS_USERUPDATEERROR, ConstantsWs.WS_STATUS_WRONGBLINDCODE}, m = "read")
    /* renamed from: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0740c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        c f56709a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56710b;

        /* renamed from: d  reason: collision with root package name */
        int f56712d;

        C0740c(qm0.d<? super C0740c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56710b = obj;
            this.f56712d |= Integer.MIN_VALUE;
            return c.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$exchangeRequest$2$1$read$2", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {272, ConstantsWs.WS_STATUS_MEASNOTSHARED}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.q<DateTime, DateTime, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56713a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ DateTime f56714b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ DateTime f56715c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ExchangeTracksWithHealthConnectWorker f56716d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker, qm0.d<? super d> dVar) {
            super(3, dVar);
            this.f56716d = exchangeTracksWithHealthConnectWorker;
        }

        @Override // ym0.q
        public final Object invoke(DateTime dateTime, DateTime dateTime2, qm0.d<? super o.a> dVar) {
            d dVar2 = new d(this.f56716d, dVar);
            dVar2.f56714b = dateTime;
            dVar2.f56715c = dateTime2;
            return dVar2.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.f56713a
                com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker r2 = r6.f56716d
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                nm0.l.b(r7)
                goto L4e
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                nm0.l.b(r7)
                goto L34
            L1f:
                nm0.l.b(r7)
                org.joda.time.DateTime r7 = r6.f56714b
                org.joda.time.DateTime r1 = r6.f56715c
                r6.f56714b = r5
                r6.f56713a = r4
                r2.getClass()
                java.lang.Object r7 = com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker.N(r2, r7, r1, r6)
                if (r7 != r0) goto L34
                return r0
            L34:
                java.util.List r7 = (java.util.List) r7
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto L3e
                r1 = r7
                goto L3f
            L3e:
                r1 = r5
            L3f:
                if (r1 == 0) goto L79
                u10.q r1 = r2.h()
                r6.f56713a = r3
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L4e
                return r0
            L4e:
                java.util.List r7 = (java.util.List) r7
                if (r7 == 0) goto L79
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L5d:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L7a
                java.lang.Object r1 = r7.next()
                nm0.j r1 = (nm0.j) r1
                java.lang.Object r1 = r1.a()
                com.withings.wiscale2.track.data.Track r1 = (com.withings.wiscale2.track.data.Track) r1
                java.lang.Long r1 = r1.getId()
                if (r1 == 0) goto L5d
                r0.add(r1)
                goto L5d
            L79:
                r0 = r5
            L7a:
                nm0.j[] r7 = new nm0.j[r4]
                if (r0 == 0) goto L82
                long[] r5 = kotlin.collections.x.R0(r0)
            L82:
                nm0.j r0 = new nm0.j
                java.lang.String r1 = "result"
                r0.<init>(r1, r5)
                r1 = 0
                r7[r1] = r0
                androidx.work.f$a r0 = new androidx.work.f$a
                r0.<init>()
                r7 = r7[r1]
                java.lang.Object r1 = r7.c()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r7 = r7.d()
                r0.b(r7, r1)
                androidx.work.f r7 = r0.a()
                androidx.work.o$a$c r0 = new androidx.work.o$a$c
                r0.<init>(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker) {
        this.f56701d = exchangeTracksWithHealthConnectWorker;
        this.f56698a = exchangeTracksWithHealthConnectWorker.O();
        this.f56699b = h.b(new e(context, exchangeTracksWithHealthConnectWorker));
        this.f56700c = exchangeTracksWithHealthConnectWorker.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:24:0x0052, B:33:0x0074, B:37:0x007f, B:39:0x0083), top: B:82:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:19:0x0043, B:43:0x00a0, B:45:0x00a4, B:54:0x00e6, B:48:0x00b8, B:49:0x00c8, B:51:0x00ce, B:56:0x00ed), top: B:84:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r13, qm0.d<? super androidx.work.o.a> r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.k(int, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable l(com.withings.partner.model.capabilities.PartnerCapabilities r10, qm0.d r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.l(com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.io.Serializable");
    }

    @Override // u10.g
    public final Object b(qm0.d<? super o.a> dVar) {
        return k(2, dVar);
    }

    @Override // u10.g
    public final Object c(qm0.d<? super o.a> dVar) {
        ExchangeTracksWithHealthConnectWorker exchangeTracksWithHealthConnectWorker = this.f56701d;
        return exchangeTracksWithHealthConnectWorker.L(ExchangeTracksWithHealthConnectWorker.J(exchangeTracksWithHealthConnectWorker), dVar);
    }

    @Override // u10.g
    public final Object d(qm0.d<? super o.a> dVar) {
        return k(1, dVar);
    }

    @Override // u10.g
    public final i<List<j<Track, List<Vasistas>>>> e() {
        return this.f56700c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // u10.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(qm0.d<? super androidx.work.o.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.C0740c
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$c r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.C0740c) r0
            int r1 = r0.f56712d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56712d = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$c r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f56710b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56712d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c r2 = r0.f56709a
            nm0.l.b(r7)
            goto L4d
        L38:
            nm0.l.b(r7)
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker r7 = r6.f56701d
            com.withings.partner.model.capabilities.PartnerCapabilities r2 = r7.m()
            r0.f56709a = r6
            r0.f56712d = r4
            java.io.Serializable r7 = r7.y(r4, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r6
        L4d:
            nm0.j r7 = (nm0.j) r7
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$d r4 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c$d
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker r2 = r2.f56701d
            r5 = 0
            r4.<init>(r2, r5)
            r0.f56709a = r5
            r0.f56712d = r3
            java.lang.Object r7 = cr.a.b(r7, r4, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            androidx.work.o$a r7 = (androidx.work.o.a) r7
            if (r7 != 0) goto L6b
            androidx.work.o$a$a r7 = new androidx.work.o$a$a
            r7.<init>()
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.c.f(qm0.d):java.lang.Object");
    }

    @Override // u10.g
    public final u10.h g() {
        return (ag0.b) this.f56699b.getValue();
    }

    @Override // u10.g
    public final a20.b<Record, fn0.d<? extends Record>, j<Track, List<Vasistas>>> getSerializer() {
        return this.f56698a;
    }
}
