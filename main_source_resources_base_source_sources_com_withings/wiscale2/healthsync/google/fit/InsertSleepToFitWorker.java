package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.o;
import androidx.work.r;
import androidx.work.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.vasistas.model.SleepLevel;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ei0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import v10.c;
/* compiled from: SyncSleepWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/InsertSleepToFitWorker;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InsertSleepToFitWorker extends FitSyncWorker {

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56345f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56346g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f56347h;

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static r a(long j5, Track track) {
            u.j(track, "track");
            w.a aVar = new w.a(InsertSleepToFitWorker.class);
            nm0.j[] jVarArr = {new nm0.j(NavigationArguments.USER_ID, Long.valueOf(j5)), new nm0.j("track_end_timestamp", Long.valueOf(TrackKt.getEffectiveEndDate(track).getMillis()))};
            f.a aVar2 = new f.a();
            for (int i11 = 0; i11 < 2; i11++) {
                nm0.j jVar = jVarArr[i11];
                aVar2.b(jVar.d(), (String) jVar.c());
            }
            return ((r.a) aVar.j(aVar2.a())).b();
        }
    }

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56348a;

        static {
            int[] iArr = new int[SleepLevel.values().length];
            try {
                iArr[SleepLevel.Awake.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepLevel.Deep.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepLevel.Light.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepLevel.Rem.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SleepLevel.Manual.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SleepLevel.Unspecified.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f56348a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncSleepWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.InsertSleepToFitWorker", f = "SyncSleepWithFit.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_HR_STATE}, m = "insertSleepTrackToFit")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Object f56349a;

        /* renamed from: b  reason: collision with root package name */
        Object f56350b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56351c;

        /* renamed from: e  reason: collision with root package name */
        int f56353e;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56351c = obj;
            this.f56353e |= Integer.MIN_VALUE;
            return InsertSleepToFitWorker.this.B(null, this);
        }
    }

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Track> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Track invoke() {
            InsertSleepToFitWorker insertSleepToFitWorker = InsertSleepToFitWorker.this;
            q x11 = InsertSleepToFitWorker.x(insertSleepToFitWorker);
            long q11 = insertSleepToFitWorker.getUser().q();
            DateTime dateTime = new DateTime(InsertSleepToFitWorker.y(insertSleepToFitWorker));
            x11.getClass();
            Track C = x11.C(q11, dateTime, null);
            if (C == null || C.isInProgress()) {
                return null;
            }
            return C;
        }
    }

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f56355a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final q invoke() {
            q qVar = q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    return qVar;
                }
                u.s("instance");
                throw null;
            }
            u.s("instance");
            throw null;
        }
    }

    /* compiled from: SyncSleepWithFit.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Long> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(InsertSleepToFitWorker.this.getInputData().e("track_end_timestamp", 0L));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertSleepToFitWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56345f = nm0.h.b(e.f56355a);
        this.f56346g = nm0.h.b(new f());
        this.f56347h = nm0.h.b(new d());
    }

    private final DataSource A(DataType dataType, String str) {
        DataSource build = new DataSource.Builder().setAppPackageName(getApplicationContext().getPackageName()).setDataType(dataType).setStreamName(str).setType(0).build();
        u.i(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(com.google.android.gms.auth.api.signin.GoogleSignInAccount r24, qm0.d<? super androidx.work.o.a> r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.InsertSleepToFitWorker.B(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    public static final q x(InsertSleepToFitWorker insertSleepToFitWorker) {
        return (q) insertSleepToFitWorker.f56345f.getValue();
    }

    public static final long y(InsertSleepToFitWorker insertSleepToFitWorker) {
        return ((Number) insertSleepToFitWorker.f56346g.getValue()).longValue();
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        c.h hVar = c.h.f103128c;
        boolean i11 = hVar.i(partner);
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        GoogleSignInAccount a11 = hVar.a(applicationContext);
        if (!i11) {
            return new o.a.c();
        }
        if (a11 == null) {
            return new o.a.c();
        }
        return B(a11, dVar);
    }
}
