package com.withings.wiscale2.appupgrade.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.feature.t;
import com.withings.wiscale2.device.common.feature.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: MigratePlatformFeaturesWorker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/appupgrade/workers/MigratePlatformFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lcom/withings/wiscale2/device/common/feature/u;", "platformFeatureActivationFactory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/withings/wiscale2/device/common/feature/u;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MigratePlatformFeaturesWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final u f50120a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f50121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MigratePlatformFeaturesWorker.kt */
    @e(c = "com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker", f = "MigratePlatformFeaturesWorker.kt", l = {45}, m = "doWork")
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f50122a;

        /* renamed from: c  reason: collision with root package name */
        int f50124c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50122a = obj;
            this.f50124c |= Integer.MIN_VALUE;
            return MigratePlatformFeaturesWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MigratePlatformFeaturesWorker.kt */
    @e(c = "com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$doWork$2", f = "MigratePlatformFeaturesWorker.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MigratePlatformFeaturesWorker f50125a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f50126b;

        /* renamed from: c  reason: collision with root package name */
        t f50127c;

        /* renamed from: d  reason: collision with root package name */
        Iterator f50128d;

        /* renamed from: e  reason: collision with root package name */
        int f50129e;

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a6 -> B:24:0x00b7). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r11.f50129e
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.util.Iterator r1 = r11.f50128d
                com.withings.wiscale2.device.common.feature.t r3 = r11.f50127c
                java.util.Iterator r4 = r11.f50126b
                com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker r5 = r11.f50125a
                nm0.l.b(r12)
                r12 = r4
                r4 = r3
                r3 = r5
                goto Lb7
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                nm0.l.b(r12)
                kn.e r12 = kn.e.c()
                java.util.List r12 = r12.m()
                java.lang.String r1 = "getDevices(...)"
                kotlin.jvm.internal.u.i(r12, r1)
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.Iterator r12 = r12.iterator()
                com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker r1 = com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.this
            L39:
                boolean r3 = r12.hasNext()
                if (r3 == 0) goto Ldb
                java.lang.Object r3 = r12.next()
                com.withings.device.Device r3 = (com.withings.device.Device) r3
                com.withings.features.platform.model.RoomPlatformFeatureRepository$Companion r4 = com.withings.features.platform.model.RoomPlatformFeatureRepository.Companion
                com.withings.features.platform.model.PlatformFeatureRepository r4 = r4.get()
                long r5 = r3.getId()
                java.util.List r4 = r4.getAllFeaturesForDevice(r5)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L5e:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L82
                java.lang.Object r6 = r4.next()
                r7 = r6
                com.withings.features.platform.model.PlatformFeature r7 = (com.withings.features.platform.model.PlatformFeature) r7
                java.util.List r8 = com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.o(r1)
                int r7 = r7.getFeatureId()
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r7)
                boolean r7 = r8.contains(r9)
                if (r7 == 0) goto L5e
                r5.add(r6)
                goto L5e
            L82:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r5.iterator()
            L8b:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto La6
                java.lang.Object r6 = r5.next()
                r7 = r6
                com.withings.features.platform.model.PlatformFeature r7 = (com.withings.features.platform.model.PlatformFeature) r7
                long r8 = r3.getId()
                boolean r7 = com.withings.features.platform.model.PlatformFeatureKt.isActivatedForDevice(r7, r8)
                if (r7 == 0) goto L8b
                r4.add(r6)
                goto L8b
            La6:
                com.withings.wiscale2.device.common.feature.u r5 = com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.t(r1)
                r6 = 0
                com.withings.wiscale2.device.common.feature.t r3 = r5.a(r3, r4, r6)
                java.util.Iterator r4 = r4.iterator()
                r10 = r3
                r3 = r1
                r1 = r4
                r4 = r10
            Lb7:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto Ld8
                java.lang.Object r5 = r1.next()
                com.withings.features.platform.model.PlatformFeature r5 = (com.withings.features.platform.model.PlatformFeature) r5
                int r5 = r5.getFeatureId()
                r11.f50125a = r3
                r11.f50126b = r12
                r11.f50127c = r4
                r11.f50128d = r1
                r11.f50129e = r2
                java.lang.Object r5 = r4.e(r5, r2, r11)
                if (r5 != r0) goto Lb7
                return r0
            Ld8:
                r1 = r3
                goto L39
            Ldb:
                androidx.work.o$a$c r12 = new androidx.work.o$a$c
                r12.<init>()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigratePlatformFeaturesWorker(Context context, WorkerParameters params, u platformFeatureActivationFactory) {
        super(context, params);
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(params, "params");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f50120a = platformFeatureActivationFactory;
        this.f50121b = x.W(4, 3, 15, 14, 10, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$a r0 = (com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.a) r0
            int r1 = r0.f50124c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50124c = r1
            goto L18
        L13:
            com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$a r0 = new com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50122a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f50124c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$b r2 = new com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f50124c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.workers.MigratePlatformFeaturesWorker.doWork(qm0.d):java.lang.Object");
    }
}
