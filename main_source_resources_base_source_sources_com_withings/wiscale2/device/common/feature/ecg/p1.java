package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.common.compose.component.input.InputFieldType;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51622a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51623b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51624c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(EcgActivationActivity ecgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(3);
        this.f51622a = ecgActivationActivity;
        this.f51623b = coroutineScope;
        this.f51624c = k4Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.text.b bVar;
        boolean z5;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            InputFieldType inputFieldType = InputFieldType.f33879g;
            String u11 = ay.b.u(C1987R.string.login_2FA_code_entry, aVar2);
            EcgActivationActivity ecgActivationActivity = this.f51622a;
            String str = (String) ecgActivationActivity.U3().K1().getValue();
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Integer num2 = (Integer) ecgActivationActivity.U3().L1().getValue();
            aVar2.s(2011827062);
            if (num2 == null) {
                bVar = null;
            } else {
                bVar = new androidx.compose.ui.text.b(ay.b.u(num2.intValue(), aVar2), null, 6);
            }
            aVar2.J();
            if (ecgActivationActivity.U3().L1().getValue() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            fk.q.b(null, inputFieldType, null, u11, str2, bVar, ay.b.u(C1987R.string.login_2FA_code_placeholde, aVar2), null, null, null, null, z5, null, null, 7, null, false, new n1(ecgActivationActivity, this.f51623b, this.f51624c), new o1(ecgActivationActivity), aVar2, 48, 24576, 112517);
        }
        return nm0.y.f85009a;
    }
}
