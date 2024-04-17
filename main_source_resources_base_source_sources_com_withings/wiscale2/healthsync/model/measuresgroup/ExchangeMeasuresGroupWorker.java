package com.withings.wiscale2.healthsync.model.measuresgroup;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.healthsync.ExchangeWorker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import u10.g;
import u10.h;
import u10.i;
import ym0.p;
import ym0.q;
/* compiled from: ExchangeMeasureGroupsRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00010\u00042\u00020\u0006:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/healthsync/model/measuresgroup/ExchangeMeasuresGroupWorker;", "", "PartnerType", "ParentPartnerType", "Lcom/withings/wiscale2/healthsync/ExchangeWorker;", "Lky/d;", "La20/d;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> extends ExchangeWorker<Object> implements a20.d {

    /* renamed from: h  reason: collision with root package name */
    private final a f56822h;

    /* renamed from: i  reason: collision with root package name */
    private final b f56823i;

    /* compiled from: ExchangeMeasureGroupsRequest.kt */
    /* loaded from: classes5.dex */
    public final class a implements i<List<? extends ky.d>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$MeasuresGroupExchangeSaver", f = "ExchangeMeasureGroupsRequest.kt", l = {204}, m = "save")
        /* renamed from: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0742a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            ExchangeMeasuresGroupWorker f56825a;

            /* renamed from: b  reason: collision with root package name */
            List f56826b;

            /* renamed from: c  reason: collision with root package name */
            ArrayList f56827c;

            /* renamed from: d  reason: collision with root package name */
            List f56828d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f56829e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType>.a f56830f;

            /* renamed from: g  reason: collision with root package name */
            int f56831g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0742a(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType>.a aVar, qm0.d<? super C0742a> dVar) {
                super(dVar);
                this.f56830f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56829e = obj;
                this.f56831g |= Integer.MIN_VALUE;
                return this.f56830f.a(null, this);
            }
        }

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01dc A[LOOP:1: B:75:0x01d6->B:77:0x01dc, LOOP_END] */
        @Override // u10.i
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.util.List<ky.d> r17, qm0.d<? super nm0.y> r18) {
            /*
                Method dump skipped, instructions count: 497
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.a.a(java.util.List, qm0.d):java.lang.Object");
        }
    }

    /* compiled from: ExchangeMeasureGroupsRequest.kt */
    /* loaded from: classes5.dex */
    public static final class b implements u10.g {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f56832a;

        /* renamed from: b  reason: collision with root package name */
        private final nm0.g f56833b;

        /* renamed from: c  reason: collision with root package name */
        private final nm0.g f56834c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56835d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$exchangeRequest$1", f = "ExchangeMeasureGroupsRequest.kt", l = {135}, m = "delete")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f56836a;

            /* renamed from: c  reason: collision with root package name */
            int f56838c;

            a(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56836a = obj;
                this.f56838c |= Integer.MIN_VALUE;
                return b.this.c(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$exchangeRequest$1$delete$2$1", f = "ExchangeMeasureGroupsRequest.kt", l = {135}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0743b extends kotlin.coroutines.jvm.internal.i implements q<Long, ParentPartnerType, qm0.d<? super o.a>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f56839a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ long f56840b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f56841c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56842d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0743b(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker, qm0.d<? super C0743b> dVar) {
                super(3, dVar);
                this.f56842d = exchangeMeasuresGroupWorker;
            }

            @Override // ym0.q
            public final Object invoke(Long l5, Object obj, qm0.d<? super o.a> dVar) {
                long longValue = l5.longValue();
                C0743b c0743b = new C0743b(this.f56842d, dVar);
                c0743b.f56840b = longValue;
                c0743b.f56841c = obj;
                return c0743b.invokeSuspend(y.f85009a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f56839a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    long j5 = this.f56840b;
                    Object obj2 = this.f56841c;
                    this.f56839a = 1;
                    obj = this.f56842d.J(j5, obj2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$exchangeRequest$1", f = "ExchangeMeasureGroupsRequest.kt", l = {117, 118}, m = "read")
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            b f56843a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f56844b;

            /* renamed from: d  reason: collision with root package name */
            int f56846d;

            c(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56844b = obj;
                this.f56846d |= Integer.MIN_VALUE;
                return b.this.f(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$exchangeRequest$1$read$2", f = "ExchangeMeasureGroupsRequest.kt", l = {118}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.i implements q<DateTime, DateTime, qm0.d<? super o.a>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f56847a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ DateTime f56848b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ DateTime f56849c;

            d(qm0.d dVar) {
                super(3, dVar);
            }

            @Override // ym0.q
            public final Object invoke(DateTime dateTime, DateTime dateTime2, qm0.d<? super o.a> dVar) {
                d dVar2 = new d(dVar);
                dVar2.f56848b = dateTime;
                dVar2.f56849c = dateTime2;
                return dVar2.invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f56847a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    DateTime dateTime = this.f56848b;
                    DateTime dateTime2 = this.f56849c;
                    this.f56848b = null;
                    this.f56847a = 1;
                    obj = b.this.i(dateTime, dateTime2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$exchangeRequest$1", f = "ExchangeMeasureGroupsRequest.kt", l = {124, 126}, m = "read")
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            b f56851a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f56852b;

            /* renamed from: d  reason: collision with root package name */
            int f56854d;

            e(qm0.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56852b = obj;
                this.f56854d |= Integer.MIN_VALUE;
                return b.this.i(null, null, this);
            }
        }

        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        /* loaded from: classes5.dex */
        static final class f extends w implements ym0.a<u10.h<List<? extends ky.d>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56855a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker) {
                super(0);
                this.f56855a = exchangeMeasuresGroupWorker;
            }

            @Override // ym0.a
            public final u10.h<List<? extends ky.d>> invoke() {
                return this.f56855a.M();
            }
        }

        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        /* loaded from: classes5.dex */
        static final class g extends w implements ym0.a<i<List<? extends ky.d>>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56856a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker) {
                super(0);
                this.f56856a = exchangeMeasuresGroupWorker;
            }

            @Override // ym0.a
            public final i<List<? extends ky.d>> invoke() {
                return this.f56856a.N();
            }
        }

        /* compiled from: ExchangeMeasureGroupsRequest.kt */
        /* loaded from: classes5.dex */
        static final class h extends w implements ym0.a<a20.b<PartnerType, ParentPartnerType, ky.d>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56857a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker) {
                super(0);
                this.f56857a = exchangeMeasuresGroupWorker;
            }

            @Override // ym0.a
            public final Object invoke() {
                return this.f56857a.R();
            }
        }

        b(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker) {
            this.f56835d = exchangeMeasuresGroupWorker;
            this.f56832a = nm0.h.b(new f(exchangeMeasuresGroupWorker));
            this.f56833b = nm0.h.b(new h(exchangeMeasuresGroupWorker));
            this.f56834c = nm0.h.b(new g(exchangeMeasuresGroupWorker));
        }

        @Override // u10.g
        public final Object b(qm0.d<? super o.a> dVar) {
            return this.f56835d.K(2, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(1:14)|15|(2:17|18)(1:20)))|30|6|7|(0)(0)|11|12|(0)|15|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            r9 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
            r9 = nm0.l.a(r9);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // u10.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(qm0.d<? super androidx.work.o.a> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$a r0 = (com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.a) r0
                int r1 = r0.f56838c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56838c = r1
                goto L18
            L13:
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$a r0 = new com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f56836a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f56838c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L27
                goto L67
            L27:
                r9 = move-exception
                goto L6d
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L31:
                nm0.l.b(r9)
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> r9 = r8.f56835d
                nm0.j r2 = new nm0.j     // Catch: java.lang.Throwable -> L27
                androidx.work.f r4 = r9.getInputData()     // Catch: java.lang.Throwable -> L27
                java.lang.String r5 = "id"
                r6 = -1
                long r4 = r4.e(r5, r6)     // Catch: java.lang.Throwable -> L27
                java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L27
                r6.<init>(r4)     // Catch: java.lang.Throwable -> L27
                a20.b r4 = r9.R()     // Catch: java.lang.Throwable -> L27
                com.withings.partner.model.capabilities.PartnerCapabilities r5 = r9.m()     // Catch: java.lang.Throwable -> L27
                java.lang.Object r4 = r4.t(r5)     // Catch: java.lang.Throwable -> L27
                r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L27
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$b r4 = new com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$b     // Catch: java.lang.Throwable -> L27
                r5 = 0
                r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L27
                r0.f56838c = r3     // Catch: java.lang.Throwable -> L27
                java.lang.Object r9 = cr.a.b(r2, r4, r0)     // Catch: java.lang.Throwable -> L27
                if (r9 != r1) goto L67
                return r1
            L67:
                androidx.work.o$a$c r9 = new androidx.work.o$a$c     // Catch: java.lang.Throwable -> L27
                r9.<init>()     // Catch: java.lang.Throwable -> L27
                goto L71
            L6d:
                nm0.k$a r9 = nm0.l.a(r9)
            L71:
                java.lang.Throwable r0 = nm0.k.b(r9)
                if (r0 == 0) goto L7a
                r0.printStackTrace()
            L7a:
                androidx.work.o$a$a r0 = new androidx.work.o$a$a
                r0.<init>()
                boolean r1 = r9 instanceof nm0.k.a
                if (r1 == 0) goto L84
                r9 = r0
            L84:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.c(qm0.d):java.lang.Object");
        }

        @Override // u10.g
        public final Object d(qm0.d<? super o.a> dVar) {
            return this.f56835d.K(1, dVar);
        }

        @Override // u10.g
        public final i<List<ky.d>> e() {
            return (i) this.f56834c.getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // u10.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(qm0.d<? super androidx.work.o.a> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.c
                if (r0 == 0) goto L13
                r0 = r7
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$c r0 = (com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.c) r0
                int r1 = r0.f56846d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56846d = r1
                goto L18
            L13:
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$c r0 = new com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$c
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f56844b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f56846d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                nm0.l.b(r7)
                goto L60
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L32:
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b r2 = r0.f56843a
                nm0.l.b(r7)
                goto L4d
            L38:
                nm0.l.b(r7)
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> r7 = r6.f56835d
                com.withings.partner.model.capabilities.PartnerCapabilities r2 = r7.m()
                r0.f56843a = r6
                r0.f56846d = r4
                java.io.Serializable r7 = r7.y(r4, r2, r0)
                if (r7 != r1) goto L4c
                return r1
            L4c:
                r2 = r6
            L4d:
                nm0.j r7 = (nm0.j) r7
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$d r4 = new com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$d
                r5 = 0
                r4.<init>(r5)
                r0.f56843a = r5
                r0.f56846d = r3
                java.lang.Object r7 = cr.a.b(r7, r4, r0)
                if (r7 != r1) goto L60
                return r1
            L60:
                androidx.work.o$a r7 = (androidx.work.o.a) r7
                if (r7 != 0) goto L69
                androidx.work.o$a$a r7 = new androidx.work.o$a$a
                r7.<init>()
            L69:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.f(qm0.d):java.lang.Object");
        }

        @Override // u10.g
        public final u10.h<List<ky.d>> g() {
            return (u10.h) this.f56832a.getValue();
        }

        @Override // u10.g
        public final a20.b<PartnerType, ParentPartnerType, ky.d> getSerializer() {
            return (a20.b) this.f56833b.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker, com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType>, a20.d] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.i0] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object i(org.joda.time.DateTime r8, org.joda.time.DateTime r9, qm0.d<? super androidx.work.o.a> r10) {
            /*
                r7 = this;
                boolean r0 = r10 instanceof com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.e
                if (r0 == 0) goto L13
                r0 = r10
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$e r0 = (com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.e) r0
                int r1 = r0.f56854d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56854d = r1
                goto L18
            L13:
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$e r0 = new com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b$e
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f56852b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f56854d
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                nm0.l.b(r10)
                goto L79
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker$b r8 = r0.f56851a
                nm0.l.b(r10)
                goto L5c
            L39:
                nm0.l.b(r10)
                a20.b r10 = r7.getSerializer()
                java.util.Map r10 = r10.c()
                com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> r2 = r7.f56835d
                com.withings.partner.model.capabilities.PartnerCapabilities r6 = r2.m()
                java.lang.Object r10 = r10.get(r6)
                if (r10 == 0) goto Ld5
                r0.f56851a = r7
                r0.f56854d = r4
                java.lang.Object r10 = r2.W(r10, r8, r9, r0)
                if (r10 != r1) goto L5b
                return r1
            L5b:
                r8 = r7
            L5c:
                r9 = r10
                java.util.List r9 = (java.util.List) r9
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L66
                goto L67
            L66:
                r10 = r5
            L67:
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto La2
                r0.f56851a = r5
                r0.f56854d = r3
                r8.getClass()
                java.lang.Object r10 = u10.g.h(r8, r10, r0)
                if (r10 != r1) goto L79
                return r1
            L79:
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto La2
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.x.y(r10, r9)
                r8.<init>(r9)
                java.util.Iterator r9 = r10.iterator()
            L8e:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto La4
                java.lang.Object r10 = r9.next()
                ky.d r10 = (ky.d) r10
                long r0 = r10.d()
                androidx.compose.material.w7.k(r0, r8)
                goto L8e
            La2:
                kotlin.collections.i0 r8 = kotlin.collections.i0.f76187a
            La4:
                java.util.Collection r8 = (java.util.Collection) r8
                r9 = 0
                java.lang.Long[] r10 = new java.lang.Long[r9]
                java.lang.Object[] r8 = r8.toArray(r10)
                nm0.j r10 = new nm0.j
                java.lang.String r0 = "result"
                r10.<init>(r0, r8)
                nm0.j[] r8 = new nm0.j[]{r10}
                androidx.work.f$a r10 = new androidx.work.f$a
                r10.<init>()
                r8 = r8[r9]
                java.lang.Object r9 = r8.c()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r8 = r8.d()
                r10.b(r8, r9)
                androidx.work.f r8 = r10.a()
                androidx.work.o$a$c r5 = new androidx.work.o$a$c
                r5.<init>(r8)
            Ld5:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.b.i(org.joda.time.DateTime, org.joda.time.DateTime, qm0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsRequest.kt */
    @e(c = "com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker", f = "ExchangeMeasureGroupsRequest.kt", l = {ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_WALKING_STEADINESS_CLASSIFICATION}, m = "export")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ExchangeMeasuresGroupWorker f56858a;

        /* renamed from: b  reason: collision with root package name */
        DateTime f56859b;

        /* renamed from: c  reason: collision with root package name */
        int f56860c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56861d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56862e;

        /* renamed from: f  reason: collision with root package name */
        int f56863f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker, qm0.d<? super c> dVar) {
            super(dVar);
            this.f56862e = exchangeMeasuresGroupWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56861d = obj;
            this.f56863f |= Integer.MIN_VALUE;
            return this.f56862e.K(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExchangeMeasureGroupsRequest.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements p<DateTime, List<? extends Integer>, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> f56864a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ExchangeMeasuresGroupWorker<PartnerType, ParentPartnerType> exchangeMeasuresGroupWorker) {
            super(2);
            this.f56864a = exchangeMeasuresGroupWorker;
        }

        @Override // ym0.p
        public final y invoke(DateTime dateTime, List<? extends Integer> list) {
            DateTime modified = dateTime;
            List<? extends Integer> measureTypes = list;
            u.j(modified, "modified");
            u.j(measureTypes, "measureTypes");
            for (Number number : measureTypes) {
                this.f56864a.F(number.intValue(), 2, modified);
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeMeasuresGroupWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        this.f56822h = new a();
        this.f56823i = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable L(int r12, com.withings.partner.model.capabilities.PartnerCapabilities r13, qm0.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.withings.wiscale2.healthsync.model.measuresgroup.a
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.wiscale2.healthsync.model.measuresgroup.a r0 = (com.withings.wiscale2.healthsync.model.measuresgroup.a) r0
            int r1 = r0.f56869e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f56869e = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.withings.wiscale2.healthsync.model.measuresgroup.a r0 = new com.withings.wiscale2.healthsync.model.measuresgroup.a
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.f56867c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f56869e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r12 = r8.f56865a
            com.withings.partner.model.capabilities.PartnerCapabilities r12 = (com.withings.partner.model.capabilities.PartnerCapabilities) r12
            nm0.l.b(r14)
            goto La7
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            com.withings.partner.model.capabilities.PartnerCapabilities r13 = r8.f56866b
            java.lang.Object r12 = r8.f56865a
            com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker r12 = (com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker) r12
            nm0.l.b(r14)
            goto L54
        L43:
            nm0.l.b(r14)
            r8.f56865a = r11
            r8.f56866b = r13
            r8.f56869e = r3
            java.io.Serializable r14 = r11.y(r12, r13, r8)
            if (r14 != r0) goto L53
            return r0
        L53:
            r12 = r11
        L54:
            nm0.j r14 = (nm0.j) r14
            java.lang.Object r14 = r14.a()
            org.joda.time.DateTime r14 = (org.joda.time.DateTime) r14
            java.util.Map r1 = a20.a.a()
            java.lang.Object r1 = r1.get(r13)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lae
            gg0.c r3 = r12.U()
            fy.l r3 = r3.d()
            com.withings.user.User r4 = r12.getUser()
            long r4 = r4.q()
            java.util.Collection r1 = (java.util.Collection) r1
            int[] r7 = kotlin.collections.x.P0(r1)
            org.joda.time.DateTime r12 = r12.x()
            java.lang.Comparable r12 = en0.r.d(r14, r12)
            org.joda.time.DateTime r12 = (org.joda.time.DateTime) r12
            long r9 = r12.getMillis()
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r9)
            r8.f56865a = r13
            r14 = 0
            r8.f56866b = r14
            r8.f56869e = r2
            r6 = 0
            r9 = 28
            r1 = r3
            r2 = r4
            r4 = r12
            r5 = r14
            java.lang.Object r14 = fy.l.c(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto La6
            return r0
        La6:
            r12 = r13
        La7:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r12 = b20.a.b(r14, r12)
            goto Lb0
        Lae:
            kotlin.collections.i0 r12 = kotlin.collections.i0.f76187a
        Lb0:
            java.io.Serializable r12 = (java.io.Serializable) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.L(int, com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.io.Serializable");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(18:5|6|7|(1:(2:10|11)(2:51|52))(16:53|54|(1:56)(1:61)|(2:58|(1:60))|50|29|(1:31)|32|(1:34)|35|(1:37)(1:48)|(1:39)|40|(1:44)|45|46)|12|(15:14|(5:17|(1:19)(1:26)|(3:21|22|23)(1:25)|24|15)|27|28|29|(0)|32|(0)|35|(0)(0)|(0)|40|(2:42|44)|45|46)|50|29|(0)|32|(0)|35|(0)(0)|(0)|40|(0)|45|46))|64|6|7|(0)(0)|12|(0)|50|29|(0)|32|(0)|35|(0)(0)|(0)|40|(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
        r5 = nm0.l.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:12:0x0026, B:27:0x0053, B:29:0x0057, B:30:0x0062, B:32:0x0068, B:34:0x0078, B:37:0x0085, B:38:0x0089, B:19:0x0037, B:24:0x0041), top: B:61:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable P(com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker r5, java.util.List r6, boolean r7, qm0.d r8) {
        /*
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.model.measuresgroup.b
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.model.measuresgroup.b r0 = (com.withings.wiscale2.healthsync.model.measuresgroup.b) r0
            int r1 = r0.f56873d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56873d = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.model.measuresgroup.b r0 = new com.withings.wiscale2.healthsync.model.measuresgroup.b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f56871b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56873d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker r5 = r0.f56870a
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r5 = move-exception
            goto L90
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            nm0.l.b(r8)
            boolean r8 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r8 != 0) goto L3e
            goto L3f
        L3e:
            r6 = r4
        L3f:
            if (r6 == 0) goto L8e
            u10.h r8 = r5.M()     // Catch: java.lang.Throwable -> L2a
            r0.f56870a = r5     // Catch: java.lang.Throwable -> L2a
            r0.f56873d = r3     // Catch: java.lang.Throwable -> L2a
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            java.lang.Object r8 = r8.g(r6, r2, r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L53
            return r1
        L53:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L8e
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r6.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r7 = r8.iterator()     // Catch: java.lang.Throwable -> L2a
        L62:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L89
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2a
            ky.d r8 = (ky.d) r8     // Catch: java.lang.Throwable -> L2a
            a20.b r0 = r5.R()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r0.serialize(r8)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L82
            nm0.j r1 = new nm0.j     // Catch: java.lang.Throwable -> L2a
            org.joda.time.DateTime r8 = r8.c()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L2a
            goto L83
        L82:
            r1 = r4
        L83:
            if (r1 == 0) goto L62
            r6.add(r1)     // Catch: java.lang.Throwable -> L2a
            goto L62
        L89:
            java.util.Map r5 = kotlin.collections.s0.p(r6)     // Catch: java.lang.Throwable -> L2a
            goto L94
        L8e:
            r5 = r4
            goto L94
        L90:
            nm0.k$a r5 = nm0.l.a(r5)
        L94:
            java.lang.Throwable r6 = nm0.k.b(r5)
            if (r6 == 0) goto L9d
            r6.printStackTrace()
        L9d:
            boolean r6 = r5 instanceof nm0.k.a
            if (r6 == 0) goto La2
            r5 = r4
        La2:
            java.util.Map r5 = (java.util.Map) r5
            nm0.j r6 = new nm0.j
            if (r5 == 0) goto Lad
            java.util.Set r7 = r5.keySet()
            goto Lae
        Lad:
            r7 = r4
        Lae:
            if (r7 != 0) goto Lb2
            kotlin.collections.k0 r7 = kotlin.collections.k0.f76195a
        Lb2:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.x.Q0(r7)
            if (r5 == 0) goto Lc9
            java.util.Collection r5 = r5.values()
            if (r5 == 0) goto Lc9
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Comparable r5 = kotlin.collections.x.Y(r5)
            r4 = r5
            org.joda.time.DateTime r4 = (org.joda.time.DateTime) r4
        Lc9:
            r6.<init>(r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.P(com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker, java.util.List, boolean, qm0.d):java.io.Serializable");
    }

    public Object J(long j5, ParentPartnerType parentpartnertype, qm0.d<? super o.a> dVar) {
        return new o.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object K(int r9, qm0.d<? super androidx.work.o.a> r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.model.measuresgroup.ExchangeMeasuresGroupWorker.K(int, qm0.d):java.lang.Object");
    }

    public abstract h<List<ky.d>> M();

    public i<List<ky.d>> N() {
        return this.f56822h;
    }

    public final Serializable O(List list, qm0.d dVar) {
        return P(this, list, true, dVar);
    }

    public Object Q(qm0.d<? super j<? extends List<? extends PartnerType>, DateTime>> dVar) {
        return null;
    }

    public abstract a20.b<PartnerType, ParentPartnerType, ky.d> R();

    public abstract boolean S();

    public abstract String T();

    public abstract gg0.c U();

    public abstract Object V(int i11, List<? extends PartnerType> list, qm0.d<? super y> dVar);

    public abstract Object W(ParentPartnerType parentpartnertype, DateTime dateTime, DateTime dateTime2, qm0.d<? super List<? extends PartnerType>> dVar);

    @Override // u10.n0
    public final g h() {
        return this.f56823i;
    }

    @Override // com.withings.wiscale2.healthsync.ExchangeWorker
    public final fg0.a z() {
        return U().b();
    }
}
