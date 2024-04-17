package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.common.compose.component.input.InputFieldType;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class k8 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51474b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51475c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(WBS08EcgActivationActivity wBS08EcgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(3);
        this.f51473a = wBS08EcgActivationActivity;
        this.f51474b = coroutineScope;
        this.f51475c = k4Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        androidx.compose.ui.text.b bVar;
        WBS08EcgActivationViewModel R33;
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
            WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51473a;
            R3 = wBS08EcgActivationActivity.R3();
            String str = (String) R3.c1().getValue();
            if (str == null) {
                str = "";
            }
            String str2 = str;
            R32 = wBS08EcgActivationActivity.R3();
            Integer num2 = (Integer) R32.d1().getValue();
            aVar2.s(1644515764);
            if (num2 == null) {
                bVar = null;
            } else {
                bVar = new androidx.compose.ui.text.b(ay.b.u(num2.intValue(), aVar2), null, 6);
            }
            aVar2.J();
            R33 = wBS08EcgActivationActivity.R3();
            if (R33.d1().getValue() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            fk.q.b(null, inputFieldType, null, u11, str2, bVar, ay.b.u(C1987R.string.login_2FA_code_placeholde, aVar2), null, null, null, null, z5, null, null, 7, null, false, new i8(wBS08EcgActivationActivity, this.f51474b, this.f51475c), new j8(wBS08EcgActivationActivity), aVar2, 48, 24576, 112517);
        }
        return nm0.y.f85009a;
    }
}
