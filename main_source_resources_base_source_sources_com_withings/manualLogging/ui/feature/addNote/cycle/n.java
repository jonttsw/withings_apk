package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.common.compose.component.z4;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41121a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41122b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f41123c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f41124d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f41125e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g3 g3Var, ym0.a<nm0.y> aVar, z4 z4Var, Context context, CoroutineScope coroutineScope) {
        super(0);
        this.f41121a = g3Var;
        this.f41122b = aVar;
        this.f41123c = z4Var;
        this.f41124d = context;
        this.f41125e = coroutineScope;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Integer num;
        g3 g3Var = this.f41121a;
        kotlin.jvm.internal.u.j(g3Var, "<this>");
        nm0.y yVar = null;
        if (g3Var.c() > 50) {
            num = Integer.valueOf((int) C1987R.string.cycleTracking_toast_error_cycleTooLong);
        } else if (g3Var.c() < 11) {
            num = Integer.valueOf((int) C1987R.string.cycleTracking_toast_error_cycleTooShort);
        } else {
            num = null;
        }
        if (num != null) {
            t0.b(this.f41123c, this.f41124d, num.intValue(), this.f41125e);
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            this.f41122b.invoke();
        }
        return nm0.y.f85009a;
    }
}
