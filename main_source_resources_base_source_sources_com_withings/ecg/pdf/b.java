package com.withings.ecg.pdf;

import android.app.Application;
import androidx.camera.core.y1;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.ecg.EcgSignalType;
import com.withings.user.User;
import kotlin.jvm.internal.u;
/* compiled from: PDFGenerationActivity.kt */
/* loaded from: classes3.dex */
public final class b extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f38740a;

    /* renamed from: b  reason: collision with root package name */
    private final PlatformFeatureRepository f38741b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.m f38742c;

    /* renamed from: d  reason: collision with root package name */
    private final jq.b f38743d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f38744e;

    /* compiled from: PDFGenerationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f38745a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38746b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38747c;

        /* renamed from: d  reason: collision with root package name */
        private final String f38748d;

        public a(String str, String str2, String str3, String str4) {
            this.f38745a = str;
            this.f38746b = str2;
            this.f38747c = str3;
            this.f38748d = str4;
        }

        public final String a() {
            return this.f38746b;
        }

        public final String b() {
            return this.f38745a;
        }

        public final String c() {
            return this.f38747c;
        }

        public final String d() {
            return this.f38748d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f38745a, aVar.f38745a) && u.e(this.f38746b, aVar.f38746b) && u.e(this.f38747c, aVar.f38747c) && u.e(this.f38748d, aVar.f38748d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f38748d.hashCode() + defpackage.d.c(this.f38747c, defpackage.d.c(this.f38746b, this.f38745a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdditionalInformationData(qrs=");
            sb2.append(this.f38745a);
            sb2.append(", pr=");
            sb2.append(this.f38746b);
            sb2.append(", qt=");
            sb2.append(this.f38747c);
            sb2.append(", qtc=");
            return y1.e(sb2, this.f38748d, ")");
        }
    }

    /* compiled from: PDFGenerationActivity.kt */
    /* renamed from: com.withings.ecg.pdf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0507b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38749a;

        static {
            int[] iArr = new int[EcgSignalType.values().length];
            try {
                iArr[EcgSignalType.DII_DIII.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcgSignalType.DII_DIII_FILTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EcgSignalType.DI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EcgSignalType.DI_FILTERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EcgSignalType.DI_DI_FILTERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38749a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PDFGenerationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.GenerationViewModel", f = "PDFGenerationActivity.kt", l = {140}, m = "getAdditionalInformationFromAssociatedMeasureGroup")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        b f38750a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38751b;

        /* renamed from: d  reason: collision with root package name */
        int f38753d;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38751b = obj;
            this.f38753d |= Integer.MIN_VALUE;
            return b.this.j0(0L, 0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Application application, PDFGenerationActivity activity, User user, long j5, HeartSignalRepository heartSignalRepository, PlatformFeatureRepository featureRepository, fy.m mVar, jq.b bVar) {
        super(application);
        u.j(activity, "activity");
        u.j(featureRepository, "featureRepository");
        this.f38740a = user;
        this.f38741b = featureRepository;
        this.f38742c = mVar;
        this.f38743d = bVar;
        this.f38744e = e1.c(heartSignalRepository.getHeartSignalLiveData(j5), new d(activity, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.ecg.pdf.b r9, com.withings.ecg.model.HeartSignalMeasurement r10, qm0.d r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.pdf.b.f0(com.withings.ecg.pdf.b, com.withings.ecg.model.HeartSignalMeasurement, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(long r10, long r12, qm0.d<? super com.withings.ecg.pdf.b.a> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.withings.ecg.pdf.b.c
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.ecg.pdf.b$c r0 = (com.withings.ecg.pdf.b.c) r0
            int r1 = r0.f38753d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f38753d = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.withings.ecg.pdf.b$c r0 = new com.withings.ecg.pdf.b$c
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.f38751b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f38753d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.withings.ecg.pdf.b r10 = r8.f38750a
            nm0.l.b(r14)
            goto L4c
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            nm0.l.b(r14)
            com.withings.user.User r14 = r9.f38740a
            long r4 = r14.q()
            r8.f38750a = r9
            r8.f38753d = r2
            fy.m r1 = r9.f38742c
            r2 = r10
            r6 = r12
            java.lang.Object r14 = r1.b(r2, r4, r6, r8)
            if (r14 != r0) goto L4b
            return r0
        L4b:
            r10 = r9
        L4c:
            ky.d r14 = (ky.d) r14
            r11 = 0
            if (r14 == 0) goto L99
            r12 = 135(0x87, float:1.89E-43)
            ky.a r12 = ly.a.e(r12, r14)
            r13 = 136(0x88, float:1.9E-43)
            ky.a r13 = ly.a.e(r13, r14)
            r0 = 137(0x89, float:1.92E-43)
            ky.a r0 = ly.a.e(r0, r14)
            r1 = 138(0x8a, float:1.93E-43)
            ky.a r14 = ly.a.e(r1, r14)
            if (r12 == 0) goto L99
            if (r13 == 0) goto L99
            if (r0 == 0) goto L99
            if (r14 == 0) goto L99
            com.withings.ecg.pdf.b$a r11 = new com.withings.ecg.pdf.b$a
            double r1 = r12.f()
            r10.getClass()
            java.lang.String r10 = m0(r1)
            double r12 = r13.f()
            java.lang.String r12 = m0(r12)
            double r0 = r0.f()
            java.lang.String r13 = m0(r0)
            double r0 = r14.f()
            java.lang.String r14 = m0(r0)
            r11.<init>(r10, r12, r13, r14)
        L99:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.pdf.b.j0(long, long, qm0.d):java.lang.Object");
    }

    private static String m0(double d11) {
        boolean z5;
        String num;
        Double valueOf = Double.valueOf(d11);
        if (d11 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!(!z5)) {
            valueOf = null;
        }
        if (valueOf == null || (num = Integer.valueOf((int) valueOf.doubleValue()).toString()) == null) {
            return "--";
        }
        return num;
    }

    public final j0 k0() {
        return this.f38744e;
    }
}
