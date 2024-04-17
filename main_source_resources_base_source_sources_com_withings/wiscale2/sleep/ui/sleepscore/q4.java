package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.library.sleep.SleepScoreGenericConstants;
import pm.e;
/* compiled from: SleepScoreWordings.kt */
/* loaded from: classes5.dex */
public abstract class q4 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f61209a;

    /* renamed from: b  reason: collision with root package name */
    private final SleepScoreGenericConstants f61210b;

    public q4(Context context, SleepScoreGenericConstants sleepScoreGenericConstants) {
        this.f61209a = context;
        this.f61210b = sleepScoreGenericConstants;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(long j5) {
        e.a aVar = new e.a(this.f61209a, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        return new pm.e(aVar).a(j5);
    }

    public final SleepScoreGenericConstants b() {
        return this.f61210b;
    }

    public final Context c() {
        return this.f61209a;
    }
}
