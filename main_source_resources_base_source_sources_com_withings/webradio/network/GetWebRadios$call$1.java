package com.withings.webradio.network;

import com.withings.webradio.model.WebRadio;
import com.withings.webradio.model.WsAirableWebRadioResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetWebRadios.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/webradio/model/WebRadio;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.webradio.network.GetWebRadios$call$1", f = "GetWebRadios.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetWebRadios$call$1 extends i implements p<CoroutineScope, d<? super List<? extends WebRadio>>, Object> {
    final /* synthetic */ String $fullUrl;
    int label;
    final /* synthetic */ GetWebRadios this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWebRadios$call$1(GetWebRadios getWebRadios, String str, d<? super GetWebRadios$call$1> dVar) {
        super(2, dVar);
        this.this$0 = getWebRadios;
        this.$fullUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetWebRadios$call$1(this.this$0, this.$fullUrl, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super List<? extends WebRadio>> dVar) {
        return invoke2(coroutineScope, (d<? super List<WebRadio>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WebRadiosRemoteRepository webRadiosRemoteRepository;
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
            webRadiosRemoteRepository = this.this$0.webRadiosRemoteRepository;
            String str = this.$fullUrl;
            this.label = 1;
            obj = webRadiosRemoteRepository.getAirableWebRadios(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return ((WsAirableWebRadioResponse) obj).getData().getList();
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super List<WebRadio>> dVar) {
        return ((GetWebRadios$call$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
