package com.withings.account.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/IsVerifiedResponse;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$isVerified$3", f = "RetrofitSessionRemoteRepository.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$isVerified$3 extends i implements p<SessionRetrofit2Api, d<? super IsVerifiedResponse>, Object> {
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $virtualDeviceToken;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$isVerified$3(String str, String str2, d<? super RetrofitSessionRemoteRepository$isVerified$3> dVar) {
        super(2, dVar);
        this.$sessionId = str;
        this.$virtualDeviceToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$isVerified$3 retrofitSessionRemoteRepository$isVerified$3 = new RetrofitSessionRemoteRepository$isVerified$3(this.$sessionId, this.$virtualDeviceToken, dVar);
        retrofitSessionRemoteRepository$isVerified$3.L$0 = obj;
        return retrofitSessionRemoteRepository$isVerified$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super IsVerifiedResponse> dVar) {
        return ((RetrofitSessionRemoteRepository$isVerified$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            String str = this.$sessionId;
            String str2 = this.$virtualDeviceToken;
            this.label = 1;
            obj = ((SessionRetrofit2Api) this.L$0).isVerified(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
