package com.withings.wiscale2.device.common.screen.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.screen.model.DeviceScreen;
import com.withings.screen.model.DeviceScreensGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.joda.time.DateTime;
/* compiled from: ScreenSelectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$changeOrder$1", f = "ScreenSelectionViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGSESSIONTYPE, ConstantsWs.WS_STATUS_NOPWDUPDATECODE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionViewModel f53263b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53264c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f53265d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(ScreenSelectionViewModel screenSelectionViewModel, int i11, int i12, qm0.d<? super a2> dVar) {
        super(2, dVar);
        this.f53263b = screenSelectionViewModel;
        this.f53264c = i11;
        this.f53265d = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a2(this.f53263b, this.f53264c, this.f53265d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<DeviceScreen> list;
        Object remove;
        DeviceScreensGroup deviceScreensGroup;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53262a;
        ScreenSelectionViewModel screenSelectionViewModel = this.f53263b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableSharedFlow mutableSharedFlow = screenSelectionViewModel.f53177r;
            this.f53262a = 1;
            obj = FlowKt.firstOrNull(mutableSharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list2 = (List) obj;
        if (list2 != null && (deviceScreensGroup = (DeviceScreensGroup) kotlin.collections.x.K(list2)) != null) {
            list = deviceScreensGroup.getScreens();
        } else {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((DeviceScreen) obj2).isActive()) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            nm0.j jVar = new nm0.j(arrayList, arrayList2);
            List list3 = (List) jVar.b();
            ArrayList S0 = kotlin.collections.x.S0((List) jVar.a());
            int i12 = this.f53264c;
            int i13 = this.f53265d;
            if (i12 != i13 && (remove = S0.remove(i12)) != null) {
                S0.add(i13, remove);
            }
            ArrayList l02 = kotlin.collections.x.l0(list3, S0);
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            DeviceScreensGroup deviceScreensGroup2 = new DeviceScreensGroup(0L, null, l02, now, 0L);
            MutableSharedFlow mutableSharedFlow2 = screenSelectionViewModel.f53177r;
            List V = kotlin.collections.x.V(deviceScreensGroup2);
            this.f53262a = 2;
            if (mutableSharedFlow2.emit(V, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
