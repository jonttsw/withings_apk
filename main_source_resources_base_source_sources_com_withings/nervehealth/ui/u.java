package com.withings.nervehealth.ui;

import java.util.List;
import java.util.ListIterator;
import k1.o1;
import k1.r0;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<List<Integer>> f42774a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r0 r0Var) {
        super(0);
        this.f42774a = r0Var;
    }

    @Override // ym0.a
    public final Integer invoke() {
        Integer num;
        o1<List<Integer>> o1Var = this.f42774a;
        List<Integer> value = o1Var.getValue();
        ListIterator<Integer> listIterator = value.listIterator(value.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                num = listIterator.previous();
                if (num.intValue() == 10) {
                    break;
                }
            } else {
                num = null;
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return (Integer) kotlin.collections.x.U(o1Var.getValue());
        }
        return num2;
    }
}
