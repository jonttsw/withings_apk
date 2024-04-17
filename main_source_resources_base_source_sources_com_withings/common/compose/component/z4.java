package com.withings.common.compose.component;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: ToastHost.kt */
/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a  reason: collision with root package name */
    private final long f34989a = 3000;

    /* renamed from: b  reason: collision with root package name */
    private final Mutex f34990b = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: c  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f34991c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToastHost.kt */
    /* loaded from: classes3.dex */
    public static final class a implements w4 {

        /* renamed from: a  reason: collision with root package name */
        private final ToastStyle f34992a;

        /* renamed from: b  reason: collision with root package name */
        private final String f34993b;

        /* renamed from: c  reason: collision with root package name */
        private final String f34994c;

        /* renamed from: d  reason: collision with root package name */
        private final ym0.a<nm0.y> f34995d;

        /* renamed from: e  reason: collision with root package name */
        private final long f34996e;

        /* renamed from: f  reason: collision with root package name */
        private final CancellableContinuation<ToastResult> f34997f;

        /* renamed from: g  reason: collision with root package name */
        private final ym0.a<nm0.y> f34998g;

        public a(ToastStyle style, String label, String description, ym0.a aVar, long j5, CancellableContinuationImpl cancellableContinuationImpl) {
            y4 y4Var;
            kotlin.jvm.internal.u.j(style, "style");
            kotlin.jvm.internal.u.j(label, "label");
            kotlin.jvm.internal.u.j(description, "description");
            this.f34992a = style;
            this.f34993b = label;
            this.f34994c = description;
            this.f34995d = aVar;
            this.f34996e = j5;
            this.f34997f = cancellableContinuationImpl;
            if (aVar != null) {
                y4Var = new y4(this);
            } else {
                y4Var = null;
            }
            this.f34998g = y4Var;
        }

        @Override // com.withings.common.compose.component.w4
        public final long a() {
            return this.f34996e;
        }

        @Override // com.withings.common.compose.component.w4
        public final String b() {
            return this.f34993b;
        }

        @Override // com.withings.common.compose.component.w4
        public final ToastStyle c() {
            return this.f34992a;
        }

        @Override // com.withings.common.compose.component.w4
        public final ym0.a<nm0.y> d() {
            return this.f34998g;
        }

        @Override // com.withings.common.compose.component.w4
        public final void dismiss() {
            CancellableContinuation<ToastResult> cancellableContinuation = this.f34997f;
            if (cancellableContinuation.isActive()) {
                cancellableContinuation.resumeWith(ToastResult.f33345a);
            }
        }

        public final ym0.a<nm0.y> f() {
            return this.f34995d;
        }

        @Override // com.withings.common.compose.component.w4
        public final String getDescription() {
            return this.f34994c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToastHost.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.ToastHostState", f = "ToastHost.kt", l = {108, 111}, m = "showToast")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        z4 f34999a;

        /* renamed from: b  reason: collision with root package name */
        ToastStyle f35000b;

        /* renamed from: c  reason: collision with root package name */
        String f35001c;

        /* renamed from: d  reason: collision with root package name */
        String f35002d;

        /* renamed from: e  reason: collision with root package name */
        ym0.a f35003e;

        /* renamed from: f  reason: collision with root package name */
        Mutex f35004f;

        /* renamed from: g  reason: collision with root package name */
        Object f35005g;

        /* renamed from: h  reason: collision with root package name */
        long f35006h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f35007i;

        /* renamed from: k  reason: collision with root package name */
        int f35009k;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35007i = obj;
            this.f35009k |= Integer.MIN_VALUE;
            return z4.this.b(null, null, null, 0L, null, this);
        }
    }

    public z4() {
        ParcelableSnapshotMutableState f11;
        f11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
        this.f34991c = f11;
    }

    public static /* synthetic */ Object c(z4 z4Var, ToastStyle toastStyle, String str, String str2, long j5, ym0.a aVar, qm0.d dVar, int i11) {
        String str3;
        long j11;
        ym0.a aVar2;
        if ((i11 & 4) != 0) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i11 & 8) != 0) {
            j11 = z4Var.f34989a;
        } else {
            j11 = j5;
        }
        if ((i11 & 16) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        return z4Var.b(toastStyle, str, str3, j11, aVar2, dVar);
    }

    public final w4 a() {
        return (w4) this.f34991c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.withings.common.compose.component.ToastStyle r24, java.lang.String r25, java.lang.String r26, long r27, ym0.a<nm0.y> r29, qm0.d<? super com.withings.common.compose.component.ToastResult> r30) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.z4.b(com.withings.common.compose.component.ToastStyle, java.lang.String, java.lang.String, long, ym0.a, qm0.d):java.lang.Object");
    }
}
