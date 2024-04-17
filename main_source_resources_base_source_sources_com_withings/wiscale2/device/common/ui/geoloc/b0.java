package com.withings.wiscale2.device.common.ui.geoloc;

import android.location.Address;
import com.google.android.gms.maps.model.LatLng;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.ui.geoloc.a0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WeatherAirQualityViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$getCurrentLocation$1$1$1", f = "WeatherAirQualityViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53853a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f53854b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Address f53855c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, Address address, qm0.d<? super b0> dVar) {
        super(2, dVar);
        this.f53854b = a0Var;
        this.f53855c = address;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b0(this.f53854b, this.f53855c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53853a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a0 a0Var = this.f53854b;
            mutableStateFlow = a0Var.f53838i;
            Address it = this.f53855c;
            LatLng latLng = new LatLng(it.getLatitude(), it.getLongitude());
            kotlin.jvm.internal.u.i(it, "$it");
            List V = kotlin.collections.x.V(new a0.a(latLng, a0.f0(a0Var, it)));
            this.f53853a = 1;
            if (mutableStateFlow.emit(V, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
