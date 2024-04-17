package com.withings.wiscale2.activity.workout.live.ui;

import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import java.util.List;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.l<List<? extends String>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LiveWorkoutActivity liveWorkoutActivity) {
        super(1);
        this.f48909a = liveWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends String> list) {
        Fragment f0Var;
        List<? extends String> list2 = list;
        if (list2 != null) {
            LiveWorkoutActivity.a aVar = LiveWorkoutActivity.f48791z;
            LiveWorkoutActivity liveWorkoutActivity = this.f48909a;
            liveWorkoutActivity.getClass();
            if (!list2.isEmpty()) {
                f0Var = new k0();
            } else {
                f0Var = new f0();
            }
            androidx.fragment.app.m0 m11 = liveWorkoutActivity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, f0Var, null);
            m11.g();
        }
        return nm0.y.f85009a;
    }
}
