package com.withings.wiscale2.activity.logging.ui;

import com.withings.wiscale2.C1987R;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends nm0.y>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48343a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48343a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends nm0.y> cVar) {
        EditWorkoutActivity editWorkoutActivity = this.f48343a;
        String string = editWorkoutActivity.getString(C1987R.string._ERROR_END_TIME_TITLE_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = editWorkoutActivity.getString(C1987R.string._ERROR_END_TIME_);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        EditWorkoutActivity.y4(editWorkoutActivity, string, string2);
        return nm0.y.f85009a;
    }
}
