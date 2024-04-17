package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.Track;
import java.text.NumberFormat;
import org.joda.time.DateTime;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
public final class b4 extends com.withings.views.graphs.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y3 f60894a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f60895b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b4(y3 y3Var, tb0.c3 c3Var) {
        this.f60894a = y3Var;
        this.f60895b = c3Var;
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupText(rs.e datum) {
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.track.data.Track");
        SleepScore sleepScore = ((Track) obj).getSleepScore();
        y3 y3Var = this.f60894a;
        if (sleepScore == null) {
            String string = y3Var.getString(C1987R.string._NO_DATA_AVAILABLE_);
            kotlin.jvm.internal.u.g(string);
            return string;
        }
        return w6.o.a(y3Var.getString(C1987R.string._SCORE_), " : ", NumberFormat.getNumberInstance().format(Integer.valueOf(sleepScore.getSleepScoreValue())));
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupTitleText(rs.e datum) {
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.track.data.Track");
        DateTime endDate = ((Track) obj).getEndDate();
        Context context = this.f60895b.f98921r.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        return b50.b.i(context, endDate);
    }
}
