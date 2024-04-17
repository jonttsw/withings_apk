package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.Track;
import java.text.NumberFormat;
import org.joda.time.DateTime;
/* compiled from: SleepMonthFragment.kt */
/* loaded from: classes5.dex */
public final class i2 extends com.withings.views.graphs.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f61019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(Context context) {
        this.f61019a = context;
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupText(rs.e datum) {
        Integer num;
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.track.data.Track");
        Track track = (Track) obj;
        SleepScore sleepScore = track.getSleepScore();
        Integer num2 = null;
        if (sleepScore != null) {
            num = Integer.valueOf(sleepScore.getSleepScoreValue());
        } else {
            num = null;
        }
        Context context = this.f61019a;
        if (num == null) {
            String string = context.getString(C1987R.string._NO_DATA_AVAILABLE_);
            kotlin.jvm.internal.u.g(string);
            return string;
        }
        String string2 = context.getString(C1987R.string._SCORE_);
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        SleepScore sleepScore2 = track.getSleepScore();
        if (sleepScore2 != null) {
            num2 = Integer.valueOf(sleepScore2.getSleepScoreValue());
        }
        return androidx.camera.camera2.internal.p2.c(string2, " : ", numberInstance.format(num2), " ");
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupTitleText(rs.e datum) {
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.track.data.Track");
        DateTime endDate = ((Track) obj).getEndDate();
        Context context = this.f61019a;
        kotlin.jvm.internal.u.i(context, "$context");
        return b50.b.i(context, endDate);
    }
}
