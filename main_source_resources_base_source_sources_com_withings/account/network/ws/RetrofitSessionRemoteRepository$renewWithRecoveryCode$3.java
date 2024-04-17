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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/account/network/ws/RenewResponse;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$renewWithRecoveryCode$3", f = "RetrofitSessionRemoteRepository.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$renewWithRecoveryCode$3 extends i implements p<SessionRetrofit2Api, d<? super RenewResponse>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $modelName;
    final /* synthetic */ String $os;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $typeName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$renewWithRecoveryCode$3(String str, String str2, String str3, String str4, String str5, d<? super RetrofitSessionRemoteRepository$renewWithRecoveryCode$3> dVar) {
        super(2, dVar);
        this.$sessionId = str;
        this.$code = str2;
        this.$modelName = str3;
        this.$typeName = str4;
        this.$os = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$renewWithRecoveryCode$3 retrofitSessionRemoteRepository$renewWithRecoveryCode$3 = new RetrofitSessionRemoteRepository$renewWithRecoveryCode$3(this.$sessionId, this.$code, this.$modelName, this.$typeName, this.$os, dVar);
        retrofitSessionRemoteRepository$renewWithRecoveryCode$3.L$0 = obj;
        return retrofitSessionRemoteRepository$renewWithRecoveryCode$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super RenewResponse> dVar) {
        return ((RetrofitSessionRemoteRepository$renewWithRecoveryCode$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str2 = this.$code;
            String str3 = this.$modelName;
            String str4 = this.$typeName;
            String str5 = this.$os;
            this.label = 1;
            obj = ((SessionRetrofit2Api) this.L$0).renewWithRecoveryCode(str, str2, false, str3, str4, str5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
