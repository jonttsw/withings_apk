package com.withings.library.authentication.api;

import com.withings.library.authentication.api.error.WrongStatusException;
import com.withings.library.authentication.api.error.WrongStatusExceptionKt;
import el0.d;
import el0.t;
import fn0.o;
import io.ktor.utils.io.m;
import jl0.d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import nl0.g;
import nm0.l;
import nm0.y;
import rk0.a;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Unwrapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljl0/d;", "Lbl0/d;", "Lrk0/a;", "<name for destructuring parameter 0>", "Lnm0/y;", "<anonymous>", "(Ljl0/d;Lbl0/d;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.library.authentication.api.Unwrapper$Feature$install$1", f = "Unwrapper.kt", l = {32, 57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Unwrapper$Feature$install$1 extends i implements q<d<bl0.d, a>, bl0.d, qm0.d<? super y>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Unwrapper$Feature$install$1(qm0.d<? super Unwrapper$Feature$install$1> dVar) {
        super(3, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        kl0.a a11;
        o a12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a11 = (kl0.a) this.L$1;
            dVar = (d) this.L$0;
            l.b(obj);
        } else {
            l.b(obj);
            dVar = (d) this.L$0;
            bl0.d dVar2 = (bl0.d) this.L$1;
            a11 = dVar2.a();
            Object b10 = dVar2.b();
            if (!(b10 instanceof m)) {
                return y.f85009a;
            }
            el0.d a13 = t.a(((a) dVar.b()).e());
            if (a13 == null) {
                return y.f85009a;
            }
            if (!a13.f(d.a.b())) {
                return y.f85009a;
            }
            this.L$0 = dVar;
            this.L$1 = a11;
            this.label = 1;
            obj = ((m) b10).k(Long.MAX_VALUE, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        String L = g.L((g) obj);
        Json Json$default = JsonKt.Json$default(null, Unwrapper$Feature$install$1$jsonParser$1.INSTANCE, 1, null);
        Json$default.getSerializersModule();
        BaseResponse baseResponse = (BaseResponse) Json$default.decodeFromString(BaseResponse.Companion.serializer(), L);
        if (baseResponse.getStatus() != 0) {
            int status = baseResponse.getStatus();
            String error = baseResponse.getError();
            if (error == null) {
                error = "";
            }
            throw WrongStatusExceptionKt.toWithingsException(new WrongStatusException(status, error, baseResponse.getBody()));
        }
        KSerializer<Object> contextual$default = SerializersModule.getContextual$default(Json$default.getSerializersModule(), a11.b(), null, 2, null);
        if (contextual$default == null && ((a12 = a11.a()) == null || (contextual$default = SerializersKt.serializer(a12)) == null)) {
            contextual$default = SerializersKt.serializer(a11.b());
        }
        Object decodeFromString = Json$default.decodeFromString(contextual$default, String.valueOf(baseResponse.getBody()));
        u.g(decodeFromString);
        bl0.d dVar3 = new bl0.d(a11, decodeFromString);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (dVar.e(dVar3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    @Override // ym0.q
    public final Object invoke(jl0.d<bl0.d, a> dVar, bl0.d dVar2, qm0.d<? super y> dVar3) {
        Unwrapper$Feature$install$1 unwrapper$Feature$install$1 = new Unwrapper$Feature$install$1(dVar3);
        unwrapper$Feature$install$1.L$0 = dVar;
        unwrapper$Feature$install$1.L$1 = dVar2;
        return unwrapper$Feature$install$1.invokeSuspend(y.f85009a);
    }
}
