package com.withings.wiscale2.manuallogging.ui.addSleep;

import com.withings.common.compose.component.q1;
import com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AddLogSleepScreen.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.l<q1, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMoodViewModel f58063a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AddMoodViewModel addMoodViewModel) {
        super(1);
        this.f58063a = addMoodViewModel;
    }

    @Override // ym0.l
    public final y invoke(q1 q1Var) {
        q1 it = q1Var;
        u.j(it, "it");
        this.f58063a.p0(it.getId());
        return y.f85009a;
    }
}
