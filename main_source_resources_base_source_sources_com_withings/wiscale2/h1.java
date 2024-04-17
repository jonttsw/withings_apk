package com.withings.wiscale2;

import com.withings.target.data.TargetRepository;
/* compiled from: HMCommonDeviceModule.kt */
/* loaded from: classes4.dex */
public final class h1 implements com.withings.common.device.h {

    /* renamed from: a  reason: collision with root package name */
    private final fl.r f56164a;

    /* compiled from: HMCommonDeviceModule.kt */
    /* loaded from: classes4.dex */
    public static final class a implements fl.r {

        /* renamed from: a  reason: collision with root package name */
        private final TargetRepository f56165a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HMCommonDeviceModule.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.HMCommonDeviceModule$WppHrThresholdRepository", f = "HMCommonDeviceModule.kt", l = {20, 21}, m = "get")
        /* renamed from: com.withings.wiscale2.h1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0738a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Object f56166a;

            /* renamed from: b  reason: collision with root package name */
            long f56167b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f56168c;

            /* renamed from: e  reason: collision with root package name */
            int f56170e;

            C0738a(qm0.d<? super C0738a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f56168c = obj;
                this.f56170e |= Integer.MIN_VALUE;
                return a.this.a(0L, this);
            }
        }

        public a(TargetRepository targetRepository) {
            kotlin.jvm.internal.u.j(targetRepository, "targetRepository");
            this.f56165a = targetRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.Serializable c(long r5, int r7, qm0.d r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof com.withings.wiscale2.i1
                if (r0 == 0) goto L13
                r0 = r8
                com.withings.wiscale2.i1 r0 = (com.withings.wiscale2.i1) r0
                int r1 = r0.f57859e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f57859e = r1
                goto L18
            L13:
                com.withings.wiscale2.i1 r0 = new com.withings.wiscale2.i1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f57857c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f57859e
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                com.withings.target.Target r5 = r0.f57856b
                com.withings.wiscale2.h1$a r6 = r0.f57855a
                nm0.l.b(r8)
                goto L54
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                nm0.l.b(r8)
                com.withings.target.data.TargetRepository r8 = r4.f56165a
                com.withings.target.Target r2 = r8.getHRLastTarget(r5, r7)
                if (r2 != 0) goto L56
                com.withings.target.Target r5 = r8.getHRLastTargetOrDefault(r5, r7)
                java.util.List r6 = kotlin.collections.x.V(r5)
                r0.f57855a = r4
                r0.f57856b = r5
                r0.f57859e = r3
                java.lang.Object r6 = r8.saveTargets(r6, r0)
                if (r6 != r1) goto L53
                return r1
            L53:
                r6 = r4
            L54:
                r2 = r5
                goto L57
            L56:
                r6 = r4
            L57:
                r6.getClass()
                com.withings.comm.wpp.generated.object.Threshold r5 = new com.withings.comm.wpp.generated.object.Threshold
                r5.<init>()
                int r6 = r2.getMeasureType()
                r7 = 144(0x90, float:2.02E-43)
                if (r6 != r7) goto L68
                goto L69
            L68:
                r3 = 2
            L69:
                r5.setId(r3)
                boolean r6 = r2.isActive()
                short r6 = (short) r6
                r5.setEnabled(r6)
                int r6 = r2.getAsInt()
                r5.setValue(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.h1.a.c(long, int, qm0.d):java.io.Serializable");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        @Override // fl.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(long r7, qm0.d<? super fl.r.a> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof com.withings.wiscale2.h1.a.C0738a
                if (r0 == 0) goto L13
                r0 = r9
                com.withings.wiscale2.h1$a$a r0 = (com.withings.wiscale2.h1.a.C0738a) r0
                int r1 = r0.f56170e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56170e = r1
                goto L18
            L13:
                com.withings.wiscale2.h1$a$a r0 = new com.withings.wiscale2.h1$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f56168c
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f56170e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r7 = r0.f56166a
                com.withings.comm.wpp.generated.object.Threshold r7 = (com.withings.comm.wpp.generated.object.Threshold) r7
                nm0.l.b(r9)
                goto L65
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L36:
                long r7 = r0.f56167b
                java.lang.Object r2 = r0.f56166a
                com.withings.wiscale2.h1$a r2 = (com.withings.wiscale2.h1.a) r2
                nm0.l.b(r9)
                goto L53
            L40:
                nm0.l.b(r9)
                r0.f56166a = r6
                r0.f56167b = r7
                r0.f56170e = r4
                r9 = 143(0x8f, float:2.0E-43)
                java.io.Serializable r9 = r6.c(r7, r9, r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r2 = r6
            L53:
                com.withings.comm.wpp.generated.object.Threshold r9 = (com.withings.comm.wpp.generated.object.Threshold) r9
                r0.f56166a = r9
                r0.f56170e = r3
                r3 = 144(0x90, float:2.02E-43)
                java.io.Serializable r7 = r2.c(r7, r3, r0)
                if (r7 != r1) goto L62
                return r1
            L62:
                r5 = r9
                r9 = r7
                r7 = r5
            L65:
                com.withings.comm.wpp.generated.object.Threshold r9 = (com.withings.comm.wpp.generated.object.Threshold) r9
                fl.r$a r8 = new fl.r$a
                r8.<init>(r9, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.h1.a.a(long, qm0.d):java.lang.Object");
        }
    }

    public h1(TargetRepository targetRepository) {
        kotlin.jvm.internal.u.j(targetRepository, "targetRepository");
        this.f56164a = new a(targetRepository);
    }

    public final fl.r a() {
        return this.f56164a;
    }
}
