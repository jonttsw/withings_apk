package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.lifecycle.LiveData;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.Track;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDayViewModel.kt */
/* loaded from: classes5.dex */
public final class n1 extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<Track>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j1 f61156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(j1 j1Var) {
        super(1);
        this.f61156a = j1Var;
    }

    @Override // ym0.l
    public final LiveData<Track> invoke(Boolean bool) {
        DateTime dateTime;
        ei0.q qVar;
        lj0.h0 h0Var;
        SleepScoreRecalculator sleepScoreRecalculator;
        fl.p pVar;
        j1 j1Var = this.f61156a;
        qm0.f coroutineContext = androidx.lifecycle.h1.a(j1Var).getCoroutineContext();
        User user = j1Var.f61025a;
        dateTime = j1Var.f61026b;
        qVar = j1Var.f61031g;
        h0Var = j1Var.f61032h;
        sleepScoreRecalculator = j1Var.f61028d;
        pVar = j1Var.f61033i;
        return new ei0.c(coroutineContext, user, dateTime, qVar, h0Var, sleepScoreRecalculator, pVar);
    }
}
