package com.withings.wiscale2.device.common.screen.ui;

import com.withings.common.compose.component.list.SlideState;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivityKt$DraggableIncludedScreenList$1", f = "ScreenSelectionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v1.w<SlideState> f53260a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<sc0.b> f53261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(v1.w<SlideState> wVar, List<sc0.b> list, qm0.d<? super a1> dVar) {
        super(2, dVar);
        this.f53260a = wVar;
        this.f53261b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a1(this.f53260a, this.f53261b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        v1.w<SlideState> wVar = this.f53260a;
        wVar.clear();
        List<sc0.b> list = this.f53261b;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (sc0.b bVar : list) {
            arrayList.add(SlideState.f34050a);
        }
        wVar.addAll(arrayList);
        return nm0.y.f85009a;
    }
}
