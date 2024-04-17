package com.withings.programs.ui.activity;

import android.content.Intent;
import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ProgramOverviewActivity.kt */
/* loaded from: classes4.dex */
final class d extends w implements p<Integer, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProgramOverviewActivity f43763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProgramOverviewActivity programOverviewActivity) {
        super(2);
        this.f43763a = programOverviewActivity;
    }

    @Override // ym0.p
    public final y invoke(Integer num, Integer num2) {
        boolean z5;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        ProgramOverviewActivity programOverviewActivity = this.f43763a;
        Intent intent = new Intent(programOverviewActivity, ExploreTabActivity.class);
        long C3 = ProgramOverviewActivity.C3(programOverviewActivity);
        long B3 = ProgramOverviewActivity.B3(programOverviewActivity);
        if (intValue2 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        programOverviewActivity.startActivity(intent.putExtra("startDestination", new ExploreTabActivity.a.AbstractC0526a.e(intValue, C3, z5, B3)));
        programOverviewActivity.finish();
        return y.f85009a;
    }
}
