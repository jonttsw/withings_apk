package com.withings.wiscale2.appupgrade.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.feature.t;
import com.withings.wiscale2.device.common.feature.u;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: MigrateLocalFeaturesWorker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/appupgrade/workers/MigrateLocalFeaturesWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lcom/withings/wiscale2/device/common/feature/u;", "platformFeatureActivationFactory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/withings/wiscale2/device/common/feature/u;)V", "LocalFeatureInfo", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MigrateLocalFeaturesWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50105a;

    /* renamed from: b  reason: collision with root package name */
    private final u f50106b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MigrateLocalFeaturesWorker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/appupgrade/workers/MigrateLocalFeaturesWorker$LocalFeatureInfo;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class LocalFeatureInfo {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ LocalFeatureInfo[] f50107c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f50108d;

        /* renamed from: a  reason: collision with root package name */
        private final int f50109a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50110b;

        static {
            LocalFeatureInfo[] localFeatureInfoArr = {new LocalFeatureInfo("Navigation", 0, 18, 2), new LocalFeatureInfo("Notifications", 1, 19, 6), new LocalFeatureInfo("Workout", 2, 21, 7), new LocalFeatureInfo("ActivityGoal", 3, 20, 1), new LocalFeatureInfo("IrregularHeartBeat", 4, 13, 8)};
            f50107c = localFeatureInfoArr;
            f50108d = sm0.b.a(localFeatureInfoArr);
        }

        private LocalFeatureInfo(String str, int i11, int i12, int i13) {
            this.f50109a = i12;
            this.f50110b = i13;
        }

        public static sm0.a<LocalFeatureInfo> a() {
            return f50108d;
        }

        public static LocalFeatureInfo valueOf(String str) {
            return (LocalFeatureInfo) Enum.valueOf(LocalFeatureInfo.class, str);
        }

        public static LocalFeatureInfo[] values() {
            return (LocalFeatureInfo[]) f50107c.clone();
        }

        public final int b() {
            return this.f50109a;
        }

        public final int d() {
            return this.f50110b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MigrateLocalFeaturesWorker.kt */
    @e(c = "com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker", f = "MigrateLocalFeaturesWorker.kt", l = {44}, m = "doWork")
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f50111a;

        /* renamed from: c  reason: collision with root package name */
        int f50113c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50111a = obj;
            this.f50113c |= Integer.MIN_VALUE;
            return MigrateLocalFeaturesWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MigrateLocalFeaturesWorker.kt */
    @e(c = "com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$doWork$2", f = "MigrateLocalFeaturesWorker.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MigrateLocalFeaturesWorker f50114a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f50115b;

        /* renamed from: c  reason: collision with root package name */
        t f50116c;

        /* renamed from: d  reason: collision with root package name */
        Iterator f50117d;

        /* renamed from: e  reason: collision with root package name */
        int f50118e;

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

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b5 -> B:28:0x00c6). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f50118e
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.util.Iterator r2 = r0.f50117d
                com.withings.wiscale2.device.common.feature.t r4 = r0.f50116c
                java.util.Iterator r5 = r0.f50115b
                com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker r6 = r0.f50114a
                nm0.l.b(r18)
                r16 = r6
                r6 = r4
                r4 = r5
                goto Lc6
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                nm0.l.b(r18)
                kn.e r2 = kn.e.c()
                java.util.List r2 = r2.m()
                java.lang.String r4 = "getDevices(...)"
                kotlin.jvm.internal.u.i(r2, r4)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
                com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker r4 = com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.this
            L3c:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto Led
                java.lang.Object r5 = r2.next()
                com.withings.device.Device r5 = (com.withings.device.Device) r5
                com.withings.wiscale2.device.common.feature.a r6 = new com.withings.wiscale2.device.common.feature.a
                android.content.Context r7 = r4.getContext()
                long r8 = r5.getId()
                r6.<init>(r7, r8)
                com.withings.features.platform.model.RoomPlatformFeatureRepository$Companion r7 = com.withings.features.platform.model.RoomPlatformFeatureRepository.Companion
                com.withings.features.platform.model.PlatformFeatureRepository r7 = r7.get()
                long r8 = r5.getId()
                java.util.List r7 = r7.getAllFeaturesForDevice(r8)
                sm0.a r8 = com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.LocalFeatureInfo.a()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                kotlin.collections.c r8 = (kotlin.collections.c) r8
                java.util.Iterator r8 = r8.iterator()
            L72:
                boolean r10 = r8.hasNext()
                r11 = 0
                if (r10 == 0) goto Lb5
                java.lang.Object r10 = r8.next()
                com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$LocalFeatureInfo r10 = (com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.LocalFeatureInfo) r10
                r12 = r7
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.Iterator r12 = r12.iterator()
            L86:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L9e
                java.lang.Object r13 = r12.next()
                r14 = r13
                com.withings.features.platform.model.PlatformFeature r14 = (com.withings.features.platform.model.PlatformFeature) r14
                int r14 = r14.getFeatureId()
                int r15 = r10.b()
                if (r14 != r15) goto L86
                goto L9f
            L9e:
                r13 = r11
            L9f:
                r12 = r13
                com.withings.features.platform.model.PlatformFeature r12 = (com.withings.features.platform.model.PlatformFeature) r12
                int r10 = r10.d()
                boolean r10 = r6.a(r10)
                if (r10 == 0) goto Lad
                r11 = r13
            Lad:
                com.withings.features.platform.model.PlatformFeature r11 = (com.withings.features.platform.model.PlatformFeature) r11
                if (r11 == 0) goto L72
                r9.add(r11)
                goto L72
            Lb5:
                com.withings.wiscale2.device.common.feature.u r6 = com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.o(r4)
                com.withings.wiscale2.device.common.feature.t r5 = r6.a(r5, r9, r11)
                java.util.Iterator r6 = r9.iterator()
                r16 = r4
                r4 = r2
                r2 = r6
                r6 = r5
            Lc6:
                r5 = r16
            Lc8:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto Le9
                java.lang.Object r7 = r2.next()
                com.withings.features.platform.model.PlatformFeature r7 = (com.withings.features.platform.model.PlatformFeature) r7
                int r7 = r7.getFeatureId()
                r0.f50114a = r5
                r0.f50115b = r4
                r0.f50116c = r6
                r0.f50117d = r2
                r0.f50118e = r3
                java.lang.Object r7 = r6.e(r7, r3, r0)
                if (r7 != r1) goto Lc8
                return r1
            Le9:
                r2 = r4
                r4 = r5
                goto L3c
            Led:
                androidx.work.o$a$c r1 = new androidx.work.o$a$c
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrateLocalFeaturesWorker(Context context, WorkerParameters params, u platformFeatureActivationFactory) {
        super(context, params);
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(params, "params");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f50105a = context;
        this.f50106b = platformFeatureActivationFactory;
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
            boolean r0 = r6 instanceof com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$a r0 = (com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.a) r0
            int r1 = r0.f50113c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50113c = r1
            goto L18
        L13:
            com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$a r0 = new com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50111a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f50113c
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
            com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$b r2 = new com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f50113c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker.doWork(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.f50105a;
    }
}
