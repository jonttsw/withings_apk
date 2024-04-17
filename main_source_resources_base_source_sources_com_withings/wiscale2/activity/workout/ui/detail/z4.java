package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.os.Build;
import com.withings.features.FeatureFlag;
import java.util.Arrays;
import java.util.Locale;
import pm.e;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class z4 extends com.withings.views.graphs.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a5 f49836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(a5 a5Var) {
        this.f49836a = a5Var;
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupText(rs.e datum) {
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeartRateDatumData");
        p4 p4Var = (p4) obj;
        if (wr.b.c(FeatureFlag.Z)) {
            return String.format("%d♡", Arrays.copyOf(new Object[]{Integer.valueOf(p4Var.d())}, 1));
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.u.i(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
        if (dp0.j.r(lowerCase, "wiko", false)) {
            return String.format("%d♡ | %d⬆ | %d⬇", Arrays.copyOf(new Object[]{Integer.valueOf(p4Var.d()), Integer.valueOf(p4Var.b()), Integer.valueOf(p4Var.a())}, 3));
        }
        return String.format("%d♡ | %d↓ | %d↑", Arrays.copyOf(new Object[]{Integer.valueOf(p4Var.d()), Integer.valueOf(p4Var.b()), Integer.valueOf(p4Var.a())}, 3));
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public final String getPopupTitleText(rs.e datum) {
        kotlin.jvm.internal.u.j(datum, "datum");
        Object obj = datum.f95625j;
        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeartRateDatumData");
        Context context = this.f49836a.e().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        e.a aVar = new e.a(context, 0);
        aVar.u(true);
        return new pm.e(aVar).a(((p4) obj).c().getMillis());
    }
}
