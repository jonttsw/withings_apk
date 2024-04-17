package com.withings.scalesmodes.ui;

import com.withings.scalesmodes.core.ScalesModes;
import com.withings.scalesmodes.ui.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
final class k extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<ScalesModes, Boolean, y> f43956a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f43957b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(p<? super ScalesModes, ? super Boolean, y> pVar, c cVar) {
        super(0);
        this.f43956a = pVar;
        this.f43957b = cVar;
    }

    @Override // ym0.a
    public final y invoke() {
        ScalesModes scalesModes;
        c cVar = this.f43957b;
        u.j(cVar, "<this>");
        if (cVar instanceof c.a) {
            scalesModes = ScalesModes.f43892a;
        } else if (cVar instanceof c.d) {
            scalesModes = ScalesModes.f43893b;
        } else if (cVar instanceof c.C0600c) {
            scalesModes = ScalesModes.f43894c;
        } else if (cVar instanceof c.b) {
            scalesModes = ScalesModes.f43895d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f43956a.invoke(scalesModes, Boolean.valueOf(cVar.e()));
        return y.f85009a;
    }
}
