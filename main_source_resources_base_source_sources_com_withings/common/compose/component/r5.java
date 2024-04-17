package com.withings.common.compose.component;

import androidx.compose.ui.unit.LayoutDirection;
import com.withings.common.compose.component.u5;
import m0.d1;
/* compiled from: WithingsPlaceholder.kt */
/* loaded from: classes3.dex */
final class r5 extends kotlin.jvm.internal.w implements ym0.l<f2.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d2.c1 f34647a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.node.n1<d2.a1> f34648b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d2.r1 f34649c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f34650d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.node.n1<LayoutDirection> f34651e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.node.n1<c2.g> f34652f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1.o1<Float> f34653g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ k1.o1<Float> f34654h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k1.o0 f34655i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(d2.c1 c1Var, androidx.compose.ui.node.n1 n1Var, d2.r1 r1Var, long j5, androidx.compose.ui.node.n1 n1Var2, androidx.compose.ui.node.n1 n1Var3, d1.d dVar, d1.d dVar2, k1.o0 o0Var) {
        super(1);
        this.f34647a = c1Var;
        this.f34648b = n1Var;
        this.f34649c = r1Var;
        this.f34650d = j5;
        this.f34651e = n1Var2;
        this.f34652f = n1Var3;
        this.f34653g = dVar;
        this.f34654h = dVar2;
        this.f34655i = o0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(f2.c cVar) {
        f2.c drawWithContent = cVar;
        kotlin.jvm.internal.u.j(drawWithContent, "$this$drawWithContent");
        k1.o1<Float> o1Var = this.f34653g;
        float floatValue = o1Var.getValue().floatValue();
        int i11 = (0.01f > floatValue ? 1 : (0.01f == floatValue ? 0 : -1));
        d2.c1 c1Var = this.f34647a;
        if (i11 <= 0 && floatValue <= 0.99f) {
            c1Var.setAlpha(o1Var.getValue().floatValue());
            d2.a0 a11 = drawWithContent.d1().a();
            a11.h(c2.h.c(drawWithContent.b()), c1Var);
            drawWithContent.r1();
            a11.i();
        } else if (o1Var.getValue().floatValue() >= 0.99f) {
            drawWithContent.r1();
        }
        k1.o1<Float> o1Var2 = this.f34654h;
        float a12 = u5.a.a(o1Var2);
        int i12 = (0.01f > a12 ? 1 : (0.01f == a12 ? 0 : -1));
        k1.o0 o0Var = this.f34655i;
        androidx.compose.ui.node.n1<c2.g> n1Var = this.f34652f;
        androidx.compose.ui.node.n1<LayoutDirection> n1Var2 = this.f34651e;
        androidx.compose.ui.node.n1<d2.a1> n1Var3 = this.f34648b;
        if (i12 <= 0 && a12 <= 0.99f) {
            c1Var.setAlpha(o1Var2.getValue().floatValue());
            d2.a0 a13 = drawWithContent.d1().a();
            a13.h(c2.h.c(drawWithContent.b()), c1Var);
            n1Var3.b(u5.a(drawWithContent, this.f34649c, this.f34650d, o0Var.a(), n1Var3.a(), n1Var2.a(), n1Var.a()));
            a13.i();
        } else if (o1Var2.getValue().floatValue() >= 0.99f) {
            n1Var3.b(u5.a(drawWithContent, this.f34649c, this.f34650d, o0Var.a(), n1Var3.a(), n1Var2.a(), n1Var.a()));
        }
        n1Var.b(c2.g.c(drawWithContent.b()));
        n1Var2.b(drawWithContent.getLayoutDirection());
        return nm0.y.f85009a;
    }
}
