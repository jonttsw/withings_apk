package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class u0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DueDateMethod[] f46150a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<DueDateMethod> f46151b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f46152c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(DueDateMethod[] dueDateMethodArr, k1.r0<DueDateMethod> r0Var, ym0.l<? super DueDateMethod, nm0.y> lVar) {
        super(1);
        this.f46150a = dueDateMethodArr;
        this.f46151b = r0Var;
        this.f46152c = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        DueDateMethod dueDateMethod = this.f46150a[num.intValue()];
        this.f46151b.setValue(dueDateMethod);
        this.f46152c.invoke(dueDateMethod);
        return nm0.y.f85009a;
    }
}
