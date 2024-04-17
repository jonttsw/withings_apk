package com.withings.wiscale2.utils.fcmlegacy;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.f;
import androidx.work.impl.n0;
import androidx.work.r;
import androidx.work.w;
import com.google.android.gms.common.GoogleApiAvailability;
import com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker;
import kotlin.jvm.internal.u;
import nm0.j;
import nm0.k;
import nm0.l;
import nm0.y;
import vf.d;
import x70.b;
/* compiled from: FcmRegisterer.kt */
/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: d */
    private static a f62171d;

    /* renamed from: a */
    private final int f62172a = 1;

    /* renamed from: b */
    private final int f62173b = 5;

    /* renamed from: c */
    private long f62174c = -1;

    public static final /* synthetic */ a c() {
        return f62171d;
    }

    public static final /* synthetic */ void d(a aVar) {
        f62171d = aVar;
    }

    @Override // vf.d
    public final y a() {
        a aVar = f62171d;
        if (aVar != null) {
            long j5 = aVar.f62174c;
            new gj0.a(this.f62173b, this.f62172a, j5).run();
            return y.f85009a;
        }
        u.s("instance");
        throw null;
    }

    @Override // vf.d
    public final int b() {
        a aVar = f62171d;
        if (aVar != null) {
            return (int) aVar.f62174c;
        }
        u.s("instance");
        throw null;
    }

    public final void e(Context context, String str) {
        Object obj;
        u.j(context, "context");
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            long j5 = this.f62174c;
            try {
                obj = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Throwable th2) {
                obj = l.a(th2);
            }
            boolean z5 = obj instanceof k.a;
            Object obj2 = obj;
            if (z5) {
                obj2 = "0";
            }
            RegisterFcmWorker.a aVar = new RegisterFcmWorker.a(j5, (String) obj2, this.f62173b, this.f62172a, str);
            n0 m11 = n0.m();
            if (m11 != null) {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.f19030a;
                w.a aVar2 = new w.a(RegisterFcmWorker.class);
                j[] jVarArr = {new j("consumer", Integer.valueOf(aVar.d())), new j("accountOrUser", Long.valueOf(aVar.a())), new j("applicationId", Integer.valueOf(aVar.b())), new j("applicationVersion", aVar.c()), new j("syncContext", aVar.e())};
                f.a aVar3 = new f.a();
                for (int i11 = 0; i11 < 5; i11++) {
                    j jVar = jVarArr[i11];
                    aVar3.b(jVar.d(), (String) jVar.c());
                }
                m11.e("RegisterFcm", existingWorkPolicy, ((r.a) aVar2.j(aVar3.a())).b());
                return;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }
        b.r(this, "No valid Google Play Services APK found.", new Object[0]);
    }

    public final void f(long j5) {
        this.f62174c = j5;
    }
}
