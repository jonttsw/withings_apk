package com.withings.wiscale2.manuallogging.ui.addSleep;

import com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: AddLogSleepScreen.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMoodViewModel f58058a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<Long, Long, y> f58059b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Long> f58060c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Long> f58061d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(AddMoodViewModel addMoodViewModel, p<? super Long, ? super Long, y> pVar, r0<Long> r0Var, r0<Long> r0Var2) {
        super(0);
        this.f58058a = addMoodViewModel;
        this.f58059b = pVar;
        this.f58060c = r0Var;
        this.f58061d = r0Var2;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f58058a.q0();
        this.f58059b.invoke(this.f58060c.getValue(), this.f58061d.getValue());
        return y.f85009a;
    }
}
