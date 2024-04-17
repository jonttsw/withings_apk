package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.common.compose.component.d3;
import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DueDateMethod[] f46162a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<DueDateMethod> f46163b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f46164c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(DueDateMethod[] dueDateMethodArr, k1.r0<DueDateMethod> r0Var, ym0.l<? super DueDateMethod, nm0.y> lVar) {
        super(2);
        this.f46162a = dueDateMethodArr;
        this.f46163b = r0Var;
        this.f46164c = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(1788799320);
            DueDateMethod[] dueDateMethodArr = this.f46162a;
            ArrayList arrayList = new ArrayList(dueDateMethodArr.length);
            int length = dueDateMethodArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                DueDateMethod dueDateMethod = dueDateMethodArr[i12];
                int i14 = i13 + 1;
                kotlin.jvm.internal.u.j(dueDateMethod, "<this>");
                if (dueDateMethod == DueDateMethod.f44546a) {
                    i11 = C1987R.string.pregnancy_mode_survey_calculateDueDate_radioButton_1;
                } else {
                    i11 = C1987R.string.pregnancy_mode_survey_calculateDueDate_radioButton_2;
                }
                arrayList.add(new com.withings.common.compose.component.e0(ay.b.u(i11, aVar2), null, i13, null, null, 26));
                i12++;
                i13 = i14;
            }
            aVar2.J();
            k1.r0<DueDateMethod> r0Var = this.f46163b;
            d3.a(null, arrayList, Integer.valueOf(kotlin.collections.l.I(dueDateMethodArr, r0Var.getValue())), false, 0L, null, new u0(dueDateMethodArr, r0Var, this.f46164c), aVar2, 64, 57);
        }
        return nm0.y.f85009a;
    }
}
