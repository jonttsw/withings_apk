package com.withings.zendesk.repositories.network;

import android.content.Context;
import androidx.work.o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.models.ZendeskStatic;
import com.withings.zendesk.repositories.data.ZendeskManager;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qm0.d;
import x70.b;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskManagerSync.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/o$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/o$a;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.zendesk.repositories.network.ZendeskManagerSync$doWork$2", f = "ZendeskManagerSync.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ZendeskManagerSync$doWork$2 extends i implements p<CoroutineScope, d<? super o.a>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ZendeskManagerSync this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskManagerSync$doWork$2(ZendeskManagerSync zendeskManagerSync, d<? super ZendeskManagerSync$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = zendeskManagerSync;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        ZendeskManagerSync$doWork$2 zendeskManagerSync$doWork$2 = new ZendeskManagerSync$doWork$2(this.this$0, dVar);
        zendeskManagerSync$doWork$2.L$0 = obj;
        return zendeskManagerSync$doWork$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ZendeskManagerSync zendeskManagerSync = this.this$0;
            try {
                Request.Builder builder = new Request.Builder();
                String string = zendeskManagerSync.getContext().getString(C1987R.string.helpCenter_zendeskMapping_URL_5032000);
                u.i(string, "getString(...)");
                Response execute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(builder.url(string).build()));
                if (execute.isSuccessful()) {
                    ResponseBody body = execute.body();
                    if (body != null) {
                        str = body.string();
                    } else {
                        str = null;
                    }
                    ZendeskStatic zendeskStatic = (ZendeskStatic) new Gson().fromJson(str, (Class<Object>) ZendeskStatic.class);
                    ZendeskManager zendeskManager = ZendeskManager.INSTANCE;
                    Context context = zendeskManagerSync.getContext();
                    u.g(zendeskStatic);
                    zendeskManager.save(context, zendeskStatic);
                }
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            Throwable b10 = k.b(a11);
            if (b10 != null) {
                b.e(coroutineScope, b10);
            }
            if (k.b(a11) == null) {
                y yVar = (y) a11;
                return new o.a.c();
            }
            return new o.a.C0176a();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super o.a> dVar) {
        return ((ZendeskManagerSync$doWork$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
