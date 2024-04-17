package com.withings.wiscale2.deeplink.main;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import hy.g;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
import zx.v;
import zx.w;
/* compiled from: MeasuresDeepLinkHandler.kt */
@e(c = "com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler$getLastMeasureForType$1", f = "MeasuresDeepLinkHandler.kt", l = {478}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class a extends i implements p<CoroutineScope, d<? super MeasuresGroup>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50684a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f50685b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MeasureDeepLinkHandler f50686c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(User user, MeasureDeepLinkHandler measureDeepLinkHandler, d<? super a> dVar) {
        super(2, dVar);
        this.f50685b = user;
        this.f50686c = measureDeepLinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f50685b, this.f50686c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super MeasuresGroup> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50684a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                c11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            xw.b bVar = new xw.b();
            sw.a z5 = sw.a.z();
            u.i(z5, "get(...)");
            v vVar = new v(z5);
            sw.a z11 = sw.a.z();
            u.i(z11, "get(...)");
            fy.l lVar = new fy.l(new dy.d(vVar, new w(z11, bVar), bVar), bVar);
            User user = this.f50685b;
            this.f50684a = 1;
            c11 = fy.l.c(lVar, user.q(), new Long(user.h().getMillis()), new Long(DateTime.now().getMillis()), false, new int[]{this.f50686c.e()}, this, 24);
            if (c11 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar = (ky.d) x.U((List) c11);
        if (dVar != null) {
            return g.e(dVar);
        }
        return null;
    }
}
