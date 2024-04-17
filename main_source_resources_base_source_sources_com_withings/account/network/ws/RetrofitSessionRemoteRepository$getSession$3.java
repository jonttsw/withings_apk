package com.withings.account.network.ws;

import com.withings.webservices.legacy.withings.model.session.Session;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webservices/legacy/withings/model/session/Session;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.network.ws.RetrofitSessionRemoteRepository$getSession$3", f = "RetrofitSessionRemoteRepository.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSessionRemoteRepository$getSession$3 extends i implements p<SessionRetrofit2Api, d<? super Session>, Object> {
    final /* synthetic */ String $duration;
    final /* synthetic */ String $hash;
    final /* synthetic */ String $login;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSessionRemoteRepository$getSession$3(String str, String str2, String str3, d<? super RetrofitSessionRemoteRepository$getSession$3> dVar) {
        super(2, dVar);
        this.$login = str;
        this.$hash = str2;
        this.$duration = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSessionRemoteRepository$getSession$3 retrofitSessionRemoteRepository$getSession$3 = new RetrofitSessionRemoteRepository$getSession$3(this.$login, this.$hash, this.$duration, dVar);
        retrofitSessionRemoteRepository$getSession$3.L$0 = obj;
        return retrofitSessionRemoteRepository$getSession$3;
    }

    @Override // ym0.p
    public final Object invoke(SessionRetrofit2Api sessionRetrofit2Api, d<? super Session> dVar) {
        return ((RetrofitSessionRemoteRepository$getSession$3) create(sessionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$login;
            String str2 = this.$hash;
            String str3 = this.$duration;
            this.label = 1;
            obj = ((SessionRetrofit2Api) this.L$0).getSession(str, str2, str3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
