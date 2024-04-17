package com.withings.ecg.details;

import android.content.Intent;
import com.withings.ecg.details.EcgResultActivity;
import com.withings.ecg.details.WaitingSignalResultActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WaitingSignalResultActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.WaitingSignalResultActivity$initViewModel$2$1", f = "WaitingSignalResultActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class v2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<WaitingSignalResultActivity.b, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f38347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WaitingSignalResultActivity f38348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(WaitingSignalResultActivity waitingSignalResultActivity, qm0.d<? super v2> dVar) {
        super(2, dVar);
        this.f38348b = waitingSignalResultActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v2 v2Var = new v2(this.f38348b, dVar);
        v2Var.f38347a = obj;
        return v2Var;
    }

    @Override // ym0.p
    public final Object invoke(WaitingSignalResultActivity.b bVar, qm0.d<? super nm0.y> dVar) {
        return ((v2) create(bVar, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        WaitingSignalResultActivity.b bVar = (WaitingSignalResultActivity.b) this.f38347a;
        if (bVar != null) {
            Long deviceId = bVar.b().getDeviceId();
            boolean a11 = bVar.a();
            WaitingSignalResultActivity context = this.f38348b;
            if (a11 && deviceId != null) {
                ch.d dVar = context.f38057g;
                if (dVar != null) {
                    context.startActivity(((ah.l) dVar.v()).h(context, WaitingSignalResultActivity.A3(context), deviceId.longValue()));
                } else {
                    kotlin.jvm.internal.u.s("intentBuilder");
                    throw null;
                }
            } else {
                EcgResultActivity.a aVar = EcgResultActivity.f38024l;
                long id2 = bVar.b().getId();
                User user = bVar.c();
                aVar.getClass();
                kotlin.jvm.internal.u.j(context, "context");
                kotlin.jvm.internal.u.j(user, "user");
                Intent putExtra = new Intent(context, EcgResultActivity.class).putExtra("ecgId", id2).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                context.startActivity(putExtra);
            }
            context.finish();
        }
        return nm0.y.f85009a;
    }
}
