package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.gms.fitness.data.DataType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import lj0.c0;
import lj0.h0;
import lj0.n0;
import u10.a0;
/* compiled from: ImportVasistasFromFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ImportVasistasFromFit;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImportVasistasFromFit extends FitSyncWorker {

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56282f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56283g;

    /* compiled from: ImportVasistasFromFit.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56284a;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.SPO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56284a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportVasistasFromFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportVasistasFromFit", f = "ImportVasistasFromFit.kt", l = {54, 63}, m = "doFitSync")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ImportVasistasFromFit f56285a;

        /* renamed from: b  reason: collision with root package name */
        Object f56286b;

        /* renamed from: c  reason: collision with root package name */
        Object f56287c;

        /* renamed from: d  reason: collision with root package name */
        a0 f56288d;

        /* renamed from: e  reason: collision with root package name */
        int f56289e;

        /* renamed from: f  reason: collision with root package name */
        boolean f56290f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f56291g;

        /* renamed from: i  reason: collision with root package name */
        int f56293i;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56291g = obj;
            this.f56293i |= Integer.MIN_VALUE;
            return ImportVasistasFromFit.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportVasistasFromFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportVasistasFromFit", f = "ImportVasistasFromFit.kt", l = {85}, m = "importData")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        DataType f56294a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56295b;

        /* renamed from: d  reason: collision with root package name */
        int f56297d;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56295b = obj;
            this.f56297d |= Integer.MIN_VALUE;
            return ImportVasistasFromFit.this.y(null, null, null, this);
        }
    }

    /* compiled from: ImportVasistasFromFit.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f56298a = new w(0);

        @Override // ym0.a
        public final c0 invoke() {
            h0 e11 = h0.e();
            u.i(e11, "get(...)");
            return new c0(e11);
        }
    }

    /* compiled from: ImportVasistasFromFit.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f56299a = new w(0);

        @Override // ym0.a
        public final n0 invoke() {
            n0 n0Var = n0.f79890b;
            if (n0Var != null) {
                return n0Var;
            }
            u.s("instance");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportVasistasFromFit(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56282f = nm0.h.b(e.f56299a);
        this.f56283g = nm0.h.b(d.f56298a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(org.joda.time.DateTime r12, org.joda.time.DateTime r13, com.withings.vasistas.model.Vasistas.Category r14, qm0.d<? super java.util.List<com.google.android.gms.fitness.data.DataPoint>> r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportVasistasFromFit.y(org.joda.time.DateTime, org.joda.time.DateTime, com.withings.vasistas.model.Vasistas$Category, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4  */
    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.withings.partner.model.Partner r64, qm0.d<? super androidx.work.o.a> r65) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportVasistasFromFit.t(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }
}
