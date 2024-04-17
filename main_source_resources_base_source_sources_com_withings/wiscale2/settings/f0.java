package com.withings.wiscale2.settings;

import javax.inject.Inject;
/* compiled from: HasAccessToAccountAndSecuritySettings.kt */
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final rf.a f59990a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HasAccessToAccountAndSecuritySettings.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.HasAccessToAccountAndSecuritySettings", f = "HasAccessToAccountAndSecuritySettings.kt", l = {9}, m = "execute")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f59991a;

        /* renamed from: c  reason: collision with root package name */
        int f59993c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59991a = obj;
            this.f59993c |= Integer.MIN_VALUE;
            return f0.this.a(this);
        }
    }

    @Inject
    public f0(eg.a aVar) {
        this.f59990a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(qm0.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.wiscale2.settings.f0.a
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.wiscale2.settings.f0$a r0 = (com.withings.wiscale2.settings.f0.a) r0
            int r1 = r0.f59993c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59993c = r1
            goto L18
        L13:
            com.withings.wiscale2.settings.f0$a r0 = new com.withings.wiscale2.settings.f0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f59991a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f59993c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            nm0.l.b(r5)
            r0.f59993c = r3
            rf.a r5 = r4.f59990a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.f0.a(qm0.d):java.lang.Object");
    }
}
