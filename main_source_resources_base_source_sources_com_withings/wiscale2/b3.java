package com.withings.wiscale2;

import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
/* compiled from: TargetTrackerSync.kt */
/* loaded from: classes4.dex */
public final class b3 {
    public static final Job a(TargetRepository targetRepository, User user, int i11, com.withings.wiscale2.measure.goal.ui.d dVar) {
        Job launch$default;
        kotlin.jvm.internal.u.j(targetRepository, "targetRepository");
        kotlin.jvm.internal.u.j(user, "user");
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new a3(dVar, targetRepository, user, i11, null), 3, null);
        return launch$default;
    }
}
