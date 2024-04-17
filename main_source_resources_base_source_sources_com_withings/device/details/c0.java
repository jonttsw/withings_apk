package com.withings.device.details;

import com.withings.device.Device;
import javax.inject.Inject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DissociateDeviceUseCase.kt */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final kn.e f36754a;

    /* renamed from: b  reason: collision with root package name */
    private final ej.w f36755b;

    /* renamed from: c  reason: collision with root package name */
    private final p005if.a f36756c;

    /* renamed from: d  reason: collision with root package name */
    private final nn.m f36757d;

    /* renamed from: e  reason: collision with root package name */
    private final nn.a f36758e;

    /* renamed from: f  reason: collision with root package name */
    private final nn.b f36759f;

    /* compiled from: DissociateDeviceUseCase.kt */
    /* loaded from: classes3.dex */
    public interface a {

        /* compiled from: DissociateDeviceUseCase.kt */
        /* renamed from: com.withings.device.details.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0483a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f36760a;

            public C0483a(Throwable th2) {
                this.f36760a = th2;
            }

            public final Throwable a() {
                return this.f36760a;
            }
        }

        /* compiled from: DissociateDeviceUseCase.kt */
        /* loaded from: classes3.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f36761a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public final int hashCode() {
                return -1836397886;
            }

            public final String toString() {
                return "NeedFactoryHelp";
            }
        }

        /* compiled from: DissociateDeviceUseCase.kt */
        /* loaded from: classes3.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f36762a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return true;
            }

            public final int hashCode() {
                return -2118958384;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase", f = "DissociateDeviceUseCase.kt", l = {41, 42, 43}, m = "dissociateMyAccount")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        c0 f36763a;

        /* renamed from: b  reason: collision with root package name */
        Device f36764b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36765c;

        /* renamed from: e  reason: collision with root package name */
        int f36767e;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36765c = obj;
            this.f36767e |= Integer.MIN_VALUE;
            return c0.this.b(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase$dissociateMyAccount$device$1", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f36769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j5, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f36769b = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f36769b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return c0.this.f36754a.d(this.f36769b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase", f = "DissociateDeviceUseCase.kt", l = {36, 37}, m = "dissociateOtherAccounts")
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        c0 f36770a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f36771b;

        /* renamed from: d  reason: collision with root package name */
        int f36773d;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36771b = obj;
            this.f36773d |= Integer.MIN_VALUE;
            return c0.this.c(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase$dissociateOtherAccounts$device$1", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f36775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j5, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f36775b = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f36775b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return c0.this.f36754a.d(this.f36775b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase", f = "DissociateDeviceUseCase.kt", l = {47, 53, 56, 57}, m = "dissociateSingleUser")
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f36776a;

        /* renamed from: b  reason: collision with root package name */
        c0 f36777b;

        /* renamed from: c  reason: collision with root package name */
        l0 f36778c;

        /* renamed from: d  reason: collision with root package name */
        long f36779d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f36780e;

        /* renamed from: g  reason: collision with root package name */
        int f36782g;

        f(qm0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36780e = obj;
            this.f36782g |= Integer.MIN_VALUE;
            return c0.this.d(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DissociateDeviceUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DissociateDeviceUseCase$dissociateSingleUser$device$1", f = "DissociateDeviceUseCase.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f36784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j5, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f36784b = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f36784b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return c0.this.f36754a.d(this.f36784b);
        }
    }

    @Inject
    public c0(kn.e deviceManager, ej.w wVar, p005if.a aVar, nn.m mVar, nn.a aVar2, nn.b bVar) {
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f36754a = deviceManager;
        this.f36755b = wVar;
        this.f36756c = aVar;
        this.f36757d = mVar;
        this.f36758e = aVar2;
        this.f36759f = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r8, qm0.d<? super nm0.y> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.withings.device.details.c0.b
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.device.details.c0$b r0 = (com.withings.device.details.c0.b) r0
            int r1 = r0.f36767e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36767e = r1
            goto L18
        L13:
            com.withings.device.details.c0$b r0 = new com.withings.device.details.c0$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f36765c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f36767e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            nm0.l.b(r10)
            nm0.k r10 = (nm0.k) r10
            r10.getClass()
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            com.withings.device.Device r8 = r0.f36764b
            com.withings.device.details.c0 r9 = r0.f36763a
            nm0.l.b(r10)
            goto L8a
        L43:
            com.withings.device.details.c0 r8 = r0.f36763a
            nm0.l.b(r10)
            r9 = r8
            goto L62
        L4a:
            nm0.l.b(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.c0$c r2 = new com.withings.device.details.c0$c
            r2.<init>(r8, r6)
            r0.f36763a = r7
            r0.f36767e = r5
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r2, r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r9 = r7
        L62:
            r8 = r10
            com.withings.device.Device r8 = (com.withings.device.Device) r8
            if (r8 != 0) goto L6a
            nm0.y r8 = nm0.y.f85009a
            return r8
        L6a:
            nn.a r10 = r9.f36758e
            r0.f36763a = r9
            r0.f36764b = r8
            r0.f36767e = r4
            r10.getClass()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.a r4 = new com.withings.device.details.a
            r4.<init>(r10, r8, r6)
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0)
            if (r10 != r1) goto L85
            goto L87
        L85:
            nm0.y r10 = nm0.y.f85009a
        L87:
            if (r10 != r1) goto L8a
            return r1
        L8a:
            nn.m r9 = r9.f36757d
            r0.f36763a = r6
            r0.f36764b = r6
            r0.f36767e = r3
            java.lang.Object r8 = r9.c(r8, r0)
            if (r8 != r1) goto L99
            return r1
        L99:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.c0.b(long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r7, qm0.d<? super nm0.y> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.device.details.c0.d
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.device.details.c0$d r0 = (com.withings.device.details.c0.d) r0
            int r1 = r0.f36773d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36773d = r1
            goto L18
        L13:
            com.withings.device.details.c0$d r0 = new com.withings.device.details.c0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36771b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f36773d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r9)
            goto L76
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.withings.device.details.c0 r7 = r0.f36770a
            nm0.l.b(r9)
            goto L51
        L39:
            nm0.l.b(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.c0$e r2 = new com.withings.device.details.c0$e
            r2.<init>(r7, r5)
            r0.f36770a = r6
            r0.f36773d = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r7 = r6
        L51:
            com.withings.device.Device r9 = (com.withings.device.Device) r9
            if (r9 != 0) goto L58
            nm0.y r7 = nm0.y.f85009a
            return r7
        L58:
            nn.b r7 = r7.f36759f
            r0.f36770a = r5
            r0.f36773d = r3
            r7.getClass()
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.c r2 = new com.withings.device.details.c
            r2.<init>(r7, r9, r5)
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r7 != r1) goto L71
            goto L73
        L71:
            nm0.y r7 = nm0.y.f85009a
        L73:
            if (r7 != r1) goto L76
            return r1
        L76:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.c0.c(long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(8:13|14|15|16|(2:18|(2:20|21))|(2:24|(2:26|27))|28|29)(2:31|32))(10:33|34|35|(1:37)|15|16|(0)|(0)|28|29))(17:38|39|40|41|42|(1:44)|45|(1:47)(1:50)|(1:49)|35|(0)|15|16|(0)|(0)|28|29))(1:54))(2:75|(1:77)(1:78))|55|(2:57|58)(2:59|(12:74|45|(0)(0)|(0)|35|(0)|15|16|(0)|(0)|28|29)(4:63|64|(1:66)(1:70)|(1:68)(15:69|41|42|(0)|45|(0)(0)|(0)|35|(0)|15|16|(0)|(0)|28|29)))))|81|6|7|(0)(0)|55|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
        r13 = nm0.l.a(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:15:0x0031, B:68:0x0135, B:22:0x004e, B:65:0x0124, B:55:0x00f3, B:57:0x00f8, B:59:0x0100, B:62:0x011f, B:54:0x00ef, B:38:0x009e, B:40:0x00b1), top: B:84:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:15:0x0031, B:68:0x0135, B:22:0x004e, B:65:0x0124, B:55:0x00f3, B:57:0x00f8, B:59:0x0100, B:62:0x011f, B:54:0x00ef, B:38:0x009e, B:40:0x00b1), top: B:84:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:15:0x0031, B:68:0x0135, B:22:0x004e, B:65:0x0124, B:55:0x00f3, B:57:0x00f8, B:59:0x0100, B:62:0x011f, B:54:0x00ef, B:38:0x009e, B:40:0x00b1), top: B:84:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r13, qm0.d<? super com.withings.device.details.c0.a> r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.c0.d(long, qm0.d):java.lang.Object");
    }
}
