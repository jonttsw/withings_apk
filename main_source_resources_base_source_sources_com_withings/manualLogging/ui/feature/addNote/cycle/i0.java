package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.common.compose.component.z4;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41031a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41032b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z4 f41033c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f41034d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f41035e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(g3 g3Var, ym0.a<nm0.y> aVar, z4 z4Var, Context context, CoroutineScope coroutineScope) {
        super(0);
        this.f41031a = g3Var;
        this.f41032b = aVar;
        this.f41033c = z4Var;
        this.f41034d = context;
        this.f41035e = coroutineScope;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Integer num;
        g3 g3Var = this.f41031a;
        kotlin.jvm.internal.u.j(g3Var, "<this>");
        nm0.y yVar = null;
        if (g3Var.c() <= g3Var.k()) {
            num = Integer.valueOf((int) C1987R.string.cycleTracking_toast_error_cycleMustExceedMenstruation);
        } else if (g3Var.k() > 44) {
            num = Integer.valueOf((int) C1987R.string.cycleTracking_toast_error_menstruationTooLong);
        } else if (g3Var.k() < 1) {
            num = Integer.valueOf((int) C1987R.string.cycleTracking_toast_error_menstruationTooShort);
        } else {
            num = null;
        }
        if (num != null) {
            t0.b(this.f41033c, this.f41034d, num.intValue(), this.f41035e);
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            this.f41032b.invoke();
        }
        return nm0.y.f85009a;
    }
}
