package com.withings.tutorials.ui;

import android.content.Context;
import com.withings.common.compose.component.q5;
import java.util.ArrayList;
import java.util.List;
import k1.o1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceIntroductionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionActivity$onCreate$1$1$1", f = "DeviceIntroductionActivity.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44702a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f44703b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f44704c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o1<List<o60.d>> f44705d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o1<String> f44706e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, o1<? extends List<o60.d>> o1Var, o1<String> o1Var2, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f44704c = context;
        this.f44705d = o1Var;
        this.f44706e = o1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        a aVar = new a(this.f44704c, this.f44705d, this.f44706e, dVar);
        aVar.f44703b = obj;
        return aVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Exception e11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44702a;
        if (i11 != 0) {
            if (i11 == 1) {
                coroutineScope = (CoroutineScope) this.f44703b;
                try {
                    nm0.l.b(obj);
                } catch (Exception e12) {
                    e11 = e12;
                    x70.b.f(coroutineScope, e11, "Error during tutorial videos caching", new Object[0]);
                    return nm0.y.f85009a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f44703b;
            try {
                q5 q5Var = q5.f34614a;
                Context context = this.f44704c;
                o1<String> o1Var = this.f44706e;
                ArrayList arrayList = new ArrayList();
                for (o60.d dVar : this.f44705d.getValue()) {
                    kotlin.collections.x.n(a70.a.j(dVar.b(), o1Var.getValue()), arrayList);
                }
                this.f44703b = coroutineScope2;
                this.f44702a = 1;
                if (q5Var.d(context, arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Exception e13) {
                coroutineScope = coroutineScope2;
                e11 = e13;
                x70.b.f(coroutineScope, e11, "Error during tutorial videos caching", new Object[0]);
                return nm0.y.f85009a;
            }
        }
        return nm0.y.f85009a;
    }
}
