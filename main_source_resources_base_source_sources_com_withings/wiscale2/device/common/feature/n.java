package com.withings.wiscale2.device.common.feature;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.withings.wiscale2.device.common.feature.q;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.y;
/* compiled from: FeatureActivationDocument.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.FeatureActivationDocumentLiveData$loadDocument$1", f = "FeatureActivationDocument.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f52397a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f52398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f52398b = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        n nVar = new n(this.f52398b, dVar);
        nVar.f52397a = obj;
        return nVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f52397a;
        q.c cVar = q.c.f52408a;
        o oVar = this.f52398b;
        oVar.postValue(cVar);
        try {
            Response execute = new OkHttpClient().newCall(new Request.Builder().url(oVar.x()).build()).execute();
            if (execute.isSuccessful()) {
                InputStream byteStream = execute.body().byteStream();
                dVar = oVar.f52399a;
                kotlin.jvm.internal.u.g(byteStream);
                a11 = new q.a(dVar.a(byteStream));
            } else {
                a11 = new q.b(new Exception(execute.message()));
            }
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            oVar.postValue((q) a11);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            oVar.postValue(new q.b((Exception) b10));
        }
        return y.f85009a;
    }
}
