package com.withings.authentication.mfa.recovery.settings;

import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.z4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SettingsRecoveryCode.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.settings.SettingsRecoveryCodeKt$SettingsRecoveryCode$copyToClipBoard$1", f = "SettingsRecoveryCode.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31926a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f31927b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f31928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z4 z4Var, String str, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f31927b = z4Var;
        this.f31928c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f31927b, this.f31928c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31926a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            ToastStyle toastStyle = ToastStyle.f33351d;
            this.f31926a = 1;
            if (z4.c(this.f31927b, toastStyle, this.f31928c, null, 0L, null, this, 28) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
