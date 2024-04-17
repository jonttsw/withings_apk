package com.withings.wiscale2.profile;

import android.content.Context;
import android.widget.ImageView;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfilePartnerAdapter.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.PartnerViewHolder$shouldShowWarning$1", f = "ProfilePartnerAdapter.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kg0.c f59403b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f59404c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Partner f59405d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f59406e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kg0.c cVar, l lVar, Partner partner, boolean z5, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f59403b = cVar;
        this.f59404c = lVar;
        this.f59405d = partner;
        this.f59406e = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f59403b, this.f59404c, this.f59405d, this.f59406e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ImageView c11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59402a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            c11 = this.f59404c.c();
            Context context = c11.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            this.f59402a = 1;
            obj = this.f59403b.a(context, this.f59405d, this, this.f59406e);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
