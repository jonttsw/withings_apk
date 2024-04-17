package com.withings.ecg.details;

import com.withings.library.ecg.EcgLeadType;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.w implements ym0.l<Integer, EcgLeadType> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b0 b0Var) {
        super(1);
        this.f38341a = b0Var;
    }

    @Override // ym0.l
    public final EcgLeadType invoke(Integer num) {
        List list;
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue();
            list = this.f38341a.f38112p;
            return (EcgLeadType) list.get(intValue);
        }
        return null;
    }
}
